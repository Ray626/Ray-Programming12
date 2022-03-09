import java.util.HashMap;

public class CaesarCipher {
    private final String[] word;
    private final int shift;
    private final String[] charList = "abcdefghijklmnopqrstuvwxyz".split("");
    private final HashMap<String, String>encryptMap = new HashMap<>();
    private final HashMap<String, String>decryptMap = new HashMap<>();
    public CaesarCipher(String word, int shift) {
        this.word = word.split("");
        this.shift = shift;
        encrypt();
        decrypt();

    }
    private void encrypt(){
        for (int i = 0; i < 26; i++){
            int shiftAmount = i + shift;
            while(shiftAmount >= 26){
                shiftAmount -= 26;
            }
            encryptMap.put(charList[i],charList[shiftAmount]);
        }
    }
    private void decrypt(){
        for (int i = 25; i >= 0; i--){
            int shiftAmount = i - shift;
            while (shiftAmount < 0){
                shiftAmount += 26;
            }
            decryptMap.put(charList[i],charList[shiftAmount]);
        }
    }
    public String encryptWord(){
        StringBuilder encryptedWord = new StringBuilder();
        for (String s : word) {
            encryptedWord.append(encryptMap.get(s));
        }
        return encryptedWord.toString();
    }

    public String decryptWord(){
        StringBuilder decryptedWord = new StringBuilder();
        for (String s : word) {
            decryptedWord.append(decryptMap.get(s));
        }
        return decryptedWord.toString();
    }


    public String toString(){
        return  "String input: " + String.join("", word) +", Shift: " + shift;
    }





}
