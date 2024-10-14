public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private Navegador navegador;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegador = new Navegador();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public Navegador getNavegador() {
        return navegador;
    }
}
