package shop.mtcoding.blog.board;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Entity
@Table(name = "board_tb")
@Data
public class Board {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String title;
    private String content;
    private String username;
    private Timestamp createdAt;

}
