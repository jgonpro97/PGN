from vehiculo.Vehiculo import Vehiculo


class Coche(Vehiculo):

    def __init__(self, motor):
        super().__init__()
        self.__motor = motor

    def getMotor(self):
        return self.__motor

    def setMotor(self, motor):
        self.__motor = motor

    def quemarRueda(self):
        print("\nEstoy quemando rueda\n")