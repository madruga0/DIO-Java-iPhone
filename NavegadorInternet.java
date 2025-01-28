package edu.PilaresPOO_IPC.DesafioiPhone.navegadorinternet;

public class NavegadorInternet {

    public void exibirPagina(String url) {
        adicionarNovaAba();
        atualizarPagina();
        System.out.println("Exibindo a url " + url);
    }

    private void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    private void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

}
