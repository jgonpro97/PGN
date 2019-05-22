class Fraccion():

    def __init__(self, num, den):
        self.__numerador = num
        self.__denominador = den

    def getNumerador (self):
        return self.__numerador

    def setNumerador (self, num):
        self.__numerador = num

    def getDenominador (self):
        return self.__denominador

    def setDenominador (self, den):
        self.__denominador = den

    def modificar (self, n, d):
        return Fraccion(n,d)

    def calcularResultado (self):
        return self.__numerador/self.__denominador

    def multiplicarPorNumero (self, num):
        return Fraccion(self.__numerador * num , self.__denominador)

    def multiplicarFracciones (self, fraccion2):
        return Fraccion(self.__numerador * fraccion2.getNumerador() , self.__denominador * fraccion2.getDenominador())

    def sumarFracciones (self, fraccion2):
        return Fraccion(self.__numerador * fraccion2.getDenominador() + self.__denominador * fraccion2.getNumerador(), self.__denominador * fraccion2.getDenominador())

    def restarFracciones (self, fraccion2) :
        return Fraccion(self.__numerador * fraccion2.getDenominador() - self.__denominador * fraccion2.getNumerador(), self.__denominador * fraccion2.getDenominador())

    def hallarMcd(self):
        dividendo = self.__numerador
        divisor = self.__denominador

        while dividendo % divisor != 0:
            resto = dividendo % divisor
            dividendo = divisor
            divisor = resto
        return int(divisor)

    def simplificarFraccion (self):
        mcd = fraccion.hallarMcd()
        self.__numerador /= mcd
        self.__denominador /= mcd

        return Fraccion(int(self.__numerador), int(self.__denominador))

    def __str__(self):
       return str(self.__numerador) + "/" + str(self.__denominador)

fraccion = Fraccion(2, 3)
fraccion2 = Fraccion(1, 5)

print("Fraccion:",fraccion)
print("La fraccion modificada es:",fraccion.modificar(1,2))
print("El resultado es: ", fraccion.calcularResultado())
print(fraccion,"* 2 =",fraccion.multiplicarPorNumero(2))
print(fraccion,"*" ,fraccion2, " =", fraccion.multiplicarFracciones(fraccion2))
print(fraccion,"+" ,fraccion2, " =", fraccion.sumarFracciones(fraccion2))
print(fraccion,"-" ,fraccion2, " =", fraccion.restarFracciones(fraccion2))
print("Fraccion simplificada",fraccion.simplificarFraccion())


