package exercicios.dominio.calculadoraSimples2;
// Um enumerador que implementa um método de uma interface.
// Inserir estes métodos diretamente na interface é mais simples, direto, ótimo para funções utilitárias ou situações
    // em que não se precisa de objetos.
// Usar com enum permite usar polimorfismo e escolher comportamentos em tempo de execução (ex: com switch, menu
    // interativo etc.). É bem útil quanod há diversos comportamentos intercambiáveis como esse.
public enum TipoOperacao implements OpMatematica{
    SOMA{
        @Override
        public double calcular(double a, double b) {
            return a+b;
        }
    },
    SUBTRACAO{
        @Override
        public double calcular(double a, double b) {
            return a-b;
        }
    },
    MULTIPLICACAO{
        @Override
        public double calcular(double a, double b) {
            return a*b;
        }
    },
    DIVISAO{
        @Override
        public double calcular(double a, double b) {
            return a/b;
        }
    }
}
