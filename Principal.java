public class Principal {

    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println(" -- PROJETO DE VENDAS -- \n");
            System.out.println(" 1 - CADASTRAR CLINTE");
            System.out.println(" 2 - LISTAR CLIENTES");
            System.out.println(" 0 - SAIR\n");
            opcao = Console.readInt("Digite uma opção:");

            switch (opcao) {
                case 1:
                    System.out.println("\n --- CADASTRO CLIENTES --- \n");
                    break;

                case 2:
                    System.out.println("\n --- LISTAGEM CLIENTES --- \n");
                    break;

                case 0:
                    System.out.println("\n --- SAINDO --- \n");
                    break;

                default:
                    System.out.println("\n --- OPÇÃO INVÁLIDA --- \n");
                    break;
            }

        } while (opcao != 0);

    }

}
