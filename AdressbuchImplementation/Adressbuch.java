package AdressbuchImplementation; 

import java.util.*;

public class Adressbuch{
    private List<Kontakt> adressbuch; 
    
    public Adressbuch(){
        adressbuch = new List<Kontakt>();
    }
    
    public void nummerAnzeigen(String pName){
        while(adressbuch.hasAccess()){
            if(adressbuch.getContent().getName().equals(pName)){
                System.out.println(adressbuch.getContent().getTelefonnummer()); 
                break; 
            }else{
                adressbuch.next(); 
            }   
        }
    }
    
    public void alleNummernAnzeigen(){
        List<Kontakt> hilf = new List<Kontakt>();
        hilf = adressbuch; 
        while (!hilf.isEmpty()){
            hilf.toLast(); 
            System.out.println(hilf.getContent().getName() + ": " + hilf.getContent().getTelefonnummer() + "\n");
            hilf.remove(); 
        }
    }
    
    public void kontaktSortiertHinzufuegen(String name, int nr){
        adressbuch.toFirst();
        boolean gefunden = false; 
        if (adressbuch.isEmpty()){
            adressbuch.append(new Kontakt(name, nr));
            return;
        }
        while(adressbuch.hasAccess() && !gefunden){
            if (adressbuch.getContent().getName().compareTo(name) > 0){
                adressbuch.insert(new Kontakt(name, nr));
                gefunden = true;
                return;
            } 
            adressbuch.next();
        }
        if (!gefunden){
            adressbuch.append(new Kontakt(name, nr)); 
        }
    }
    
    public void letztenKontaktloeschen(){
        adressbuch.toLast(); 
        adressbuch.remove(); 
    }
    
    public void kontaktHinzufuegen(String name, int nr){
        adressbuch.insert(new Kontakt(name, nr));
    }
}
