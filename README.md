# Trabajo de Recuperación

## Bloque 1 - Java

### 1) Se desea realizar una aplicación para móviles para gestionar los gastos de una targeta bancária. Esta aplicación tiene que permitir guardar los datos propios de la targeta i gestionar los pagos realizados.

### Desarrollo mental
Para este ejercicio así de primeras buscaba una posible herencia entre clases cosa que depués de leerla me di cuenta de que no.
Primero me pongo a leer los atributos y que tipo de atributos son, es decir, String, booleano o integer, pero me encuentro con el primer
dilema que es que tipo de dato es el último atributo, en el examen no supe identificarlo y utilicé una ArrayList, pero al llegar a casa me di cuenta inmediatamente, era crear otra clase llamada compra que contendrá los atributos de establecimiento y precio donde establecimiento es   String y float, esta clase compra únicamente contendrá el método para mostrar los datos de la clase compra.

Una vez creada la clase como dice el enunciado debemos guardar los datos en un atributo por tanto decido usar una ArrayList de compra en la que
contendrá los datos de compra.

Una vez comprendido la estructura del programa ahora solo queda definir getters, setters, constructores y sus respectivos métodos y por último crear la clase menú que contendrá el main del programa donde antes del main se debe crear el método validar y luego dentro del main mediante de los métodos creados dentro de la clase Targeta.

Una vez está todo definido el programa funciona de la siguiente manera: Creamos una targeta manualmente (Se podría hacer por teclado pero el enunciado no lo especifíca), la targeta se crea haciendo un objeto nuevo de targeta asignandole un numero, un nombre y su estado. Luego pasa por una función que valida que la targeta sea de 16 dígitos y su estado esté activo. Más adelante creo 6 compras con el método añadir compra y metiendo los valores por parámetro que son los definidos previamente en la clase compra y el método los guarda dentro de la ArrayList. 
Por último uso un método para mostrar las 'n' compras últimas, en este caso en vale 4 y, por tanto, muestra las últimas 4 compras realizadas.

### Desarrollo de código

En este apartado explicaré cómo funcionan los métodos y las tomas de decisiones sobre las iteraciones. 

##### Clase Targeta

Para empezar en la definición de los atributos el numero de la targeta considero que es mejor usar String ` private String num_targe` para así dentro del bucle poder recorrer la cadena con una funcion de java que es `num_targe.length()` en cambio sí usara el tipo de dato Integer tendría que pasarla momentániamente a String pero cómo no he hacer ningún tipo de operación con los números considero mejor definirla directamente como cadena de carácteres.

Luego para seguir los principios de la programación orientada a objetos después de los atributos se definirán los getters y setters que básicamente sirven para acceder a los atributos ya que son privados y poder obtener el valor (get) o darle valor (set). Una vez hechos los getters y setters pasamos a crear los constructores, debemos crear 2, el constructor vacio y el constructor completo. 

El constructor vacio sirve para crear objetos vacios en este caso targeta tal que así:
```
public Targeta() {
    this.num_targe = "";
    this.titular = "";
    this.estado = "";
}
```
Y el constructor completo sirve para crear objetos completos de targeta tal que así:
```
public Targeta(String num_targe, String titular, String estado) { 
    this.num_targe = num_targe;
    this.titular = titular;
    this.estado = estado;
}
```
Pasamos a lo último que se debe añadir que son los métodos y siguiendo el enunciado dice que debe haber 3 métodos, pero en este caso he creído conveniente usar un método más que es el método `toString()` para mostrar por terminal los datos de targeta, pero no todos, solo he creído conveniente mostrar el número de la targeta.

##### Método addCompra()

Para este método lo primero que había que hacer era pasarle por parámetro los atributos de compra y luego dentro del método lo único que había que hacer era crear un objeto compra donde las variables que le pasamos por parámetro sean los que le pasamos creando el nuevo objeto y finalmente añade la compra a la lista de compras de la clase targeta de la siguiente manera:
```
public void addCompra(String establicimiento, float precio) { 
    Compra compra = new Compra(establicimiento, precio);
    this.listaCompra.add(compra);
}
```

##### Método mostrarCompras()

Para este método se le tiene que pasar por parámetro un integer 'n' donde n puede valer lo que queramos luego dentro del método primero creamos un contador para que solo me muestre las n compras luego hacemos un bucle for el cual recorre la lista de compras de atrás hacia adelante y luego si el contador es más pequeño que n quiero que me muestre la compra usando un if y luego que me sume el contador cada iteración hasta que el contador sea más grande que n. En otras palabras que haga tantas vueltas como n sea, si n fuera 3, pues 3 vueltas me va a dar. Esto en código es tal que así:

```
public void mostrarCompras(int n) { 
    int contador = 0; 
    for (int i = listaCompra.size() - 1; i >= 0; i--) {
        if (contador < n) { 
            System.out.println(listaCompra.get(i));
            contador++;
        }
    }
}
```

##### Método escondeNum()

En este caso el método no necesita que le pasen nada por parámetro por tanto en dentro del método lo primero que debemos hacer es crear una variable que contendrá el número tapado con asteriscos y por ende el que se mostrará por pantalla. Una vez definida la variable de tipo string vacía que la llamaremos `String numOculto = "";` usaremos la iteración for para recorrer el atributo `private String num_targe;`  con el método `.length()` donde el bucle recorrerá toda la string una vez dentro del bucle le pondremos una condición if en la que cuando la posición sea menor que 12 me añadas un asterisco a cada vuelta por posición de 'i' es decir primera vuelta i = 0 añadem un * en la variable numOculto. 
Una vez la posición es mayor que 12 entra en un else en la que juntaremos lo que queda de numero de targeta con los asteriscos 
consiguiendo así algo tal que así: **** **** **** 3452 y el códgio es:
```
public void escondeNum() { 
    String numOculto = "";
    for (int i = 0; i < num_targe.length(); i++) {
        if (i < 12) {
            numOculto += "*"; 
        } else {
            numOculto += num_targe.charAt(i); 
        }
    }
    System.out.println(numOculto);
}
```

