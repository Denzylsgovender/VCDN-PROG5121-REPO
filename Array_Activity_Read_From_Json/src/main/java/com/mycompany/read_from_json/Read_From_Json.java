

package com.mycompany.read_from_json;



import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
//Update pom.xml

public class Read_From_Json {

    public static void main(String[] args) {
          // Arrays to store data
        String[] names = new String[5];
        String[] occupations = new String[5];

        try {
            // Read and parse the JSON file
            // Make sure you created this Json file and saved in your project
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("PeoplesData.json"));
            JSONArray peopleArray = (JSONArray) obj;

            // Loop through the array and populate the arrays
            int index = 0;
            Iterator<?> iterator = peopleArray.iterator();
            while (iterator.hasNext() && index < 5) {
                JSONObject person = (JSONObject) iterator.next();
                names[index] = (String) person.get("name");
                occupations[index] = (String) person.get("occupation");
                index++;
            }

            // Display loaded data
            System.out.println("Names and Occupations from JSON:");
            for (int i = 0; i < index; i++) {
                System.out.println(names[i] + " - " + occupations[i]);
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    
}

    



    
    

