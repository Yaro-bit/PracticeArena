package step1;

public class OOPEquals {

	public static void main(String[] args) {
		System.out.println("New cars: ");
		Automobile tomsCar = new Automobile("Audi", "BLUE", 275);
		Automobile jimsCar = new Automobile("Audi", "BLUE", 275);
		System.out.print("Toms Car: " + tomsCar + "\nJims Car: " + jimsCar);
		System.out.print("\nToms Car == Jims Car: " + (tomsCar == jimsCar)); // refernzenvergleich
		System.out.print("\nToms Car equals Jims Car: " + (tomsCar.equals(jimsCar))); //objektvergleich
	}

}

class Automobile {
	String brand;
	String color;
	int horsePower;

	public Automobile(String brand, String color, int horsePower) {
		this.brand = brand;
		this.color = color;
		this.horsePower = horsePower;
	}

	public Automobile() {
		this("Unbekannt", "Unlackiert", -1);
	}

	@Override
	public String toString() {
		return "Automobile [brand= " + brand + ", color= " + color + ", horsePower= " + horsePower + "]";
	}

	@Override
	public boolean equals(final Object other) {
		if (other == null) { // null-Akzeptanz
			return false;
		}
		if (this == other) { // Reflexivität: Identitätsprüfung (sind beide Objekte dieselbe Referenz?)
			return true;
		}
		if (this.getClass() != other.getClass()) { // Typvergleich
			return false;
		}

		// Cast zu Automobile
		Automobile obj = (Automobile) other;

		// Vergleiche die Felder
		return java.util.Objects.equals(this.brand, obj.brand) && java.util.Objects.equals(this.color, obj.color)
				&& this.horsePower == obj.horsePower;
	}

}