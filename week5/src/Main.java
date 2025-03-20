import java.time.LocalDate;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        FoodProduct milk = new FoodProduct("Süt", 100.0, 100, LocalDate.of(2025, 7, 1));
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 1000.0, 10, "24 Ay");
        milk.productPrint();
        laptop.productPrint();
        milk.applyDiscount(3.0);
        laptop.applyDiscount(10.0);
        milk.increaseStock(1);
        laptop.increaseStock(1);
    }
}