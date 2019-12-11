/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats;

import java.util.Objects;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class cat {
    private int age;
    private String catName;

    public cat(int age, String catName) {
        this.age = age;
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "cat{" + "age=" + age + ", catName=" + catName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cat other = (cat) obj;
        if (this.age != other.age) {
            return false;
        }
        return true;
    }

    
    
    
    
}
