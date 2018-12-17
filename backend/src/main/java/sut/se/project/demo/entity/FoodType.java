package sut.se.project.demo.entity;

import lombok.*;
import javax.persistence.*;


@Entity
@Data

public class FoodType {

    @Id @GeneratedValue private Long id;
                        private @NonNull String name;
                       
    protected FoodType(){}

    public FoodType(Long id , String name){

                        this.id = id;
                        this.name =name;
    }

}