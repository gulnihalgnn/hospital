package default_package;


public class PatientManager extends BaseManager {
	Patient[] patients;
	private int size;
	private int capacity;

	PatientManager() {
		size = 0;
		capacity = 1;
		patients = new Patient[1];
		initialize();
	}

	public int getSize() {
		return size;
	}

	private void initialize() {
		AddPatient("Zulfikar Kadioglu", 500, 80);
		AddPatient("Musa Kesici", 250, 250);
		AddPatient("Nilay Yabanci", 100, 200);
		AddPatient("Kerim Bilgili", 300, 100);
		AddPatient("Demir Parlayan", 150, 100);
		AddPatient("Isa Demir", 50, 100);
		AddPatient("Nehir Keskin", 50, 1000);
		AddPatient("Selcuk Can", 75, 750);
		AddPatient("Emre Mutlu", 120, 7500);
		AddPatient("Hayriye Gulseven", 120, 7500);
		AddPatient("Mehmet Kara", 1200, 10);
		AddPatient("Mihrimah Ran", 100, 25);
		AddPatient("Emir Kulcu", 100, 7500);
		AddPatient("Giray Kansız", 45, 150);
		AddPatient("Yaren Yarsız", 120, 1500);
	}

	public void AddPatient(String name, int stockAmount, int prize) {
		if (size == capacity)
			ensureCapacity();
		patients[size] = new Patient();
		patients[size].setNamePatient(name);
		patients[size].setIdPatient(size + 1);
		patients[size].setCodePatient();
		patients[size].setStockAmount(stockAmount);
		patients[size].setPrize(prize);
		size++;
	}

	public void AddPatient(String name, int prize) {
		if (size == capacity)
			ensureCapacity();
		patients[size] = new Patient();
		patients[size].setNamePatient(name);
		patients[size].setIdPatient(size + 1);
		patients[size].setCodePatient();
		patients[size].setPrize(prize);
		size++;
	}

	@Override
	public void Remove(int id) {
		boolean removed = false;
		for (int index = 0; index < patients.length; index++) {
			if (patients[index].getIdPatient() == id) {
				for (int tempIndex = index; tempIndex <= patients.length - 1; tempIndex++) {
					if (tempIndex == patients.length - 1) {
						patients[tempIndex] = null;
						reduceCapacity();
						size--;
						break;
					} else
						patients[tempIndex] = patients[tempIndex + 1];
				}
				removed = true;
			}
		}
	}

	@Override
	void ensureCapacity() {
		Patient[] tempPatient = new Patient[capacity + 1];

		for (int i = 0; i < capacity; i++) {
			tempPatient[i] = patients[i];
		}
		patients = tempPatient;
		capacity = capacity + 1;
	}

	@Override
	void reduceCapacity() {
		Patient[] tempProduct = new Patient[capacity - 1];

		for (int i = 0; i < capacity - 1; i++) {
			tempProduct[i] = patients[i];
		}
		patients = tempProduct;
		capacity = capacity - 1;
	}

}