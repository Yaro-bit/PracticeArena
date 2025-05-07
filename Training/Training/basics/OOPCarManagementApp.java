package basics;

public class OOPCarManagementApp {
    public static void main(String[] args) {
        
        AutoManagementApplication app = new AutoManagementApplication();
        
        System.out.println("Alle Renaults im Angebot: ");
        app.filterByBrand("Renault");
        
        System.out.println();
        
        int x = 160;
        System.out.println("Alle Autos mit PS größer als " + x + ":");
        app.filterByHorsePower(x);
    }
}

class AutoManagementApplication {
    Auto[] availableCars = new Auto[] { 
        new Auto("Renault", "Blau", 130), 
        new Auto("Renault", "Rot", 130),
        new Auto("Volkswagen", "Grau", 140), 
        new Auto("BMW", "Schwarz", 150), 
        new Auto("BMW", "Weiß", 150),
        new Auto("Audi", "Grau", 200), 
        new Auto("Audi", "Schwarz", 200)
    };

    AutoManagementApplication() {
    }

    void filterByBrand(String brand) {
        for (int i = 0; i < availableCars.length; i++) {
            Auto currentCar = availableCars[i];
            if (currentCar.brand.equals(brand)) {
                System.out.println(currentCar);
            }
        }
    }

    void filterByHorsePower(int minHorsePower) {
        for (int i = 0; i < availableCars.length; i++) {
            if (availableCars[i].horsePower > minHorsePower) {
                System.out.println(availableCars[i]);
            }
        }
    }

    class Auto {
        String brand;
        String color;
        int horsePower;

        public Auto() {
            this("Unbekannt", "Unlackiert", -1);
        }

        Auto(String brand, String color, int horsePower) {
            this.brand = brand;
            this.color = color;
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Car [brand=" + brand + ", color=" + color + ", horsePower=" + horsePower + "]";
        }

        public void paintWith(String newColor) {
            this.color = newColor;
        }

        public void applyTuningkit() {
            this.horsePower = horsePower + 100;
        }
    }
}
