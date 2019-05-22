from vehiculo.Vehiculo import Vehiculo


class Bicicleta(Vehiculo):

    def __init__(self, velocidades):
        super().__init__()
        self.__velocidades = velocidades

    def getVelocidades(self):
        return self.__velocidades

    def setVelocidades(self, velocidades):
        self.__velocidades = velocidades

    def hacerCaballito(self):
        print("\nEstoy haciendo el caballito\n")