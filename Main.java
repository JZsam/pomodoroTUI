import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws InterruptedException{
		Scanner s = new Scanner(System.in);
		pomodoro p = new pomodoro();
		boolean cont = false;
		do{
			p.run();
			System.out.print("Do you want to start a Pomodoro round [y/n]::");
			cont=s.next().charAt(0)=='y'||s.next().charAt(0)=='Y';
			if(cont)
				System.out.print("\033[H\033[2J");

		}while(cont);
		s.close();
	}
}
