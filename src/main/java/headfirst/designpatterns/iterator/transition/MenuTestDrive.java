package headfirst.designpatterns.iterator.transition;
import headfirst.designpatterns.iterator.transition.aggregate.DinerMenu;
import headfirst.designpatterns.iterator.transition.aggregate.Menu;
import headfirst.designpatterns.iterator.transition.aggregate.PancakeHouseMenu;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
