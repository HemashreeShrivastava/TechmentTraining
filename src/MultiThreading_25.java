	class Dollar extends Thread
		{
			public void run() {
				for(int i=1;i<=10;i++)
				{
					System.out.println("$"+"every 500 millisecond");
					try {
						Thread.sleep(500);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
			
		}
public class MultiThreading_25 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("*"+"normal execution");
		}
		Dollar dollar=new Dollar();
		dollar.start();
	}

}
