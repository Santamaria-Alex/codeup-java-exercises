package KitchenApp;

import java.util.Scanner;

public class Refrigerator extends Appliance{

    private boolean hasShelves;

    public boolean isHasShelves(){
        return hasShelves;
    }

    public void setHasShelves(boolean hasShelves){
        this.hasShelves = hasShelves;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    @Override
    public void keepFresh() {

    }

    public Refrigerator(String type, String brandName, boolean hasShelves) {
        super(type, brandName);
        this.hasShelves = hasShelves;

//        public void keepFresh(){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Would you like to put something in the fridge? (Y/N)");
//            String userChoice = sc.nextLine();
//            while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
//                System.out.println("What would you like to put in the fridge?");
//                String item = sc.nextLine();
//                System.out.printf("Sounds good, i'll keep your %s cold for you\n", item);
//                System.out.println("Would you like to add anything else in the fridge? (Y/N)");
//                userChoice = sc.nextLine();
//            }
//            System.out.println("Okay, stay cool.");
//        }

    }
}

// .java file is all the text and is human readable, contains source code
// .class file is compiled, contains Java bytecode produced by Java compiler


// JDK is a software development kit, JRE is a software bundle
