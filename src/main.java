package src;

// Required imports
import java.util.*;
import java.io.*;
// JSON simple library
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CelojumaSaraksts saraksts = new CelojumaSaraksts();
        // Define variables

        while (true) {
            System.out.println("1  Pievienot galamērķi");
            System.out.println("2  Noņemt galamērķi");
            System.out.println("3  Meklēt pēc valsts");
            System.out.println("4  Meklēt pēc aktivitātes");
            System.out.println("5  Atlasīt pēc budžeta");
            System.out.println("6  Atlasīt pēc ilguma");
            System.out.println("7  Saglabāt JSON");
            System.out.println("0  Iziet");

            int izvele = scan.nextInt();
            scan.nextLine();

            switch (izvele) {
                case 1: {
                    System.out.print("Nosaukums: ");
                    String Nosaukums = scan.nextLine();
                    System.out.print("Valsts: ");
                    String Valsts = scan.nextLine();
                    System.out.print("Ilgums (dienas): ");
                    int Ilgums = scan.nextInt();
                    System.out.print("Budžets: ");
                    int Budget = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Aktivitātes (ar komatiem): ");
                    String Aktiviitate = scan.nextLine();
                    List<String> Active = Arrays.asList(Aktiviitate.split(","));

                    saraksts.pievienot(new Celojums(Nosaukums, Valsts, Ilgums, Budget, Active));
                }
                    break;

            }
        }
        // System.out.println("Ievadi aktivitates ");
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