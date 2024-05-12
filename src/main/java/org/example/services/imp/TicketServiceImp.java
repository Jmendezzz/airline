package org.example.services.imp;

import org.example.domain.models.Flight;
import org.example.domain.models.FlightPassenger;
import org.example.domain.models.Seat;
import org.example.domain.models.User;
import org.example.services.FlightService;
import org.example.services.TicketService;


public class TicketServiceImp implements TicketService {
  private final FlightService flightService;
  public TicketServiceImp(FlightService flightService) {
    this.flightService = flightService;
  }
  @Override
  public void buyFlightTicket(Flight flight, User user) {
    Seat seat = getRandomSeat(flight);
    FlightPassenger flightPassenger = new FlightPassenger(user,seat);
    flight.addPassenger(flightPassenger);
  }

  private Seat getRandomSeat(Flight flight) {
    return flightService.getAvailableSeats(flight).get(0);
  }
}
