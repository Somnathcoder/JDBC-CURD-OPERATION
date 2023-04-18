package Com.Student;

public class ss {

	public ss() {
		super();

	}

	public ss(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ss [id=" + id + ", name=" + name + "]";
	}

}
