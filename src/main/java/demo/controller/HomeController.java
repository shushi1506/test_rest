package demo.controller;

import demo.DefinedConfig;
import demo.Utils.Config;
import demo.core.drivedb.ConnectionMysql;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
