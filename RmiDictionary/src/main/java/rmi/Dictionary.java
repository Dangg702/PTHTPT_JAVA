package rmi;

public class Dictionary {
	private int id;
	private String word;
	private String mean;
	public Dictionary() {
		super();
	}
	public Dictionary(String word) {
		super();
		this.word = word;
	}
	public Dictionary(int id, String word, String mean) {
		super();
		this.id = id;
		this.word = word;
		this.mean = mean;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	
	
}
