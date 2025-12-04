package src;

import java.util.*;

public class CelojumaSaraksts {

    public List<Celojums> saraksts = new ArrayList<>();

    public void pievienot(Celojums celo) {
        saraksts.add(celo);
    }

    public void nonemt(String Nosaukums) {
        saraksts.removeIf(celo -> celo.Nosaukums.equalsIgnoreCase(Nosaukums));
    }

}
