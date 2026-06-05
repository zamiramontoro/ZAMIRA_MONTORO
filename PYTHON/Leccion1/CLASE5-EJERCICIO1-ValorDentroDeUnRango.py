#CLASE 5
#EJERCICIO 1: valor dentro de un rango
valor = int(input("Digite un número dentro del rango o al 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f'El valor {valor} esta dentro del rango')
else:
    print(f'El valor {valor} no esta dentro del rango')
