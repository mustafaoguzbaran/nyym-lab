public class Food extends MenuItem {
    private String isSpicy;

    public Food(String name, String isSpicy, int price) {
        super(name, price);
        this.setIsSpicy(isSpicy);
    }

    public String getIsSpicy() {
        return isSpicy;
    }

    public void setIsSpicy(String isSpicy) {
        this.isSpicy = isSpicy;
    }

    public String displayDetails() {
        return "Yemek İsmi: " + this.getName() + " Acı Olup Olmadığı: " + isSpicy + " Ücreti: " + this.getPrice();
    }

}
