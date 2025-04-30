package aulasPraticas.classTester;

import aulasPraticas.academy.polimorfismo.repo.Repositorio;
import aulasPraticas.academy.polimorfismo.servicos.RepoArquivo;
import aulasPraticas.academy.polimorfismo.servicos.RepoDB;
import aulasPraticas.academy.polimorfismo.servicos.RepoMemoria;

public class OrientacaoInterface {
    public static void main(String[] args) {
        // Assim como herança, é possível fazer polimorfismo em objetos que implementam determinado atributo de uma
            //interface. Como o método salvar() vem da interface Repositorio,
        Repositorio repo1 = new RepoDB();
        Repositorio repo2 = new RepoArquivo();
        Repositorio repo3 = new RepoMemoria();

        repo1.salvar();
        repo2.salvar();
        repo3.salvar();
    }
}
