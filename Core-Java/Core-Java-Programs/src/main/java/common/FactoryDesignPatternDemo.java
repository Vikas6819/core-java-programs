package common;

interface PaymentMethod
{
  void processPayment();
}

class NetBanking implements PaymentMethod
{

  @Override
  public void processPayment()
  {
    System.out.println("Netbanking");
  }
}

class UPI implements PaymentMethod
{

  @Override
  public void processPayment()
  {
    System.out.println("UPI");
  }
}

class PaymentMethodFactory
{
  public static PaymentMethod getPaymentMethod(String name)
  {
    if (name.equals("UPI"))
      return new UPI();
    else if (name.equals("NET"))
    {
      return new NetBanking();
    }
    else {
      return null;
    }
  }
}

public class FactoryDesignPatternDemo
{
  String req = "reqId=123&payType=UPI";

  public static void main(String[] args)
  {
    PaymentMethod net = PaymentMethodFactory.getPaymentMethod("NET");
    net.processPayment();
    PaymentMethod upi = PaymentMethodFactory.getPaymentMethod("UPI");
    upi.processPayment();
  }
}
