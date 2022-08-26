public class Main {
  public static long main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    return service.calculate(amount, registered);
  }
}

