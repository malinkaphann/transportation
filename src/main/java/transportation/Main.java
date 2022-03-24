package transportation;

public class Main {
    public static void main(String args[]) {
        Truck truck = new Truck();
        Transportation session = new Transportation();
        int cargoWeight = 3;
        session.transport(truck, cargoWeight);
    }
}
