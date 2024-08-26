class Student{   //instance veriable and instatce method
   int id;       
   String name;
   float marks;
   long mob;
   String address;
   Static String instituteName;   //static variable
   
   Student(it a,String b,float c,long d,Strig e){
	   id=a;
	   name=b;
	   marks=c;
	   mob=d;
	   address=e;
   }
   
   float displayMarks(){
   return marks;
   }
   
   void calculatePercentage(){
   System.out.println("Percentage");
   }
   
   void displayDetails(){//void for sop 
   System.out.println(id+" " +name+" " +address+ ""+mob+ ""+marks);
   }
   
}
class StudentDemo{
	public static void main(String[] args){
		
		 System.out.println(Student.instituteName);//no need to object for static
	}
}