package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Targeta { 
    private Integer num;
    private String estat;
    private String nom;
    private Compra compra;

    //getters i setters
    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public String getEstat(){
        return estat;
    }

    public void setEstat(String estat){
        this.estat = estat;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public Compra getCompra(){
        return compra;
    }

    public void setCompra(Compra compra){
        this.compra = compra;
    }
    //constructors

    //constructor vacio
    public Targeta(){
        this.num = 0;
        this.estat = "";
        this.nom = "";
        this.compra = compra;
    }

    //constructo completo
    public Targeta(int num, String estat, String nom, String dades){
        this.setNum(num);
        this.setEstat(estat);
        this.setNom(nom);
        this.setCompra(compra);
    }

    //métodes
    @Override
    public String toString(){
        return "Targeta [num= " + num + ", nom= " + nom + ", estat= " + estat +']';
    }

    //afegir una compra
    public static void afegirCompra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nom de l'establiment: ");
        String establecimiento = sc.nextLine();
        System.out.println("Introdueix el preu de la compra: ");
        float precio = sc.nextFloat();
        Compra compra = new Compra(establecimiento, precio);
        

    }

    //llistar compres
    public static String retornarCompres(int n){
        return "Compra [establecimiento= " + establecimiento + ", precio= " + precio + "]";
    }

    //tapar numero targeta
    public static String taparNum(Integer num){
        String converted = "";
        for(int i = 0; i < num; i++){
            converted = num + "*";
        }
        return converted;
    }
}
