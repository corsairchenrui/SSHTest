import java.io.File;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


public class uploadAction extends ActionSupport {
	private String title;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String allowTypes;
	private String savePath;
	public void setSavePath(String value) {
		this.savePath = value;
	}
	private String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}

	

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getUploadContentType() {
		return uploadContentType;
	}


	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}


	public String getUploadFileName() {
		return uploadFileName;
	}


	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}


	public String getAllowTypes() {
		return allowTypes;
	}


	public void setAllowTypes(String allowTypes) {
		this.allowTypes = allowTypes;
	}


	public File getUpload() {
		return upload;
	}


	public void setUpload(File upload) {
		this.upload = upload;
	}


	public String execute(){
		try {
			getUpload().renameTo(new File(getSavePath(),getUploadFileName()));
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
}
