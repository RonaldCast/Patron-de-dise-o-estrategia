package patron.strategy.excepciones;

// Excepción para poligonos irregulares.
public class PoligonoNoSoportadoException extends Exception {

    // Constructor.
    public PoligonoNoSoportadoException() {
        super("No se ha formulado algún algoritmo para este polígono.");
    }
}

