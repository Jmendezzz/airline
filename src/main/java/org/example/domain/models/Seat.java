package org.example.domain.models;

public class Seat {
  private String seatNumber;
  private String seatClass;
  private boolean isBooked;
  public boolean isBooked() {
    return isBooked;
  }

  public boolean isAvailable() {
    return !isBooked;
  }

  public void setBooked(boolean booked) {
    isBooked = booked;
  }

  public String getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }

  public String getSeatClass() {
    return seatClass;
  }

  public void setSeatClass(String seatClass) {
    this.seatClass = seatClass;
  }

  public void bookSeat() {
    this.isBooked = true;
  }
}
