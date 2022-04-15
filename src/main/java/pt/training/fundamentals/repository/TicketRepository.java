package pt.training.fundamentals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.training.fundamentals.entity.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
