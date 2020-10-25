
public class Record {
	private static final Object Null = null;
	//id --> random number from 100 to 10000
	//recordTitle ---> Null or empty
	//singerName ----> Null or empty
	//recordLength ---> more than zero
	//recordRanking ---> more than zero less than 6
			
	private double id;
	private String recordTitle;
	private String singerName;
	private int recordLength;
	private int recordRanking;
	
	
	//constructor
	public Record(String recordTitle, String singerName, int recordLength, int recordRanking) {
		setId();
		setTitle(recordTitle);
		setSingerName(singerName);
		setRecLength(recordLength);
		setRwcRank(recordRanking);
	}
	
	

	//getter setters
	public double getId() {
		return id;
	}
	
	public String getTitle() {
		return recordTitle;
	}
	
	public String getSingerName() {
		return singerName;
	}
	
	public int getRecLength() {
		return recordLength;
	}
	
	public int getRecRank() {
		return recordRanking;
	}
	
	//setter
	public void setId() {
		this.id = (int)((Math.random()*9001) + 1);
	}
	
	public void setTitle(String recordTitle) {
		if(!recordTitle.equals(null) || !recordTitle.isEmpty()) {
			this.recordTitle = recordTitle;
		}
	}
	 
	public void setSingerName(String singerName) {
		if(!singerName.equals(null) || !singerName.isEmpty()) {
			this.singerName = singerName;
		}
	} 
	
	public void setRecLength(int recordLength) {
		if(recordLength > 0) {
			this.recordLength = recordLength;
		}
	}
	
	public void setRwcRank(int recordRanking) {
		if(recordRanking > 0 && recordRanking < 6) {
			this.recordRanking = recordRanking;
		}
	}
	
}
