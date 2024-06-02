import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private List<Kitap> kitaplar;
    private List<Uye> uyeler;

    public Kutuphane() {
        this.kitaplar = new ArrayList<>();  // Listelerin başlatıldığından emin olun
        this.uyeler = new ArrayList<>();    // Listelerin başlatıldığından emin olun
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void uyeEkle(Uye uye) {
        this.uyeler.add(uye);
    }

    public Kitap kitapBul(int kitapID) {
        for (Kitap kitap : kitaplar) {
            if (kitap.getKitapID() == kitapID)
                return kitap;
        }

        return null;
    }

    public Uye uyeBul(int uyeID) {
        for (Uye uye : uyeler) {
            if (uye.getUyeID() == uyeID)
                return uye;
        }

        return null;
    }

    public List<Kitap> getKitaplar() {
        return kitaplar;
    }

    public List<Uye> getUyeler() {
        return uyeler;
    }
}