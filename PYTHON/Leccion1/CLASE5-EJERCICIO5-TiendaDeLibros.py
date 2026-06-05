#CLASE 5
#EJERCICIO 5: Tienda de Libros
print('Digite los siguientes datos del libro')
nombre = input('Digite el nombre del libro: ')
id = input('Digite el id del libro: ')
precio = float(input('Digite el precio del libro: '))
envioGratuito = input('Indicar si el libro es gratuito (True/False): ')
if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == False:
    envioGratuito = False
else:
    envioGratuito = 'El valor es incorrecto, debe escribir True/False '
    print(f'''
            Nombre: {nombre}
            Id: {id}
            precio: {precio}
            envioGratuito?: {envioGratuito}
''')