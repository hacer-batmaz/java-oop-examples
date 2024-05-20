public class ApplePhoneManager extends BasePhoneManager{
    public ApplePhoneManager(String phoneModel) {
        setPhoneBrand("Apple");
        super.phoneModel = phoneModel;
    }
    @Override
    public double buyPhone(int price, double otv) {
        double total = (price * 0.2) + (price * 0.1) + (price * 0.01);
        return (price + (price * otv) + total + (price * 0.25));
    }
}