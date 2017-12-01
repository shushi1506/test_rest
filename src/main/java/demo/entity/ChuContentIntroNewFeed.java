package demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.sql.Timestamp;

/**
 * @author tuananh 11/22/2017
 * test_rest
 * demo.entity
 */
public class ChuContentIntroNewFeed  {

    @JsonProperty("Header")
    private String title;
    @JsonProperty("InfoMain")
    private String introtext;
    @JsonProperty("Text")
    private String fulltext;
    @JsonProperty("Url")
    private String urls;
    @JsonProperty("Time")
    private String created;

    @Basic
    @Column(name = "title", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Basic
    @Column(name = "introtext", nullable = false, length = -1)
    @XmlElement(name = "intro")
    public String getIntrotext() {
        return introtext;
    }

    public void setIntrotext(String introtext) {
        this.introtext = introtext;
    }

    @Basic
    @Column(name = "fulltext", nullable = false, length = -1)
    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }
    @Basic
    @Column(name = "created", nullable = false)
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
    @Basic
    @Column(name = "urls", nullable = false, length = -1)
    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

}
