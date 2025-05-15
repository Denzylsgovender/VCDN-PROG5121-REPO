

package com.mycompany.hashmessage;

import org.json.JSONObject;
import java.io.*;


public class HashMessage {

    //method for hashing
    public static String CreateMessageHash(String messageId, int messageNumber,String messageContent)
    {
        //trim the message(removes the extra spaces) 
        messageContent= messageContent.trim();
        
        //Extract first word
        //Give me everything from the beginning up to the first space.
        String firstword=messageContent.substring(0,messageContent.indexOf(" "));
        
        //Extract last word
        //Start just after the last space, and give me the rest
         String lastword= messageContent.substring(messageContent.lastIndexOf(" ") + 1);
         //Build and return the hash in uppercase
      return messageId.substring(0,2) + " : " + messageNumber + " : " + (firstword + lastword).toUpperCase();
    }
    
    public static void main(String[] args) {
      String messageID="0763369799";
      int messageNumber=1;
      String message=" Hi there, thanks ";
      
      String hash = CreateMessageHash(messageID,messageNumber,message);
      System.out.println("Generated hash is: " + hash);
      
    
        JSONObject messageJson = new JSONObject();
        messageJson.put("MessageId", messageID);
        messageJson.put("MessageNumber", messageNumber);
        messageJson.put("Message", message);
        messageJson.put("Hash", hash);
        
           try (FileWriter file = new FileWriter("message.json")) {
            file.write(messageJson.toString(4)); 
            System.out.println("Message saved to message.json");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
                
    }
    
    
}
