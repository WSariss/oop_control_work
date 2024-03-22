public class Car {

    // Атрибути класу
    private String brand;
    private int year;
    private double price;

    // Конструктор класу
    public Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    // Метод для зміни ціни автомобіля
    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для отримання ціни автомобіля
    public double getPrice() {
        return price;
    }
}
