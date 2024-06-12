package codes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class sorting {
	public static void main(String[] args) {

		String name="vikas";
		char target='u';
		
		boolean searching=search(name,target);
		System.out.println(searching);
		}

	private static boolean search(String name, char target) {
		
		if(name.length()==0) {
			return false;
		}
		for(int i=0;i<name.length();i++){
			if(target==name.charAt(i)) {
				
			return true;
			}
			}
		return false;
	}

	}


	 
