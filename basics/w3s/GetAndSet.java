package w3s;

public class GetAndSet {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public static void main(String[] args) {
		GetAndSet newPers = new GetAndSet();
		newPers.setName("Yaro");
		System.out.println(newPers.getName());
	}
}
