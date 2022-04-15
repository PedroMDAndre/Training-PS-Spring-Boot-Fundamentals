package pt.training.fundamentals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.training.fundamentals.entity.Release;

@Repository
public interface ReleaseRepository extends CrudRepository<Release, Long> {

}
