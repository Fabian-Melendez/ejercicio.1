public class Empleado {
    protected String nom;
    protected int edad;

    public Empleado() {
    }

    public Empleado(String nom, int edad) {
        this.nom = nom;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nom='" + nom + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void mostInfo(){
        System.out.println("Nombre empleado: "+this.nom);
        System.out.println("Edad empleado: "+this.edad);
    }
}
