Algoritmo triangulo_clasificacion
	Definir lado1 Como Real
	Definir lado2 Como Real
	Definir lado3 Como Real
	Escribir ('Escriba la longitud del primero lado')
	Leer lado1
	Escribir ('Escriba la longitud del segundo lado')
	Leer lado2
	Escribir ('Escriba la longitud del último lado')
	Leer lado3
	Si (lado1+lado2>=lado3 Y lado1+lado3>=lado2 Y lado2+lado3>=lado1) Entonces
		Escribir ('Sí es posible elaborar un triángulo con esos valores')
		Si (lado1==lado2 Y lado2==lado3) Entonces
			Escribir ('El triángulo elaborado sería equilátero')
		SiNo
			Si (lado1==lado2 O lado1==lado3 O lado2==lado3) Entonces
				Escribir ('El triángulo elaborado sería isósceles')
			SiNo
				Escribir ('El triángulo elaborado sería escaleno')
			FinSi
		FinSi
	SiNo
		Escribir ('No es posible elaborar un triángulo con esos valores')
	FinSi
FinAlgoritmo
