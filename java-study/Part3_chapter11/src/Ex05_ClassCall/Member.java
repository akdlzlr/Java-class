package Ex05_ClassCall;

public class Member implements Cloneable{
//	�ʵ�
//	�������� ����[�̸�, ����, �ּ�, ��ȭ��ȣ], �ĺ��� userId, ��й�ȣ : �ݵ�� ��ȣȭ�ؼ� �����ؾߴ�
	private String userId;
	private String name;
	private String password;
	private String age;
	private String address;

// 	������	
	public Member() {
		super();
	}

	public Member(String userId, String name, String password, String age, String address) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.age = age;
		this.address = address;
	}

//	�޼ҵ�
	public Member getMember() {
		Member m = null;
		try {
			m = (Member)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	
	@Override
	public boolean equals(Object obj) {
	if(obj instanceof Member) {
		Member member = (Member)obj;
		if(userId.equals(member.userId)) {
			return true;
			}
		}
	return false;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", name=" + name + ", password=" + password + ", age=" + age + ", address="
				+ address + "]";
	}
	
	public static class Builder{
		
		private String userId;
		private String name;
		private String password;
		private String age;
		private String address;
		
//		setter�� ����
		public Builder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}
		public Builder setAge(String age) {
			this.age = age;
			return this;
		}
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Member build() {
			return new Member(userId, name, password, age, address);
		}
	}
}