public class Kitap {
    private int kitapID;
    private String baslik;
    private String yazar;
    private int yayimYili;
    private String durum;

    public Kitap(int kitapID, String baslik, String yazar, int yayimYili, String durum) {
        this.kitapID = kitapID;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayimYili = yayimYili;
        this.durum = "Mevcut";
    }

    public String getKitapBilgisi() {
        return baslik + " - " + yazar + " (" + yayimYili + ")";
    }

    public void oduncVer() {
        if (durum.equals("Mevcut"))
            durum = "Ödünç verildi";
    }

    public void geriAl() {
        if (durum.equals("Ödünç verildi"))
            durum = "Mevcut";
    }

    public int getKitapID() {
        return kitapID;
    }

    public void setKitapID(int kitapID) {
        this.kitapID = kitapID;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getYayimYili() {
        return yayimYili;
    }

    public void setYayimYili(int yayimYili) {
        if (yayimYili > 0)
            this.yayimYili = yayimYili;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}