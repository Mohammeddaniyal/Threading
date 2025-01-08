class cmn
{
private String something;
public void keep(String something)
{
this.something=something;
System.out.printf("I have kept %s, now I am tired and I am going to sleep\n",this.something);
try
{
Thread.sleep(100);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
System.out.printf("Now I am awake, I am picking what i kept %s\n",this.something);
}
}
class Worker extends Thread
{
private String something;
private cmn someplace;
Worker(cmn someplace,String something)
{
this.someplace=someplace;
this.something=something;
start();
}
public void run()
{
this.someplace.keep(this.something);
}
}
class eg1psp
{
public static void main(String gg[])
{
cmn commonplace=new cmn();
Worker w1=new Worker(commonplace,"Gold");
Worker w2=new Worker(commonplace,"Silver");
Worker w3=new Worker(commonplace,"Diamond");
}
}