package testClasses;

public class TC505Reverse {

	public static void main(String[] args) {
		
			String org="pavan";
			        
			String rev="";  // navap
			
			//           3      -1>=0
			
			for(int i=org.length()-1; i>=0; i--) {
				
				rev=rev+org.charAt(i); //pava+n=navap
			}
				
				System.out.println(org);
				System.out.println(rev);
					
			}	
	}
