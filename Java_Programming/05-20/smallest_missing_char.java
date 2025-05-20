// Find the smallest missing charater from the String

public class smallest_missing_char {
    public static void main(String[] args) {
        String s = "Beautifulqwertyuiopasdfghjkxcvbnm";
        s = s.toLowerCase();
        int charvalue = 97;
        while(charvalue < 123){
            if(s.indexOf((char) charvalue) != -1){
                charvalue++;
            } else{
                break;
            }
        }
        if(charvalue < 123)
        System.out.println("Smallest missing character is: "+(char) charvalue);
        else
        System.out.println("All charaters are present in the word.");
    }
}
