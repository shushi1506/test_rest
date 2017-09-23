package demo.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "chu_categories", schema = "chundbcntt")
public class ChuCategoriesEntity {
    private int id;
    private int parentId;
    private String title;
    private String name;
    private String alias;
    private String image;
    private String section;
    private String imagePosition;
    private String description;
    private byte published;
    private int checkedOut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOutTime;
    private String editor;
    private int ordering;
    private byte access;
    private int count;
    private String params;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parent_id", nullable = false)
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
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
    @Column(name = "image", nullable = false, length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "section", nullable = false, length = 50)
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Basic
    @Column(name = "image_position", nullable = false, length = 30)
    public String getImagePosition() {
        return imagePosition;
    }

    public void setImagePosition(String imagePosition) {
        this.imagePosition = imagePosition;
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
    @Column(name = "published", nullable = false)
    public byte getPublished() {
        return published;
    }

    public void setPublished(byte published) {
        this.published = published;
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
    @Column(name = "checked_out_time", nullable = false,columnDefinition = "DATETIME")
    public Date getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(Date checkedOutTime) {
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
    @Column(name = "ordering", nullable = false)
    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    @Basic
    @Column(name = "access", nullable = false)
    public byte getAccess() {
        return access;
    }

    public void setAccess(byte access) {
        this.access = access;
    }

    @Basic
    @Column(name = "count", nullable = false)
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

        ChuCategoriesEntity that = (ChuCategoriesEntity) o;

        if (id != that.id) return false;
        if (parentId != that.parentId) return false;
        if (published != that.published) return false;
        if (checkedOut != that.checkedOut) return false;
        if (ordering != that.ordering) return false;
        if (access != that.access) return false;
        if (count != that.count) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (section != null ? !section.equals(that.section) : that.section != null) return false;
        if (imagePosition != null ? !imagePosition.equals(that.imagePosition) : that.imagePosition != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (checkedOutTime != null ? !checkedOutTime.equals(that.checkedOutTime) : that.checkedOutTime != null)
            return false;
        if (editor != null ? !editor.equals(that.editor) : that.editor != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + parentId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (section != null ? section.hashCode() : 0);
        result = 31 * result + (imagePosition != null ? imagePosition.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) published;
        result = 31 * result + checkedOut;
        result = 31 * result + (checkedOutTime != null ? checkedOutTime.hashCode() : 0);
        result = 31 * result + (editor != null ? editor.hashCode() : 0);
        result = 31 * result + ordering;
        result = 31 * result + (int) access;
        result = 31 * result + count;
        result = 31 * result + (params != null ? params.hashCode() : 0);
        return result;
    }
}
