public class empPlanta extends Empleado {
    protected int sf= 2100000;

    public empPlanta() {
    }

    public empPlanta(String nom, int edad, int sf) {
        super(nom, edad);
        this.sf = sf;
    }

    public int getSf() {
        return sf;
    }

    public void setSf(int sf) {
        this.sf = sf;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sf=" + sf +
                '}';
    }
    @Override
    public void mostInfo(){
        super.mostInfo();
        System.out.println("El salario del empleado es: "+sf);
    }
}
