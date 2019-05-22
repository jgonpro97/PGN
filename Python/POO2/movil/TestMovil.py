from movil.Movil import Movil

m1 = Movil("678 11 22 33", "rata")
m2 = Movil("644 74 44 69", "mono")
m3 = Movil("622 32 89 09", "bisonte")

print(m1)
print(m2)
m1.llamar(m2, 320)
m1.llamar(m3, 200)
m2.llamar(m3, 550)
print(m1)
print(m2)
print(m3)
