package jws.beer_selector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JS on 3/22/17.
 */

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
        brands.add("Green Flash Hop Head");
            brands.add("Roundhouse IRA");
        } else if (color.equals("dark")) {
            brands.add("American Porter IPA");
            brands.add("Milk Stout");
        } else if (color.equals("brown")) {
            brands.add("Nut Brown Ale");
            brands.add("Ode to Mercy IPA");
        } else if (color.equals("light")){
            brands.add("corona");
            brands.add("pilsner");
        }
        return brands;
    }

}
