package Example;

public class Cars {
    private String modelName;
    private String brand;
    private double price;
    private String color;
    private int year;
    private String noOfSeats;
    public Cars(String modelName, String brand, Double price, String color, int year, String noOfSeats) {
        this.modelName = modelName;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.year = year;
        this.noOfSeats = noOfSeats;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getNoOfSeats() {
        return noOfSeats;
    }
    public void setNoOfSeats(String noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Cars{" +
                 "modelName="+"modelName " + '\''+
                "brand=" +"brand" + '\''+
                "year=" + "year" + '\''+
                "price=" + "price" + '\''+
                "color="+ "color" + '\''+
                "noOfSeats=" + "noOfSeats" +'\'' ;
    }
}