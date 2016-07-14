package ca.uwo.csd.cs2212.jtayl294;

import java.lang.StringBuilder;
import java.io.Serializable;

public class Address implements Serializable  {

  private String street;
  private String city;
   private String country;
  transient private Thread myThread;


  public Address(String street, String city, String country) {
    this.street = street;
    this.city = city;
    this.country = country;
    this.myThread = new Thread();
  }

  public String toString() {
    StringBuilder msg = new StringBuilder();

    msg.append("Street    : ");
    msg.append(this.street);
    msg.append("\n");

    msg.append("City      : ");
    msg.append(this.city);
    msg.append("\n");

    msg.append("Country   : ");
    msg.append(this.country);
    msg.append("\n");

    return msg.toString();
  }

}
