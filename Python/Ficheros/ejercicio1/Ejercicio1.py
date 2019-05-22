archivo = open('primos.dat', 'w')

def esPrimo(num):
    for i in range(2, num):
        if (num%i) == 0:
            return False
    return True

for i in range(2, 501):
    if esPrimo(i):
        archivo.write(str(i) + "\n")
archivo.close()