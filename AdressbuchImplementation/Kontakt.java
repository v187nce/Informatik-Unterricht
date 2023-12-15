package AdressbuchImplementation; 

public class Kontakt{
    private int telefonnummer; 
    private String name; 
    
    public Kontakt(){
        
    }
    
    public Kontakt(String name, int telefonnummer){
        this.name = name; 
        this.telefonnummer = telefonnummer; 
    }
    
    public String getName(){
        return name; 
    }
    
    public int getTelefonnummer(){
        return telefonnummer; 
    }
}
