public class MetodaStycznych {

    static double sinus(double x) {
        return Math.sin(x);
    }

    static double cosinus(double x) {
        return Math.cos(x);
    }

    public static void main(String argv[]) {

        double tolerance = .000000001;
        int max_count = 200;

        double x = 5;

        if (argv.length == 1) {
            x = Double.valueOf(argv[0]).doubleValue();
        }

        for (int count = 1; (Math.abs(sinus(x)) > tolerance) && (count < max_count); count++) {
            x = x - sinus(x) / cosinus(x);
            System.out.println("Krok: " + count + " x:" + x + " Wartość:" + sinus(x));
        }

        if (Math.abs(sinus(x)) <= tolerance) {
            System.out.println("Wartość 0 znaleziona w x=" + x);
        } else {
            System.out.println("Błąd, nie znaleziono zera");
        }
    }

}
