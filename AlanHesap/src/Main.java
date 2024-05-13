public class Main {
    public static void main(String[] args) {
        Sekil s1 = new Kare(5);
        System.out.println("Karenin alanı: " + s1.alan());

        Sekil s2 = new Ucgen(6,5);
        System.out.println("Üçgenin alanı: " + s2.alan());
    }
}