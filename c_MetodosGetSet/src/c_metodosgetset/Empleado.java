package c_metodosgetset;
public class Empleado extends Persona{
    private double sueldo;
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public void mostrarSueldo(){
        System.out.println("Sueldo: " + sueldo);
    }
}

