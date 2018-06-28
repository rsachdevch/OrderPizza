package com.rsachdev.sandbox.Pizza;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {
    private PizzaRepository pizzaRepository;

    public PizzaController(PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping("/all")
    public List<Pizza> getAll(){
        List<Pizza> pizzas = this.pizzaRepository.findAll();

        return pizzas;
    }

    @GetMapping("/id/{id}")
    public Optional<Pizza> getById(@PathVariable("id") String id){
        Optional<Pizza> pizza = this.pizzaRepository.findById(id);
        return pizza;
    }

    @GetMapping("/name/{name}")
    public Pizza getByName(@PathVariable("name") String name){
        Pizza pizza = this.pizzaRepository.findByName(name);
        return pizza;
    }

    @PostMapping
    public void insert(@RequestBody Pizza pizza){
        this.pizzaRepository.insert(pizza);
    }

    @PutMapping
    public void update(@RequestBody Pizza pizza){
        this.pizzaRepository.save(pizza);
    }

    @GetMapping("pizzaId/{name}")
    public String getPizzaIdFromName(@PathVariable("name") String name){
        Pizza pizza = this.pizzaRepository.findByName(name);
        return pizza.getId();
    }
}
