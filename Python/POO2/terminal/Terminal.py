class Terminal():

  def __init__(self, telefono):
    self.__telefono = telefono
    self.__duracion = 0

  def setTelefono(self, telefono):
    self.__telefono = telefono

  def getTelefono(self):
    return self.__telefono

  def setDuracion(self, duracion):
    self.__duracion = duracion

  def getDuracion(self):
    return self.__duracion

  def llamar (self, t, s):
    self.__duracion += s
    t.__duracion += s

  def __str__(self):
    return "Nº " + str(self.getTelefono()) + " - " + str(self.getDuracion()) + "s de conversación"