'''
Created on 14 ene. 2019

@author: jgonp
'''
class Cuadrado():
  
  def __init__(self, l):
    self.__lado = l
    
  def toString(self):
    resultado = ""
    
    for i in range(self.__lado):
      resultado += "**"
    
    resultado += "\n"
    
    for i in range(1,self.__lado - 1): 
      resultado += "**"
      for espacios in range(1,self.__lado - 1):
        resultado += "  "
      resultado += "**\n"
    for i in range(self.__lado):
      resultado += "**"
    resultado += "\n"
    
    return resultado
 

miCuadradito = Cuadrado(5)
print(miCuadradito.toString()) 
