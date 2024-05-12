package org.example.services;

import org.example.domain.models.Flight;
import org.example.domain.models.User;


public interface TicketService {
  void buyFlightTicket(Flight flight, User user);

}
