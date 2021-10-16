package cahsflow.modelo;
import java.util.ArrayList;
import java.util.List;

public class BalanceFinanciero {
    private Double ingresosPasivos;
    private Double gastosPasivos;
    private Double salario;
    private Double gastosFijos;
    private Double cashflow;
    private List<Activo> activos;
    private List<Pasivo> pasivos;

    public BalanceFinanciero(Double salarioInicial) {
    	
        this.ingresosPasivos = 0.0;
        this.gastosPasivos = 0.0;
        this.salario = salarioInicial;
        this.gastosFijos = this.salario/2;
        this.cashflow = ingresosPasivos + salario - gastosPasivos - gastosFijos;
        this.activos = new ArrayList<Activo>();
        this.pasivos = new ArrayList<Pasivo>();
    }

	public Double getIngresosPasivos() {
		return ingresosPasivos;
	}

	public void setIngresosPasivos(Double ingresosPasivos) {
		this.ingresosPasivos = ingresosPasivos;
	}

	public Double getGastosPasivos() {
		return gastosPasivos;
	}

	public void setGastosPasivos(Double gastosPasivos) {
		this.gastosPasivos = gastosPasivos;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getGastosFijos() {
		return gastosFijos;
	}

	public void setGastosFijos(Double gastosFijos) {
		this.gastosFijos = gastosFijos;
	}

	public Double getCashflow() {
		return cashflow;
	}

	public void setCashflow(Double cashflow) {
		this.cashflow = cashflow;
	}

	public List<Activo> getActivos() {
		return activos;
	}

	public void setActivos(List<Activo> activos) {
		this.activos = activos;
	}
	
	public void addActivo(Activo activo) {
		this.activos.add(activo);
	}

	public List<Pasivo> getPasivos() {
		return pasivos;
	}

	public void setPasivos(List<Pasivo> pasivos) {
		this.pasivos = pasivos;
	}

	public void addPasivo(Pasivo pasivo) {
		this.pasivos.add(pasivo);
	}

	@Override
	public String toString() {
		return "BalanceFinanciero [ingresosPasivos=" + ingresosPasivos + ", gastosPasivos=" + gastosPasivos
				+ ", salario=" + salario + ", gastosFijos=" + gastosFijos + ", cashflow=" + cashflow + ", activos="
				+ activos + ", pasivos=" + pasivos + "]";
	}
    
    
    
}
