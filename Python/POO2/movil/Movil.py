from movil.Terminal import Terminal


class Movil(Terminal):

  def __init__(self, telefono, tarifa):
    super().__init__(telefono)
    self.__tarifa = tarifa
    self.__tarificado = 0

  def setTarifa(self, tarifa):
    self.__tarifa = tarifa

  def getTarifa(self):
    return self.__tarifa

  def setTarificado(self, tarificado):
    self.__tarificado = tarificado

  def getTarificado(self):
    return self.__tarificado

  def llamar(self, t, s):
    super().llamar(t,s)
    min = s / 60

    if self.__tarifa == "rata":
      self.__tarificado += min * 0.06

    if self.__tarifa == "mono":
      self.__tarificado += min * 0.12

    if self.__tarifa == "bisonte":
      self.__tarificado += min * 0.30

  def __str__(self):
    return super().__str__() +  " - tarificados " + str("%.2f" % self.getTarificado()) + " euros"
