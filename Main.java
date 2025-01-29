package edu.PilaresPOO_IPC.DesafioiPhone.program;

public class Main {
    public static void main(String[] args) {

        ServicosiPhone iphone = new ServicosiPhone();

        iphone.ligar("81998392");
        
        iphone.exibirPagina("htpp://localhost");
        
        iphone.selecionarMusica("Enter Sandman - Metallica");
    }
}
