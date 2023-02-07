package Banco;

import java.util.ArrayList;

public class Targeta { 
    private String num_targe; //uso una string para que pueda recorrerla con un for
    private String titular;
    private String estado;
    private ArrayList<Compra> listaCompra = new ArrayList<Compra>();

    //getters i setters

    public String getNum_targe() {
        return num_targe;
    }

    public void setNum_targe(String num_targe) {
        this.num_targe = num_targe;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Compra> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(ArrayList<Compra> listaCompra) {
        this.listaCompra = listaCompra;
    }

    //constructores

    public Targeta() {
        this.num_targe = "";
        this.titular = "";
        this.estado = "";
    }

    public Targeta(String num_targe, String titular, String estado) {
        this.num_targe = num_targe;
        this.titular = titular;
        this.estado = estado;
    }

    //creame un método toString para mostrar los datos de la targeta con forma de tabla con asteriscos
        @Override
    public String toString(){
        return "***************" + " num_targe= " + num_targe + ", titular= " + titular + ", estado= " + estado + "***************";
    }

/*     @Override
    public String toString() {
        return " Visa imaginBank [" + " num_targe= " + num_targe + ", titular= " + titular + ", estado= " + estado + ']';
    } */

    public void addCompra(String establicimiento, float precio){
        Compra compra = new Compra(establicimiento, precio);
        this.listaCompra.add(compra);
    }

    public void mostrarCompras(int n){
        int contador = 0;
        for (int i = listaCompra.size() - 1; i >= 0; i--) {
            if(contador < n){
                System.out.println(listaCompra.get(i));
                contador++;
            }
        }
    }

    public void escondeNum(){
        String numOculto = "";
        for (int i = 0; i < num_targe.length(); i++) {
            if(i < 12){
                numOculto += "*";
            }else{
                numOculto += num_targe.charAt(i);
            }
        }
        System.out.println("El numero de la targeta es: " + numOculto);
    }
}
