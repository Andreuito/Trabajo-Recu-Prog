package Banco;

public class menu {

    public static boolean validarTargeta(Targeta targeta){ // creo un metodo para validar la targeta
        boolean valid = false;
        if (targeta.getNum_targe().length() == 16 && targeta.getEstado().equals("Activa")){ // compruebo que el numero de la targeta tenga 16 digitos y que el estado sea activo
            valid = true;
        }
        return valid;
    }

    public static void main (String [] args){
        Targeta targeta1 = new Targeta("1234567890123452", "Banco 1", "Activa"); // creo una targeta con los datos que me piden

        System.out.println("Creando una targeta...");
        System.out.println("");
        System.out.println("La targeta creada es" + targeta1.toString());
        System.out.println("Comprobando si la targeta es valida...");
        System.out.println("");

        if (validarTargeta(targeta1)){ // compruebo si la targeta es valida
            System.out.println("La targeta es válida");
        }else{
            System.out.println("La targeta no es válida");
        }

        System.out.println("");
        targeta1.addCompra("Farmacia", 8.60f);
        targeta1.addCompra("Agencia de viajes", 90.88f);
        targeta1.addCompra("Mercadona", 12.55f);
        targeta1.addCompra("Cafeteria", 4.50f);
        targeta1.addCompra("Mecánico", 40.00f);
        targeta1.addCompra("Tienda de deportes", 29.95f);

        System.out.println("Mostrando las ultimas 4 compras realizadas con la targeta");
        targeta1.escondeNum();

        System.out.println("");
        targeta1.mostrarCompras(4); // muestro las ultimas 4 compras
        System.out.println("");
    }
}


// Apartado C

/*
 * A día de hoy existen dos tipos de targetas las de debito y las de credito por tanto habría que crear una clase abstracta
 * Targeta que sería padre de dos clases hijas TargetaDebito y TargetaCredito. Estas clases se tendrían que poner los atributos
 * del padre en el constructor super() y añadir los atributos propios de cada clase. Por ejemplo en la clase TargetaDebito
 * se añadiría el atributo saldo y en la clase TargetaCredito se añadiría el atributo limite. También se tendría que crear
 * un metodo abstracto que se implementaría en las clases hijas.
 * 
 * Consiguiendo así separar el tipo de targeta de los atributos que tienen en comun.
 */
