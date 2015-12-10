package ilentt.ilenlab.com.dom;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "tbl_orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", length = 11)
    private Long orderID;
    @Column(name = "orderDate", nullable = false)
    private Date orderDate;
    @Column(name = "jobTitle", length = 45, nullable = false)
    private String jobTitle;
    @Column(name = "jobDescription", nullable = false)
    private String jobDescription;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "duration", length = 10, nullable = false)
    private String duration;
    @Column(name = "project", nullable = false)
    private String project;
    @Column(name = "salaryRange", length = 20, nullable = false)
    private String salaryRange;
    @Column(name = "experience", length = 15, nullable = false)
    private String experience;
    @Column(name = "location", nullable = false)
    private String location;
    @Column(name = "remainingQuantity", nullable = false)
    private int remainingQuantity;
    @Column(name = "isDelete", nullable = false)
    private boolean isDelete;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "createId")
    private Long createId;
    @Column(name = "updateDate")
    private Date updateDate;
    @Column(name = "updateId")
    private Long updateId;
    @Column(name = "deleteDate")
    private Date deleteDate;
    @Column(name = "deleteId")
    private Long deleteId;
    @Version
    @Column(name = "version", length = 10)
    private Long version;

    public Orders() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Orders(Date orderDate, String jobTitle, String jobDescription, int quantity, String duration, String project,
            String salaryRange, String experience, String location, int remainingQuantity, boolean isDelete,
            Date createDate) {
        super();
        this.orderDate = orderDate;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.quantity = quantity;
        this.duration = duration;
        this.project = project;
        this.salaryRange = salaryRange;
        this.experience = experience;
        this.location = location;
        this.remainingQuantity = remainingQuantity;
        this.isDelete = isDelete;
        this.createDate = createDate;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(int remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public Long getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(Long deleteId) {
        this.deleteId = deleteId;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
