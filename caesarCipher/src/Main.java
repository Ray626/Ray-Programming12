public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 26; i++){
            System.out.println(new CaesarCipher("apple",i));
            System.out.println(new CaesarCipher("apple",i).encryptWord());
            System.out.println(new CaesarCipher("apple", i).decryptWord());
        }

    }
}
