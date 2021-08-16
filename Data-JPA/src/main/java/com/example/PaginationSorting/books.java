package com.example.PaginationSorting;

import javax.persistence.*;

@Entity
@Table(name="books")
public class books {

    @Id
    @GeneratedValue
    @Column(name="book_id")
    private Integer id;

    @Column(name="book_name")
    private String name;

    @Column(name="book_price")
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
