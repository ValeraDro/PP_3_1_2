package web.model;

public class Car {
    private int year;
    private String model;
    private int price;

    public Car(int year, String model, int price) {
        this.year = year;
        this.model = model;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
