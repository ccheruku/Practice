public final class EmployeeImmutable {
	private final int id;
	private final Address address;

	private EmployeeImmutable(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		Address add = new Address();
		add.setStreet(address.getStreet());
		return add;
	}

	public static EmployeeImmutable getInstance() {
		Address add = new Address();
		add.setStreet("Sherman Ave");
		EmployeeImmutable emp = new EmployeeImmutable(120, add);

		return emp;

	}
	
	public static void main(String[] args) {
		EmployeeImmutable ei = EmployeeImmutable.getInstance();
		System.out.println(ei.getAddress().street);
		System.out.println(ei.getId());
		System.out.println(ei.getId());
		
	}
}
