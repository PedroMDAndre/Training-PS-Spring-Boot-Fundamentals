package pt.training.fundamentals.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pt.training.fundamentals.entities.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
