
public class Triangulo extends Poligono{
	
	private double l1;
	private double l2;
	private double l3;
	public Triangulo( double l1, double l2, double l3) {
		super(3);
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	
	public double getL1() {
		return l1;
	}

	public double getL2() {
		return l2;
	}

	public double getL3() {
		return l3;
	}

	@Override
	public String toString() {
		return "Triangulo: \n"+super.toString() +"[lado 1: =" + l1 + ", lado 2: =" + l2 + ", lado 3: =" + l3 + "]";
	}

	@Override
	public double area() {
		double p = (l1+l2+l3)/2;
		return Math.sqrt((p*(p-l1)*(p-l2)*(p-l3)));
	}
	
}
