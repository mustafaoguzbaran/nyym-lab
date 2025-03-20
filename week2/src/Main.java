//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink("Kola", "Latte", 100);
        Drink drink2 = new Drink("Fanta", "Medium", 200);
        Drink drink3 = new Drink("Ayran", "Small", 300);

        System.out.println(drink1.displayDetails());
        System.out.println(drink2.displayDetails());
        System.out.println(drink3.displayDetails());


    }
}