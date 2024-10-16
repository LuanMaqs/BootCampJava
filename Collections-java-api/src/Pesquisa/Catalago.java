package Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class Catalago {
    private List<Livro> listLivro;

    public Catalago() {
        this.listLivro = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int ano) {
        listLivro.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for(Livro l : listLivro ) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;

        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for(Livro ln : listLivro){
                if(ln.getAno() >= anoInicial && ln.getAno() <= anoFinal){
                    livrosPorAno.add(ln);
                }
            }
            return livrosPorAno;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!listLivro.isEmpty()) {
            for(Livro l : listLivro){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        }  else {
            throw new RuntimeException("A lista está vazia!");
        }
        
    }

    public static void main(String[] args) {
        Catalago catalogoLivros = new Catalago();

        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
    
        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
    
        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
    
        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAno(2010, 2022));
    
        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAno(2025, 2030));
    
        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));
    
        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
        
    }
}
