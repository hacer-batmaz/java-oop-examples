public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.basePhoneManager = new HuaweiPhoneManager("P20 Lite");
        customerManager.infoMessage();
        customerManager.doTheShopping();
    }
}