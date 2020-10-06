/*42.	Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width 
of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of 
tiles needed to cover the floor completely.*/


import java.util.*;
class Tile{
	public float edge_length;
	
	Tile(){}
	
	Tile(float edge_length){
		this.edge_length=edge_length;
	}
	
}
class Floor{
	private float length;
	private float width;
	public float total ;
	
	Floor(){}
	
	Floor(float length, float width){
		this.length=length;
		this.width=width;
	}
	
	void totalTiles(Tile t) {
		float floorArea=length*width;
		float tileArea=t.edge_length*t.edge_length;
		total = floorArea/tileArea;
	}
	void show(){
		System.out.println("Total no of tile : "+total);
	}
}

class Question42{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Tile edge length : ");
		float el = sc.nextFloat();
		System.out.println("Enter the Floor length and width : ");
		float len = sc.nextFloat();
		float wid = sc.nextFloat();
		Tile tl =new Tile(el);
		Floor f = new Floor(len , wid);
		f.totalTiles(tl);
		f.show();
		

	}
}