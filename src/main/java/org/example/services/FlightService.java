package org.example.services;

import org.example.domain.models.Flight;
import org.example.domain.models.Seat;


import java.util.List;

public interface FlightService {
  List<Flight> getAvailableFlights();
  List<Seat> getAvailableSeats(Flight flight);

}
