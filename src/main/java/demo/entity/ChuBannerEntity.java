package demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "chu_banner", schema = "chundbcntt", catalog = "")
public class ChuBannerEntity {
    private int bid;
    private int cid;
    private String type;
    private String name;
    private String alias;
    private int imptotal;
    private int impmade;
    private int clicks;
    private String imageurl;
    private String clickurl;
    private Timestamp date;
    private byte showBanner;
    private byte checkedOut;
    private Timestamp checkedOutTime;
    private String editor;
    private String custombannercode;
    private int catid;
    private String description;
    private byte sticky;
    private int ordering;
    private Timestamp publishUp;
    private Timestamp publishDown;
    private String tags;
    private String params;

    @Id
    @Column(name = "bid", nullable = false)
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "cid", nullable = false)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 30)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "alias", nullable = false, length = 255)
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Basic
    @Column(name = "imptotal", nullable = false)
    public int getImptotal() {
        return imptotal;
    }

    public void setImptotal(int imptotal) {
        this.imptotal = imptotal;
    }

    @Basic
    @Column(name = "impmade", nullable = false)
    public int getImpmade() {
        return impmade;
    }

    public void setImpmade(int impmade) {
        this.impmade = impmade;
    }

    @Basic
    @Column(name = "clicks", nullable = false)
    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    @Basic
    @Column(name = "imageurl", nullable = false, length = 100)
    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @Basic
    @Column(name = "clickurl", nullable = false, length = 200)
    public String getClickurl() {
        return clickurl;
    }

    public void setClickurl(String clickurl) {
        this.clickurl = clickurl;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "showBanner", nullable = false)
    public byte getShowBanner() {
        return showBanner;
    }

    public void setShowBanner(byte showBanner) {
        this.showBanner = showBanner;
    }

    @Basic
    @Column(name = "checked_out", nullable = false)
    public byte getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(byte checkedOut) {
        this.checkedOut = checkedOut;
    }

    @Basic
    @Column(name = "checked_out_time", nullable = false)
    public Timestamp getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Timestamp checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    @Basic
    @Column(name = "editor", nullable = true, length = 50)
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Basic
    @Column(name = "custombannercode", nullable = true, length = -1)
    public String getCustombannercode() {
        return custombannercode;
    }

    public void setCustombannercode(String custombannercode) {
        this.custombannercode = custombannercode;
    }

    @Basic
    @Column(name = "catid", nullable = false)
    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "sticky", nullable = false)
    public byte getSticky() {
        return sticky;
    }

    public void setSticky(byte sticky) {
        this.sticky = sticky;
    }

    @Basic
    @Column(name = "ordering", nullable = false)
    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    @Basic
    @Column(name = "publish_up", nullable = false)
    public Timestamp getPublishUp() {
        return publishUp;
    }

    public void setPublishUp(Timestamp publishUp) {
        this.publishUp = publishUp;
    }

    @Basic
    @Column(name = "publish_down", nullable = false)
    public Timestamp getPublishDown() {
        return publishDown;
    }

    public void setPublishDown(Timestamp publishDown) {
        this.publishDown = publishDown;
    }

    @Basic
    @Column(name = "tags", nullable = false, length = -1)
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Basic
    @Column(name = "params", nullable = false, length = -1)
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChuBannerEntity that = (ChuBannerEntity) o;

        if (bid != that.bid) return false;
        if (cid != that.cid) return false;
        if (imptotal != that.imptotal) return false;
        if (impmade != that.impmade) return false;
        if (clicks != that.clicks) return false;
        if (showBanner != that.showBanner) return false;
        if (checkedOut != that.checkedOut) return false;
        if (catid != that.catid) return false;
        if (sticky != that.sticky) return false;
        if (ordering != that.ordering) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (imageurl != null ? !imageurl.equals(that.imageurl) : that.imageurl != null) return false;
        if (clickurl != null ? !clickurl.equals(that.clickurl) : that.clickurl != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (editor != null ? !editor.equals(that.editor) : that.editor != null) return false;
        if (custombannercode != null ? !custombannercode.equals(that.custombannercode) : that.custombannercode != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (publishUp != null ? !publishUp.equals(that.publishUp) : that.publishUp != null) return false;
        if (publishDown != null ? !publishDown.equals(that.publishDown) : that.publishDown != null) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bid;
        result = 31 * result + cid;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + imptotal;
        result = 31 * result + impmade;
        result = 31 * result + clicks;
        result = 31 * result + (imageurl != null ? imageurl.hashCode() : 0);
        result = 31 * result + (clickurl != null ? clickurl.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (int) showBanner;
        result = 31 * result + (int) checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + (editor != null ? editor.hashCode() : 0);
        result = 31 * result + (custombannercode != null ? custombannercode.hashCode() : 0);
        result = 31 * result + catid;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) sticky;
        result = 31 * result + ordering;
        result = 31 * result + (publishUp != null ? publishUp.hashCode() : 0);
        result = 31 * result + (publishDown != null ? publishDown.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        return result;
    }
}
