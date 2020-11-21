package clonare;

public class Student implements Cloneable{
	private String nume;
	private Masina masina;
	public Student(String nume,Masina masina) {
		this.nume = nume;
		this.masina = masina;
	}
	public Object cloneShallowCopy() throws CloneNotSupportedException {
		return super.clone();
	}
	public Object cloneDeepCopy() throws CloneNotSupportedException{
		Student student = (Student) super.clone();
		student.masina = (Masina) student.masina.clone();
		return student;
	}
	@Override
	public String toString() {
		return "Student [nume=" + nume + ", masina=" + masina + "]";
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public Masina getMasina() {
		return masina;
	}
	public void setMasina(Masina masina) {
		this.masina = masina;
	}
	
}
