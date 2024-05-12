public class Akademisyen extends Calisan{
    protected String bolum;
    protected String gorev;
    protected String[] dersler;

    public Akademisyen(String ad, String eposta, int telefon, String bolum, String gorev, String[] dersler) {
        super(ad, eposta, telefon);
        this.bolum = bolum;
        this.gorev = gorev;
        this.dersler = dersler;
    }

    public void giris() {
        System.out.println(this.ad + " A kapısından giriş yaptı!");
    }

    public void derseGir() {
        System.out.println(this.ad + " " + this.gorev + " görevi ile derse giriş yaptı");
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public String[] getDersler() {
        return dersler;
    }

    public void setDersler(String[] dersler) {
        this.dersler = dersler;
    }
}
