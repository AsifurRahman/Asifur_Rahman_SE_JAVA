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

    @Column(name = "Product_Type")
    private String ptype;

    @Column(name = "p_percent")
    private int pp;

    public Product() {
    }

    public Product(String name, String price, String ptype) {
        this.name = name;
        this.price = price;
        this.ptype = ptype;
    }

    public Product(String name, String price, String ptype, int pp) {
        this.name = name;
        this.price = price;
        this.ptype = ptype;
        this.pp = pp;
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


    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", ptype='" + ptype + '\'' +
                ", pp=" + pp +
                '}';
    }
}