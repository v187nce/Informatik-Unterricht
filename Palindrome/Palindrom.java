package Palindrome;

public class Palindrom {
  Stack<Character> stack = new Stack<Character>();
  Queue<Character> queue = new Queue<Character>();

  public void testeString(){
    
  }

  public boolean palindrom(String palindromWort) {
    for (int i = 0; i < palindromWort.length(); i++) {
      this.stack.push(palindromWort.charAt(i));
      this.queue.enqueue(palindromWort.charAt(i));
    }
    while (!this.stack.isEmpty() && !this.queue.isEmpty()) {
      if (this.stack.top() != this.queue.front()) {
        return false;
      }
      this.stack.pop();
      this.queue.dequeue();
    }
    return true;
  }

  public String createPalindrom(String palindromWort) {
    Queue<Character> queue = new Queue<>();
    Stack<Character> stack = new Stack<>();
    String palindrom = "";
    for (int i = 0; i < palindromWort.length(); i++) {
      queue.enqueue(palindromWort.charAt(i));
    }
    for (int i = 0; i < palindromWort.length(); i++) {
      stack.push(palindromWort.charAt(i));
    }
    do {
      queue.enqueue(stack.top());
      stack.pop();
    } while (!stack.isEmpty());
    while (!queue.isEmpty()) {
      palindrom += queue.front();
      queue.dequeue();
    }
    return palindrom;
  }

}
