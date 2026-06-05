#Diseñar un programa que ingresando un año,nos devuelve
#por consola si es un año bisiesto o no,repetir la acción
#hasta que el usuario lo decida
# Solicitar el año al usuario
while True:
    anio = int(input("Ingrese un año (o 0 para salir): "))

    if anio == 0:
        print("Programa finalizado")
        break
    # Evaluar si el año es bisiesto

    if (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0):
        print(f"El año {anio} SI es bisiesto")
    else:
        print(f"El año {anio} NO es bisiesto")
