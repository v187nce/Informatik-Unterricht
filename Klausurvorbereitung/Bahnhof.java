package Klausurvorbereitung; 

public class Bahnhof{
    private Stack<Wagon> gleisA;  
    private Stack<Wagon> gleisB;
    private Stack<Wagon> gleisC;

    public Bahnhof(){
        gleisA = new Stack<Wagon>();
        gleisB = new Stack<Wagon>();
        gleisC = new Stack<Wagon>();
    }

    public void rangiereAzuB(){
        gleisB.push(gleisA.top()); 
        gleisA.pop();
    }
    public void rangiereAzuC(){
        gleisC.push(gleisA.top()); 
        gleisA.pop();
    }
    public void rangiereBzuA(){
        gleisA.push(gleisB.top()); 
        gleisB.pop();
    }
    public void rangiereBzuC(){
        gleisC.push(gleisB.top()); 
        gleisB.pop();
    }
    public void rangiereCzuA(){
        gleisA.push(gleisC.top()); 
        gleisC.pop();
    }
    public void rangiereCzuB(){
        gleisB.push(gleisC.top());
        gleisC.pop();
    }

    public void sortiereWagons(){
        
    }

}