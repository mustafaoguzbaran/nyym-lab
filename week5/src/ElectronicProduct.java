
public class ElectronicProduct extends Product {
    private String warrantyPeriod;

    public ElectronicProduct(String name, double price, int stock, String warrantyPeriod) {
        super(name, price, stock);
        this.warrantyPeriod = warrantyPeriod;;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0.0 && percentage < 20.00) {
            double newPrice = this.getPrice() - this.getPrice() * (percentage / 100);
            setPrice(newPrice);
            System.out.println(getName() + " ürünü için " + percentage + "% indirim uygulandı. Yeni fiyat: " + newPrice);
        } else {
            throw new IllegalArgumentException("The percentage must be between 0.01 and 20.00");
        }
    }

    public void productPrint() {
        System.out.println("Name: " + this.getName() + ", Id: " + this.getId() + ", Stock: " + this.getStock() + " Garanti: " + this.warrantyPeriod);
    }

}
