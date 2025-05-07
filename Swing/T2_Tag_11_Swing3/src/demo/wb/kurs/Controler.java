package demo.wb.kurs;

public class Controler {

	public void langsameMethode() {
		try {
			Thread.sleep(5*1000);
			System.out.println("Thread HELLO Thread is beendet");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
