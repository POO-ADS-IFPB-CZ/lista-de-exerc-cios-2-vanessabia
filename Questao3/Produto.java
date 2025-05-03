package Questao3;

/**
 *
 * @author vanessa
 */
public class Produto {
    
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    
    public Produto (int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        setPreco(preco);
        this.estoque = estoque;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido. Deve ser não negativo.");
        }
    }

    
    public void exibirInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque: " + estoque + " unidades");
    }
   
    
    public static void main(String[] args) {
        Produto p = new Produto(101, "Notebook", 3500.00, 5);
        p.exibirInfo();
    }
}
