package Products;

public class Adapter {
    public Alcohol adapt(Alcohol alcohol) {
        if (alcohol.getName().equals("mead") && alcohol.getType().equals("wine")) {
            alcohol.setType("Beer");
            return alcohol;
        }
        return null;
    }
}
