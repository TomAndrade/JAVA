package aulasPraticas.academy.excecoes;

import java.io.Closeable;
import java.io.IOException;

public class SobrescrevendoCloseable implements Closeable {
    // A Interface Closeable tem apenas o método close() que é obrigatório para todos que a implementarem.
    @Override
    public void close() throws IOException {
        System.out.println("Encerrando...");
    }
}
