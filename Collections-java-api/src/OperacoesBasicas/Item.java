package OperacoesBasicas;

public class Item {
    private String nome;
    private int preco;
    private int quant;
    public Item(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quantidade;
    }
    public String getNome() {
        return nome;
    }
    
    public int getPreco(){
        return preco;
    }

    public int getQuant() {
        return quant;
    }
    
    @Override
	public String toString() {
		return "Item{" +
				"nome='" + nome + '\'' +
				", preco=" + preco +
				", quant=" + quant +
				'}';
	}
    
    
    
    
    
}
