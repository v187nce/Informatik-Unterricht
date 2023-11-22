package Kursarbeit; 

public class Notentabelle{

    private int[] tabelle;
    
    public Notentabelle(int min1, int min2, int min3, int min4, int min5){
        tabelle = new int[] {min1, min2, min3, min4, min5, 0};  
    }

    public int bestimmeNote(int pPunkte){
        int note = 0; 
        for (int i = 0; i < tabelle.length; i++){
            if (pPunkte >= tabelle[i]){
                note = i++;
                return note;  
            } 
        }
        return 6; 
    }
}