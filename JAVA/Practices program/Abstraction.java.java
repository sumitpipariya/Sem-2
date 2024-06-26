public class Abstraction {
    public static void main(String[] args) {
        car c = new ConcreteCar();
        c.start();
    }
}

interface vehical {
    void start();
    void off();
}

abstract class car implements vehical {
    int a = 10;
    void start() {
        // code here
    }
}

class ConcreteCar extends car {
    void start() {
        System.out.println("Car is here");
    }
}
