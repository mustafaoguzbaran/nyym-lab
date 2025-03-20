import java.util.Random;

public class Product {
    private String name;
    private String id;
    private int stock;
    private double price;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.id = this.generateProductId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void increaseStock(int amount) throws Exception {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stok miktarı arttırıldı " + this.stock);
        } else {
            throw new Exception("Amount parametresi, negatif değer alamaz");
        }
    }

    public void decreaseStock(int amount) throws Exception {
        if (amount > 0 && this.stock > 0 && this.stock - amount > 0) {
            this.stock -= amount;
            System.out.println("Stok miktarı azaltıldı " + this.stock);
        } else {
            throw new Exception("Amount negatif değer olamaz veya geçerli stok miktarı negatif değere dönüştürülemez!");
        }
    }

    //Burada method overloading (aşırı yükleme) kullandım. Çünkü case'de parametre olmazsa default olarak indirim oranının %5.0 olarak uygulanması istenmiş.
    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
        System.out.println("Parametreli indirim %" + percentage + " kadar uygulandı. Yeni fiyat: " + this.price);
    }

    public void applyDiscount() {
        this.price -= this.price * 0.05;
        System.out.println("Paramentresiz indirim default %5.0 olarak uygulandı. Yeni fiyat: " + this.price);
    }

    public void productPrint() {
        System.out.println("Name: " + this.name + ", Id: " + this.id + ", Stock: " + this.stock + ", Price: " + this.price);
    }

    public String generateProductId() {
        Random rand = new Random();
        return "PRD-" + rand.nextInt(999999);
    }

}
