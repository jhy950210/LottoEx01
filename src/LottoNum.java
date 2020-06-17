
public class LottoNum {
	private int number;


	public LottoNum(int number) {
		this.number = number;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LottoNum other = (LottoNum) obj;
		if (number != other.number)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "LottoNum [number=" + number + "]";
	}


	public int getNumber() {
		return number;
	}

	
}
