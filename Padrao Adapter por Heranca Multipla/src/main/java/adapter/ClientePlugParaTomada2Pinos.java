package adapter;

import com.katyusco.padroes.adpater.servicos.Fio;

public class ClientePlugParaTomada2Pinos {
    private Fio pinoFase;
    private Fio pinoNeutro;

    //construtor
    public ClientePlugParaTomada2Pinos(Fio pinoFase, Fio pinoNeutro) {
        this.pinoFase = pinoFase;
        this.pinoNeutro = pinoNeutro;
    }

    private void acoplaPlug(){
        AdapterTomadaDe2Para3Pinos adaptador = new AdapterTomadaDe2Para3Pinos(this.pinoFase, this.pinoNeutro);
        adaptador.conectar();
    }

    public static void main(String[] args) {
        ClientePlugParaTomada2Pinos plug2Pinos = new ClientePlugParaTomada2Pinos(Fio.FASE, Fio.NEUTRO);
        plug2Pinos.acoplaPlug();
    }
}
