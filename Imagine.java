import java.awt.Image;

public class Imagine extends AbstractElement{
	private String pathImagine;
	private Image data;
	
	public Imagine(String fileName) {
		pathImagine = fileName;
	}

	public void print() {
		System.out.println(this.pathImagine);
		
	}

}
