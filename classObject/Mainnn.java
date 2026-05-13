interface Tinder {
    void match(String type);
}

class Babita implements Tinder {
    public void match(String type) {
        System.out.println("Matched with Babita  : " + type);
    }
}

class Aarti implements Tinder {
    public void match(String type) {
        System.out.println("Matched with Aarti  : " + type);
    }
}

class Kavita implements Tinder {
    public void match(String type) {
        System.out.println("Matched with Kavita  : " + type);
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

class Mainnn {
    public static void main(String[] args) {

        Tinder t = Dalal.getGirl("Babita");

        if (t != null) {
            t.match("Serious Match");
        } else {
            System.out.println("No match found ");
        }
    }
}