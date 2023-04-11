

public class Homework {
    public static void main(String[] args) throws Exception {
        System.out.println("Hot drinks:");
        
        VendingMachine<HotDrink> m = new VendingMachine<>();
            m.addProduct(new HotDrink("Hote chocolate", 110, 70, 0.5));
            m.addProduct(new HotDrink("dobale Hote chocolate", 110, 70, 0.3));
            m.addProduct(new HotDrink("Cappucino", 200, 60, 0.5));
            m.addProduct(new HotDrink("Latte", 150, 80, 0.3));
            m.addProduct(new HotDrink("Latte With milk", 150, 80, 0.5));
            m.addProduct(new HotDrink("Americano", 350, 60, 0.3));
        System.out.println("Вывод всех продуктов");
        for (HotDrink product : m.getProducts()) {
            System.out.println(product);
        }
        System.out.println("Вывод по name продукта ");
        System.out.println(m.getProduct("Latte"));
        
        System.out.println("Вывод по name продукта и cost");
        System.out.println(m.getProduct("Latte With milk",150));
            
        }
        

        
    }


    
