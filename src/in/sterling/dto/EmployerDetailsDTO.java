package in.sterling.dto;
public class EmployerDetailsDTO {
	private String empr_id=null;
	private String empr_email=null;
	private String empr_mobile=null;
    private String emp_password=null;
    private String empr_name=null;
    private String empr_image=null;
	public String getEmpr_id() {
		return empr_id;
	}
	public void setEmpr_id(String empr_id) {
		this.empr_id = empr_id;
	}
	public String getEmpr_email() {
		return empr_email;
	}
	public void setEmpr_email(String empr_email) {
		this.empr_email = empr_email;
	}
	public String getEmpr_mobile() {
		return empr_mobile;
	}
	public void setEmpr_mobile(String empr_mobile) {
		this.empr_mobile = empr_mobile;
	}
	public String getEmp_password() {
		return emp_password;
	}
	public void setEmp_password(String emp_password) {
		this.emp_password = emp_password;
	}
	public void setEmpr_name(String empr_name)
	{
		this.empr_name=empr_name;
	}
	public String getEmpr_name()
	{
		return empr_name;
	}
	public void setEmpr_image(String enpr_image)
	{
		this.empr_image=empr_image;
	}
	public String getEmpr_image()
	{
		return empr_image;
	}
}
