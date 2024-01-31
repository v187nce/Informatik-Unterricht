public class Palindrom{
    
    public static boolean istPalindrom(String wort){
        if (wort.length() <=1){
            return true; 
        } else {
            if (wort.charAt(0) == wort.charAt(wort.length()-1)){
                
            } else {
                return false; 
            }
        }
        
        return false; 
    }

    public static void main(String[] args) {
        
    }


}