package KitchenApp;

//Abstract Class
//highest level parent. Can serve as a super class, but can't directly instantiate an abstract class.

public class ApplianceTest {

    public static void main(String[] args) {

        //will get an error by trying to directly instantiate
//        Appliance app1 = new Appliance();

        Refrigerator app1 = new Refrigerator("two door", "LG", true);

        System.out.println(app1.brandName);
        System.out.println(app1.type);
        System.out.println(app1.isHasShelves());
        app1.keepFresh();


    }


}
