package org.example.domain.models;

public class FlightPassenger {
  private User user;
  private Seat seat;

  public FlightPassenger(User user, Seat seat) {
    this.user = user;
    this.seat = seat;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Seat getSeat() {
    return seat;
  }

  public void setSeat(Seat seat) {
    this.seat = seat;
  }
}
