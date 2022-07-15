package default_package;


public class Patient {
	private String namePatient;
	private int idPatient;
	private String codePatient;
	private int stockAmount;
	private int carePrize;

	public int getPrize() {
		return carePrize;
	}

	public void setPrize(int prize) {
		this.carePrize = prize;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public String getCodePatient() {
		return codePatient;
	}

	public void setCodePatient() {
		String temp = namePatient.substring(0, 2);
		String temp2 = Integer.toString(idPatient);
		this.codePatient = temp + temp2;
	}

	public String getNamePatient() {
		return namePatient;
	}

	public void setNamePatient(String namePatient) {
		this.namePatient = namePatient;
	}
}