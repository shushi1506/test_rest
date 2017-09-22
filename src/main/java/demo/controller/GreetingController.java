package demo.controller;

import demo.entity.Greeting;
import demo.entity.Parent;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting",produces={MediaType.APPLICATION_JSON_VALUE},headers = "Accept=application/json")
    public Parent greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Parent tem = new Parent();
        tem.setIt(1);
        tem.setNameParent("NameParent");
        List<Greeting> lst = new ArrayList<>();
        lst.add(new Greeting(counter.incrementAndGet(),
                String.format(template, name)));
        tem.setLst(lst);
        return tem;
    }
}
