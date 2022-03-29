package Abstraction;

abstract class Vehicle {
	public int speed;
	public long distance;
	abstract void run();
	abstract void stop();
	public void fuel(int x)
	{
		
	}
	public void fuel(float x,String y)
	{
		
	}
	public void fuel(char x,int y)
	{
		
	}
	public Vehicle()
	{
		speed=0;
		distance=0L;
	}
	public Vehicle(int speed,long distance)
	{
		this.speed=speed;
		this.distance=distance;
	}
}
class TwoWheel extends Vehicle
{
	
	public int no_of_tyres;
	public TwoWheel(int x) 
	{
		
	}
	public void display()
	{
		System.out.println(super.distance);
		System.out.println(super.speed);
		System.out.println(no_of_tyres);
	}
	@Override
	void run()
	{
		
		System.out.println("run method of twowheeler");
	}
	@Override
	void stop()
	{
		System.out.println("stop method of two wheeler");
	}
	
}
class ThreeWheel extends Vehicle
{
	int no_of_tyres=3;
	int distance=433;
	int speed=79;
	
	void  run()
	{
		System.out.println("run method of threewheeler");
	}
	void stop()
	{
		System.out.println("stop method of threewheeler");
	}
	public ThreeWheel(int x,int y) 
	{
		this.distance=x;
		this.speed=y;
	}
	public void display()
	{
		System.out.println(super.distance);
		System.out.println(super.speed);
	}
}
class FourWheel extends Vehicle
{
	int no_of_tyres=4;
	int distance=484;
	int speed=55;
	
	void  run()
	{
		System.out.println("run method of FourWheel");
	}
	void stop()
	{
		System.out.println("stop method of FourWheel");
	}
	public FourWheel(int x,int y) 
	{
		this.distance=x;
		this.speed=y;
	}
	public void display()
	{
		System.out.println(super.distance);
		System.out.println(super.speed);
	}
}
class EightWheel extends Vehicle
{
	int no_of_tyres=8;
	int distance=89;
	int speed=83;
	
	void  run()
	{
		System.out.println("run method of EightWheel");
	}
	void stop()
	{
		System.out.println("stop method of EightWheel");
	}
	public EightWheel(int x,int y) 
	{
		this.distance=x;
		this.speed=y;
	}
	public void display()
	{
		System.out.println(super.distance);
		System.out.println(super.speed);
	}
}
abstract class VehicleProg
{
	public static void main(String[] args) 
	{
		Vehicle v1=new TwoWheel(2);
		Vehicle v2=new ThreeWheel(30, 80);
		Vehicle v3=new FourWheel(43,65);
		Vehicle v4=new EightWheel(32, 34);
		v1.run();
		v1.stop();
		v2.run();
		v2.stop();
		v3.run();
		v3.stop();
		v4.run();
		v4.stop();
		
		
	}
}

