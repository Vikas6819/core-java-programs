package common;

interface Animal
{
  void eat();
}

class Dog implements Animal
{
  @Override
  public void eat()
  {
    System.out.println("Dog EAT");
  }
}

class Duck implements Animal
{

  @Override
  public void eat()
  {

  }
}

interface Color
{
  void paint();
}

class White implements Color
{
  @Override
  public void paint()
  {
    System.out.println("White Paint");
  }
}

class Red implements Color
{

  @Override
  public void paint()
  {
    System.out.println("Red Paint");
  }
}

interface AbstractFactory<T>
{
  T create(String type);
}

class AnimalFactory implements AbstractFactory<Animal>
{

  @Override
  public Animal create(String type)
  {
    if (type.equalsIgnoreCase("Dog"))
      return new Dog();
    else if (type.equalsIgnoreCase("duck"))
      return new Duck();
    else
      return null;

  }
}

class FactoryProvider
{

  public static AbstractFactory getFactory(String type)
  {
    if (type.equalsIgnoreCase("animal"))
      return new AnimalFactory();
    else if (type.equalsIgnoreCase("color"))
    {
      return new ColorFactory();
    }
    else
      return null;
  }
}

class ColorFactory implements AbstractFactory<Color>
{

  @Override
  public Color create(String type)
  {
    if (type.equalsIgnoreCase("white"))
      return new White();
    else if (type.equalsIgnoreCase("red"))
      return new Red();
    else
      return null;

  }
}

public class AbstractFactoryDemo
{
  public static void main(String[] args)
  {
    AbstractFactory provider = FactoryProvider.getFactory("animal");
    Object dog = provider.create("dog");
  }
}
