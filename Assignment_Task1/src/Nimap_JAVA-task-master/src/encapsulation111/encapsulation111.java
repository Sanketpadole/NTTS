package encapsulation111;

public class encapsulation111 {
	private String name;
	private String sirname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSirname() {
		return sirname;
	}

	public void setSirname(String sirname) {
		this.sirname = sirname;
	}

	public static void main(String[] args) {
		encapsulation111 enc = new encapsulation111();
		enc.setName("Sanket");
		enc.setSirname("Padole");
		System.out.println(enc.getSirname());
	}

}
