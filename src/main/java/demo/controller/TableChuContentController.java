package demo.controller;

import demo.core.impletemend.ResponeCreateChuContent;
import demo.core.mysql.crud.TableChuContent;
import demo.entity.ChuContentEntity;
import demo.entity.ChuContentIntroNewFeed;
import demo.entity.ChuContentTitleEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TableChuContentController {

    @RequestMapping(value = "/newfeed/{id}",produces={MediaType.APPLICATION_JSON_VALUE},headers = "Accept=application/json")
    public List<ChuContentEntity> getChuContentById(@PathVariable("id") int id)  {
        TableChuContent tableChuContent=new TableChuContent();
        return tableChuContent.getTableChuContentById(id);
    }
    @GetMapping(value = "/newfeed/chuid",params = "id",produces = {MediaType.APPLICATION_XML_VALUE},headers = "Accept=application/xml")
    public List<ChuContentEntity> getChuContentById1(@RequestParam("id") int id)  {
        TableChuContent tableChuContent=new TableChuContent();
        return tableChuContent.getTableChuContentById(id);
    }
    @GetMapping(value = "/newfeed2",produces = {MediaType.APPLICATION_JSON_VALUE},headers = "Accept=application/json")
    public List<ChuContentIntroNewFeed> getChuContentById2()  {
        TableChuContent tableChuContent=new TableChuContent();
        return tableChuContent.getNewFeedChuContent2();
    }
    @GetMapping(value = "/newfeed/chuid",params = {"start","end"},produces = {MediaType.APPLICATION_JSON_VALUE},headers = "Accept=application/json")
    public List<ChuContentEntity> getChuContentById1(@RequestParam("start") int start,@RequestParam("end") int end)  {
        TableChuContent tableChuContent=new TableChuContent();
        return tableChuContent.getTableChuContentById(start, end);
    }
    @GetMapping(value = "/newfeed/chucontent/title",produces = {MediaType.APPLICATION_JSON_VALUE},headers = {"Accept=application/json"})
    public List<ChuContentTitleEntity>getChuContentTitle(){
        TableChuContent tableChuContent=new TableChuContent();
        return tableChuContent.getTitleChuContent();
    }
    @PostMapping(value = "/newfeed/chucontent/")
    public ResponeCreateChuContent createChuContent(@RequestBody ChuContentEntity chuContentEntity){
        TableChuContent tableChuContent=new TableChuContent();
        return tableChuContent.createChuContent(chuContentEntity);
    }
}
