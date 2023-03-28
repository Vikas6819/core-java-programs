package org.example.core.java8;

import java.time.LocalDate;

@FunctionalInterface
interface Predicate<T>
{
    public boolean isEven(T name);
}

@FunctionalInterface
interface Supplier<T>
{
  public T getTime();
}

@FunctionalInterface
interface Consumer<T>
{
  public void display(T type);
}

public class PredicateDemo
{
  public static void main(String[] args)
  {
     Predicate<String> p1 = (String name) -> name.length() %2 == 0;

    System.out.println(p1.isEven("Vikas"));

    Supplier<LocalDate> s1 = () -> LocalDate.now();

    System.out.println(s1.getTime());

    Consumer<String> c1 = (String name) -> System.out.println(name);

    c1.display("Vikas");
  }
}
