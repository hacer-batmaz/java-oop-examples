public class Asistan extends Calisan{
    private String yuksekLisans;

    public Asistan(String ad, String eposta, int telefon, String yuksekLisans) {
        super(ad, eposta, telefon);
        this.yuksekLisans = yuksekLisans;
    }

    public void labGir() {
        System.out.println(this.ad + " lab dersine giriş yaptı!");
    }

    public void quizOku() {
        System.out.println(this.ad + " quiz notlarını okumaya başladı!");
    }

    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }
}
