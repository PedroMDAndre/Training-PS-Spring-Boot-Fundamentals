package pt.training.fundamentals.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.training.fundamentals.entities.Ticket;
import pt.training.fundamentals.repositories.TicketRepository;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }

}
