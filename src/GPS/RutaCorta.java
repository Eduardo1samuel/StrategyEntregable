package GPS;

public class RutaCorta implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return "Rutas más corta entre " + puntoA + " y " + puntoB;
    }
}
