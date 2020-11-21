package clonare;

public class Test {
	public static void main(String args[]) throws CloneNotSupportedException {
		Masina masina = new Masina("Audi","Rosu");
		
		Student student = new Student("Mircea Popescu",masina);
		
		Student deepCopy = (Student) student.cloneDeepCopy();
		Student shallowCopy = (Student) student.cloneShallowCopy();
		
		student.getMasina().vopseste("Albastru");
		
		System.out.println(deepCopy);
		System.out.println(shallowCopy);
	}
}
