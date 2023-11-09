public class Main {


  private static Stack<Teller> teller;
  private static Queue<Biber> biber;

  public static boolean groessePasst() {
    Queue<Biber> hilfBiber = biber;
    Stack<Teller> hilfTeller = teller;
    while (!biber.isEmpty()) {
      if (biber.front().getGroesse() != teller.top().getGroesse()) {
        biber = hilfBiber;
        teller = hilfTeller;
        return false;
      } else {
        biber.dequeue();
        teller.pop();
      }
    }
    biber = hilfBiber;
    teller = hilfTeller;
    return true;
  }

  public static void main(String[] args) {


    //test 
    teller = new Stack<>();
    biber = new Queue<>();
    teller.push(new Teller(1));
    biber.enqueue(new Biber(1));

    System.out.println(groessePasst());
  }
}