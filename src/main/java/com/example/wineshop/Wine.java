package com.example.wineshop;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wine {

    private @Id @GeneratedValue Long id;
    private @ManyToOne @JoinColumn(name = "winery") Winery winery;
    private int year;
    private double num_reviews;

    private @ManyToOne @JoinColumn(name = "region") Region region;

    private double price;

    private @ManyToOne @JoinColumn(name = "type") Type type;

    private int body;

    private int acidity;

    private double rating;

    private String name;

    public Wine() {}


    public Wine(Winery winery, int year, double num_reviews, Region region, double price, Type type, int body, int acidity,
                double rating, String name) {
        this.winery = winery;
        this.year = year;
        this.num_reviews = num_reviews;
        this.region = region;
        this.price = price;
        this.type = type;
        this.body = body;
        this.acidity = acidity;
        this.rating= rating;
        this.name= name;
    }

    /*Getters and setters*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Winery getWinery() {
        return winery;
    }

    public void setWinery(Winery winery) {
        this.winery = winery;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getNum_reviews() {
        return num_reviews;
    }

    public void setNum_reviews(double num_reviews) {
        this.num_reviews = num_reviews;
    }


    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getAcidity() {
        return acidity;
    }

    public void setAcidity(int acidity) {
        this.acidity = acidity;
    }



    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Wine))
            return false;
        Wine wine = (Wine) o;
        return  Double.compare(wine.price, price) == 0 && Double.compare(wine.rating, rating) == 0
                && num_reviews == wine.num_reviews && winery == wine.winery && type == wine.type
                && region == wine.region && id.equals(wine.id) && name.equals(wine.name)
                && Objects.equals(year, wine.year) && Objects.equals(body, wine.body) && Objects.equals(acidity, wine.acidity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.winery, this.year, this.region, this.price, this.name, this.region,
                this.acidity, this.body, this.num_reviews, this.rating);
    }

    @Override
    public String toString() {
        return "Wine{" + "id=" + this.id + ", winery='" + this.winery + '\'' + ", year='" + this.year
                + '\'' + ", rating='" + this.rating + '\'' + ", num_reviews='" + this.num_reviews
                +'\'' + ", region='" + this.region + '\'' + ", price='"
                + this.price + ", type='" + this.type + ", body='" + this.body + ", acidity='"
                + this.acidity + '\''+ ", name='" + this.name + '}';
    }



}


