from tiempo.Tiempo import Tiempo

t = Tiempo(1, 20, 30)
t2 = Tiempo(0, 30, 40)
t3 = Tiempo(0, 35, 20)

print("Suma: ", t2, " + ", t3, " : ", t2.sumar(t3))
print("Resta: ", t, " - ", t2, " : ", t.restar(t2))