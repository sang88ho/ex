package sogang.ip.ex.exchange;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="exchange")
public class Exchange {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy. MM. dd HH:mm:ss");
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String bank;
	
	private String nation;

	private String monetaryCode;
	
	private Float transferSend;
	
	private Float transferReceive;
	
	private Float cashSend;
	
	private Float cashReceive;
	
	private Float saleStandard;
	
	private Float usdExchangeRate;
	
	private Calendar date;

	public Exchange() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getMonetaryCode() {
		return monetaryCode;
	}

	public void setMonetaryCode(String monetaryCode) {
		this.monetaryCode = monetaryCode;
	}

	public Float getTransferSend() {
		return transferSend;
	}

	public void setTransferSend(Float transferSend) {
		this.transferSend = transferSend;
	}
	
	public Float getTransferReceive() {
		return transferReceive;
	}

	public void setTransferReceive(Float transferReceive) {
		this.transferReceive = transferReceive;
	}

	public Float getCashSend() {
		return cashSend;
	}

	public void setCashSend(Float cashSend) {
		this.cashSend = cashSend;
	}

	public Float getCashReceive() {
		return cashReceive;
	}

	public void setCashReceive(Float cashReceive) {
		this.cashReceive = cashReceive;
	}

	public Float getSaleStandard() {
		return saleStandard;
	}

	public void setSaleStandard(Float saleStandard) {
		this.saleStandard = saleStandard;
	}

	public Float getUsdExchangeRate() {
		return usdExchangeRate;
	}

	public void setUsdExchangeRate(Float usdExchangeRate) {
		this.usdExchangeRate = usdExchangeRate;
	}

	public String getDate() {
		return date == null ? null : sdf.format(date.getTime());
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
}
