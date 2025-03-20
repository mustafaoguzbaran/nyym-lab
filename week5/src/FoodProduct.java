import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FoodProduct extends Product {
    public LocalDate expirationDate;

    public FoodProduct(String name, double price, int stock, LocalDate expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }

    @Override
    public void applyDiscount(double percentage) {
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), expirationDate);

        if (daysLeft <= 30) {
            percentage += 5;
        }
        if (daysLeft <= 7) {
            percentage += 10;
        }
        if (percentage > 5.0) {
            percentage = 5.0;
        }

        System.out.println(percentage);

        double newPrice = getPrice() * (1 - (percentage / 100));
        setPrice(newPrice);
        System.out.println(getName() + " ürünü için " + percentage + "% indirim uygulandı. Yeni fiyat: " + newPrice);
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void productPrint() {
        System.out.println("Name: " + this.getName() + ", Id: " + this.getId() + ", Stock: " + this.getStock() + " Son Kullanım Tarihi: " + this.expirationDate);
    }

}
