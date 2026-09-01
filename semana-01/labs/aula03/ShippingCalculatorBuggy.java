package course.week1.debug;

public final class ShippingCalculatorBuggy {
    private ShippingCalculatorBuggy() {
    }

    public static double calculate(double subtotal, String customerTier) {
        if (subtotal >= 200 || customerTier.equals("STANDARD")) {
            return 0.0;
        }
        return 18.90;
    }

    public static void main(String[] args) {
        System.out.println(calculate(250.0, "STANDARD")); // esperado: 0.0
        System.out.println(calculate(100.0, "STANDARD")); // esperado: 18.9
        System.out.println(calculate(100.0, "PREMIUM"));  // esperado: 18.9
    }
}
