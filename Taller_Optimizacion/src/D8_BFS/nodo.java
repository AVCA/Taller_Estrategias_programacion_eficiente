package D8_BFS;

public class nodo {
	
	double x, y;

	public nodo(double x1,double y1) {
		this.x = x1;
		this.y = y1;
	}

	@Override
	public String toString() {
		return "\n[x=" + x + ", y=" + y + "]";
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

}
