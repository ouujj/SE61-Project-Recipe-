package sut.se.project.demo.controller;

import sut.se.project.demo.entity.*;
import sut.se.project.demo.respository.*;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Recipe")
class RecipeController{ 
        @Autowired private RecipeRespository recipeRespository;

        public RecipeController(RecipeRespository recipeRespository){
            this.recipeRespository=recipeRespository;

        }

        @GetMapping()
        public Collection<Recipe> recipes() {
            return recipeRespository.findAll().stream()
                    .collect(Collectors.toList());
        }

        @PostMapping()
        public void addRecipe(@RequestBody  Map<String , Object>  body){
             
            Recipe hotRecipe = new Recipe();
           
    }

        @DeleteMapping("delete/{id}")
        public  boolean deleteRecipe(@PathVariable  Long id) {
            try {
            recipeRespository.deleteById(id); 
                return true;
            }catch(Exception e) {
                return false;
            }

    }
        @PutMapping("update")
        public  Recipe updateRecipe(@RequestBody Recipe body) {
            try{    
            return recipeRespository.save(body);
            }catch(Exception e){
                return null;
            }
        
    }

}
