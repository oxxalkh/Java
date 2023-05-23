package hwf;
import java.util.*;

public class TechStore {
    private Set<Laptop> laptops;

    public TechStore() {
        laptops = new HashSet<>();
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }


}