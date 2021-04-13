package pl.assa.assa_1_2021;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/zadanie_1")
    public String zadanie01() {
        return "zadanie_1";
    }
}
