import java.util.ArrayList;

public class ObservableGrupo {

    protected ArrayList<ObserverUsuario> usuarios;

    public ObservableGrupo(ArrayList<ObserverUsuario> usuarios) {
        usuarios = new ArrayList<ObserverUsuario>();
    }

    public ObservableGrupo() {
        usuarios = new ArrayList<ObserverUsuario>();
    }

    public void adicionarUsuario(ObserverUsuario usuario){
        ConcretoObserver concretoUsuario = (ConcretoObserver) usuario;
        if (!verificaSeUsuarioExiste(concretoUsuario.getEmail())){
            usuarios.add(usuario);
            //System.out.println("Usuario" + usuario + "adicionado com sucesso");
        }
        else{
            System.out.println("Impossivel adicionar usuario!!! " + concretoUsuario.getEmail() + " ja foi cadastradono grupo");
        }
    }

    public void deletarUsuario (String email){
        for (ObserverUsuario observerUsuario : usuarios){
            ConcretoObserver concretoUsuario = (ConcretoObserver) observerUsuario;
            if (email.equals(concretoUsuario.getEmail())){
                usuarios.remove(observerUsuario);
                return;
            }
        }
    }

    protected boolean verificaSeUsuarioExiste (String email) {
        for (ObserverUsuario observerUsuario : usuarios) {
            ConcretoObserver concreteUser = (ConcretoObserver) observerUsuario;
            if (email.equals(concreteUser.getEmail())) return true;
        }
        return false;
    }

    protected void notificarUsuarios(){
        for (ObserverUsuario observerUsuario : usuarios){
            observerUsuario.atualizarDadosDoGrupo();
        }
    }
}
