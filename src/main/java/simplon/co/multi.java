package simplon.co;

public class multi {
	
	    public static void main( String[] args ) throws InterruptedException
	    {
	    	Thread thread =  new Thread(new Messageur(1000,"bonjour"));
	    	Thread thread2 =  new Thread(new Messageur(1333,"j'ai faim !!!"));
	    	
	    	thread.start();
	    	thread2.start();
	    	
	    }

}
