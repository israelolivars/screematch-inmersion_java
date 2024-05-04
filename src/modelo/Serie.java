package modelo;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * duracionEnMinutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }
    @Override
    public void muestraFichaTecnica() {
        super.muestraFichaTecnica();
        System.out.println("Número de temporadas: " + getTemporadas());
        System.out.println("Episodios por temporada: " + getEpisodiosPorTemporada());
        System.out.println("Duración por episodio: " + getDuracionEnMinutosPorEpisodio() + " minutos");
        System.out.println("Duración total de la serie: " + getDuracionEnHorasYMinutos());
    }

}
