package entities;

public class Employee {
	private Integer id;
	private Double salary;
	private String name;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	
	public void increaseSalary(double percentage) {
		salary += (percentage / 100 * salary);
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
