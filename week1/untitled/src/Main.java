//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        for (int i = 1; i <= 15; i++) {
            car.accelerate();
            System.out.println("Speed: " + car.getSpeed());
            System.out.println("Fuel Level " + car.getFuelLevel());
        }
    }

}