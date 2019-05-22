1
from vehiculo.Vehiculo import Vehiculo
from vehiculo.Bicicleta import Bicicleta
from vehiculo.Coche import Coche

coche = Coche(1900)
bicicleta = Bicicleta(6)

while True:
  print("VEHÍCULOS")
  print("=========")
  print("1. Anda con la bicicleta")
  print("2. Haz el caballito con la bicicleta")
  print("3. Anda con el coche")
  print("4. Quema rueda con el coche")
  print("5. Ver kilometraje de la bicicleta")
  print("6. Ver kilometraje del coche")
  print("7. Ver kilometraje total")
  print("8. Salir")
  print("Elige una opción (1-8):")
  opcion = int(input())

  if opcion == 1:
    km = int(input("\nCuanta distancia (en km) quieres andar: "))
    print()
    bicicleta.andar(km)

  if opcion == 2:
    bicicleta.hacerCaballito()

  if opcion == 3:
    km = int(input("\nCuanta distancia (en km) quieres andar: "))
    print()
    coche.andar(km)

  if opcion == 4:
    coche.quemarRueda()

  if opcion == 5:
    print("\nEl kilometraje de la bicicleta es: " , bicicleta.getkilometrosRecorridos() , "\n")

  if opcion == 6:
    print("\nEl kilometraje del coche es: " , coche.getkilometrosRecorridos() , "\n")

  if opcion == 7:
    print("\nEl kilometraje total de ambos vehiculos es: " , Vehiculo.kilometrosTotales, "\n")

  if opcion == 8:
    print("Saliendo....")
    break


