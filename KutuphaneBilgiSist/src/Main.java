public class Main {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();

        Kitap kitap1 = new Kitap(123456,"Körlük","Jose Saramago", 1900,"Mevcut");
        Kitap kitap2 = new Kitap(123789,"Kürk Mantolu Madonna", "Sabahattin Ali", 1800,"Ödünç verildi");

        Uye uye1 = new Uye(001,"Joe","Öğrenci");
        Uye uye2 = new Uye(002,"John","Öğrenci");

        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);
        //System.out.println("--- Kitaplar Başarıyla Eklendi! ---");

        kutuphane.uyeEkle(uye1);
        kutuphane.uyeEkle(uye2);
        //System.out.println("--- Üyeler Başarıyla Eklendi! ---");


        System.out.println("Kütüphanedeki Kitaplar:");
        for (Kitap kitap : kutuphane.getKitaplar()) {
            System.out.println(kitap.getKitapBilgisi() + " - Durum: " + kitap.getDurum());
        }

        System.out.println("\nKütüphanedeki Üyeler:");
        for (Uye uye : kutuphane.getUyeler()) {
            System.out.println(uye.getUyeBilgisi());
        }
        System.out.println("---------------------------------");


        uye1.kitapOduncAl(kitap1);
        System.out.println("\n" + uye1.getIsim() + " " + kitap1.getBaslik() + " kitabını ödünç aldı.");
        System.out.println("---------------------------------");


        System.out.println("\nKütüphanedeki Kitapların Güncellenmiş Durumu:");
        for (Kitap kitap : kutuphane.getKitaplar()) {
            System.out.println(kitap.getKitapBilgisi() + " - Durum: " + kitap.getDurum());
        }
        System.out.println("---------------------------------");

        uye1.KitapIadeEt(kitap1);
        System.out.println("\n" + uye1.getIsim() + " " + kitap1.getBaslik() + " kitabını iade etti.");
        System.out.println("---------------------------------");
    }
}