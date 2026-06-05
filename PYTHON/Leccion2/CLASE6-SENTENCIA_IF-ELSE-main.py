'''
#En esta clase veremos la sentencia if-else
condicion = 10
if condicion == True:
    print('Condición verdadera')
elif condicion == False:
    print('Condición falsa')
else:
    print('Condición sin especificar')
'''

#Conversion de número a texto
num = int(input("Digite un número en el rango del 1 al 3: "))
numTexto = ''
if num == 1:
    numTexto = "Numero uno"
elif num == 2:
    numTexto = "Numero dos"
elif num == 3:
    numTexto = "Numero tres"
else:
    numTexto = "Has ingresado un numero fuera de rango"
print(f"El numero ingresado es {num} - {numTexto}")
