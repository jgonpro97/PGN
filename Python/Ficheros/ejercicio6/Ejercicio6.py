nombreArchivo = input("Introduce el nombre del fichero: ")
archivo = open(nombreArchivo + '.txt', 'r')
lista = []
palabra  = input("Introduce la palabra que quiera buscar: ")
repetida = 0

while True:
    linea = archivo.readline()
    if not linea:
        break
    lista.append(linea.strip())

for s in lista:
    if s == palabra:
        repetida = repetida + 1

archivo.close()
print("La palabra " + palabra + " se repite en el fichero " + str(repetida) + " veces")

