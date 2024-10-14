public class MainTest {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando o reprodutor musical
        meuIPhone.getReprodutorMusical().tocar();
        meuIPhone.getReprodutorMusical().selecionarMusica("Minha Música Favorita");
        meuIPhone.getReprodutorMusical().pausar();

        // Testando o aparelho telefônico
        meuIPhone.getAparelhoTelefonico().ligar("123-456-7890");
        meuIPhone.getAparelhoTelefonico().atender();
        meuIPhone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Testando o navegador
        meuIPhone.getNavegador().exibirPagina("www.exemplo.com");
        meuIPhone.getNavegador().adicionarNovaAba();
        meuIPhone.getNavegador().atualizarPagina();
    } 
}   
