public class Cliente {
    public static void main(String[] args) {
        //LINUX
        JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaAviso(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaDownload(new JanelaLinux());
        janela.desenhar();

        //WINDOWS
        janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();

        janela = new JanelaAviso(new JanelaWindows());
        janela.desenhar();

        janela = new JanelaDownload(new JanelaWindows());
        janela.desenhar();

        //ANDROID
        janela = new JanelaDialogo(new JanelaAndroid());
        janela.desenhar();

        janela = new JanelaAviso(new JanelaAndroid());
        janela.desenhar();

        janela = new JanelaDownload(new JanelaAndroid());
        janela.desenhar();
    }
}
