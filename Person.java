package ca.uwo.csd.cs2212.jtayl294;

import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Person implements Serializable{

  private String name;
  private Address address;
  private List<String> phoneNumbers;
   transient private Thread myThread;
  
  private static final long serialVersionUID = 2L;
  private String gender;

  public Person() {
    this.phoneNumbers = new ArrayList<String>();
  }

  public Person(String name, Address address) {
    this();
    this.name = name;
    this.myThread= new Thread();
   this.address = address;
  }


  public void addPhoneNumber(String number) {
    this.phoneNumbers.add(number);
  }

  @Override
  public String toString() {
    StringBuilder msg = new StringBuilder();

    msg.append("Name      : ");
    msg.append(this.name);
    msg.append("\n");

    if (this.address != null)
      msg.append(this.address.toString());
    else
      msg.append("Address: null");

    for (String number : this.phoneNumbers) {
      msg.append("Telephone : ");
      msg.append(number);
      msg.append("\n");
    }

    return msg.toString();
  }
}
