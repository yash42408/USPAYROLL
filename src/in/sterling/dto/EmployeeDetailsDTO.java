package in.sterling.dto;

public class EmployeeDetailsDTO {
	private String emp_name=null;
	private String emp_id=null;
	private String emp_email=null;
	private String emp_mob=null;
	private String emp_add=null;
	private String emp_designation=null;
	private String emp_salary=null;
	public String getEmp_designation(){
		return emp_designation;
	}
	public void setEmp_designation(String emp_designation)
	{
		this.emp_designation=emp_designation;
	}
	public void setEmp_salary(String emp_salary)
	{
		this.emp_salary=emp_salary;
	}
	public String getEmp_salary()
	{
		return emp_salary;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_mob() {
		return emp_mob;
	}
	public void setEmp_mob(String emp_mob) {
		this.emp_mob = emp_mob;
	}
	public String getEmp_add() {
		return emp_add;
	}
	public void setEmp_add(String emp_add) {
		this.emp_add = emp_add;
	}
	
	 
}
 