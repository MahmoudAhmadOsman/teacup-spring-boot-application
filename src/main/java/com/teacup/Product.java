package com.teacup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Add Lombok annotation
@Data

//All Argument constructor
@AllArgsConstructor

//Add no argument constructor
@NoArgsConstructor


//Add Entity to annotate product class
@Entity
//Specify Table name in the database,if you don't specify JPA will use Product class as your Table name in the database
@Table(name="ProductTable")
public class Product {

    @Id
    @GeneratedValue
    private  int id;
    private  String name;
    private  int quantity;
    private  double price;

}
