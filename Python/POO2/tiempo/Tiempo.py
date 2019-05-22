class Tiempo():

  def __init__(self, h, m, s):
    self.__horas = h
    self.__minutos = m
    self.__segundos = s

  def getHoras(self):
    return self.__horas


  def setHoras(self, h):
    if h < 0:
      print("El numero no puede ser menor de 0")


    self.__horas = h

  def getMinutos(self):
    return self.__minutos

  def setMinutos(self, m):
    self.__minutos = m

  def getSegundos(self):
    return self.__segundos

  def setSegundos(self, s):
    self.__segundos = s

  def sumar (self, t2):
    suma = Tiempo(self.getHoras() + t2.getHoras(), self.getMinutos() + t2.getMinutos(), self.getSegundos() + t2.getSegundos())
    suma.pasarASegundos()
    suma.pasarTiempo()
    return suma

  def restar (self, t2):
    resta = Tiempo(self.getHoras() - t2.getHoras(), self.getMinutos() - t2.getMinutos(), self.getSegundos() - t2.getSegundos())
    resta.pasarASegundos()
    resta.pasarTiempo()
    return resta

  def pasarASegundos(self):
    self.__horas *= 3600
    self.__minutos *= 60
    self.__segundos = self.__horas + self.__minutos + self.__segundos

    return self.__segundos;

  def pasarTiempo(self):
    self.__horas = int(self.__segundos / 3600)
    self.__minutos = int((self.__segundos - (self.__horas * 3600)) / 60)
    self.__segundos = self.__segundos - ((self.__horas * 3600) + (self.__minutos * 60))

    return Tiempo(self.__horas / 3600, self.__minutos, self.__segundos)

  def __str__(self):
    return str(self.__horas) + "h " + str(self.__minutos) + "m " + str(self.__segundos) + "s";


