package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate date;
	private double toatlValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	public  Contract() {
	}

	public Contract(Integer number, LocalDate date, double toatlValue) {
		this.number = number;
		this.date = date;
		this.toatlValue = toatlValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getToatlValue() {
		return toatlValue;
	}

	public void setToatlValue(double toatlValue) {
		this.toatlValue = toatlValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
}

