package com.example.cardapio.food;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

  @Autowired private FoodRepository repository;

  public List<FoodResponse> findAll() {
    return repository.findAll().stream().map(FoodResponse::new).toList();
  }

  public void save(FoodRequest data) {
    repository.save(new Food(data));
  }
}
