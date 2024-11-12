abstract class shape {
abstract void numberofsides();
} class rectangle extends shape{
	int side;
	rectangle(int side){
		this.side=side;
	} void numberofsides() {
		System.out.println("the number of sides of reactangle is "+side);
	}
} class triangle extends shape{
	int side;
	triangle(int side){
		this.side=side;
	} void numberofsides() {
		System.out.println("The number of sides of trinagle is "+side);
	}
} class hexagon extends shape{
	int side;
	hexagon(int side){
		this.side=side;
	} void numberofsides() {
		System.out.println("The number of sides of hexagon is "+side);
	}
} public class Abstract{
	public static void main(String args []) {
		rectangle r=new rectangle(4);
		triangle t=new triangle(3);
		hexagon h=new hexagon(6);
		r.numberofsides();
		t.numberofsides();
		h.numberofsides();
	}
}
