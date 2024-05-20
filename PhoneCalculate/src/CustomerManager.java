import java.util.Scanner;

public class CustomerManager {
    BasePhoneManager basePhoneManager;
    Scanner sc = new Scanner(System.in);

    public int phonePrice;
    public double phoneOtv;

    public void infoMessage() {
        System.out.println("-------------\n< Telefon Ücret Bilgileri >\n-------------");
        System.out.print("-> Telefon Geliş Ücreti: ");
        phonePrice = sc.nextInt();

        if (phonePrice >= 3000)
            phoneOtv = 0.4;
        else if (phonePrice >= 1500 && phonePrice < 3000)
            phoneOtv = 0.25;
        else
            phoneOtv = 0.15;

        System.out.println("-> Ödemek zorunda olduğunuz ÖTV ücreti: %" + phoneOtv * 100);
    }

    public void doTheShopping() {
        System.out.println("-------------\n< Telefon Bilgileri >\n-------------");
        System.out.println("-> Telefon Markası: "+basePhoneManager.getPhoneBrand());
        System.out.println("-> Telefon Modeli: "+basePhoneManager.phoneModel);
        System.out.println("-------------\n< Telefon Hesaplaması >\n-------------");
        System.out.println("-> Telefon Fiyatı: "+ basePhoneManager.buyPhone(phonePrice,phoneOtv));
        System.out.println("-----------------");
    }
}