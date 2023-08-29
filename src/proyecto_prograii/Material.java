package proyecto_prograii;

public class Material {
//se usaran tipados en string que posteriormente seran convertidos para realizar las distintias operaciones
	//cuanto quiero de cada cosa, establecer precios:
	//double
	private String pegamento;
	//double 
	private String barniz;
	//int
	private String madera;
	//int
	private String clavos;
	//int
	private String lija;
	/**
	 * @param pegamento
	 * @param barniz
	 * @param madera
	 * @param clavos
	 * @param lija
	 */
	public Material(String pegamento, String barniz, String madera, String clavos, String lija) {
		super();
		this.pegamento = pegamento;
		this.barniz = barniz;
		this.madera = madera;
		this.clavos = clavos;
		this.lija = lija;
	}
	public String getPegamento() {
		return pegamento;
	}
	public void setPegamento(String pegamento) {
		this.pegamento = pegamento;
	}
	public String getBarniz() {
		return barniz;
	}
	public void setBarniz(String barniz) {
		this.barniz = barniz;
	}
	public String getMadera() {
		return madera;
	}
	public void setMadera(String madera) {
		this.madera = madera;
	}
	public String getClavos() {
		return clavos;
	}
	public void setClavos(String clavos) {
		this.clavos = clavos;
	}
	public String getLija() {
		return lija;
	}
	public void setLija(String lija) {
		this.lija = lija;
	}
	@Override
	public String toString() {
		return "Material [pegamento=" + pegamento + ", barniz=" + barniz + ", madera=" + madera + ", clavos=" + clavos
				+ ", lija=" + lija + "]";
	}
	
}
