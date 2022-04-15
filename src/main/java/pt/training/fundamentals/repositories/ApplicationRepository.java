package pt.training.fundamentals.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.training.fundamentals.entities.Application;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
