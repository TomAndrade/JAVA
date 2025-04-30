package aulasPraticas.academy.interfaces;
// Interfaces são como contratos a serem seguidos à risca.
// Interfaces são incompatíveis com finals também.
// Não podem ser instanciadas como um novo objeto.
// Todos os métodos da interface são por padrão públicos e abstratos.
// Todos os atributos de uma interface são públicas, estáticas e finals.
// Uma interface não pode implementar de outra e sim estendê-la.
// Ordem de permissões para modificadores de acesso: private -> default -> protected -> public
// Quando não usar interfaces:
    // Quando você quer compartilhar código comum, aí sim classe abstrata faz mais sentido.
    // Interfaces não têm estado (variáveis de instância) e não guardam lógica implementada (salvo os métodos default,
        // que é uma gambiarra moderna).
public interface DataLoader {
    String ATRIBUTOS_SAO_ESTATICOS_E_FINALS = " ";
    void carregar();
    // Para inserir métodos concretos (não abstratos), use a palavra reservada "default".
    // Todos os métodos default são públicos também.
    default void checkPermission(){
        System.out.println("Checando permissões...");
    }
    static void metodoEstatico(){
        System.out.println("Métodos estáticos de interfaces são públicos");
    }
}
