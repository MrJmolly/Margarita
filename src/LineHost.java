import java.util.regex.Pattern;


public class LineHost {
	private String host = "";
	private String hostName = "";
	private String hostIp = "";
	
	public void hostToString(){

		if (Pattern.matches("(^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$)", host))
		{
			hostIp = host;
			System.out.println("IP: " + getHostIp());
		}
		else{
			hostName = host;
			System.out.println("Host: " + getHostName());
		} 
			
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getHostIp() {
		return hostIp;
	}
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}
	

}
