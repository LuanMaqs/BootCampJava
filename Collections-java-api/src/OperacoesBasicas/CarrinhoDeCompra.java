package OperacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, int preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }   

    public void removerItem(String nome) {
        if (!itemList.isEmpty()) {  // Verifica se a lista não está vazia
            Iterator<Item> iterator = itemList.iterator();
            boolean encontrouItem = false;

            while (iterator.hasNext()) {
                Item i = iterator.next();
                
                // Verifica se o nome do item é o mesmo que foi passado, ignorando letras maiúsculas/minúsculas
                if (i.getNome().equalsIgnoreCase(nome)) {
                    iterator.remove();  // Remove diretamente o item durante a iteração
                    encontrouItem = true;
                }
            }

            // Mensagem para o caso de nenhum item com o nome especificado ter sido encontrado
            if (encontrouItem) {
                System.out.println("Item(s) removido(s) com sucesso.");
            } else {
                System.out.println("Nenhum item com o nome '" + nome + "' foi encontrado.");
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }


    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
              double valorItem = item.getPreco() * item.getQuant();
              valorTotal += valorItem; 
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return valorTotal;
    } 

    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
          } else {
            System.out.println("A lista está vazia!");
          }
    }

    @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + itemList +
          '}';
    }
  
    public static void main(String[] args) {
      
      CarrinhoDeCompra carrinhoDeCompras = new CarrinhoDeCompra();
  
      // Adicionando itens ao carrinho
      carrinhoDeCompras.adicionarItem("Lápis", (int) 2d, 3);
      carrinhoDeCompras.adicionarItem("Lápis", (int) 2d, 3);
      carrinhoDeCompras.adicionarItem("Caderno",  (int)35d, 1);
      carrinhoDeCompras.adicionarItem("Borracha", (int)2d, 2);
  
      // Exibindo os itens no carrinho
      carrinhoDeCompras.exibirItens();
  
      // Removendo um item do carrinho
      carrinhoDeCompras.removerItem("Lápis");
  
      // Exibindo os itens atualizados no carrinho
      carrinhoDeCompras.exibirItens();
  
      // Calculando e exibindo o valor total da compra
      System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
  }


