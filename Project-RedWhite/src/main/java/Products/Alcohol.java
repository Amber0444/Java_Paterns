package Products;

public abstract class Alcohol{
    private float price;
    private float degree;
    private String manufacture;
    private String name;
    private String type;

    public Alcohol(float price, float degree, String manufacture, String name, String type) {
        this.price = price;
        this.degree = degree;
        this.manufacture = manufacture;
        this.name = name;
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDegree() {
        return degree;
    }

    public void setDegree(float degree) {
        this.degree = degree;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
