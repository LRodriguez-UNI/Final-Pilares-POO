public class Empleado_Tiempo_Completo extends Empleado {

    private double Salario_Anual;

    public Empleado_Tiempo_Completo(String Nombre, String Numero_Identificacion, double Salario_Anual) {
        super(Nombre, Numero_Identificacion);
        this.Salario_Anual = Salario_Anual;
    }


    public double get_Salario_Anual() {
        return Salario_Anual;
    }

    @Override
    public double Calcular_Salario() {
        return Salario_Anual / 12; // Salario mensual
    }
}