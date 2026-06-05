#EJERCICIO 2:
condicion = True
#if condicion:
#    print('Condicion Verdadera')
#else:
#    print('Condicion Falsa')

#print('Condicion Verdadera') if condicion else print('Condicion Falsa')
#EJERCICIO 2: Determinar la solución l+ogica de la siguiente operación
#((3 + 5 * 8 )< 3 and ((-6/3 * 4) + 2 < 2)) or (a>b)
a = int(input('Digite el valor de a: '))
b = int(input('Digite el valor de b: '))
resultado = (3 + 5 * 8) < 3 and ((-6/3 * 4)+ 2 < 2) or (a>b)
print(f'El resultado es: {resultado}')
