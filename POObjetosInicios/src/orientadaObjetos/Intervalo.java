package orientadaObjetos;

public class Intervalo {
	private float limiteSuperior;
	private float limiteInferior;

	public Intervalo() {
		this.setLimiteSuperior(0);
		this.setLimiteInferior(0);
	}
	public Intervalo (float limiteSuperior) {
		this.setLimiteInferior(0);
		if(limiteSuperior < 0) {
			this.setLimiteSuperior(0);
		}
		else {
			this.setLimiteSuperior(limiteSuperior);
		}	
	}
	public Intervalo( float limiteInferior, float limiteSuperior ) {
		if(limiteInferior > limiteSuperior) {
			this.setLimiteInferior(limiteSuperior);
			this.setLimiteSuperior(limiteInferior);
		}
		else {
			this.setLimiteInferior(limiteInferior);
			this.setLimiteSuperior(limiteSuperior);
		}
	}
	public float getLimiteInferior() {
		return limiteInferior;
	}
	public void setLimiteInferior(float limiteInferior) {
		if(this.limiteInferior <= limiteSuperior) {
			this.limiteInferior = limiteInferior;
		}
	}
	public float getLimiteSuperior() {
		return limiteSuperior;
	}
	public void setLimiteSuperior(float limiteSuperior) {
		if (this.limiteInferior <= limiteSuperior) {
			this.limiteSuperior = limiteSuperior;
		}	
	}
	public void desplazar ( float desplazamiento) {
		this.limiteSuperior += desplazamiento;
		this.limiteInferior += desplazamiento;
	}
	public static Intervalo union (Intervalo i1, Intervalo i2) {
		if (i1.limiteSuperior>= i2.limiteInferior && i1.limiteInferior <= i2.limiteSuperior) {
			return new Intervalo(i1.limiteInferior, i2.limiteSuperior);
		}
		else {
			return null;
		}
	}
	public boolean estaIntervalo(float num) {
		return this.limiteInferior <= num && num <= this.limiteSuperior;
	}
	
	public boolean estaIncluido(Intervalo i1) {
		return i1.limiteInferior >= this.limiteSuperior && i1.limiteSuperior <= this.limiteInferior;
	}
	

}

