package aulasPraticas.academy.polimorfismo.servicos;

import aulasPraticas.academy.polimorfismo.repo.Repositorio;

public class RepoMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em... Memória");
    }
}
