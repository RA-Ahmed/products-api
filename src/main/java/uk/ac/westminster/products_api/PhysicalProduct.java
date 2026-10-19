//A PhysicalProduct IS-A Product because it has a price
//One thing a shop system might have that passes this test is a shopping cart because it is not a product with price

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{

    private String dimensions;
    private double weightKG;

    public PhysicalProduct(Long id, String name, double price, String dimensions, double weightKG){

        super(id, name, price);
        this.dimensions = dimensions;
        this.weightKG = weightKG;
    }

    public String getDimensions(){
        return dimensions;
    }

    public double getweightKG(){
        return weightKG;
    }

}
