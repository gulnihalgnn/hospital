package default_package;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonnelManager extends BaseManager {
	BasePersonnel[] Personnels;
	private int size;
	private int capacity;

	public PersonnelManager() throws ParseException {
		size = 0;
		capacity = 1;
		Personnels = new BasePersonnel[1];
		initilazeThePersonnel();
	}

	public int getSize() {
		return size;
	}

	public void initilazeThePersonnel() throws ParseException {
		AddDoctorPersonnel("Enes", "Kaya", 15500, 20, "09/01/2014");
		AddDoctorPersonnel("Zeliha Nur", "Çabuk", 15500, 17, "09/01/2012");
		AddDoctorPersonnel("Gülnihal", "Gunen", 9000, 25, "09/02/2015");
		AddDoctorPersonnel("Irfan", "Yucesan", 10000, 32, "12/05/2016");
		AddDoctorPersonnel("Mehmet Mert", "Yavas", 10000, 18, "21/08/2013");
		AddDoctorPersonnel("Bedirhan", "Demirci", 10000, 16, "09/02/2015");
		AddNursePersonnel("Kadir", "Kurtulus", 5000, 12, "17/06/2017");
		AddNursePersonnel("Deniz", "Keser", 5000, 30, "29/01/2018");
		AddInternPersonnel("Sezai", "Karadag", 3500, 40, "05/02/2015");//
		AddInternPersonnel("Berkecan", "İğneci", 3000, 15, "07/12/2019");
		AddInternPersonnel("Sinem", "Yavas", 3000, 10, "07/12/2019");
		AddNursePersonnel("Yasin", "Barut", 4000, 12, "19/10/2021");
		AddNursePersonnel("Eren", "Kartal", 5500, 36, "13/07/2016");
		AddNursePersonnel("Sezin", "Kaya", 5000, 24, "17/06/2017");
		AddNursePersonnel("Kerem", "Pehlivan", 5200, 48, "29/03/2018");
		AddInternPersonnel("Onur", "Demir", 3500, 36, "13/02/2015");//
		AddInternPersonnel("Tarik", "Kivanc", 3000, 22, "30/12/2019");
		AddInternPersonnel("Murat Kadir", "Can", 3000, 8, "07/12/2019");
		AddNursePersonnel("Tarkan", "Kurtoğlu", 4000, 0, "19/10/2018");
		AddNursePersonnel("Emre", "Kuru", 5000, 10, "12/05/2016");
		AddNursePersonnel("Şevval", "Cakir", 5000, 24, "17/06/2017");
		AddNursePersonnel("Irem", "Avsar", 5000, 22, "29/01/2018");
		AddInternPersonnel("Zeynep", "Katranci", 3500, 18, "05/02/2015");//
		AddInternPersonnel("Stacy", "Yilmaz", 3000, 29, "07/09/2020");
		AddInternPersonnel("Adem", "Johnson", 3000, 30, "21/01/2022");
		AddNursePersonnel("Duygu", "Ayaz", 4000, 18, "19/10/2018");
		AddNursePersonnel("Barıs", "Pasazade", 5000, 2, "12/09/2019");
		AddNursePersonnel("Erdem", "Cevik", 5000, 26, "17/06/2017");
		AddNursePersonnel("Tolgahan", "Gazel", 5000, 22, "29/01/2020");
		AddInternPersonnel("Fatma", "Kuyt", 3500, 18, "05/02/2015");//
		AddInternPersonnel("Yaren", "Kılıç", 3000, 17, "07/12/2019");
		AddInternPersonnel("Ramazan", "Karaman", 3000, 35, "07/12/2021");
		AddNursePersonnel("Eril", "Mollaoğlu", 4000, 42, "19/10/2018");
	}

	public void AddInternPersonnel(String name, String surname, int salary) {
		Date dateNow = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		if (size == capacity) {
			ensureCapacity();
		}
		Personnels[size] = new InternPersonnel();
		Personnels[size].setName(name);
		Personnels[size].setSurname(surname);
		Personnels[size].setSalary(salary);
		Personnels[size].setPosition("Intern");
		Personnels[size].setPrimAmount(0);
		Personnels[size].setId(size + 1);
		Personnels[size].setStartDate(dateFormat.format(dateNow));
		size++;
	}

	// overloading for initializing Personnels
	public void AddInternPersonnel(String name, String surname, int salary, double prim, String startDate)
			throws ParseException {
		Date date;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		date = dateFormat.parse(startDate);
		if (size == capacity) {
			ensureCapacity();
		}
		Personnels[size] = new InternPersonnel();
		Personnels[size].setName(name);
		Personnels[size].setSurname(surname);
		Personnels[size].setSalary(salary);
		Personnels[size].setPosition("Intern");
		Personnels[size].setPrimAmount(prim);
		Personnels[size].setId(size + 1);
		Personnels[size].setStartDate(dateFormat.format(date));
		size++;
	}

	public void AddNursePersonnel(String name, String surname, int salary) {
		Date dateNow = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		if (size == capacity) {
			ensureCapacity();
		}
		Personnels[size] = new NursePersonnel();
		Personnels[size].setName(name);
		Personnels[size].setSurname(surname);
		Personnels[size].setSalary(salary);
		Personnels[size].setPosition("Nurse");
		Personnels[size].setPrimAmount(0);
		Personnels[size].setId(size + 1);
		Personnels[size].setStartDate(dateFormat.format(dateNow));
		size++;
	}

	public void AddNursePersonnel(String name, String surname, int salary, double prim, String startDate)
			throws ParseException {
		Date date;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		date = dateFormat.parse(startDate);
		if (size == capacity) {
			ensureCapacity();
		}
		Personnels[size] = new NursePersonnel();
		Personnels[size].setName(name);
		Personnels[size].setSurname(surname);
		Personnels[size].setSalary(salary);
		Personnels[size].setPosition("Nurse");
		Personnels[size].setPrimAmount(prim);
		Personnels[size].setId(size + 1);
		Personnels[size].setStartDate(dateFormat.format(date));
		size++;
	}

	public void AddDoctorPersonnel(String name, String surname, int salary) {
		Date dateNow = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		if (size == capacity) {
			ensureCapacity();
		}
		Personnels[size] = new DoctorPersonnel();
		Personnels[size].setName(name);
		Personnels[size].setSurname(surname);
		Personnels[size].setSalary(salary);
		Personnels[size].setPosition("Doctor");
		Personnels[size].setPrimAmount(0);
		Personnels[size].setId(size + 1);
		Personnels[size].setStartDate(dateFormat.format(dateNow));
		size++;
	}

	public void AddDoctorPersonnel(String name, String surname, int salary, double prim, String startDate)
			throws ParseException {
		Date date;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		date = dateFormat.parse(startDate);
		if (size == capacity) {
			ensureCapacity();
		}
		Personnels[size] = new DoctorPersonnel();
		Personnels[size].setName(name);
		Personnels[size].setSurname(surname);
		Personnels[size].setSalary(salary);
		Personnels[size].setPosition("Doctor");
		Personnels[size].setPrimAmount(prim);
		Personnels[size].setId(size + 1);
		Personnels[size].setStartDate(dateFormat.format(date));
		size++;
	}

	public BasePersonnel FindPersonnel(String name, String surname) {
		boolean isTrue = false;
		BasePersonnel temp = new BasePersonnel();
		for (BasePersonnel Personnel : Personnels) {
			if (Personnel.getName().matches(name) && Personnel.getSurname().matches(surname)) {
				temp = Personnel;
				isTrue = true;
			}
		}
		if (isTrue)
			return temp;
		else
			return null;
	}

	public void changePosition(BasePersonnel Personnel, String position) throws ParseException {
																								
		BasePersonnel temp;
		temp = Personnel;
		removeforChangePersonnel(Personnel.getName(), Personnel.getSurname());
		switch (position) {
		case "Doctor":
			AddDoctorPersonnel(temp.getName(), temp.getSurname(), temp.getSalary(), temp.getPrimAmount(),
					temp.getStartDate());
			FindPersonnel(temp.getName(), temp.getSurname()).setId(temp.getId());
			sortID();
			break;
		case "Nurse":
			AddNursePersonnel(temp.getName(), temp.getSurname(), temp.getSalary(), temp.getPrimAmount(),
					temp.getStartDate());
			FindPersonnel(temp.getName(), temp.getSurname()).setId(temp.getId());
			sortID();
			break;
		case "Intern":
			AddInternPersonnel(temp.getName(), temp.getSurname(), temp.getSalary(), temp.getPrimAmount(),
					temp.getStartDate());
			FindPersonnel(temp.getName(), temp.getSurname()).setId(temp.getId());
			sortID();
			break;
		default:
			System.out.println("Invalid Position,Back to Main Menu");
			break;
		}
	}

	private void removeforChangePersonnel(String name, String surname) {
		for (int index = 0; index <= Personnels.length - 1; index++) {
			if (Personnels[index].getName().matches(name) && Personnels[index].getSurname().matches(surname)) {
				for (int tempIndex = index; tempIndex <= Personnels.length - 1; tempIndex++) {
					if (tempIndex == Personnels.length - 1) {
						Personnels[tempIndex] = null;
						reduceCapacity();
						size--;
						break;
					} else
						Personnels[tempIndex] = Personnels[tempIndex + 1];
				}
			}
		}
	}

	@Override
	public void Remove(int id) {
		boolean removed = false;
		for (int index = 0; index < Personnels.length; index++) {
			if (Personnels[index].getId() == id) {
				for (int tempIndex = index; tempIndex <= Personnels.length - 1; tempIndex++) {
					if (tempIndex == Personnels.length - 1) {
						Personnels[tempIndex] = null;
						reduceCapacity();
						size--;
						break;
					} else
						Personnels[tempIndex] = Personnels[tempIndex + 1];
				}
				removed = true;
			}
		}
		if (removed)
			System.out.println(" REMOVED");
		else
			System.out.println(" didn't found");
	}

	public void showPersonnelPrim(String name, String surname) {
		boolean isTrue = false;
		double number;
		for (BasePersonnel Personnel : Personnels) {
			if (Personnel.getName().matches(name) && Personnel.getSurname().matches(surname)) {
				number = Personnel.primCalculator(Personnel.getPrimAmount());
				System.out.println(name + " " + surname + "'s mounthly prim is " + number);
				isTrue = true;
			}
		}
		if (!isTrue)
			System.out.println(name + " " + surname + " didn't found");

	}

	public void sortID() {
		BasePersonnel temp;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < Personnels.length - 1; i++) {
				if (Personnels[i].getId() > Personnels[i + 1].getId()) {
					temp = Personnels[i];
					Personnels[i] = Personnels[i + 1];
					Personnels[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}

	public void ShowAllPersonnel() {
		for (BasePersonnel Personnel : Personnels) {
			Personnel.getAllCard();
		}
	}

	public void SortofSalary(BasePersonnel[] tempPersonnels) {
		BasePersonnel temp;
		for (int i = 0; i < Personnels.length; i++)
			tempPersonnels[i] = Personnels[i];
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < tempPersonnels.length - 1; i++) {
				if (tempPersonnels[i].getSalary() < tempPersonnels[i + 1].getSalary()) {
					temp = tempPersonnels[i];
					tempPersonnels[i] = tempPersonnels[i + 1];
					tempPersonnels[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}

	@Override
	public void ensureCapacity() {
		BasePersonnel[] tempPersonnelManager = new BasePersonnel[capacity + 1];
		for (int i = 0; i < capacity; i++) {
			tempPersonnelManager[i] = Personnels[i];
		}
		Personnels = tempPersonnelManager;
		capacity = capacity + 1;
	}

	@Override
	public void reduceCapacity() {
		BasePersonnel[] tempPersonnelManager = new BasePersonnel[capacity - 1];
		for (int i = 0; i < capacity - 1; i++) {
			tempPersonnelManager[i] = Personnels[i];
		}
		Personnels = tempPersonnelManager;
		capacity--;
	}
}