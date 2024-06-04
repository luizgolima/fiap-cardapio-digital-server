package com.example.cardapio.controller;

import com.example.cardapio.food.FoodRequest;
import com.example.cardapio.food.FoodResponse;
import com.example.cardapio.food.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FoodController {

  @Autowired private FoodService service;

  @GetMapping
  public List<FoodResponse> findAll() {
    return service.findAll();
  }

  @PostMapping
  public void save(@RequestBody FoodRequest data) {
    service.save(data);
  }
}
