package pt.training.fundamentals.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.training.fundamentals.entities.Release;

@Repository
public interface ReleaseRepository extends CrudRepository<Release, Long> {

}
