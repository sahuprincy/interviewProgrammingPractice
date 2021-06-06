package interviewPracticeQuestions;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		 
        String s2 = "Hello";
        String s3 = "Hello";
        
 
        System.out.println(s1.equals(s2)); // output- t
    
        System.out.println(s2 == s1); // output-f

        
        if (s1==s2)
            System.out.println("s1==s2");
        if(s1==s3)
            System.out.println("s1==s3");
        if(s2==s3)
            System.out.println("s2==s3");
		
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        
	}

}
