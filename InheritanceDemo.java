/*
	private variables are not inherited
	constructors are also not inherited 
	Constrcutor chaining 
*/

public class InheritanceDemo{
	public static void main (String args[]){
		Point3D p3d = new Point3D();
		//p3d.x = 10;
		//p3d.y = 20;
		//p3d.z = 30;
		p3d.setData(10,20,30);
	}
}

class Point{    
	protected int x;
	protected int y;

	public void setData(int x, int y){
		this.x = x;
		this.y = y;
	}

	public Point(){
		System.out.println("In Point Constructor");
	}
}

class Point3D extends Point{	  // extending the existing class to create a similar 				//new class
	int z;

	public void setData(int x, int y,int z){
		this.setData(x,y);
		this.z = z;
	}

	public Point3D(){
		super();
		System.out.println("In 3DPoint Constructor");
	}
}