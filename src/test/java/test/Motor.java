package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	public void cambiarRegistro(int num) {
		registro = num;
	}
	
	public void asignarTipo (String motor) {
		if (motor == "electrico") {
			tipo = motor;
		} else if (motor == "gasolina") {
			tipo = motor;
		}
    }

}
