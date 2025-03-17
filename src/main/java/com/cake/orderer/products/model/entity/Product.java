package com.cake.orderer.products.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  private List<String> size;
  private String name;
  private List<Float> price;
  private String description;
  private String  nutritionTable;
  private String content;
}
