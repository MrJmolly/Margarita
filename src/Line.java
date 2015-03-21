import java.util.Date;

public class Line{
	
		private Host host = new Host();
		private Date date;
		private String req;
		private int http;
		private int reply;
		
		public void lineToString(){
			System.out.println("----------------------------");
			host.hostToString();
			System.out.println("Time: " + getDate());
			System.out.println("Request: " + getReq());
			System.out.println("Http reply code: " + getHttp());
			System.out.println("Bytes in reply: " + getReply());
		}
		
		public Host getHost() {
			return host;
		}
		public void setHost(String str) {
			host.setHostName(str);
		}		
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getReq() {
			return req;
		}
		public void setReq(String req) {
			this.req = req;
		}
		public int getHttp() {
			return http;
		}
		public void setHttp(int http) {
			this.http = http;
		}
		public int getReply() {
			return reply;
		}
		public void setReply(int reply) {
			this.reply = reply;
		}
		
	}