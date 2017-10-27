package cm.test.model;

public class TestModel {
	private long id;
	private String name;
	private String surname;
	private String fathername

	@Override
	public String toString() {
		return "TestModel [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}

	public TestModel() {
		// TODO Auto-generated constructor stub
	}

	public TestModel(long id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
