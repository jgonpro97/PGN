class Vehiculo():

    vehiculosCreados = 0
    kilometrosTotales = 0

    def __init__(self):
        self.__kilometrosRecorridos = 0

    def getkilometrosRecorridos(self):
        return self.__kilometrosRecorridos

    def setKilometrosRecorridos(self, kilometrosRecorridos):
        self.__kilometrosRecorridos = kilometrosRecorridos

    def getKilometrosTotales(self):
        return self.kilometrosTotales

    def setKilometrosTotales(self, kilometrosTotales):
        Vehiculo.kilometrosTotales = kilometrosTotales

    def andar(self, km):
        self.__kilometrosRecorridos += km
        Vehiculo.kilometrosTotales += self.__kilometrosRecorridos