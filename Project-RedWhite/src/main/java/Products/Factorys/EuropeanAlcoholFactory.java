package Products.Factorys;

import Products.Alcohol;
import Products.MediumAlcohol;
import Products.SoftAlcohol;
import Products.StrongAlcohol;

public class EuropeanAlcoholFactory extends AlcoholFactory {
    @Override
    public SoftAlcohol createSoftAlcohol(float price, float degree, String manufacture, String name) {
        return new SoftAlcohol(price, degree, manufacture, name, "beer");
    }

    @Override
    public MediumAlcohol createMediumAlcohol(float price, float degree, String manufacture, String name) {
        return new MediumAlcohol(price, degree, manufacture, name, "wine");
    }

    @Override
    public StrongAlcohol createStrongAlcohol(float price, float degree, String manufacture, String name) {
        return new StrongAlcohol(price, degree, manufacture, name, "vodka");
    }
}
