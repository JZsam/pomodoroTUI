
public class pomodoro{
	private long startTime;
	private long endTime;
	public long startWork(){
		startTime = System.currentTimeMillis();
		endTime = startTime+1500000;
		return endTime;
	}
	public long startShortBreak(){
		startTime = System.currentTimeMillis();
		endTime = startTime+300000;
		return endTime;
	}
	public long startLongBreak(){
		startTime = System.currentTimeMillis();
		endTime = startTime+1800000;
		return endTime;
	}
	public void run() throws InterruptedException{
		boolean first=true;
		do{
			long current = (endTime/1000)-(System.currentTimeMillis()/1000);
			if(first)
				startWork();
			System.out.println("Work\n"+((current/60)%60) + ":" + (current%60));
			Thread.sleep(1);
			System.out.print("\033[H\033[2J");
			first=false;
		}while(endTime>=startTime);
		first=true;
		do{
			long current = (endTime/1000)-(System.currentTimeMillis()/1000);
			if(first)
				startShortBreak();
			System.out.println("Short Break\n"+((current/60)%60) + ":" + (current%60));
			Thread.sleep(1);
			System.out.print("\033[H\033[2J");
		}while(endTime>=startTime);
		first=true;
		do{
			long current = (endTime/1000)-(System.currentTimeMillis()/1000);
			if(first)
				startWork();
			System.out.println("Work\n"+((current/60)%60) + ":" + (current%60));
			Thread.sleep(1);
			System.out.print("\033[H\033[2J");
		}while(endTime>=startTime);
		first=true;
		do{
			long current = (endTime/1000)-(System.currentTimeMillis()/1000);
			if(first)
				startShortBreak();
			System.out.println("Short Break\n"+((current/60)%60) + ":" + (current%60));
			Thread.sleep(1);
			System.out.print("\033[H\033[2J");
		}while(endTime>=startTime);
		first=true;
		do{
			long current = (endTime/1000)-(System.currentTimeMillis()/1000);
			if(first)
				startWork();
			System.out.println("Work\n"+((current/60)%60) + ":" + (current%60));
			Thread.sleep(1);
			System.out.print("\033[H\033[2J");
		}while(endTime>=startTime);
		first=true;
		do{
			long current = (endTime/1000)-(System.currentTimeMillis()/1000);
			if(first)
				startShortBreak();
			System.out.println("Short Break\n"+((current/60)%60) + ":" + (current%60));
			Thread.sleep(1);
			System.out.print("\033[H\033[2J");
		}while(endTime>=startTime);
		first=true;
		do{
			long current = (endTime/1000)-(System.currentTimeMillis()/1000);
			if(first)
				startWork();
			System.out.println("Work\n"+((current/60)%60) + ":" + (current%60));
			Thread.sleep(1);
			System.out.print("\033[H\033[2J");
		}while(endTime>=startTime);
		first=true;
		do{
			long current = (endTime/1000)-(System.currentTimeMillis()/1000);
			if(first)
				startShortBreak();
			System.out.println("Short Break\n"+((current/60)%60) + ":" + (current%60));
			Thread.sleep(1);
			System.out.print("\033[H\033[2J");
		}while(endTime>=startTime);
		first=true;
		do{
			long current = (endTime/1000)-(System.currentTimeMillis()/1000);
			if(first)
				startLongBreak();
			System.out.println("Long Break\n"+((current/60)%60) + ":" + (current%60));
			Thread.sleep(1);
			System.out.print("\033[H\033[2J");
		}while(endTime>=startTime);
	}
}
