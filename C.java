interface I1
{ void run();}
interface I2
{void run();}
interface I3
{void delete();}
interface I4{
void addProduct();}
interface I5 extends I4,I3,I2{
void createUser();}

class C implements I5{
public void run(){
System.out.println("Run");
}
public void delete(){
System.out.println("delete");}
public void createUser()
{System.out.println("createuser in i5");}
public void addProduct(){System.out.println("addproduct");}
public static void main(String args[]){
I5 i5= new C();
i5.run();
i5.addProduct();
i5.createUser();
}}