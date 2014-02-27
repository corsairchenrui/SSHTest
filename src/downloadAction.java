import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


public class downloadAction extends ActionSupport {
	private String generatedFile;
	public String getGeneratedFile() {
		return generatedFile;
	}
	public void setGeneratedFile(String generatedFile) {
		this.generatedFile = generatedFile;
	}
	public InputStream getDownloadFile() {
		InputStream ret = ServletActionContext.getServletContext().getResourceAsStream(getGeneratedFile());
		return ret;
	}
	public String execute(){
		return SUCCESS;
	}
}
