abstract class Vehicle {
    private String brand;
    private Integer speed = 0;
    private Integer fuelLevel = 1000;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int speed) {
        if (this.getSpeed() < 200 && this.getFuelLevel() > 0) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Hız, 200 üzerine çıkamaz");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

}
