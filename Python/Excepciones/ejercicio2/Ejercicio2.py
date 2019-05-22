from ejercicio2.Gato import Gato

gato = Gato("macho")
gatito = Gato("macho")

try:
    gato.apareaCon(gatito)
except Exception as e:
    print(e)
