public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println("Current Food" + f.getCurrentFood());
        f.simulateOneDay(12);
        System.out.println("Current Food" + f.getCurrentFood());

  }
}
