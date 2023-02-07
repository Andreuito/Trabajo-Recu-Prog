package Banco;

public class menu {

    Targeta targeta = new Targeta(123456789, "activa", "Banc 1", "");


    public static void main (String [] args){
        System.out.println("Creando una targeta...");
        //System.out.println(Targeta.toString());
    }
}


//apartado C
/*
 * Si hubiese diferentes targetas lo haría de la siguiente manera:
 * 
 * Habría una clase Targeta que sería padre de las posibles variaciones, es decir si comparten la majoria de atributos
 * separaria esos atributos distintivos siendo clases hijas de Targeta de manera que podrían acceder usando la funcion de
 * java llamada getClass() y así desde la clase targeta se le puede asignar valores a los atributos.
 * 
 * 
 * 
 * Sé que soy capaz de aprovar este examen pero me he bloqueado, probaré suerte en la última recuperación
 */
