public class Envio {

    private static final double UMBRAL_BAJO = 500;
    private static final double UMBRAL_ALTO = 1000;
    private static final double COSTO_BAJO = 100;
    private static final double COSTO_MEDIO = 50;
    private static final double COSTO_GRATIS = 0;

    public static double calcularCostoEnvio(double importePedido) {
        if (importePedido < UMBRAL_BAJO) {
            return COSTO_BAJO;
        }
        if (importePedido < UMBRAL_ALTO) {
            return COSTO_MEDIO;
        }
        return COSTO_GRATIS;
    }

    // Cliente Premium
    public static double calcularCostoEnvio(double importePedido, boolean esPremium) {
        if (esPremium) {
            return COSTO_GRATIS;
        }

        if (importePedido < UMBRAL_BAJO) {
            return COSTO_BAJO;
        }
        if (importePedido < UMBRAL_ALTO) {
            return COSTO_MEDIO;
        }
        return COSTO_GRATIS;
    }
}