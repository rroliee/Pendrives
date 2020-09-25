package hu.kincstar.javasetraining.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    // az emelés százalékát kéri
    void risePrice(int percent){
        this.price *= (percent + 100.0d) / 100.0d;
    }

    int comparePricePerCapacity(Pendrive pendrive){
        return Double.compare(this.getPricePerCapacity(), pendrive.getPricePerCapacity());
    }

    private double getPricePerCapacity() {
        return (double) price / (double) capacity;
    }

    boolean cheaperThan(Pendrive pendrive){
        return this.price < pendrive.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
