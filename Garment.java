
package wagesmanagementsystem;

public class Garment {
    //VARIABLE DECLARATION
    private String brand;
    private String color;
    private String type;
    private String quality;
    private String cost;

    //constructor
    public Garment(String brand, String color, String type, String quality, String cost) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.quality = quality;
        this.cost = cost;
    }

    //getters and setters for variables
    
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getQuality() {
        return quality;
    }

    public String getCost() {
        return cost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    
    
}
