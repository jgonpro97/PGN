from random import randint

diccionario = {}
palabrasEspagnol = []
palabrasAleatorias = []

aciertos = 0
fallos = 0

diccionario['rojo'] = 'rojo'
diccionario['azul'] = 'blue'
diccionario['verde'] = 'green'
diccionario['negro'] = 'black'
diccionario['blanco'] = 'white'
diccionario['barco'] = 'boat'
diccionario['coche'] = 'car'
diccionario['autobus'] = 'bus'
diccionario['bicicleta'] = 'bike'
diccionario['moto'] = 'motorcycle'
diccionario['perro'] = 'dog'
diccionario['gato'] = 'cat'
diccionario['caballo'] = 'horse'
diccionario['mono'] = 'monkey'
diccionario['pajaro'] = 'bird'
diccionario['cama'] = 'bed'
diccionario['ventana'] = 'windows'
diccionario['silla'] = 'chair'
diccionario['mesa'] = 'desk'
diccionario['ordenador'] = 'computer'

for i in diccionario:
    palabrasEspagnol.append(i)

for i in range(5):
    palabrasAleatorias.append(palabrasEspagnol.pop(randint(0, 19)))

for i in palabrasAleatorias:
    pIntroducida = input("Introduzca la traduccion al ingles de " + i + ": ")

    if pIntroducida == diccionario.get(i):
        print("\nPalabra acertada!!\n")
        aciertos = aciertos + 1

    else:
        print("\nPalabra erronea!!\n")
        fallos = fallos + 1

print("Palabras correctas: " , aciertos)
print("Palabras erroneas: " , fallos)
