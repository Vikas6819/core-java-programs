package org.example.core.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RandomDigitDemo
{
  public static void main(String[] args)
  {
    Random random = new Random();
   // random.ints().limit(10).forEach(System.out::println);

    Integer max = Stream.of(1, 2, 3, 4, 5, 6,7)
      .max(Comparator.comparing(Integer::intValue))
      .get();

   // System.out.println(max);

    List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");

    stringList.stream()
      .filter(str -> str.length() > 3)
      .forEach(System.out::println);

    List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);

    integerList.stream()
      .map(no -> no * 3)
      .forEach(System.out::println);

    List<Integer> integerList1 = Arrays.asList(1,2,3,4);
    List<Integer> integerList2 = Arrays.asList(5,6,7,4);
    Stream<Integer> concatStream = Stream.concat(integerList1.stream(), integerList2.stream());
    concatStream.forEach(System.out::println);

    System.out.println(LocalDate.now());//date
    System.out.println(LocalTime.now());//time
    System.out.println(LocalDateTime.now());// datetime


    List<Integer> l = Arrays.asList(4,5,6,7,1,2,3);
    System.out.println(l.stream()
      .mapToInt(Integer::intValue)
      .sum());
  }
}
