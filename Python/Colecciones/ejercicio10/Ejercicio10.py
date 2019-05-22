diccionario = {}

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

palabra = input("Plabra en español: ")

if diccionario.__contains__(palabra):
    print("Palabra en ingles: " , diccionario.get(palabra))

else :
    print("Esa palabra no se encuentra en el diccionario")