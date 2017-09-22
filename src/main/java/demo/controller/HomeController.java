package demo.controller;

import demo.Utils.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/hello")
    public String homePage(Map<String, Object> model) {
        model.put("message", this.message);
        return Config.HOME_PAGE;
    }
}
