package iphone;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Chamando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no browser");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no browser");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no browser...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }
}