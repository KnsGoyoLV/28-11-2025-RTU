package src;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.List;

public class Celojums {
    String Nosaukums, Valsts;
    int Ilgums, Budget;
    List<String> Aktiviitate;

    public Celojums(String Nosaukums, String Valsts, int Ilgums, int Budget, List<String> Aktiviitate) {
        this.Nosaukums = Nosaukums;
        this.Valsts = Valsts;
        this.Ilgums = Ilgums;
        this.Budget = Budget;
        this.Aktiviitate = Aktiviitate;
    }

    public JSONObject toJSON() {
        JSONObject dest = new JSONObject();
        dest.put("Nosaukums", Nosaukums);
        dest.put("Valsts", Valsts);
        dest.put("Budgets", Budget);
        dest.put("Ilgums-Dienas", Ilgums);

        JSONArray celojumi = new JSONArray();
        celojumi.addAll(Aktiviitate);
        dest.put("Aktivitates", celojumi);

        return dest;
    }
}
