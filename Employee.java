package day13;

class Employee {
	private String EmpName;
	private int Eid;
	private float Esalary;
	private long Ephonenumber;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public float getEsalary() {
		return Esalary;
	}
	public void setEsalary(float esalary) {
		Esalary = esalary;
	}
	public long getEphonenumber() {
		return Ephonenumber;
	}
	public void setEphonenumber(long ephonenumber) {
		Ephonenumber = ephonenumber;
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", Eid=" + Eid + ", Esalary=" + Esalary + ", Ephonenumber="
				+ Ephonenumber + "]";
	}
	
		
		
		
}
