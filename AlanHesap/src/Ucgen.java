public class Ucgen extends Sekil{
    private double yukseklik;
    private double taban;

    public Ucgen(double yukseklik, double taban) {
        this.yukseklik = yukseklik;
        this.taban = taban;
    }

    @Override
    public double alan() {
        return (taban * yukseklik) / 2;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }
}