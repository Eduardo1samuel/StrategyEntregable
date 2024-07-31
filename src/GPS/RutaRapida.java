package GPS;

public class RutaRapida implements RutaStrategy{

    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más rapida entre " + puntoA + " y " + puntoB;
    }
}
