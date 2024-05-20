public class HuaweiPhoneManager extends BasePhoneManager{
    public HuaweiPhoneManager(String phoneModel) {
        setPhoneBrand("Huawei");
        super.phoneModel = phoneModel;
    }
    @Override
    public double buyPhone(int price, double otv) {
        double total = (price * 0.2) + (price * 0.1) + (price * 0.01);
        return (price + (price * otv) + total);
    }
}