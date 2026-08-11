# lista = Ariel, Zamira, Natalia, Osvaldo

nombres = ['Naty', 'Osvaldo', 'Zami', 'Ariel']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])

print(nombres[0:2]) #Solo muestra el indice 0, 1 pero no el indice 2
# Ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3]) # Indice a mostrar 0, 1, 2
# Desde el indice indicado hasta el final
print(nombres[1: ])
# Modificamos un valor
nombres[2] = 'Zamira'
nombres[0] = 'Natalia'
print(nombres)
# Iterar una lista
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Preguntamos cuántos elementos tiene una lista
print(len(nombres)) # le pasamos como parámetro la lista

# Agregamos un elemento
nombres.append('Marcelo')
print(nombres)

# Insertar un elemento en un índice específico
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

# Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)

# Eliminar el último elemento
nombres.pop()
print(nombres)

# Eliminar un índice específico
del nombres[2] # del significa delete (eliminar)
print(nombres)

# Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
print(nombres) # Aquí nos mostrará un error

# Verificamos como trabajar día a día en git





