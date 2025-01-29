package edu.PilaresPOO_IPC.DesafioiPhone.aparelhotelefonico;

import edu.PilaresPOO_IPC.DesafioiPhone.navegadorinternet.NavegadorInternet;

public class AparelhoTelefonico extends NavegadorInternet {

    public void ligar(String numero) {
        atender();
        System.out.println("Ligando para " + numero);
        iniciarCorreiVoz();
    }

    protected void atender() {
        System.out.println("Atendeu");
    }

    protected void iniciarCorreiVoz() {
        System.out.println("Iniciou correio de voz");
    }

}
