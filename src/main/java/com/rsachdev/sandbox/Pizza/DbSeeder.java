package com.rsachdev.sandbox.Pizza;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {
    private PizzaRepository pizzaRepository;

    public DbSeeder (PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
        Pizza pepperoni = new Pizza("pepperoni");
        Pizza veggie = new Pizza("veggie");
        Pizza meatza = new Pizza("meatza");

        this.pizzaRepository.deleteAll();

        this.pizzaRepository.insert(pepperoni);
        this.pizzaRepository.insert(veggie);
        this.pizzaRepository.insert(meatza);
    }

}
