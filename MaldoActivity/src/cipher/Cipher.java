package cipher;
import java.util.Scanner;

import static cipher.CipherExample.encryptData;
import static cipher.CipherExample.decryptData;

public class Cipher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word you want to encrypt: ");
        String input = sc.nextLine();

        String encrypted = encryptData(input);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decryptData(encrypted);
        System.out.println("Decrypted: " + decrypted);
        
        sc.close();
    }
}
    

    



