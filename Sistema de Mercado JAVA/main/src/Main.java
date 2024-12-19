import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String nome;
        double preco, precoTotal;
        int quantidade, Id_Produto;
        String Opcao_escolha;

        ArrayList<Produtos> ProdutosList = new ArrayList<>();

        while (true){
            System.out.println("Sistema de Mercado \n 1 - Cadastro de Produtos \n 2 - Vender Produto \n 3 - sair");


            precoTotal = 0;
            Scanner sc = new Scanner(System.in); // receber dados do teclado
            Opcao_escolha = sc.nextLine(); // armazena a variavel

            if (Opcao_escolha.equals("1")) { // cadastro dos produtos
                System.out.println("informe o nome do produto: ");
                nome = sc.nextLine();

                System.out.println("informe o preço do produto: ");
                preco = Double.parseDouble(sc.nextLine());

                System.out.println("informe a quantidade do produto: ");
                quantidade = Integer.parseInt(sc.nextLine());

                Produtos pro = new Produtos(nome, preco, quantidade);
                ProdutosList.add(pro);

                System.out.println("Cadastro Concluido");


            } else if (Opcao_escolha.equals("2")) { // vender os produtos

                while (true){
                    for (int i = 0; i < ProdutosList.size(); i++) {
                        Produtos cont = ProdutosList.get(i);
                        System.out.println(i + ":" + cont.Mostrar());
                    }
                    System.out.println("informe o codigo do produto: ");
                    Id_Produto = Integer.parseInt(sc.nextLine());
                    Produtos ProdutoVendido = ProdutosList.get(Id_Produto);

                    System.out.println("informe a Quantidade deste produto: ");
                    int quantidadeVendida = Integer.parseInt(sc.nextLine());

                    ProdutoVendido.retirar(quantidadeVendida);

                    precoTotal += (ProdutoVendido.getpreco() * quantidadeVendida);

                    System.out.println("vamos adicionum novo iten?\n sim \n nao");
                    sc = new Scanner(System.in);
                    String Carrinho = sc.nextLine();

                    if(Carrinho.equals("sim"))
                    {
                        continue;
                    }
                    else if(Carrinho.equals("nao"))
                    {
                        System.out.println("total da compra: "+ precoTotal);
                        break;
                    }
                }
            }

            else if(Opcao_escolha.equals("3")){
                break;
            }

            else {

                System.out.println("Houve um erro no codigo");

            }

        }
    }
}
