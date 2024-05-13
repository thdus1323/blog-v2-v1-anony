package shop.mtcoding.blog.board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class BoardNativeRepository {
    private final EntityManager em;

    //1. 게시판 글쓰기
    @Transactional
    public void save(String title, String content, String username) {
        Query query = em.createNativeQuery("insert into board_tb(title, content, username,created_at) values (?,?,?,now())");
        query.setParameter(1, title);
        query.setParameter(2, content);
        query.setParameter(3, username);
        query.executeUpdate();
    }

    //2. 게시판 목록보기
    public List<Board> findAll(){
        Query query = em.createNativeQuery("select * from board_tb order by id desc", Board.class);
        return query.getResultList();
    }
    }
