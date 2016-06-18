import java.util.LinkedList;
import java.util.Scanner;

public class DNAscan {
static Scanner MyInput = new Scanner(System.in);
 static boolean MFlag= false;  
	public static void main(String[] args) {
		int NoT= MyInput.nextInt();
		for(int i=0; i<NoT;i++){
			ScanVirus();
			if (MFlag == true ) System.out.println();
			if (MFlag == false ) {
				System.out.print("No Match!");
				System.out.println();
			}
			MFlag = false ;
		}
	}
	
	private  static void ScanVirus() {
		String PatDNA = MyInput.next(),VirusDNA=MyInput.next();
		int i=0;
		LinkedList<Character> ArraySamp = new LinkedList<Character>() ;
		//for (int j = 0 ; j < ( i + VirusDNA.length() - 1 ) ; j++ ){
		while( (i + VirusDNA.length()) < PatDNA.length()+1 ){
			for(int k = 0 ; k < VirusDNA.length() ; k++ ){
				ArraySamp.add(PatDNA.charAt(i+k)) ;
				}
			//ArraySamp.trimToSize() ;
		Transfer(ArraySamp,VirusDNA,i);	
		ArraySamp.clear();
		i++;
		}
		
		
	}
	private static void Transfer(LinkedList<Character> arraySamp, String virusDNA, int i) {
		int count=0; boolean Flag=true;
		for(int m=0; m < virusDNA.length(); m++){
			if(arraySamp.get(m) != virusDNA.charAt(m)) count++; 	
			if (count == 2) {
				Flag = false;
				break ;
				}
			
		}
		if (Flag == true ) {
			System.out.print(i + " ");
			
		MFlag=true;
		} 
 	
		
	}

}
