package sut.se.project.demo;

import sut.se.project.demo.entity.*;
import sut.se.project.demo.respository.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class RecipeDataloader implements ApplicationRunner {

    @Autowired  private CookingMethodRespository cookingMethodRespository;
    @Autowired  private FoodTypeRespository foodTypeRespository;
    @Autowired  private MainIngredRespository mainIngredRespository;
    @Autowired private RecipeRespository recipeRespository;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {

        cookingMethodRespository.save(new CookingMethod("ทอด"));
        cookingMethodRespository.save(new CookingMethod("ปิ้ง"));
        cookingMethodRespository.save(new CookingMethod("ย่าง"));
        cookingMethodRespository.save(new CookingMethod("นึ่ง"));
        cookingMethodRespository.save(new CookingMethod("ต้ม"));
        cookingMethodRespository.save(new CookingMethod("ผัด"));
        cookingMethodRespository.save(new CookingMethod("แกง"));

        foodTypeRespository.save(new FoodType("คาว"));
        foodTypeRespository.save(new FoodType("หวาน"));
        foodTypeRespository.save(new FoodType("ของว่าง"));
        foodTypeRespository.save(new FoodType("ขนม"));

        mainIngredRespository.save(new MainIngredients("หมู"));
        mainIngredRespository.save(new MainIngredients("หมึก"));
        mainIngredRespository.save(new MainIngredients("กุ้ง"));
        mainIngredRespository.save(new MainIngredients("ไก่"));
        mainIngredRespository.save(new MainIngredients("ปลา"));
        mainIngredRespository.save(new MainIngredients("ไข่"));
        mainIngredRespository.save(new MainIngredients("อื่นๆ"));

       
        cookingMethodRespository.findAll().forEach(System.out::println);
        foodTypeRespository.findAll().forEach(System.out::println);
        mainIngredRespository.findAll().forEach(System.out::println);
       
	}
    
}