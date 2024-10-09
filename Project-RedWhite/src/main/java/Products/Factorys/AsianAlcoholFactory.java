package Products.Factorys;

import Products.MediumAlcohol;
import Products.SoftAlcohol;
import Products.StrongAlcohol;

public class AsianAlcoholFactory extends AlcoholFactory{
    @Override
    public SoftAlcohol createSoftAlcohol(float price, float degree, String manufacture, String name) {
        return new SoftAlcohol(price, degree, manufacture, name, "takzhu");
    }

    @Override
    public MediumAlcohol createMediumAlcohol(float price, float degree, String manufacture, String name) {
        return new MediumAlcohol(price, degree, manufacture, name, "setu");
    }

    @Override
    public StrongAlcohol createStrongAlcohol(float price, float degree, String manufacture, String name) {
        return new StrongAlcohol(price, degree, manufacture, name, "sake");
    }
}
