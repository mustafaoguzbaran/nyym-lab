import java.awt.*;

public class MenuItem {
    private String name = null;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String displayDetails() {
        return "Name: " + name + ", Price: " + price;
    }

}
