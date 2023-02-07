# Trabajo de recuperación

## Bloque 1 - Java

### 1) Se desea realizar una aplicación para móviles para gestionar los gastos de una targeta bancária. Esta aplicación tiene que permitir guardar los datos propios de la targeta i gestionar los pagos realizados.

#### Desarrollo mental

#### Desarrollo de código

## Bloque 2 - Python

### 2. Crea un programa en Java o en Python que genere una matriz de 3x3 con valores aleatorios i que primero la muestre por pantalla y después muestre su matriz traspuesta.

#### Desarrollo mental 

Primero para este ejercicio se tiene que decidir que lenguaje usar, y por comodidad para ejecutar el programa consecutivas veces para usar la técnica ensayo-error considero que el mejor lenguaje es Python.

Una vez decidido el lenguaje procedemos a desglosar el problema por partes y qué nos pide exactamente, una vez comprendo lo que pide que se dibuje por pantalla, empieza el debate con la algoritmia y me pregunto que tipo de iteración usar, tengo dos opciones, usar while o usar for. 

En este caso decido usar el for porque no que quiero que me repita sin parar la lista de numeros, solo que quiero que me itere desde punto 'a' a punto 'b'.

#### Desarrollo de código 

El ejercico me pide que haga una matriz de 3x3 con numeros aleatorios por tanto lo primero que se me ocurre es utilizar esta libreria `import random` que implementa generadores de números pseudoaleatorios para varias distribuciones, es decir, numeros enteros, numeros reales, etc. 

Luego debemos crear una lista vacia `numeros = []` que contendra los numeros aleatorios que generaremos más adelante.

###### Matriz 3x3

Para crear una matriz de 3x3, lo iteraremos con 'for', primero con este bucle generamos 3 filas `for i in range(3)`. Una vez dentro del bucle añadimos una lista vacia a la lista de numeros `numeros.append([])` y despues para generar las 3 columnas usaremos otro bucle for `for j in range(3)` y dentro de este bucle por cada numero de i le añadiremos numeros aleatorios ala lista con la siguiente funcion `numeros[i].append(random.randint(0,9))` que esta funcion viene de la libreria mencionada anteriormente. 
Después de añadir los numeros aleatorios lo debemos mostrar por pantalla mostrando cada posicion de cada bucle de la siguiente manera: `print(numeros[i][j], end=" "` y luego de imprimir el numero la funcion `end=""` lo que hace es generar un espacio en blanco. 

Para que luego no salgan los numeros desordenados se imprime un salto de linia con print vacío tal que así: `print()`

###### Matriz 3x3 traspuesta

Primero crearemos otro espacio en blanco para separar ambas matrices con `print()`

Para crear la matriz traspuesta de 3x3 usaremos la misma iteración que la matriz normal solo con una pequeña variación que consigue mover las filas y las columnas consiguiendo así las matriz traspuesta de la siguiente manera: `print(numeros[j][i], end=" ") ` a diferencia de la matriz normal mostraremos primero de j a i en vez de i a j.



