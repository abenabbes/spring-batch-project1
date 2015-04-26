/**
 * 
 */
package aba.batch.web.perso.vo;

/**
 * @author ali
 *
 */
public class Report {

	private String Date;
	private String Impressions;
	private String Clicks;
	private String Earning;
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getImpressions() {
		return Impressions;
	}
	public void setImpressions(String impressions) {
		Impressions = impressions;
	}
	public String getClicks() {
		return Clicks;
	}
	public void setClicks(String clicks) {
		Clicks = clicks;
	}
	public String getEarning() {
		return Earning;
	}
	public void setEarning(String earning) {
		Earning = earning;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Report [Date=");
		builder.append(Date);
		builder.append(", Impressions=");
		builder.append(Impressions);
		builder.append(", Clicks=");
		builder.append(Clicks);
		builder.append(", Earning=");
		builder.append(Earning);
		builder.append("]");
		return builder.toString();
	}
	
}
