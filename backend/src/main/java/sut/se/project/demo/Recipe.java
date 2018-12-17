package sut.se.project.demo;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Recipe {

    @Id @GeneratedValue private Long id;
                        private @NonNull String name;
                        private String  urlPhoto;



}