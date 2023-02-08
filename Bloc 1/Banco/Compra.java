package Banco;


public class Compra { // creo la clase compra para poder guardar los datos de las compras
    private String establicimiento;
    private float precio; // uso float para poder guardar los decimales

    // getters i setters

    public String getEstablicimiento() {
        return establicimiento;
    }

    public void setEstablicimiento(String establicimiento) {
        this.establicimiento = establicimiento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // constructores

    public Compra() {
        this.establicimiento = "";
        this.precio = 0;
    }

    public Compra(String establicimiento, float precio) {
        this.establicimiento = establicimiento;
        this.precio = precio;
    }

    // metodo toString para mostrar los datos de la compra
    @Override
    public String toString() {
        return "  El establicimiento es -> " + establicimiento + " y su precio es -> " + precio + " euros" ;
    }

}
