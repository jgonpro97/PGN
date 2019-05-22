archivo = open('primos.dat', 'r')

while True:
    linea = archivo.readline()
    if not linea:
        break
    print(linea)

archivo.close()