@Tabela(nome = "minha_tabela")
public class MinhaTabela {
    public static void main(String[] args) {
        Class<?> classe = MinhaTabela.class;

        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = classe.getAnnotation(Tabela.class);
            String nomeTabela = tabela.nome();
            System.out.println("Nome da tabela: " + nomeTabela);
        }
    }
}
