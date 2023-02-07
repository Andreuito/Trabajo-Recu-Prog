package Banco;

public class Compra {
    private String establicimiento;
    private float precio;
    
    public Compra(){
        this.establicimiento = "";
        this.precio = 0;
    }

    public Compra(String establicimiento, float precio){
        this.establicimiento = establicimiento;
        this.precio = precio;
    }

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

    @Override
    public String toString(){
        return "Compra{" + "id=" + id + ", establicimiento=" + establicimiento + ", precio=" + precio + '}';
    }

    

}
