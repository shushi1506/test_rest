package demo.controller;

import demo.core.mysql.crud.TableChuContent;

import demo.entity.ChuContentEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting/{id}",produces={MediaType.APPLICATION_JSON_VALUE},headers = "Accept=application/json")
    public List<ChuContentEntity> getChuContentById(@PathVariable("id") int id)  {
//        Parent tem = new Parent();
//        tem.setIt(1);
//        tem.setNameParent("NameParent");
//        List<Greeting> lst = new ArrayList<>();
//        lst.add(new Greeting(counter.incrementAndGet(),
//                String.format(template, name)));
//        tem.setLst(lst);
        TableChuContent tableChuContent=new TableChuContent();
        return tableChuContent.getTableChuContentById(id);
    }
    @GetMapping(value = "/chuid",params = "id",produces = {MediaType.APPLICATION_XML_VALUE},headers = "Accept=application/xml")
    public List<ChuContentEntity> getChuContentById1(@RequestParam("id") int id)  {
        TableChuContent tableChuContent=new TableChuContent();
        return tableChuContent.getTableChuContentById(id);
    }
    @GetMapping(value = "/chuid",params = {"start","end"},produces = {MediaType.APPLICATION_JSON_VALUE},headers = "Accept=application/json")
    public List<ChuContentEntity> getChuContentById1(@RequestParam("start") int start,@RequestParam("end") int end)  {
        TableChuContent tableChuContent=new TableChuContent();
        return tableChuContent.getTableChuContentById(start, end);
    }
}
