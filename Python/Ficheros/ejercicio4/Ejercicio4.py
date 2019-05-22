nombreArchivo = input("Introduce el nombre del fichero: ")
archivoLectura = open(nombreArchivo + '.txt', 'r')
archivoEscritura = open(nombreArchivo + '_sort.txt', 'w')

lista = archivoLectura.readlines()

archivoLectura.close()

lista.sort()

for s in lista:
    archivoEscritura.write(s)

archivoEscritura.close()