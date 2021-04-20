import java.util.ArrayList;

public class ConcretoGrupo extends ObservableGrupo{
    private ArrayList<Mensagem> mensagens;

    public ConcretoGrupo() {
        mensagens = new ArrayList<Mensagem>();
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void adicionarMensagem (Mensagem mensagem){
        if(verificaSeUsuarioExiste(mensagem.getUsuario())){
            mensagens.add(mensagem);
            notificarUsuarios();
        }
        else {
            System.out.println("Não foi possivel enviar a mensagem!!! " + mensagem.getUsuario() + " não foi cadastrado no grupo anteriormente ou não pertence mais ao grupo");
        }
    }

    public void listarUsuarios(){
        System.out.println("Usuarios que estão cadastrados no grupo:");
        for (ObserverUsuario observerUsuario : this.usuarios){
            ConcretoObserver concretoUsuario = (ConcretoObserver) observerUsuario;
            System.out.println(concretoUsuario.getEmail());
        }
    }
}
