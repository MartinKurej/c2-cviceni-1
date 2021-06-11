package cz.educanet.praha;

public class StringWithMostOccurrencesOfLetter {

    public static String findStringWithMostOccurrencesOfLetter(String[] strings, char letter) {
        int nejPoc = 0;
        String nejString = null;
        for(int i = 0; i < strings.length;i++){
            String string = strings[i];
            int pocet = 0;
            for (int x = 0; x < string.length(); x++) {
                char y = string.charAt(x);
                if(y == letter){
                    pocet++;
                }
            }if(pocet > nejPoc ){
                nejPoc = pocet;
                nejString = string;
            }
        }
        return nejString;
    }
}