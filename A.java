interface I1
{ void run();}
interface I2
{void run();}
interface I3
{void delete();}
interface I4{
void addProduct();}
interface I5{
void createUser();}

class A implements I1,I2{
public void run(){
System.out.println("Run");
}
public static void main(String args[]){
I2 a= new A();
a.run();
}}