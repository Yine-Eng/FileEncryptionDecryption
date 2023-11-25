import java.io.*;


public class Main
{
   public static void main(String[] args)
   {
      System.out.println("Encrypting the contents of the file");
      System.out.println("Trouble.txt. The encrypted file will");
      System.out.println("be stored as Encrypted.txt");

      try
      {     
         Crypto.encryptFile("Trouble.txt", "Encrypted.txt");
         System.out.println("Done. Inspect the encrypted file.");
      }
      catch (IOException e)
      {
         System.out.println("Error - " + e.getMessage());
      }

      System.out.println("Decrypting the contents of the file");
      System.out.println("Encrypted.txt. The encrypted file will");
      System.out.println("be stored as Decrypted.txt");

      try
      {     
         Crypto.decryptFile("Encrypted.txt", "Decrypted.txt");
         System.out.println("Done. Inspect the decrypted file.");
      }
      catch (IOException e)
      {
         System.out.println("Error - " + e.getMessage());
      }
   }
}
