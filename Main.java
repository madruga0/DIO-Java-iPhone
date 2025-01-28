package edu.PilaresPOO_IPC.DesafioiPhone.program;

public class Main {
    public static void main(String[] args) {

        ServicosiPhone iphone = new ServicosiPhone();

        iphone.reprodutorMusical.selecionarMusica("Red Hot Chilli Peppers");
        iphone.navegadorInternet.exibirPagina("https://helle.com");
        iphone.aparelhoTelefonico.ligar("12934567654");

    }
}
