interface Tinder {
    void match(int amount);
}

class Babita implements Tinder {
    public void match(int amount) {
        System.out.println("Matched with Babita. Amount: " + amount);
    }
}

class Aarti implements Tinder {
    public void match(int amount) {
        System.out.println("Matched with Aarti. Amount: " + amount);
    }
}

class Kavita implements Tinder {
    public void match(int amount) {
        System.out.println("Matched with Kavita. Amount: " + amount);
    }
}

class Dalal {
    static Tinder getGirl(String type) {

        if (type.equalsIgnoreCase("Babita")) {
            return new Babita();
        } 
        else if (type.equalsIgnoreCase("Aarti")) {
            return new Aarti();
        } 
        else if (type.equalsIgnoreCase("Kavita")) {
            return new Kavita();
        } 
        else {
            return null;
        }
    }
}

class Mainn {
    public static void PaymentGateway(String[] args) {

        Tinder t = Dalal.getGirl("Babita");

        if (t != null) {
            t.match(5000);
        } else {
            System.out.println("No match found 😢");
        }
    }
}