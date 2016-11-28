package fppattern.chapter02.ja.builder;

/**
 * Created by zyong on 2016/11/24.
 */
public class Driver {
    public static void main(String[] args) {
        // Note the method chaining
        UsedCar car = new UsedCarBuilder().make("Maruti").model("Alto")
                .kmDriven(10000).yearOfManufacturing(2006).hasGps(false)
                .hasAc(false).hasAbs(false).hasAirBags(false).build();
        System.out.println(car);
    }
}