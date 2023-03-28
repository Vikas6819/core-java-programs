package org.example.core.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeDetails
{
  private int id;
  private String empName;
  private String deptName;
  private double empSal;

  public EmployeeDetails(int id, String empName, String deptName, double empSal)
  {
    this.id = id;
    this.empName = empName;
    this.deptName = deptName;
    this.empSal = empSal;
  }

  public int getId()
  {
    return id;
  }

  public String getEmpName()
  {
    return empName;
  }

  public String getDeptName()
  {
    return deptName;
  }

  public double getEmpSal()
  {
    return empSal;
  }

  @Override
  public String toString()
  {
    return "EmployeeDetails{" +
      "id=" + id +
      ", empName='" + empName + '\'' +
      ", deptName='" + deptName + '\'' +
      ", empSal=" + empSal +
      '}';
  }
}

public class EmployeeDetailsDemo
{
  public static void main(String[] args)
  {
      EmployeeDetails e1 =  new EmployeeDetails(1, "Vikas", "Developer", 25.2);
      EmployeeDetails e2 =  new EmployeeDetails(2, "Akshay", "Developer", 25.2);
      EmployeeDetails e3 =  new EmployeeDetails(3, "Suneet", "IT", 25.2);
      EmployeeDetails e4 =  new EmployeeDetails(4, "Vaibhav", "IT", 25.2);
      EmployeeDetails e5 =  new EmployeeDetails(5, "Sumedh", "Support", 25.2);
      EmployeeDetails e6 =  new EmployeeDetails(6, "Keshav", "Admin", 25.2);

      List<EmployeeDetails> list = Arrays.asList(e1,e2,e3,e4,e5,e6);

      list.stream()
        .collect(Collectors.groupingBy(EmployeeDetails::getDeptName))
        .entrySet()
        .stream()
        .forEach(System.out::println);

  }
}
