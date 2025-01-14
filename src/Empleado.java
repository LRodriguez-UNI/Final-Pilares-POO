abstract class Empleado {

    private String Nombre;
    private String Numero_Identificacion;

    public Empleado(String Nombre, String Numero_Identificacion) {
        this.Nombre = Nombre;
        this.Numero_Identificacion = Numero_Identificacion;
    }

    public String get_Nombre() {
        return Nombre;
    }

    public String get_Numero_Identificacion() {
        return Numero_Identificacion;
    }

    // Método abstracto
    public abstract double Calcular_Salario();
}