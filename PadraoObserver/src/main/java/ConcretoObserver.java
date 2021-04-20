import java.util.ArrayList;

public class ConcretoObserver implements ObserverUsuario{

    private String email;
    private ConcretoGrupo concretoGrupo;
    private ArrayList<Mensagem> mensagensDoGrupo;

    public ConcretoObserver(String email, ConcretoGrupo concretoGrupo) {
        this.email = email;
        this.concretoGrupo = concretoGrupo;
    }

    public void atualizarDadosDoGrupo() {
        this.mensagensDoGrupo = this.concretoGrupo.getMensagens();
        mostrarMensagensRecebidas();
    }

    public String getEmail() {
        return email;
    }

    public ConcretoGrupo getConcretoGrupo() {
        return concretoGrupo;
    }

    public ArrayList<Mensagem> getMensagensDoGrupo() {
        return mensagensDoGrupo;
    }

    public void mostrarMensagensRecebidas(){
        Mensagem mensagem = mensagensDoGrupo.get(mensagensDoGrupo.size() - 1);
        if (mensagem.getUsuario().equals(email)){
            System.out.println(email + " - mensagem enviada para o grupo");
        }
        else{
            System.out.println(email + " - recebeu uma mensagem no grupo");
        }
        mensagem.print();
    }
}
