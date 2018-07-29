package com.ict.ecomApp.model;
import javax.persistence.*;

/*
 * Created by Asif
 *
 */
@Entity
@Table(name="ProductTable")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Price")
    private String price;

    @Column(name = "Profit_P")
    private String prof_per;

    @Column(name = "Product_Type")
    private String ptype;

    public Product() {
    }

    public Product(String name, String price, String prof_per, String ptype) {
        this.name = name;
        this.price = price;
        this.prof_per = prof_per;
        this.ptype = ptype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProf_per() {
        return prof_per;
    }

    public void setProf_per(String prof_per) {
        this.prof_per = prof_per;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", prof_per='" + prof_per + '\'' +
                ", ptype='" + ptype + '\'' +
                '}';
    }
}