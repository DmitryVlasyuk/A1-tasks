package com.example.A1.task3.entity;


import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "postings")
public class PostingsEntity {
    public String getMaterialDescription() {
        return MaterialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        MaterialDescription = materialDescription;
    }

    public double getAmount_LC() {
        return Amount_LC;
    }

    public void setAmount_LC(double amount_LC) {
        Amount_LC = amount_LC;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAuthedPosting() {
        return isAuthedPosting;
    }

    public void setAuthedPosting(boolean authedPosting) {
        isAuthedPosting = authedPosting;
    }

    private long MatDoc;
    private int Item;

    public PostingsEntity(long id, long matDoc, int item, Date docDate, Date pstngDate, String materialDescription, int quantity, String BUn, double amount_LC, String crcy, String userName, boolean isAuthedPosting) {
        this.id = id;
        MatDoc = matDoc;
        Item = item;
        DocDate = docDate;
        PstngDate = pstngDate;
        MaterialDescription = materialDescription;
        Quantity = quantity;
        this.BUn = BUn;
        Amount_LC = amount_LC;
        Crcy = crcy;
        UserName = userName;
        this.isAuthedPosting = isAuthedPosting;
    }

    @Override
    public String toString() {
        return "PostingsEntity{" +
                "id=" + id +
                ", MatDoc=" + MatDoc +
                ", Item=" + Item +
                ", DocDate=" + DocDate +
                ", PstngDate=" + PstngDate +
                ", MaterialDescription='" + MaterialDescription + '\'' +
                ", Quantity=" + Quantity +
                ", BUn='" + BUn + '\'' +
                ", Amount_LC=" + Amount_LC +
                ", Crcy='" + Crcy + '\'' +
                ", UserName='" + UserName + '\'' +
                ", isAuthedPosting=" + isAuthedPosting +
                '}';
    }

    @Temporal(TemporalType.DATE)
    private Date DocDate;
    @Temporal(TemporalType.DATE)
    private Date PstngDate;
    private String MaterialDescription;
    private int Quantity;
    private String BUn;
    private double Amount_LC;
    private String Crcy;
    private String UserName;
    private boolean isAuthedPosting;

    public PostingsEntity() {

    }

    public long getMatDoc() {
        return MatDoc;
    }

    public void setMatDoc(long matDoc) {
        MatDoc = matDoc;
    }

    public int getItem() {
        return Item;
    }

    public void setItem(int item) {
        Item = item;
    }

    public Date getDocDate() {
        return DocDate;
    }

    public void setDocDate(Date docDate) {
        DocDate = docDate;
    }

    public Date getPstngDate() {
        return PstngDate;
    }

    public void setPstngDate(Date pstngDate) {
        PstngDate = pstngDate;
    }


    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getBUn() {
        return BUn;
    }

    public void setBUn(String BUn) {
        this.BUn = BUn;
    }


    public String getCrcy() {
        return Crcy;
    }

    public void setCrcy(String crcy) {
        Crcy = crcy;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}

