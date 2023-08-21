package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	public void cambiarColor (String color) {
		switch(color)
		{
		case "rojo": color = "rojo";
		        break;
		case "verde": color = "verde";
		        break;
		case "amarillo": color = "amarillo";
		        break;
		case "negro": color = "negro";
		        break;
		case "blanco": color = "blanco";
		        break;
		}
	}


}
