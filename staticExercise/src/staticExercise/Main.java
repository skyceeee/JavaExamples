package staticExercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Online Öðrenci : " + Student.howStudent());
		 Student s1= new Student("Ali",220,100);
		 Student s2= new Student("Ayþe",300,80);
		 Student s3= new Student("Mehmet",200,90);
		 System.out.println("Online Öðrenci : " + Student.howStudent());
		 s1.exit();
		 System.out.println("Online Öðrenci : " + Student.howStudent());
		 int []points=new int [3];
		 points[0]=s1.point;
		 points[1]=s2.point;
		 points[2]=s3.point;
		 System.out.println("Not ortalamasý : " + Student.calcOverAll(points));

	}

}
