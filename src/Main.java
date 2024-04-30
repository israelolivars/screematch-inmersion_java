import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenidos a la inmersión en Java!");
        //System.out.println("Pelicula Matrix");
        //DECLARACION DE VARIABLES

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre ="Matrix";
        String sinopsis = """
                la mejor pelicula del fin del mileno
                """ ;

        double mediaEvaluacionesUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }


        for (int i = 1; i <= 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa la nota que le darias a matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaMatrix;

        }
        System.out.println("La media de la pelicula Matrix calculada por el usuario es: " + mediaEvaluacionesUsuario/3);
    }
}