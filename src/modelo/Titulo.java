package modelo;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private String sinopsis;
    private boolean incluidoEnElPlanBasico;
    private int tiempoDeDuracionEnMinutos;
    private int duracionMaraton;


    public int getDuracionMaraton() {
        return duracionMaraton;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }


    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public String getDuracionEnHorasYMinutos(){
        return String.format("%d Horas y %d minutos", getTiempoDeDuracionEnMinutos() / 60, getTiempoDeDuracionEnMinutos() % 60);
    }

    public void muestraFichaTecnica(){
        System.out.println("******FICHA TÉCNICA*****");
        System.out.println("Nombre del titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración en minutos: " + getTiempoDeDuracionEnMinutos() + " minutos");
        //System.out.println("\n");


    }
}
