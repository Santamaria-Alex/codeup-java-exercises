package KitchenApp;

public abstract class Appliance {

    protected String type;
    protected String brandName;

    public Appliance(String type, String brandName){
        this.type = type;
        this.brandName = brandName;
    }

    //Abstract methods are defined using the "abstract" keyword and create a blueprint for a method to be implemented in the subclass.
    // Abstract methods provide the return type, name of method, and number of parameters and parameter type.
    // do this to prevent from having to create getters and setters for every class
    public abstract void setType(String type);

    public abstract void setBrandName(String brandName);

    public abstract void keepFresh();
}
