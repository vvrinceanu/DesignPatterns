
public class Paragraf extends AbstractElement{
	private String text;
	
	public Paragraf(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void print() {
		System.out.println(this.text);
		
	}

}
