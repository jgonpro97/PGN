<'''
Created on 14 ene. 2019

@author: jgonp
'''
class GatoSimple():
  
  def __init__(self, s):
    self.__sexo = s

  
  def setSexo(self, s):
    self.__sexo = s
    
  def getSexo(self):
    return self.__sexo
  
  def maullar(self): 
    print("Miauuuu")
    
  def ronronear(self):
    print("mrrrrrr")
    
  def comer(self, comida):
    if(comida == "pescado"):
      print("Hmmmm, gracias")
    else:
      print("Lo siento, yo solo como pescado")
      
  def peleaCon(self, contrincante):
    if(self.__sexo == "hembra"):
      print("no me gusta pelear")
    else:
      if(contrincante.getSexo() == "hembra"):
        print("no peleo contra gatitas")
      else:
        print("ven aqui que te vas a enterar")

		gardfiel = GatoSimple("macho")
print("hola gatito")
gardfiel.maullar()
print("toma tarta")
gardfiel.comer("tarta selva negra")
print("toma pescado, a ver si te gusta")
gardfiel.comer("pescado")

tom = GatoSimple("macho")

print("Tom, toma sopita de verduras")
tom.comer("sopa de verduras")

lisa = GatoSimple("hembra")

print("gatitos, haber como maullais")
gardfiel.maullar()
tom.maullar()
lisa.maullar()

gardfiel.peleaCon(lisa)
lisa.peleaCon(tom)
tom.peleaCon(gardfiel)