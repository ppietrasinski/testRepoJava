public class MainApp {
    public static void main(String[] args) {

        int a = 27;
        int b = 85;
        int c = 34;
        int d = 42;

        int AsumB = a + b;
        int CsumD = c + d;

        boolean isAsumBEven = false;
        boolean isCsumDEven = false;
        if (AsumB % 2 == 0) {
            isAsumBEven = true;
        }

        if (AsumB % 2 == 0) {
            isAsumBEven = false;
        }

        if (isAsumBEven && isCsumDEven) {
            System.out.println("wszystkie liczby są parzyste");
        } else {
            System.out.println("ktoras z liczb nie jest parzysta");
        }


    }
}