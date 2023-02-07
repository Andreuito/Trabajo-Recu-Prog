package Banco;

public class menu {
    public static boolean validarTargeta(Targeta targeta){
        boolean valid = false;
        if (targeta.getNum_targe().length() == 16 && targeta.getEstado().equals("Activa")){
            valid = true;
        }
        return valid;
    }

    public static void main (String [] args){
        Targeta targeta1 = new Targeta("1234567890123452", "Banc 1", "Activa");
        System.out.println("Creando una targeta...");
        System.out.println("La targeta creada es" + targeta1.toString());
        if (validarTargeta(targeta1)){
            System.out.println("La targeta es valida");
        }else{
            System.out.println("La targeta no es valida");
        }
        targeta1.addCompra("Farmacia", 8.60f);
        targeta1.addCompra("Agencia de viajes", 90.88f);
        targeta1.addCompra("Mercadona", 12.55f);
        targeta1.addCompra("Cafeteria", 4.50f);
        targeta1.addCompra("Mecánico", 40.00f);
        targeta1.addCompra("Tienda de deportes", 29.95f);

        System.out.println("Mostrando las ultimas 3 compras...");
        targeta1.mostrarCompras(4);
    }
}


//apartado C
/*
 * A día de hoy existen dos tipos de targetas
 * 
 * Habría una clase Targeta que sería padre de las posibles variaciones, es decir si comparten la majoria de atributos
 * separaria esos atributos distintivos siendo clases hijas de Targeta de manera que podrían acceder usando la funcion de
 * java llamada getClass() y así desde la clase targeta se le puede asignar valores a los atributos.
 * 
 * 
 */
