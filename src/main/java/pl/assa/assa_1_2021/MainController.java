package pl.assa.assa_1_2021;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/zadanie_02")
    public String zadanie02(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("nameLength", name.length());
        return "index";
    }
}
