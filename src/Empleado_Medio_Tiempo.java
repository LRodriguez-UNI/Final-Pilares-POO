public class Empleado_Medio_Tiempo extends Empleado {

    private double Salario_Por_Hora;
    private int Horas_Trabajadas_Por_Semana;

    public Empleado_Medio_Tiempo(String Nombre, String Numero_Identificacion, double Salario_Por_Hora,
            int Horas_Trabajadas_Por_Semana) {
        super(Nombre, Numero_Identificacion);
        this.Salario_Por_Hora = Salario_Por_Hora;
        this.Horas_Trabajadas_Por_Semana = Horas_Trabajadas_Por_Semana;
    }

    @Override
    public double Calcular_Salario() {
        return Salario_Por_Hora * Horas_Trabajadas_Por_Semana * 4; // Salario mensual
    }
}
