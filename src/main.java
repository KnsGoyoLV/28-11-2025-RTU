package src;

// Required imports
import java.util.*;
import java.io.*;
// JSON simple library
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;


public class main {
	public static void main(String[] args) {
                // Define variables
                String Nosaukums,Valsts;
                int Budget,Ilgums;
                String[] Aktiviitate;
                // Create JSON structure
                JSONObject root = new JSONObject();
                JSONArray celojumi = new JSONArray();
                JSONObject dest = new JSONObject();
                // Sample data       
                dest.put("Nosaukums", "TEST-Nosaukums");
                dest.put("Valsts", "TEST-Valsts");
                dest.put("Budget", 500);
                dest.put("Ilgums-Dienas", 6);
                
                // aktivitates array
                JSONArray aktivitates = new JSONArray();
                // [] Add loop for array activities
                aktivitates.add("muzejs");
                aktivitates.add("pludmale");


                dest.put("Aktivitate", aktivitates);
                
                celojumi.add(dest);

                root.put("Celojumi", celojumi);
                try (FileWriter file = new FileWriter("celojumi.json")) {
                    file.write(root.toJSONString());
                    file.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
	}
}