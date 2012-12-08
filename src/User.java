import java.io.Serializable;

public class User implements Serializable {

 
	/**
	 * 
	 */
	private static final long serialVersionUID = -6768869063601481932L;
	
	private String name;
	private Custom ct;
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public Custom getCt() {
		return ct;
	}

	public void setCt(Custom ct) {
		this.ct = ct;
	}
 
}