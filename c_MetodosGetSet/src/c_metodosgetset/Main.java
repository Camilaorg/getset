package c_metodosgetset;
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Mengano");
        empleado.setEdad(25);
        empleado.setGenero("Masculino");
        empleado.setSueldo(50000.0);
        empleado.mostrarDatos();
        empleado.mostrarSueldo();
    }
        
}
