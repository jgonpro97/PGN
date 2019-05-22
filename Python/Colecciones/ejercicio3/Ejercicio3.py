lista = []

for i in range(0, 10):
    num = int(input("Introduce un numero: "))

    lista.append(num)

print("\nLista sin ordenar: ", lista)
lista.sort()
print("Lista ordenada: ", lista)