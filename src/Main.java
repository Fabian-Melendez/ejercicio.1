import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int op;
        boolean est = true;
        boolean con = true;

        List<empHora> lstEmpleado =new ArrayList<>();
        List<empPlanta> lsEmpleado= new ArrayList<>();
        List<Empleado> lstaEmpleado= new ArrayList<>();

        empPlanta e1 = new empPlanta();
        empHora e2 = new empHora();

        do{
            System.out.println("""
                    ------MENU-----
                    1.Registrar empleado de planta
                    2.Registrar empleado por hora
                    3.Calcular salario de empleado por hora
                    4.Mostrar todos los empleados
                    5.Salir
                    """);
            op= tc.nextInt();
            switch (op){
                case 1 ->{
                    System.out.println("Ingrese el nombre del empleado");
                    e1.setNom(tc.next());
                    System.out.println("Ingrese la edad del empleado");
                    e1.setEdad(tc.nextInt());
                    System.out.println("El salario del empleado es: ");
                    e1.mostInfo();
                    lsEmpleado.add(new empPlanta(e1.getNom(),e1.getEdad(), e1.getSf()));
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del empleado");
                    e2.setNom(tc.next());
                    System.out.println("Ingrese la edad del empleado");
                    e2.setEdad(tc.nextInt());
                    System.out.println("Ingrese las horas trabajadas");
                    e2.setHortrab(tc.nextInt());
                    //e2.mostInfo();

                    lstEmpleado.add(new empHora(e2.getNom(), e2.getEdad(), e2.getHortrab(), e2.getPaghora()));
                }
                case 3 ->{
                    String nEmpleado;
                    System.out.println("Ingrese el nombre del usuario");
                    nEmpleado= tc.next();
                    for (int i = 0; i < lstEmpleado.size(); i++){
                        if (lstEmpleado.get(i).getNom().equalsIgnoreCase(nEmpleado)){
                         }
                    }
                    do{
                       System.out.println("Ingrese las horas trabajadas");
                    e2.setHortrab(tc.nextInt());
                    int sal = e2.hortrab*98000;
                        System.out.println("El pago del trabajador es: "+sal);
                        con= false;
                    }while (con);

                }
                case 4 -> {
                    for (Empleado cu : lsEmpleado ){
                        System.out.println(cu);
                    }
                    for (Empleado ci : lstEmpleado){
                        System.out.println(ci);
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    est=false;
                }


            }


        }while(est);
    }
}