import java.util.List;

public class Person {

  private String id;
  private String referenceNumber;
  private String name;
  private String type;
  private Address address;
  private String telephone;
  private String email;

  public Person(String id, String referenceNumber, String name, String type, Address address, String telephone, String email) {
    this.id = id;
    this.referenceNumber = referenceNumber;
    this.name = name;
    this.type = type;
    this.address = address;
    this.telephone = telephone;
    this.email = email;
  }
}
