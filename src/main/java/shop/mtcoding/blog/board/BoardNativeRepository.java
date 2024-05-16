package shop.mtcoding.blog.board;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class BoardNativeRepository {
    private final EntityManager em;
    private final Apple apple;

//    public BoardNativeRepository(EntityManager em, Apple apple) {
//        this.em = em;
//        this.apple = apple;
//    }


    //    public BoardNativeRepository(Apple apple) {
//        System.out.println("보드 레파지토리 올라옴");
//        if(apple == null){
//            System.out.println("apple 은 null 이야");
//        }else{
//            this.apple = apple;
//        }
//        System.out.println(apple.getColor());
//    }
}
