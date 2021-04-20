import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class teste {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String linha, email, mensagem;

        Pattern p;
        Matcher m;

        ConcretoGrupo g = new ConcretoGrupo();

        while (true){
            linha = r.nextLine();

            if (linha.contains("finalizar")){
                break;
            }

            p = Pattern.compile("\\s*\\S+@\\S+\\s*");
            m = p.matcher(linha);

            if (m.find()) {
                email = m.group(0);
                email = email.strip();
            }else{
                System.out.println("Nao foi inserido o email!!!");
                continue;
            }

            if (linha.contains("add")){
                g.adicionarUsuario(new ConcretoObserver(email,g));
                g.listarUsuarios();
            }
            else if (linha.contains("del")){
                g.deletarUsuario(email);
                g.listarUsuarios();
            }
            else {
                p = Pattern.compile("\".*\"");
                m = p.matcher(linha);
                if(m.find()){
                    mensagem = m.group(0);
                    mensagem = mensagem.strip();
                    StringBuilder sb = new StringBuilder(mensagem);
                    sb.deleteCharAt(mensagem.length() - 1);
                    sb.deleteCharAt(0);
                    mensagem = sb.toString();

                    g.adicionarMensagem(new Mensagem(email, mensagem));
                }
                else{
                    System.out.println("Nao foi inserida a mensagem!!!");
                    continue;
                }
            }
        }
    }
}
