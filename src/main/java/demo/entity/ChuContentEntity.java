package demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "chu_content", schema = "chundbcntt")
public class ChuContentEntity {
    private int id;
    private String title;
    private String alias;
    private String titleAlias;
    private String introtext;
    private String fulltext;
    private byte state;
    private int sectionid;
    private int mask;
    private int catid;
    private Timestamp created;
    private int createdBy;
    private String createdByAlias;
    private Timestamp modified;
    private int modifiedBy;
    private int checkedOut;
    private Timestamp checkedOutTime;
    private Timestamp publishUp;
    private Timestamp publishDown;
    private String images;
    private String urls;
    private String attribs;
    private int version;
    private int parentid;
    private int ordering;
    private String metakey;
    private String metadesc;
    private int access;
    private int hits;
    private String metadata;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "title_alias", nullable = false, length = 255)
    public String getTitleAlias() {
        return titleAlias;
    }

    public void setTitleAlias(String titleAlias) {
        this.titleAlias = titleAlias;
    }

    @Basic
    @Column(name = "introtext", nullable = false, length = -1)
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
    @Column(name = "state", nullable = false)
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "sectionid", nullable = false)
    public int getSectionid() {
        return sectionid;
    }

    public void setSectionid(int sectionid) {
        this.sectionid = sectionid;
    }

    @Basic
    @Column(name = "mask", nullable = false)
    public int getMask() {
        return mask;
    }

    public void setMask(int mask) {
        this.mask = mask;
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
    @Column(name = "created", nullable = false)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "created_by", nullable = false)
    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_by_alias", nullable = false, length = 255)
    public String getCreatedByAlias() {
        return createdByAlias;
    }

    public void setCreatedByAlias(String createdByAlias) {
        this.createdByAlias = createdByAlias;
    }

    @Basic
    @Column(name = "modified", nullable = false)
    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    @Basic
    @Column(name = "modified_by", nullable = false)
    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Basic
    @Column(name = "checked_out", nullable = false)
    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
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
    @Column(name = "images", nullable = false, length = -1)
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Basic
    @Column(name = "urls", nullable = false, length = -1)
    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    @Basic
    @Column(name = "attribs", nullable = false, length = -1)
    public String getAttribs() {
        return attribs;
    }

    public void setAttribs(String attribs) {
        this.attribs = attribs;
    }

    @Basic
    @Column(name = "version", nullable = false)
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Basic
    @Column(name = "parentid", nullable = false)
    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
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
    @Column(name = "metakey", nullable = false, length = -1)
    public String getMetakey() {
        return metakey;
    }

    public void setMetakey(String metakey) {
        this.metakey = metakey;
    }

    @Basic
    @Column(name = "metadesc", nullable = false, length = -1)
    public String getMetadesc() {
        return metadesc;
    }

    public void setMetadesc(String metadesc) {
        this.metadesc = metadesc;
    }

    @Basic
    @Column(name = "access", nullable = false)
    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    @Basic
    @Column(name = "hits", nullable = false)
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Basic
    @Column(name = "metadata", nullable = false, length = -1)
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChuContentEntity that = (ChuContentEntity) o;

        if (id != that.id) return false;
        if (state != that.state) return false;
        if (sectionid != that.sectionid) return false;
        if (mask != that.mask) return false;
        if (catid != that.catid) return false;
        if (createdBy != that.createdBy) return false;
        if (modifiedBy != that.modifiedBy) return false;
        if (checkedOut != that.checkedOut) return false;
        if (version != that.version) return false;
        if (parentid != that.parentid) return false;
        if (ordering != that.ordering) return false;
        if (access != that.access) return false;
        if (hits != that.hits) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (titleAlias != null ? !titleAlias.equals(that.titleAlias) : that.titleAlias != null) return false;
        if (introtext != null ? !introtext.equals(that.introtext) : that.introtext != null) return false;
        if (fulltext != null ? !fulltext.equals(that.fulltext) : that.fulltext != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdByAlias != null ? !createdByAlias.equals(that.createdByAlias) : that.createdByAlias != null)
            return false;
        if (modified != null ? !modified.equals(that.modified) : that.modified != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (publishUp != null ? !publishUp.equals(that.publishUp) : that.publishUp != null) return false;
        if (publishDown != null ? !publishDown.equals(that.publishDown) : that.publishDown != null) return false;
        if (images != null ? !images.equals(that.images) : that.images != null) return false;
        if (urls != null ? !urls.equals(that.urls) : that.urls != null) return false;
        if (attribs != null ? !attribs.equals(that.attribs) : that.attribs != null) return false;
        if (metakey != null ? !metakey.equals(that.metakey) : that.metakey != null) return false;
        if (metadesc != null ? !metadesc.equals(that.metadesc) : that.metadesc != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (titleAlias != null ? titleAlias.hashCode() : 0);
        result = 31 * result + (introtext != null ? introtext.hashCode() : 0);
        result = 31 * result + (fulltext != null ? fulltext.hashCode() : 0);
        result = 31 * result + (int) state;
        result = 31 * result + sectionid;
        result = 31 * result + mask;
        result = 31 * result + catid;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + createdBy;
        result = 31 * result + (createdByAlias != null ? createdByAlias.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + modifiedBy;
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + (publishUp != null ? publishUp.hashCode() : 0);
        result = 31 * result + (publishDown != null ? publishDown.hashCode() : 0);
        result = 31 * result + (images != null ? images.hashCode() : 0);
        result = 31 * result + (urls != null ? urls.hashCode() : 0);
        result = 31 * result + (attribs != null ? attribs.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + parentid;
        result = 31 * result + ordering;
        result = 31 * result + (metakey != null ? metakey.hashCode() : 0);
        result = 31 * result + (metadesc != null ? metadesc.hashCode() : 0);
        result = 31 * result + access;
        result = 31 * result + hits;
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        return result;
    }
}
