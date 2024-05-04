import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido(a) a ScreenMatch
                    
                    1) Registrar nueva Pelicula
                    2) Registrar nueva Serie
                    
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el nombre del titulo de la pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingresa el año de lanzamiento de la pelicula");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa la duración de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa el nombre del director de la pelicula");
                    String director = teclado.nextLine();

                    Pelicula peliculaUsiario = new Pelicula();
                    peliculaUsiario.setNombre(nombre);
                    peliculaUsiario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsiario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsiario.setDirector(director);
                    peliculaUsiario.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingresa el nombre de la serie");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingresa el año de lanzamiento");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa el numero de temporadas");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa el numero de episodios por temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa la duracion en minutos por episodio");
                    int duracionEnMinutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();

                    Serie serie = new Serie();
                    serie.setNombre(nombre);
                    serie.setFechaDeLanzamiento(fechaDeLanzamiento);
                    serie.setTemporadas(temporadas);
                    serie.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serie.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
                    serie.muestraFichaTecnica();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");



            }

        }
    }
}
