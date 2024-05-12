public class Main {
    public static void main(String[] args) {
        Asistan a = new Asistan("Ayşe","ayse@cumhuriyet.edu.tr",111-11-1,"Makina Öğrenmesi");
        a.giris(); //ismi vermez çünkü overload metot koymadık
        a.labGir();
        a.quizOku();
        a.cikis();
        System.out.println("--------------");

        Akademisyen a2 = new Akademisyen("Berat","berat@cumhuriyet.edu.tr",333-33-3,"Bilgisayar Müh.","Asistan", new String[]{"MAT1, MAT2"});
        a2.giris();
        a2.derseGir();
        a2.yemek();
        a2.cikis();
        System.out.println("--------------");

        Memur m = new Memur("Betül","betul@cumhuriyet.edu.tr",444-44-4,"IT","Tam Zamanlı");
        m.giris();
        m.calis();
        m.yemek();
        m.cikis();
        System.out.println("--------------");

        GuvenlikGorevlisi g = new GuvenlikGorevlisi("Ahmet",null,222-22-2,"Silahlı Güvenlik Görevlisi");
        g.giris(); //ismi vermez çünkü overload metot koymadık
        g.nobet();
        g.cikis();
    }
}