package Com.map;

import java.util.Objects;

public class Department {
	
	int did;
	String name;
	
	Department()
	{
		
	}
	

	public Department(int did, String name) {
		super();
		this.did = did;
		this.name = name;
	}
	


	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(did, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return did == other.did && Objects.equals(name, other.name);
	}

}
		
	


	


