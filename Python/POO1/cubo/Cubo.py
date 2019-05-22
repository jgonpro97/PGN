'''
Created on 14 ene. 2019

@author: jgonp
'''
class Cubo():

  def __init__(self, cap, cont):
    self.__capacidad = cap
    self.__contenido = cont

  def getCapacidad(self):
    return self.__capacidad

  def getContenido(self):
    return self.__contenido

  def setContenido(self, litros):
    self.__contenido = litros

  def vaciar(self):
    self.__contenido = 0
    
  def llenar(self):
    self.__contenido = self.__capacidad
  
  def pintar(self):
    for nivel in range(self.__capacidad,0,  -1):
      if self.__contenido >= self.__capacidad:
        print("#****#")
      else:
        print("#    #")
    print("######")
      
    
      
    
  def volcarEn(self, destino): 
    libres = destino.getCapacidad() - destino.getContenido()
    
    if(libres > 0):
      if(self.__contenido <= libres):
        destino.setContenido(destino.getContenido() + self.__contenido)
        self.vaciar()
      else:
        self.__contenido -= libres
        destino.llenar()
        

cubito = Cubo(2,0)
cubote = Cubo(7,0)

print("Cubito: ")
cubito.pintar()

print("Cubote:")
cubote.pintar()

print("Lleno el cubito: ")
cubito.llenar()
cubito.pintar()

print("El cubote sigue vacio")
cubote.pintar()

print("Ahora vuelco lo que tiene el cubito en el cubote.")
cubito.volcarEn(cubote)

print("Cubito: ")
cubito.pintar()

print("Cubote: ")
cubote.pintar()

print("Ahora vuelco lo que tiene en el cubito")
cubote.volcarEn(cubito)