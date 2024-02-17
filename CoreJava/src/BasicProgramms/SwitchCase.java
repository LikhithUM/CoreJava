package BasicProgramms;

import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		String str="";
		
		switch(month)
		{
		case 1:
			str="jan";
			break;
		case 2:
			str="feb";
			break;
		case 3:
			str="mar";
			break;
		case 4:
			str="apr";
			break;
		case 5:
			str="may";
			break;
		case 6:
			str="jun";
			break;
		case 7:
			str="jul";
			break;
		case 8:
			str="aug";
			break;
		case 9:
			str="sep";
			break;
		case 10:
			str="oct";
			break;
		case 11:
			str="nov";
			break;
		case 12:
			str="dec";
			break;
		default: System.out.println("invalid month");
		}
		System.out.println(str);

	}

}
