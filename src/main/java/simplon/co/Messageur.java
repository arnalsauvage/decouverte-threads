package simplon.co;

public class Messageur implements Runnable{
	long monDelai;
	String monMessage;

	public Messageur(long monDelai,String monMessage ){
		setMonDelai(monDelai);
		setMonMessage(monMessage);
	}

	public void run() {
		while (true)
		{	
			try {
				Thread.sleep(monDelai);
				System.out.println(monMessage);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public long getMonDelai() {
		return monDelai;
	}

	public void setMonDelai(long monDelai) {
		this.monDelai = monDelai;
	}

	public String getMonMessage() {
		return monMessage;
	}

	public void setMonMessage(String monMessage) {
		this.monMessage = monMessage;
	}
}
