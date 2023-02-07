package Banco;

public class Compra {
    private String establicimiento;
    private float precio;
    

    //getters i setters

    public String getEstablicimiento(){
        return establicimiento;
    }

    public void setEstablicimiento(String establicimiento){
        this.establicimiento = establicimiento;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }


    //constructores

    public Compra(){
        this.establicimiento = "";
        this.precio = 0;
    }

    public Compra(String establicimiento, float precio){
        this.establicimiento = establicimiento;
        this.precio = precio;
    }

    //metodo toString para mostrar los datos de la compra
/*     @Override
    public String toString(){
        return "[" + " establicimiento= " + establicimiento + ", precio= " + precio + ']';
    }
 */
    //creame un metodo toString para mostrar los datos de la compra en forma de tabla con asteriscos
        @Override
    public String toString(){
        return "------------" + " establicimiento= " + establicimiento + ", precio= " + precio + "***************";
    }

}
