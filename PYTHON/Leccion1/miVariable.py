'''
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print (id(x))
# las literales se escriben x528, la variable y = x272, la variable z= x592
print (id(y))
print (id(z))

#Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(type(x))
x = "Hola alumnos"
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))


#Manejo de Cadenas (String)
miGrupoFavorito = "The Letter Black"
características = "The Best Rock band"
print ("Mi grupo favorito es: ",miGrupoFavorito, características)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

#Tipos Booleanos (Bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

#Procesar la entrada del usuario
#función input
resultado = input("Digite un número: ") #Regresa un dato tipo string
print(resultado)

#Conversión de la entrada de datos
numero1 =int(input("Escribe el primer número: "))
numero2 =int(input("Escribe el segundo número: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ",resultado)
'''
"""
#CLASE4
OperandoA = 8
OperandoB = 5
Suma = OperandoA + OperandoB
#print("Resulatos de la suma: ",Suma)
print(f"El resultado de la suma es: {Suma}")

resta = OperandoA - OperandoB
print(f"El resultado de la resta es: {resta}")

multiplicacion = OperandoA * OperandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}")

division = OperandoA / OperandoB
print(f"El resultado de la division es: {division}")
dividendo = OperandoA // OperandoB
print(f"El resultado de la division (int) es: {division}")
modulo = OperandoA % OperandoB
print(f"El resultado de la modulo es: {modulo}")
exponente = OperandoA ** OperandoB
print(f"El resultado de la exponente es: {exponente}")


alto = int(input('Proporciona el alto del rectángulo: '))
ancho = int(input('Proporciona el ancho del rectángulo: '))
area = alto * ancho
perímetro = (alto + ancho) * 2
print('Área: ',area)
print('Perímetro: ',perímetro)
"""
"""
#CLASE 4
#Operadores de Resignación
miVariable3 = 10
print(miVariable3)

miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

#miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

#miVariable3 = miVariable*3
miVariable3 *= 3
print(miVariable3)

#miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

#CLASE 4
#Operadores de comparación
d = 4
b = 6
resultado = d == b #Comprobamos si son iguales
print(resultado)

#Operador diferente
resultado = d != b
print(resultado)

#Operador Mayor que
resultado = d > b
print(resultado)

#Operador Menor que
resultado = d < b
print(resultado)

#Operador Menor o Igual que
resultado = d <= b
print(resultado)

#Operador Mayor o Igual que
resultado = d >= b
print(resultado)
"""
"""
#CLASE 4_ EJERCICIO 1
a = int(input("Digite un numero: "))
print(f"El residuo de la dicision es: {a % 2 }")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un número PAR")
else:
    print(f"El valor de a es: {a} un número IMPAR")
"""
"""
#CLASE 4_ EJERCICIO 2
edadAdulto = 18
edadPersona = int(input("Digite su edad: "))

if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} años, usted es mayor de edad")
else:
    print(f"Su edad es: {edadPersona} años, usted es menor de edad")
"""

#CLASE 5
#OPERADORES LOGICOS
a= False
b= False
resultado = a and b
print(resultado)

#Operador or
resultado = a or b
print(resultado)

#Operador not
resultado = not a
print(resultado)














