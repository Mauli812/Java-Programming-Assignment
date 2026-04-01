abstract class Cipher {

    abstract void encrypt(String text);
}

class CaesarCipher extends Cipher {

    void encrypt(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            ch += 3;

            result += ch;
        }

        System.out.println("Encrypted Text: " + result);
    }
}
public class Program_6
{
    public static void main(String args[]) {

        CaesarCipher obj = new CaesarCipher();

        obj.encrypt("HELLO");
    }
}