package common;

final class Emp
{
    private Integer id;
    private String name;
    private Address address;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public Address getAddress() throws CloneNotSupportedException
  {

    return new Address();
  }

  public Emp(Integer id, String name, Address address)
  {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  @Override
  public String toString()
  {
    return "Emp{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", address=" + address +
      '}';
  }
}

class Address
{
  private String city;
  public Address(){}
  public Address(String city)
  {
    this.city = city;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  @Override
  public String toString()
  {
    return "Address{" +
      "city='" + city + '\'' +
      '}';
  }
}


public class ImmutableDemo
{
  public static void main(String[] args) throws CloneNotSupportedException
  {
    Emp e1 = new Emp(1, "Vikas", new Address("Mumbai"));
    System.out.println("Before:: "+e1);

    Address ad = e1.getAddress();
    ad.setCity("Pune");
    System.out.println("After:: "+e1);
  }
}
