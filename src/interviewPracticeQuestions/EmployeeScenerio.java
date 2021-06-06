package interviewPracticeQuestions;

public class EmployeeScenerio {
	
	     public static void main(String []args){
	        System.out.println("Hello World");
	        Emp e = new Emp();
	        e.set("Hari");
	        display(e);//Output of e
	     }
	       public static Emp display(Emp a){
	       a.set("Pavan");
	       return a;
	       }
	       
	       
}
