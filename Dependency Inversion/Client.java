public class Client {

    public static void main(String[] args) {
        DieselEngine diesel = new DieselEngine();
        PetrolEngine petrol = new PetrolEngine();

        Car c1 = new Car(diesel);
        Car c2 = new Car(petrol);

        c1.start();
        c2.start();

    }

}
