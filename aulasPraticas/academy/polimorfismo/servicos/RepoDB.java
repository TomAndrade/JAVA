package aulasPraticas.academy.polimorfismo.servicos;

import aulasPraticas.academy.polimorfismo.repo.Repositorio;

public class RepoDB implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em... Banco de dados");
    }
}
