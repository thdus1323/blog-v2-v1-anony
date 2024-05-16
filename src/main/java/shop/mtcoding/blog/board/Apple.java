package shop.mtcoding.blog.board;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Data
public class Apple {
    private String color = "빨강";

    public Apple() {
        System.out.println("사과 메모리에 올라옴");
    }

    public Apple(String color) {
        this.color = color;
    }
}
