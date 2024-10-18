package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
        
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        if (!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        }else{
            System.out.println("O conjunto está vazio");
        }
    }
    
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
          for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
              contatosPorNome.add(c);
            }
          }
          return contatosPorNome;
        } else {
          throw new RuntimeException("O conjunto está vazio!");
        }
      }


    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()) {
            for(Contato c : contatoSet){
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
            
        }else {
            throw new RuntimeException("O conjunto está vazio");
        }
        
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContato agendaContatos = new AgendaContato();
    
        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContato();
    
        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);
    
        // Exibindo os contatos na agenda
        agendaContatos.exibirContato();
    
        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    
        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContato();
      }
    }


