package application;

public class Students {
	private int idStudents;
	private String	Name;
	private String	LastName;
	private String Email;
	private int	Year;
	private String  Program;
	public Students(int idStudents, String name, String lastName,String email, int year, String program) {
		super();
		this.idStudents = idStudents;
		Name = name;
		LastName = lastName;
		Email = email;
		Year = year;
		Program = program;
	}
	public int getIdStudents() {
		return idStudents;
	}
	public void setIdStudents(int idStudents) {
		this.idStudents = idStudents;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setBirth(String email) {
		Email = email;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getProgram() {
		return Program;
	}
	public void setProgram(String program) {
		Program = program;
	}
	

		
		

}
