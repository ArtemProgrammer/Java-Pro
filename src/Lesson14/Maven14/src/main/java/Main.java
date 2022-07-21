public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            GetNumbers.start();
        } else {
            GetNumbers.start(args);
        }
    }
}
