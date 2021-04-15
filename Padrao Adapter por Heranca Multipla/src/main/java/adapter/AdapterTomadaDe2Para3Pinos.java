package adapter;

import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;

public class AdapterTomadaDe2Para3Pinos extends ServicoTomada3Pinos implements InterfaceAlvoParaTomada2Pinos{

    public AdapterTomadaDe2Para3Pinos(Fio fase, Fio neutro) {
        super(fase, neutro, null);
    }

    public void conectar() {
        this.forneceEnergia();
    }
}


