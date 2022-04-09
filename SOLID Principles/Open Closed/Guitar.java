public class Guitar {

    public String model;
    public String color;
    public int price;

    // Constructors, getters & setters
}

class ElectricGuitar extends Guitar {
    public String electricPort;

    // constructor, getters + setters

}

// By extending the Guitar class, we can be sure that our existing application won't be affected.
