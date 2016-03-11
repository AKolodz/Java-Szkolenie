import java.util.Random;

public class Doktor {
	String name;
	public Doktor(){};
	public Doktor(String name){
		this.name=name;
	}
	public static void main(String args[]){
		Doktor doctor=new Doktor("Czarek");
		
		
		//Jakieœ pierdo³y
		Random rand=new Random();
		float f[]=new float[10];
		for (int i=0;i<10;i++)
			f[i]=rand.nextFloat();
		for(float x:f)
			System.out.println(x);
	}
}

