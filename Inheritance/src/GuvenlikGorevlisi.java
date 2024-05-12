public class GuvenlikGorevlisi extends Calisan{
    private String belge;

    public GuvenlikGorevlisi(String ad, String eposta, int telefon, String belge) {
        super(ad, eposta, telefon);
        this.belge = belge;
    }

    public void nobet() {
        System.out.println(this.ad + " nöbet tutmaya başladı!");
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
}
