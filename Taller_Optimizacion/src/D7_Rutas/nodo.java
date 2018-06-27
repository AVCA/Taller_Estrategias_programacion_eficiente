package D7_Rutas;

public class nodo {
	
	double x, y,valor;
	String etiqueta;

	public nodo(double x1,double y1,double v, String eti) {
		this.x = x1;
		this.y = y1;
		this.valor=v;
		this.etiqueta=eti;
	}

	@Override
	public String toString() {
		return "nodo [x=" + x + ", y=" + y + ", valor=" + valor + ", etiqueta=" + etiqueta + "]";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	

}
