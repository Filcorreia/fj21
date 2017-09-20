package pt.com.altran.servlet;

class Quadrado implements AreaCalculavel {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	public double calculaArea() {
		return this.lado * this.lado;
	}

	@Override
	public double calculArea() {
		// TODO Auto-generated method stub
		return this.lado * this.lado;
		
	}
}
