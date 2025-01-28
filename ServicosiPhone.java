package edu.PilaresPOO_IPC.DesafioiPhone.program;

import edu.PilaresPOO_IPC.DesafioiPhone.aparelhotelefonico.AparelhoTelefonico;
import edu.PilaresPOO_IPC.DesafioiPhone.navegadorinternet.NavegadorInternet;
import edu.PilaresPOO_IPC.DesafioiPhone.reprodutormusical.ReprodutorMusical;

public class ServicosiPhone extends NavegadorInternet{

    NavegadorInternet navegadorInternet;
    AparelhoTelefonico aparelhoTelefonico;
    ReprodutorMusical reprodutorMusical;

    public ServicosiPhone() {
        this.navegadorInternet = new NavegadorInternet();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.reprodutorMusical = new ReprodutorMusical();
    }


}
