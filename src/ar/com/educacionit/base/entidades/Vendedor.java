package ar.com.educacionit.base.entidades;

public class Vendedor extends Persona{

    int cantAutosVendidos;

    public Vendedor() {
        super();
    }

    public Vendedor(String nombre, String apellido, String numeroDocumento, int cantAutosVendidos) {
        super(nombre, apellido, numeroDocumento);
        this.cantAutosVendidos = cantAutosVendidos;
    }

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + this.getNombre() + '\'' +
                ", apellido='" + this.getApellido() + '\'' +
                ", numero de documento='" + this.getNumeroDocumento() + '\'' +
                ", cantAutosVendidos='" + cantAutosVendidos +
                '}';
    }
}
