package exercises1;

public class TestStopWatch {

	public static void main(String[] args) {
		int size=100000;
		double []list=new double[size];
		
		StopWatch sw=new StopWatch();
		
		sw.start();
		
		for(int i=0;i<list.length;i++) {
			list[i]=Math.random()*list.length;
		}
		
		sw.stop();
		
		System.out.println(sw);
        

	}

}
