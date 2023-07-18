class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class CBE extends Bank {

    float getRateOfInterest() {
        return 8.4f;
    }
}

class COOP extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AWASH extends Bank {

    float getRateOfInterest() {

        return 9.7f;

    }
}

class Polymorphism {
    public static void main(String args[]) {
        Bank b;
        b = new CBE();
        System.out.println("CBE Rate of Interest: " + b.getRateOfInterest());
        b = new COOP();
        System.out.println("COOP Rate of Interest: " + b.getRateOfInterest());
        b = new AWASH();
        System.out.println("AWASH Rate of Interest: " + b.getRateOfInterest());

    }
}