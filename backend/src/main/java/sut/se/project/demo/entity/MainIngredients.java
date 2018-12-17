package sut.se.project.demo.entity;

import lombok.*;
import javax.persistence.*;


@Entity
@Data

public class MainIngredients {

    @Id @GeneratedValue private Long id;
                        private @NonNull String name;
                       

    protected MainIngredients(){}

    public MainIngredients(Long id , String name){

                        this.id = id;
                        this.name = name;

    }    
}