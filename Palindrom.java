public class Palindrom{
    
    public static boolean istPalindrom(String wort){
        if (wort.length() <=1){
            return true; 
        } else {
            if (wort.charAt(0) == wort.charAt(wort.length())){
                return istPalindrom(wort.substring(1, wort.length()-1)); 
            } else {
                return false; 
            }
        }
    }

    public static boolean palindromKurz(String wort){
        // return (wort.length() <= 1) ? result : palindromKurz(wort.substring(1, wort.length()-1), result); 
        return (wort.length() <= 1) ? true : (wort.charAt(0) == wort.charAt(wort.length()-1)) ? palindromKurz(wort.substring(1, wort.length()-1)) : false;
    }

    public static void main(String[] args) {
        System.out.println(palindromKurz("anna")); 
    }


}