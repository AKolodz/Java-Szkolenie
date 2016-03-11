
public class Pen implements Tool {
protected String material;
protected String color;
public Pen(){
	System.out.println("I'm pen!");
}
public Pen(String material, String color){
	this.material=material;
	this.color=color;
	System.out.println("My color is " + color + "I was made of " + material);
	
};
@Override
public void working(){
	System.out.println("I'm Writing");
};

public static void main(String args[]){
	Pen p=new Pen("Plastic","Black");
	Tool pen=new Pen();
	pen.working();
	Pen r=new Parker(1000);
	r.working();
}
}
