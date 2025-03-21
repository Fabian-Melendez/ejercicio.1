public class empHora extends Empleado{
    protected int paghora= 98000;
    protected int hortrab;

    public empHora() {
    }

    public empHora(String nom, int edad, int paghora, int hortrab) {
        super(nom, edad);
        this.paghora = paghora;
        this.hortrab = hortrab;

    }

    public int getPaghora() {
        return paghora;
    }

    public void setPaghora(int paghora) {
        this.paghora = paghora;
    }

    public int getHortrab() {
        return hortrab;
    }

    public void setHortrab(int hortrab) {
        this.hortrab = hortrab;
    }


    @Override
    public String toString() {
        return super.toString()+
                "paghora=" + paghora +
                ", hortrab=" + hortrab +
                '}';
    }

    @Override
    public void mostInfo(){
        super.mostInfo();
        System.out.println("El pago por hora es: "+paghora);
        System.out.println("Horas trabajadas: "+hortrab);

    }


}
