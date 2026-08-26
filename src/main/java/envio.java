public class Envio {
    public static double calcularCostoEnvio(double importe) {
        if (importe < 500) {
            return 100;
        } else if (importe < 1000) {
            return 50;
        } else {
            return 0;
        }
    }
}