##### Clase Compra

Esta clase ha sido creada para poder almacenar los datos de compra y poder crear objetos por tanto contiene los atributos privados de tipo String para establecimiento y float para el precio, uso float porque los precios suelen tener décimales y si lo pongo de tipo integer no me deja usar décimales.

Por último esta clase contiene un método para mostras los datos de la compra y es tal que así:

```
@Override
public String toString() {
    return "  El establicimiento es -> " + establicimiento + " y su precio es -> " + precio + " euros" ;
}
```


##### Clase Menu

En esta clase es un poco diferente a las demás porque esta contiene el main que es una funcion para iniciar el programa y mostra los datos por terminal o los métodos.

Por tanto, dispondrá de dos métodos: 

##### Método validarTargeta()

Este método se le pasará por parámetro una targeta y luego dentro del método lo primero que se debe hacer es crear una variable booleana llamada `boolean valid = false;` ya que este método devuelve un booleano luego usaremos una condición if donde comprobaremos que el número de la targeta sean 16 dígitos y que su estado sea activo, en el caso que si sea así la variable 'valid' será true y por tanto finalmente me devuelve la variable tanto si es true o false. El código se vería tal que así:
```
public static boolean validarTargeta(Targeta targeta){ 
    boolean valid = false;
    if (targeta.getNum_targe().length() == 16 && targeta.getEstado().equals("Activa")){
        valid = true;
    }
    return valid;
}
```

##### Método public static void main (String [] args)

Este método como comentaba previamente es el encargado de que el programa 'arranque' y por tanto dentro de este método lo primero que hay que hacer es crear un objeto targeta que lo llamaremos 'targeta1' y le debemos pasar por parámetro los atributos de targeta, número, nombre, etc...
Para así poder primero comprobar que el constructor targeta funciona correctamente y poder trabajar con una targeta y añadirle compras.

Antes de añadirle compras primero mostraremos con la funcion `targeta1.toString()` los datos de la targeta creada.

Además debemos hacer una condición if para usar el método `validarTargeta(Targeta targeta)` el cual si el resultado del método es 'True' este deberá primero mostrar por pantalla que un `System.out.println("La targeta es válida")` que nos dice que la targeta es válida.

Para añadirle compras usaremos el método `addcCompras()` en el cual por parámetro le pasaremos los atributos de compras, en este caso establecimiento y precio de la siguiente manera:
`targeta1.addCompra("Farmacia", 8.60f);` la 'f' es por el tipo de dato float.

Por último la condición if usaremos el método `targeta1.mostrarCompras(4)` en cual mostrará las 4 últimas compras.

Si en la condición no se cumple la validación de la targeta, entra en 'else' y motrará por pantalla que la targeta no es válida.

Finalizando así el programa sobre la gestión de una targeta bancaria.

# Bloque 2 - Python

### 2. Crea un programa en Java o en Python que genere una matriz de 3x3 con valores aleatorios i que primero la muestre por pantalla y después muestre su matriz traspuesta.

#### Desarrollo mental

Primero para este ejercicio se tiene que decidir que lenguaje usar, y por comodidad para ejecutar el programa consecutivas veces para usar la técnica ensayo-error considero que el mejor lenguaje es Python.

Una vez decidido el lenguaje procedemos a desglosar el problema por partes y qué nos pide exactamente, una vez comprendo lo que pide que se dibuje por pantalla, empieza el debate con la algoritmia y me pregunto que tipo de iteración usar, tengo dos opciones, usar while o usar for. 

En este caso decido usar el for porque no que quiero que me repita sin parar la lista de numeros, solo que quiero que me itere desde punto 'a' a punto 'b'.

#### Desarrollo de código 

El ejercico me pide que haga una matriz de 3x3 con numeros aleatorios por tanto lo primero que se me ocurre es utilizar esta libreria `import random` que implementa generadores de números pseudoaleatorios para varias distribuciones, es decir, numeros enteros, numeros reales, etc. 

Luego debemos crear una lista vacia `numeros = []` que contendra los numeros aleatorios que generaremos más adelante.

##### Matriz 3x3

Para crear una matriz de 3x3, lo iteraremos con 'for', primero con este bucle generamos 3 filas `for i in range(3)`. Una vez dentro del bucle añadimos una lista vacia a la lista de numeros `numeros.append([])` y despues para generar las 3 columnas usaremos otro bucle for `for j in range(3)` y dentro de este bucle por cada numero de i le añadiremos numeros aleatorios ala lista con la siguiente funcion `numeros[i].append(random.randint(0,9))` que esta funcion viene de la libreria mencionada anteriormente. 
Después de añadir los numeros aleatorios lo debemos mostrar por pantalla mostrando cada posicion de cada bucle de la siguiente manera: `print(numeros[i][j], end=" "` y luego de imprimir el numero la funcion `end=""` lo que hace es generar un espacio en blanco. 

Para que luego no salgan los numeros desordenados se imprime un salto de linia con print vacío tal que así: `print()`

##### Matriz 3x3 traspuesta

Primero crearemos otro espacio en blanco para separar ambas matrices con `print()`

Para crear la matriz traspuesta de 3x3 usaremos la misma iteración que la matriz normal solo con una pequeña variación que consigue mover las filas y las columnas consiguiendo así las matriz traspuesta de la siguiente manera: `print(numeros[j][i], end=" ") ` a diferencia de la matriz normal mostraremos primero de j a i en vez de i a j.



