public class Mensagem {

    private String usuario;
    private String texto;

    public Mensagem(String usuario, String texto) {
        this.usuario = usuario;
        this.texto = texto;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTexto() {
        return texto;
    }

    public void print(){
        System.out.println(usuario);
        System.out.println(texto);
    }
}
