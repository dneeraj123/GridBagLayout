import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name;
	private String pass;
	
	public FormEvent(Object arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public FormEvent(Object arg0,String name,String pass) {
		super(arg0);
		this.name=name;
		this.pass=pass;
	}


	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
