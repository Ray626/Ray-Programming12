import java.time.temporal.TemporalAmount;
import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {
    private String word;
    private int shift;
    private String[] charList = "abcdefghijklmnopqrstuvwxyz".split("");

    private HashMap<String, String>encryptMap = new HashMap<>();
    private HashMap<String, String>decryptMap = new HashMap<>();
    public CaesarCipher(String word, int shift) {
        this.word = word;
        this.shift = shift;
        encrypt();
        decrypt();

    }
    private void encrypt(){
        for (int i = 0; i < 26; i++){
            int shiftAmount = i + shift;
            if(shiftAmount >= 26){
                shiftAmount -= 26;
            }
            encryptMap.put(charList[i],charList[shiftAmount]);
        }
    }
    private void decrypt(){
        for (int i = 25; i >= 0; i--){
            int shiftAmount = i - shift;
            if (shiftAmount < 0){
                shiftAmount += 26;
            }
            decryptMap.put(charList[i],charList[shiftAmount]);
        }
    }

    public String toString(){
        return encryptMap.toString();
    }





}
