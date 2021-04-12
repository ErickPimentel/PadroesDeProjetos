public abstract class JanelaAbstrata {

    protected JanelaImplementada janela;

    public JanelaAbstrata(JanelaImplementada j){
        janela = j;
    }

    public void desenharJanela(String titulo){
        janela.desenharJanela(titulo);
    }

    public void desenharCaixaDePergunta(String titulo){
        janela.desenharCaixaDePergunta(titulo);
    }

    public void desenharCaixaDeResposta(String titulo){
        janela.desenharCaixaDeResposta(titulo);
    }

    public void desenharBotao(String titulo){
        janela.desenharBotao(titulo);
    }

    public abstract void desenhar();

}
