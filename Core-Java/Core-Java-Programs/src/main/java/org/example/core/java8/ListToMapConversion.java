package org.example.core.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Hosting {

  private int Id;
  private String name;
  private long websites;

  public Hosting(int id, String name, long websites) {
    Id = id;
    this.name = name;
    this.websites = websites;
  }

  public int getId()
  {
    return Id;
  }

  public void setId(int id)
  {
    Id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public long getWebsites()
  {
    return websites;
  }

  public void setWebsites(long websites)
  {
    this.websites = websites;
  }
  //getters, setters and toString()
}

public class ListToMapConversion
{
  public static void main(String[] args)
  {
    List<Hosting> list = new ArrayList<>();
    list.add(new Hosting(1, "liquidweb.com", 80000));
    list.add(new Hosting(2, "linode.com", 90000));
    list.add(new Hosting(3, "digitalocean.com", 120000));
    list.add(new Hosting(4, "aws.amazon.com", 200000));
    list.add(new Hosting(5, "mkyong.com", 1));

    Map<Integer, String> collect = list.stream()
      .collect(Collectors.toMap(Hosting::getId, Hosting::getName));

    System.out.println(collect);

    // key=name value=website
    Map<String, Long> collect1 = list.stream()
      .collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));

    System.out.println(collect1);

    List<String> list2 = Arrays.asList("abc", "pqrs", "cd");

    Map<Integer, String> collect2 = list2.stream()
      .collect(Collectors.toMap((key) -> key.length(), (val) -> val));

    System.out.println("Example:: "+ collect2);

  }
}
