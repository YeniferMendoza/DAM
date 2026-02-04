package heladeria;

public class Helado {
	private boolean esTarrina;
	private int numB;
	private SaborHelado [] bolas;
	
	public Helado(boolean esTarrina, SaborHelado...bolas) {
		this.esTarrina = esTarrina;
		this.numB = bolas.length;
		this.setBolas(bolas);
	}
	
	public boolean isEsTarrina() {
		return esTarrina;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

	public SaborHelado[] getBolas() {
		return bolas;
	}

	public void setBolas(SaborHelado[] bolas) {
		this.bolas = bolas;
	}

	public void setEsTarrina(boolean esTarrina) {
		this.esTarrina = esTarrina;
	}
	

}
