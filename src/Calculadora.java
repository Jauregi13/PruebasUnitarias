
public class Calculadora {
	
	private int lado;
	private String figura;
	
	

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public static int CalcularArea(int lado, String figura){
		int area = 0;
		if(figura == "Cuadrado"){
			area = lado * lado;
		}
		return area;
	}
	
	public static boolean esPar(int numero){
		if(numero % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
