public class Ucgen extends Sekil{
    private int yukseklik;
    private int taban;

    public Ucgen(int yukseklik, int taban) {
        this.yukseklik = yukseklik;
        this.taban = taban;
    }

    @Override
    public double alan() {
        return (taban * yukseklik) / 2;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }
}