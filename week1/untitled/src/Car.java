public class Car extends Vehicle {
    public void accelerate() {
        this.setSpeed(this.getSpeed() + 10);
        this.setFuelLevel(this.getFuelLevel() - 10);
    }

}
