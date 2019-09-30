package ku.shop;

import java.util.HashMap;
import java.util.Map;

public class PetCollection {
    private Map<String, Pets> petsCollection_;

    public PetCollection() {
        petsCollection_ = new HashMap<>();
    }

    public void addPet(String name,int num, double price) {
        petsCollection_.put(name, new Pets(name, num,price));
    }

    public Pets getPet(String name) {
        return petsCollection_.get(name);
    }

}
