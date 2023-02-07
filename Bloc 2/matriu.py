import random

numeros = [] 

print("Matriz 3x3")

for i in range(3): # Creamos un bucle que genera 3 filas
    numeros.append([]) # Lista vacia en cada fila
    for j in range(3): # Otro bucle que genera 3 columnas
        numeros[i].append(random.randint(0,9)) # Añaden numeros aleatorios
        print(numeros[i][j], end=" ") # se printea la matriz
    print()
    
print()
print("Matriz 3x3 traspuesta")

 # Repetimos el mismo bucle pero cambiando el orden de las filas y columnas
for i in range(3): 
    numeros.append([])
    for j in range(3):
        numeros[i].append(random.randint(0,9))
        print(numeros[j][i], end=" ") # Aqui cambiamos el orden de las filas y columnas
    print()
