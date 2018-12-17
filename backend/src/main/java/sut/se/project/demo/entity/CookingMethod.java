package sut.se.project.demo.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data

public class CookingMethod {

    @Id @GeneratedValue private Long id;
                        private @NonNull String name;

    protected CookingMethod(){}

    public CookingMethod(Long id , String name){
                    
                        this.id = id;
                        this.name =name;
    }                       

}