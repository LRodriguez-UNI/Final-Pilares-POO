public class App {
    public static void main(String[] args) throws Exception {

        Empleado[] empleados = new Empleado[2];

        empleados[0] = new Empleado_Tiempo_Completo("Juan Pérez", "125", 600000.0);
        empleados[1] = new Empleado_Medio_Tiempo("María López", "456", 15.0, 20);

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.get_Nombre() + ", Salario mensual: $" + empleado.Calcular_Salario());
        }
    }
}
