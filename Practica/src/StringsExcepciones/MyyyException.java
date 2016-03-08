package StringsExcepciones;

public class MyyyException {
	static int calcular(String str1, String str2) throws ExcepcionIntervalo,
			NumberFormatException, ArithmeticException {
		int num = Integer.parseInt(str1);
		int den = Integer.parseInt(str2);
		if ((num > 100) || (den < -5)) {
			throw new ExcepcionIntervalo("N�meros fuera del intervalo");
		}
		return (num / den);
	}

	public static void main(String[] args) {
		String str1 = "120";
		String str2 = "2";
		String respuesta;
		int numerador, denominador, cociente;
		try {
			cociente = calcular(str1, str2);
			respuesta = String.valueOf(cociente);
		} catch (NumberFormatException ex) {
			respuesta = "Se han introducido caracteres no num�ricos";
		} catch (ArithmeticException ex) {
			respuesta = "Divisi�n entre cero";
		} catch (ExcepcionIntervalo ex) {
			respuesta = ex.toString();
		}
		System.out.println(respuesta);
	}
}
