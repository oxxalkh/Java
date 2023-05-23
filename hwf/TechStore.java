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




    public void filterLaptops(Map<String, Object> filters) {
        for (Laptop laptop : laptops) {
            boolean pass = true;
            for (String key : filters.keySet()) {
                Object value = filters.get(key);
                switch (key) {
                    case "brand":
                        if (!laptop.getBrand().equals(value)) {
                            pass = false;
                        }
                        break;
                    case "model":
                        if (!laptop.getModel().equals(value)) {
                            pass = false;
                        }
                        break;

                    case "price":
                        if (laptop.getPrice() < (double) value) {
                            pass = false;
                        }
                        break;
                    case "ram":
                        if (laptop.getRam() < (int) value) {
                            pass = false;
                        }
                        break;
                    case "storage":
                        if (laptop.getStorage() < (int) value) {
                            pass = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equals(value)) {
                            pass = false;
                        }
                        break;

                    default:
                        System.out.println("Unknown filter: " + key);
                }
            }
            if (pass) {
                System.out.println(laptop);
            }
        }
    }

    public static void main(String[] args) {
        TechStore store = new TechStore();
        store.addLaptop(new Laptop("Apple", "MacBook Pro", 1999.99, 16, 512, "silver"));
        store.addLaptop(new Laptop("Dell", "XPS 13", 1199.99, 8, 256, "black"));
        store.addLaptop(new Laptop("Lenovo", "ThinkPad X1 Carbon", 1499.99, 16, 1_000, "black"));
        store.addLaptop(new Laptop("HP", "Spectre x360", 1399.99, 16, 512, "silver"));
        store.addLaptop(new Laptop("Apple", "MacBook", 1499.99, 16, 512, "pink"));
        store.addLaptop(new Laptop("HP", "Spectre x360", 1399.99, 16, 512, "black"));

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();
        System.out.print("Enter brand (or press Enter to skip): ");
        String brand = scanner.nextLine();
        if (!brand.isEmpty()) {
            filters.put("brand", brand);
        }
        System.out.print("Enter model (or press Enter to skip): ");
        String model = scanner.nextLine();
        if (!model.isEmpty()) {
            filters.put("model", model);
        }
        System.out.print("Enter color (or press Enter to skip): ");
        String color = scanner.nextLine();
        if (!color.isEmpty()) {
            filters.put("color", color);
        }
        System.out.print("Enter minimum price or 0: ");
        double price = scanner.nextDouble();
        filters.put("price", price);
        System.out.print("Enter minimum RAM or 0: ");
        int ram = scanner.nextInt();
        filters.put("ram", ram);
        System.out.print("Enter minimum storage or 0: ");
        int storage = scanner.nextInt();
        filters.put("storage", storage);


        System.out.println("Filtered laptops:");
        store.filterLaptops(filters);
    }
}
