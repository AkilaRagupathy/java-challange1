package JavaChallenge;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Hello World ";
        String [] split=s.split(" ");
        System.out.println(Arrays.toString(split));
       
       int lastindex=split.length-1;
       String lastword=split[lastindex];
      
       System.out.println(lastword);
       System.out.println(lastword.length());
       
      // System.out.print(s.substring(s.trim().lastIndexOf(" ")+1).trim().length());
        
	}

}
