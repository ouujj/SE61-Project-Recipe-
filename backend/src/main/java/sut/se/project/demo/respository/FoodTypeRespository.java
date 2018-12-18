package sut.se.project.demo.respository;

        import sut.se.project.demo.entity.FoodType;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;
        import org.springframework.web.bind.annotation.CrossOrigin;



@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface FoodTypeRespository extends JpaRepository<FoodType, Long> {

}