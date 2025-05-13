

package com.mycompany.hashmessage;

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
    }
    
    
}
