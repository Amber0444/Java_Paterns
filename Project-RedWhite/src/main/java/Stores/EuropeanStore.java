package Stores;

import Products.Alcohol;
import Products.Factorys.AlcoholFactory;
import Products.Factorys.EuropeanAlcoholFactory;

public class EuropeanStore {
    public static Alcohol createAlcohol(float price, float degree, String manufacture, String name) {
        AlcoholFactory alcoholFactory = new EuropeanAlcoholFactory();
        Alcohol alcohol;
        if (degree < 10)
            alcohol = alcoholFactory.createSoftAlcohol(price, degree, manufacture, name);
        else if (degree < 20)
            alcohol = alcoholFactory.createMediumAlcohol(price, degree, manufacture, name);
        else
            alcohol = alcoholFactory.createStrongAlcohol(price, degree, manufacture, name);
        return alcohol;
    }
}
