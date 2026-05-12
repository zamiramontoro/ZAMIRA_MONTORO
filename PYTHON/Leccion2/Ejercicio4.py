#EJERCICIO 4: Área y longitud de un círculo
# Hacer un programa para ingresar el radio de un circulo y se
#reporte su área y la longitud de su circunsferencia
#Area = Pi * r2
#Longitud = 2 * Pi * r
#En este módulo vamosa necesitar importar el módulo math porque tiene el valor de Pi
#Se escribe import math
r = float(input('Digite el valor del radio del circulo: '))
import math
area = math.pi * (r ** 2)
longitud = 2 * math.pi * r
print(f'El valor del area es {area}')
print(f'El valor del longitud es {longitud}')


