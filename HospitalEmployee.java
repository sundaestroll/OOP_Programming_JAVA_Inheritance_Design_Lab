
 class HospitalEmployee{
	 
	protected String name;
	protected int number;
	HospitalEmployee(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
		}
    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String toString() {
        return name + " " + number;
    }
 
    public void work() {
        System.out.println(name + " works for the hospital.");
    }
		
	}

class Doctor extends HospitalEmployee {
	private String specialty;
	
    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public String toString() {
        return super.toString() + " " + specialty;
    }
    public void work() {
        System.out.println(name + " works for the hospital. " + name + " is a(n) " + specialty + " doctor.");
    }
}

class Nurse extends HospitalEmployee {

	private int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }
    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }
    public String toString() {
        return super.toString() + " has " + numOfPatients + " patients.";
    }
    public void work() {
        System.out.println(name + " works for the hospital. " + name + " is a nurse with " + numOfPatients + " patients.");
    }
}
	


	
