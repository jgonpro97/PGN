from random import randint
from statistics import mean

lista = []
tamanno = randint(10, 20)

for i in range(tamanno):
    num = randint(0, 100)

    lista.append(num)

print(lista)

print("Suma: ", sum(lista))
print("Media: %.2f" %  mean(lista))
print("Maximo: ", max(lista))
print("Minimo: ", min(lista))