from random import randint


class Gato():
    def __init__(self, s):
        self.__sexo = s

    def apareaCon(self, gato):
        if self.__sexo == gato.__sexo:
            raise Exception("No se pueden aparear son del mismo sexo")

        lista = ["macho", "hembra"]
        s = lista[randint(0, 1)]

        return Gato(s)




