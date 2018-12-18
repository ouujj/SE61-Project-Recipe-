package sut.se.project.demo.controller;

import sut.se.project.demo.entity.*;
import sut.se.project.demo.respository.*;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/MainIngraed")
class MainIngraedintsController{
    private  MainIngredRespository mainIngredRespository;
	

    public  MainIngraedintsController(MainIngredRespository mainIngredRespository){
        this.mainIngredRespository=mainIngredRespository;

    }

    @GetMapping()
    public Collection<MainIngredients> mainIngredients(){
        return mainIngredRespository.findAll().stream().collect(Collectors.toList());
    
    }


}

