
import java.io.*;

/**
   The Crypto class encrypts and decrypts data
   for the File Decryption Filter programming 
   challenge.
*/

public class Crypto
{
   /**
      The encryptFile method makes an encrypted copy
      of an existing file.
      @param existing The name of the existing file to encrypt.
      @param encrypted The name of the encrypted file to create.
      @exception IOException When an IO error occurs.
   */
   
   public static void encryptFile(String existing, String encrypted)
                      throws IOException
   {
     try
       {
     //Let's read the data from the file
     FileInputStream fileInputStream = new FileInputStream(existing);
     InputStreamReader input = new InputStreamReader(fileInputStream, "UTF-8");

     //Let's write the encrypted data to output file
     FileOutputStream fileOutput = new FileOutputStream(encrypted);
     OutputStreamWriter output = new OutputStreamWriter(fileOutput, "UTF-8");

     int d;
     while ((d = input.read()) != -1)
       {
         //Here, we add 10 to decrypt and write to the output file
         output.write(d + 10);
       }

     input.close();
     output.close();
       }
      catch (IOException e)
       {
         e.printStackTrace();
       }

   }
   
   /**
      The decryptFile method decrypts an encrypted file.
      @param existing The name of the existing file to decrypt.
      @param encrypted The name of the decrypted file to create.
      @exception IOException When an IO error occurs.
   */
      
   public static void decryptFile(String existing, String decrypted)
                      throws IOException
   {
    try{
      //Let's read the data from the file
      FileInputStream fileInputStream = new FileInputStream(existing);
      InputStreamReader input = new InputStreamReader(fileInputStream,"UTF-8");
      
      //Let's write the decrypted data to uoutput file
      FileOutputStream fileOutput = new FileOutputStream(decrypted);
      OutputStreamWriter output = new OutputStreamWriter(fileOutput,"UTF-8");
      
      int d;
      while ((d = input.read()) != -1)
        {
          //Here, we subtract 10 to decrypt and write to the output file
          output.write(d - 10);
        }
          input.close();
          output.close();
        }
      catch (IOException e)
       {
         e.printStackTrace();
       }
   
   }

}

    
     
     
     
     

 
   