package org.example.core.java8;


import java.util.List;

class Employee
{
  private int id;
  private String name;
  private int salary;

  public Employee(int id, String name, int salary)
  {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public String getName()
  {
    return name;
  }

  public int getSalary()
  {
    return salary;
  }

  @Override
  public String toString()
  {
    return "Employee{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", salary=" + salary +
      '}';
  }
}


public class CustomSort
{
  public static void main(String[] args)
  {
    Employee e1 = new Employee(1, "vikas", 12);
    Employee e2 = new Employee(2, "vikas", 15);
    Employee e3 = new Employee(3, "akshay", 12);
    Employee e4 = new Employee(4, "suneet", 12);

    List<Employee> employeeList = List.of(e1,e2,e3,e4);

    employeeList.stream()
      .sorted((emp1,emp2) -> {
        if(emp1.getName().equals(emp2.getName()))
        {
          if(emp1.getSalary() > emp2.getSalary())
            return 1;
          else
            return -1;
        }
        else
        {
         return emp1.getName().compareTo(emp2.getName());
        }
      }).forEach(System.out::println);
  }
}
