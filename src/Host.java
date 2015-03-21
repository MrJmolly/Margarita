import java.util.regex.Pattern;


public class Host {
	private String hostName = "";
	private String hostIp = "";
	
	public void hostToString(){

		if (Pattern.matches("(^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$)", hostName))
		{
			hostIp = hostName;
			hostName = "";
			System.out.println("IP: " + getHostIp());
		}
		else System.out.println("Host: " + getHostName());
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
