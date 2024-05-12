package org.example.services.imp;

import org.example.domain.models.Flight;
import org.example.domain.models.Seat;
import org.example.services.FlightService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightServiceImp implements FlightService {

  private List<Flight> flights;
  public FlightServiceImp() {
    this.flights = new ArrayList<>();
  }

  @Override
  public List<Flight> getAvailableFlights() {
    LocalDateTime currentTime = LocalDateTime.now();

    return flights.stream()
            .filter(flight -> flight.getDepartureTime().isAfter(currentTime))
            .filter(flight -> flight.hasAvailableSeats())
            .toList();
  }

  @Override
  public List<Seat> getAvailableSeats(Flight flight) {
    List<Seat> flightSeats = flight.getSeats();
    return flightSeats.stream()
            .filter(seat -> seat.isAvailable())
            .toList();
  }


}
