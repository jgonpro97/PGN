lista = []
num = 0

for i in range(0, 5):
    while(True):
        try:
            num = int(input("Introduce un numero: "))
            break
        except ValueError:
            print("Valor no valido")

    lista.append(num)

print("\nMaximo :" , max(lista))
