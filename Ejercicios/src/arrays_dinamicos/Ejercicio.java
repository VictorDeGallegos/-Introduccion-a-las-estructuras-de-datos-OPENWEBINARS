package Ejercicios.src.arrays_dinamicos;

// Variables

// Enteras: E, Dato, Cantidad, Valor()

// 1. Inicio

// 2. Mientras E <> 4 Hacer

// 2.1 Si E = 1 Entonces

// Llamar Genera

// FinSi

// 2.2 Si E = 2 y Dato <> 0 Entonces

// Llamar CalculaSuma(Cantidad) PorValor

// FinSi

// 2.3 Si E = 3 y Dato <> 0 Entonces

// Llamar CalculaMult(Cantidad) PorValor

// FinSi

// 2.4 Mostrar “Elija opción: 1. Introducir dato

// 2. Calcular 1 + 3 + 5 + ··· + n

// 3. Calcular 1 * 3 * 5 * ··· * n

// 4. Salir”

// 2.5 Pedir E

// Repetir

// 3. Fin

// Módulo Genera

// Variables

// Enteras: Impar, i

// Booleanas: Par

// 1. Dato = 0

// 2. Mientras Dato <= 0 ó Dato > 19 ó Par = Verdadero Hacer

// Par = Falso

// Mostrar “Introduzca un número impar entre 1 y 19”

// Pedir Dato

// Si Dato mod 2 = 0 Entonces

// Par = Verdadero : Mostrar “El número debe ser impar”

// FinSi

// Repetir

// 3. Impar = - 1 : i = 0

// 4. Hacer

// i = i + 1

// Impar = Impar + 2

// Redimensionar Valor(i)

// Valor(i) = Impar

// Repetir Mientras Impar < Dato

// 5. Cantidad = i

// FinMódulo

// Módulo CalculaSuma(Numero: Enteros)

// Variables

// Enteras: i, Suma

// 1. Suma = 0

// 2. Desde i = 1 hasta Numero Hacer

// Suma = Suma + Valor(i)

// Siguiente

// 3. Mostrar “La suma 1 + 3 + 5 + ··· + n vale”, Suma

// FinMódulo

// Módulo CalculaMult(Cifra: Enteros)

// Variables

// Enteras: i, Acumulado

// 1. Acumulado = 1

// 2. Desde i = 1 hasta Cifra Hacer

// Acumulado = Acumulado * Valor(i)

// Siguiente

// 3. Mostrar “El producto 1 * 3 * 5 * ··· * n vale”, Acumulado

// FinMódulo
