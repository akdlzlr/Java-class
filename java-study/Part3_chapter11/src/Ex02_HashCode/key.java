package Ex02_HashCode;

public class key {
	public int number;
	
	public key(int number) {
		this.number=number;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof key) {
			key compareKey = (key)obj;
			if(this.number==compareKey.number) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + number;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		key other = (key) obj;
//		if (number != other.number)
//			return false;
//		return true;
//	}
}