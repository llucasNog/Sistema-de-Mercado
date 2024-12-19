public class Produtos {

    private  int Id;
    private String nome_produto;
    private double preco_produto;
    private int quantidade_produto;

    public Produtos(String nome_produto, double preco_produto, int quantidade_produto) {
        this.nome_produto = nome_produto;
        this.preco_produto = preco_produto;
        this.quantidade_produto = quantidade_produto;
    }

    public double soma_produtos() {
        double somaTudo = preco_produto * quantidade_produto;
        return somaTudo;
    }

    public void retirar(int quantidadeVendida) {
        int Estoque = quantidade_produto - quantidadeVendida;
        if (Estoque <= 0) {
            quantidade_produto = 0;
        } else {
            this.quantidade_produto -= quantidadeVendida;
        }
    }

    public void Adicinar(int quantidade_produto) {
        this.quantidade_produto += quantidade_produto;
    }

    public String Mostrar() {
        return (nome_produto + " , " + preco_produto + " , " + quantidade_produto);
    }

    public int getId(){
        return Id;
    }

    public void SetId(int Id){
        this.Id = Id;
    }

    public String getNome(){
        return nome_produto;
    }

    public void setNome(String nome_produto){
        this.nome_produto = nome_produto;
    }

    public double getpreco(){
        return preco_produto;
    }

    public void setpreco(double preco_produto){
        this.preco_produto = preco_produto;
    }

    public int getquantidade(){
        return quantidade_produto;
    }

    public void setquantidade(int quantidade_produto){
        this.quantidade_produto = quantidade_produto;
    }
}