import java.util.Date;


public class ReportParameters {
	private Line[] line;
	private Date dateFrom;
	private Date dateTo;
	
	public Line[] getLine() {
		return line;
	}
	public void setLine(Line[] line) {
		this.line = line;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	

}
