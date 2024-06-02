public class Uye {
    private int uyeID;
    private String isim;
    private String uyeTipi;

    public Uye(int uyeID, String isim, String uyeTipi) {
        this.uyeID = uyeID;
        this.isim = isim;
        this.uyeTipi = uyeTipi;
    }

    public String getUyeBilgisi() {
        return uyeID + " - " + isim  + " - " + uyeTipi;
    }

    public void kitapOduncAl(Kitap kitap) {
        kitap.oduncVer();
    }

    public void KitapIadeEt(Kitap kitap) {
        kitap.geriAl();
    }

    public int getUyeID() {
        return uyeID;
    }

    public void setUyeID(int uyeID) {
        this.uyeID = uyeID;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getUyeTipi() {
        return uyeTipi;
    }

    public void setUyeTipi(String uyeTipi) {
        this.uyeTipi = uyeTipi;
    }
}