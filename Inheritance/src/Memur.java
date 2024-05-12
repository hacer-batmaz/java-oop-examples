public class Memur extends Calisan{
    private String departman;
    private String mesai;

    public Memur(String ad, String eposta, int telefon, String departman, String mesai) {
        super(ad, eposta, telefon);
        this.departman = departman;
        this.mesai = mesai;
    }

    public void giris() {
        System.out.println(this.ad + " M kapısından giriş yaptı!");
    }

    public void calis() {
        System.out.println(this.ad + " " + this.mesai + " çalışmaya başladı!");
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
}
