public class JanelaDownload extends JanelaAbstrata{

    public JanelaDownload(JanelaImplementada j) {
        super(j);
    }

    public void desenhar() {
        desenharJanela("Janela de Download");

        desenharCaixaDePergunta("Onde o download deve ser realizado?");
        desenharCaixaDeResposta("Resposta: ");

        desenharCaixaDePergunta("Deseja continuar o download?");
        desenharBotao("Sim");
        desenharBotao("Não");

    }
}
