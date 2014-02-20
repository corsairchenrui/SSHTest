import com.opensymphony.xwork2.ActionSupport;


public class loginAction extends ActionSupport {
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute(){
		if(getName().equals("cr"))
			return SUCCESS;
		else
			return ERROR;
	}
}
