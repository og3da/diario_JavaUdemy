package entitites;

public class Aluguel {
	private String name;
	private String email;
	private int room;
	
	public Aluguel(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	
	public String retorno() {
		return room + ": " + name + ", " + email;
	}

}
