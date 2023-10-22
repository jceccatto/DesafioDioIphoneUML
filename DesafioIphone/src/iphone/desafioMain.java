package iphone;

public class desafioMain {

  
    public static void main(String[] args) {
        var iPhone = new IPhone();
        
        System.out.println("\n Funções do Aparelho Telefônico");
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioDeVoz();

        System.out.println("\n Funções do Reprodutor Musical");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();

        System.out.println("\n Funções do Navegador de Internet");
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
