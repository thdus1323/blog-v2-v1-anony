package shop.mtcoding.blog.board;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final BoardNativeRepository boardNativeRepository;

    //게시판 글쓰기
    @PostMapping("/board/save")
    public String save(String title, String content, String username){
//        System.out.println("title = " + title);
//        System.out.println("content = " + content);
//        System.out.println("username = " + username);
            boardNativeRepository.save(title, content,username);
        return "redirect:/";
    }

    //게시판 목록보기
    @GetMapping("/")
    public String index(HttpServletRequest request){
        List<Board> boardList = boardNativeRepository.findAll();
        request.setAttribute("boardList", boardList);
        return "index";
    }


//    @GetMapping("/" )
//    public String index() {
//        return "index";
//    }

    @GetMapping("/board/save-form")
    public String saveForm() {
        return "board/save-form";
    }

    @GetMapping("/board/{id}")
    public String detail(@PathVariable Integer id) {
        return "board/detail";
    }
}
