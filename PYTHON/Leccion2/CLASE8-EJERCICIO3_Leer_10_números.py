#Leer 10 números e imprimir cuantos son positivos,
#cuántos negativos y cuántos neutros.
positivos = 0
negativos = 0
neutros = 0

print("Ingresar 10 números:")

for i in range(10):
    numero = float(input(f"Número {i + 1}: "))

    if numero > 0:
        positivos += 1
    elif numero < 0:
        negativos += 1
    else:
        neutros += 1

print("\n--- Resultados ---")
print(f"Positivos: {positivos}")
print(f"Negativos: {negativos}")
print(f"Neutros (ceros): {neutros}")
