package pt.training.fundamentals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.training.fundamentals.entity.Application;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
