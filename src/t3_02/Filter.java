package t3_02;

@Table("t_user")
public class Filter {

	@Column("t_id")
	private int id ;
	
	@Column("t_userName")
	private String userName ;
	
	@Column("t_number")
	private String number ;
 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Filter [id=" + id + ", userName=" + userName + ", number=" + number + "]";
	}
	
	
}
