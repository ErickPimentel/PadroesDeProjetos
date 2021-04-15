public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget {
    public void carregarImagem(String nomeDoArquivo) {
        SDL_CarregarSurface(nomeDoArquivo);
    }

    public void desenharImagem(int posX, int posY, int largura, int altura) {
        SDL_DesenharSurface(largura, altura, posX, posY);
    }
}
