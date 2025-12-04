package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CelojumaSaraksts {

    public List<Celojums> saraksts = new ArrayList<>();

    public void pievienot(Celojums celo) {
        saraksts.add(celo);
    }

    public void nonemt(String Nosaukums) {
        saraksts.removeIf(celo -> celo.Nosaukums.equalsIgnoreCase(Nosaukums));
    }

    public List<Celojums> mekletPecValsts(String Valsts) {
        List<Celojums> ripo = new ArrayList<>();
        for (Celojums celo : saraksts) {
            if (celo.Valsts.equalsIgnoreCase(Valsts))
                ripo.add(celo);
        }
        return ripo;
    }

    public List<Celojums> mekletPecAktiviitate(String Aktiviitate) {
        List<Celojums> ripo = new ArrayList<>();
        for (Celojums celo : saraksts) {
            if (celo.Aktiviitate.contains(Aktiviitate))
                ripo.add(celo);
        }
        return ripo;
    }

    public List<Celojums> atlasitBudzetu(int Budget) {
        List<Celojums> ripo = new ArrayList<>();
        for (Celojums celo : saraksts) {
            if (celo.Budget < Budget)
                ripo.add(celo);
        }
        return ripo;
    }

    public List<Celojums> atlasitIlgumu(int Ilgums) {
        List<Celojums> ripo = new ArrayList<>();
        for (Celojums celo : saraksts) {
            if (celo.Ilgums < Ilgums)
                ripo.add(celo);
        }
        return ripo;
    }

    public void saglabatJSON(String path) {
        JSONObject root = new JSONObject();
        JSONArray celojumi = new JSONArray();

        for (Celojums celo : saraksts) {
            celojumi.add(celo.toJSON());
        }

        root.put("Celojumi", celojumi);

        try (FileWriter fw = new FileWriter(path)) {
            fw.write(root.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
