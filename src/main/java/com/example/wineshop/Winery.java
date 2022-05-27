package com.example.wineshop;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Winery {

    private @Id @GeneratedValue Long id;

    private String name;

    public Winery(String name) {
        this.name = name;
    }

    public Winery() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Winery))
            return false;
        Winery winery = (Winery) o;
        return Objects.equals(this.id, winery.id) && Objects.equals(this.name, winery.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Winery{" + "id=" + this.id + ", name='" + this.name + '\'' + '}';
    }



}
