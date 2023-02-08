package Banco;

import java.util.ArrayList;

public class Targeta {
    private String num_targe; // uso una string para que pueda recorrerla con un for
    private String titular;
    private String estado;
    private ArrayList<Compra> listaCompra = new ArrayList<Compra>(); // creo un arraylist para guardar las compras

    // getters i setters

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

    // constructores

    public Targeta() {
        this.num_targe = "";
        this.titular = "";
        this.estado = "";
    }

    public Targeta(String num_targe, String titular, String estado) { // creo el constructor con los parametros que necesito
        this.num_targe = num_targe;
        this.titular = titular;
        this.estado = estado;
    }

    // metodos

    @Override
    public String toString() {
        return " Visa imaginBank " + num_targe;
    }

    public void addCompra(String establicimiento, float precio) { // creo un metodo para añadir compras
        Compra compra = new Compra(establicimiento, precio); // creo un objeto compra
        this.listaCompra.add(compra); // añado el objeto compra a la lista
    }

    public void mostrarCompras(int n) { // creo un metodo para mostrar las ultimas n compras
        int contador = 0;
        for (int i = listaCompra.size() - 1; i >= 0; i--) { // recorro la lista de compras de atras para adelante
            if (contador < n) {
                System.out.println(listaCompra.get(i)); // muestro la compra
                contador++;
            }
        }
    }
 
    public void escondeNum() { // creo un metodo para ocultar los 12 primeros numeros de la targeta
        String numOculto = "";
        for (int i = 0; i < num_targe.length(); i++) { // recorro la targeta
            if (i < 12) {
                numOculto += "*"; // añado un * en la posicion i
            } else {
                numOculto += num_targe.charAt(i); // añado el numero de la targeta en la posicion i
            }
        }
        System.out.println(numOculto);
    }
}
