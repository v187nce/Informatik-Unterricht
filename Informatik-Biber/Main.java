public class Main {

  private static Stack<Teller> teller = new Stack<Teller>(); 
  private static Queue<Biber> biber = new Queue<Biber>(); 

  public static boolean groessePasst() {
    Queue<Biber> hilfBiber = new Queue<Biber>(); 
    hilfbiber = biber;
    Stack<Teller> hilfTeller = new Stack<Teller>(); 
    hilfTeller = teller; 
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