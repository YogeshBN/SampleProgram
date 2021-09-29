package assignment1;

class RandomGenThread implements Runnable 
{
double num;
public void run() 
 {
try {
SquareThread sqt = new SquareThread();
Thread squareThread = new Thread(sqt);
CubeThread cbt = new CubeThread();
Thread CubeThread = new Thread(cbt);
squareThread.start();
CubeThread.start();
for(int i=0;i<10;i++) 
{
System.out.println("t1-"+i);
if(i%2 == 0)
{
sqt.setNum(new Double(i));
}
else
{
cbt.setNum(new Double(i));
}
Thread.sleep(1000);
}
} catch (InterruptedException e) 
{
e.printStackTrace();
}
}
}
class SquareThread implements Runnable
{
Double num;
public void run()
{
try {
int i=0;
do{
i++;
if(num != null&&num %2 ==0)
{
System.out.println("t2--->square of "+num+"="+(num*num));
num = null;
}
Thread.sleep(1000);
}while(i<=5);
}
catch (Exception e)
{
e.printStackTrace();
}
}
public Double getNum() 
{
return num;
}
public void setNum(Double num) 
{
this.num = num;
}
}
class CubeThread implements Runnable
{
Double num;
public void run() 
{
try {
int i=0;
do{
i++;
if(num != null&&num%2 !=0) 
{
System.out.println("t3-->Cube of "+num+"="+(num*num*num));
num=null;
}
Thread.sleep(1000);
}
while(i<=5);
}
catch (Exception e)
{
 e.printStackTrace();
}
}
public static void start() {
	// TODO Auto-generated method stub
	
}
public Double getNum() 
{
return num;
}
public void setNum(Double num) 
{
this.num = num;
}
}
public class Act28_4
{
public static void main(String[] args) throws InterruptedException 
{
Thread randomThread = new Thread(new RandomGenThread());
randomThread.start();
}
}