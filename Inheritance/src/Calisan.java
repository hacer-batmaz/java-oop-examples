public class Calisan {
    protected String ad;
    protected String eposta;
    protected int telefon;

    public Calisan(String ad, String eposta, int telefon) {
        this.ad = ad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    public void giris() {
        System.out.println("Giriş yaptı!");
    }

    public void cikis() {
        System.out.println("Çıkış yapıldı!");
    }

    public void yemek() {
        System.out.println("Yemek yedi!");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
}