package Products.Factorys;

import Products.MediumAlcohol;
import Products.SoftAlcohol;
import Products.StrongAlcohol;

public abstract class AlcoholFactory {
    public abstract SoftAlcohol createSoftAlcohol(float price, float degree, String manufacture, String name);
    public abstract MediumAlcohol createMediumAlcohol(float price, float degree, String manufacture, String name);
    public abstract StrongAlcohol createStrongAlcohol(float price, float degree, String manufacture, String name);
}
