package calculadordefactoriales;
import java.math.BigInteger;
import java.io.*;

public class CalculadorDeFactoriales {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;	// variables objetos in y out para
	static BigInteger cuentaInstancia = BigInteger.valueOf(0);

	public static void main(String[] args) throws java.io.IOException{
		out.println("Deme el numero que desea calcular el factorial");
		int numFactorizar = Integer.parseInt(in.readLine());
		BigInteger numeroFactorizado = factorizarNumero(numFactorizar);
		out.println("El resultado de factorizar " + numFactorizar + " es: " + numeroFactorizado + "\nHubieron " + cuentaInstancia + " instancias");
		
	}

	public static BigInteger factorizarNumero(int n){
		BigInteger resultado = new BigInteger("0");
		if(n == 1){
			resultado = BigInteger.ONE;
		}else{
			cuentaInstancia = cuentaInstancia.add(BigInteger.ONE);
                        BigInteger pn = BigInteger.valueOf(n);
			resultado = pn.multiply(factorizarNumero(n - 1));
		}
		
		return resultado;

	}
    
}
