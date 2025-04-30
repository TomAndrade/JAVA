package aulasPraticas.academy.interfaces;
// Quando se trabalha com interfaces, você usa implements ao invés de extends. E já que interfaces são contratos,
    // evidentemente tudo nele precisa ser implementado.
// Diferente do extends, é possível implementar mais de uma interface para uma classe.
public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void carregar() {
        System.out.println("Carregando dados...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados...");
    }
}
