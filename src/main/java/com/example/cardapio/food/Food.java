package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "foods")
@Entity(name = "foods")
public class Food {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private String image;
  private Integer price;

  public Food(FoodRequest data) {
    this.image = data.image();
    this.price = data.price();
    this.title = data.title();
  }
}
