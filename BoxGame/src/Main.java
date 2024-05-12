public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("John",10,120,92,40);
        Fighter f2 = new Fighter("Joe",20,85,90,50);

        Match match = new Match(f1, f2, 90,95);

        match.run();
    }
}