
class Mainn {
    public static void main(String[] args) {

        PaymentGateway pg = Gateway.modeofPayment("UPI");
        pg.pay(100);

       
    }
}