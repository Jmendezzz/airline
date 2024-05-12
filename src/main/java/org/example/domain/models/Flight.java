package org.example.domain.models;

import java.time.LocalDateTime;
import java.util.List;

public class Flight {

  private Plane plane;
  private String origin;
  private String destination;
  private LocalDateTime departureTime;
  private LocalDateTime arrivalTime;
  private Airline airline;
  private Integer availableSeats;
  private List<FlightPassenger> passengers;

  public List<Seat> getSeats() {
    return this.plane.getSeats();
  }

  public void addPassenger(FlightPassenger passenger) {
    this.passengers.add(passenger);
    passenger.getSeat().bookSeat();
    this.availableSeats--;
  }
  public boolean hasAvailableSeats() {
    return this.availableSeats > 0;
  }
  public LocalDateTime getDepartureTime() {
    return departureTime;
  }

  public Plane getPlane() {
    return plane;
  }



}
