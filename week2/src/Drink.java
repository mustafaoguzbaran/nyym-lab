public class Drink extends MenuItem {
    private String size;

    public Drink(String name, String size, int price) {
        this.setName(name);
        this.setPrice(price);
        this.setSize(size);
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String displayDetails() {
        return "İçecek İsmi: " + this.getName() + " Size: " + size + " Ücreti: " + this.getPrice();
    }

}
