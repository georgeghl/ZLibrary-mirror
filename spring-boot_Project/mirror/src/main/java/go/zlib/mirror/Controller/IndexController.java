package go.zlib.mirror.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import go.zlib.mirror.Pojo.Book;
import go.zlib.mirror.mapper.BookMapper;

@Controller
public class IndexController {
    @Autowired
    private BookMapper bookMapper;


    @GetMapping(path = "/search")
    public String search(Model model,String keyword){
        List<Book> books=bookMapper.selectBookByTitle(keyword);
        for(Book i:books){
            i.setHref("/torrent/"+i.getTorrent());
        }
        model.addAttribute("books", books);
        return "search";
    }
}
