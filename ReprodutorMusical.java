package edu.PilaresPOO_IPC.DesafioiPhone.reprodutormusical;

import edu.PilaresPOO_IPC.DesafioiPhone.aparelhotelefonico.AparelhoTelefonico;

public class ReprodutorMusical extends AparelhoTelefonico {

    public void selecionarMusica(String musica) {
        tocar();
        System.out.println(musica);
        pausar();
    }
    private void tocar() {
        System.out.println("Tocando musica");
    }
    protected void pausar() {
        System.out.println("Pausando musica");
    }

}
