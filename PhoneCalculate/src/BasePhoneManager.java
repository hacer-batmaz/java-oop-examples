public abstract class BasePhoneManager {
    private String phoneBrand;
    public String phoneModel;
    public abstract double buyPhone(int price, double otv);

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }
}