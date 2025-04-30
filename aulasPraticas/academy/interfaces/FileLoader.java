package aulasPraticas.academy.interfaces;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void carregar() {
        System.out.println("Carregando arquivo...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo...");
    }
}
