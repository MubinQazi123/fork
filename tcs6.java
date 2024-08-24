public class A
{
	public void a()
	{
syspout("base A")
	}
}

class B extends A
{
	public void b()
	{
	sysout("devired B for A\n Base For C")
	}
}

class C extends B
{
	public ovid c()
	{
	sysout("Base C")
	}
}

class Main
{
	public s v m()
	{
	  C c1=new C();
	  c1.a();
	  c1.b();
	  c1.c();
	}
} {
    
}
