
public class Main {

	public static void main(String[] args) throws Exception {
		Carte c = new Carte();
		Sectiune s = new Sectiune();
		Paragraf p = new Paragraf("asdasd");
		s.add(p);
		
		Tabel t = new Tabel();
		Paragraf p2 = new Paragraf("Bla Bla Bla");
		s.add(t);
		s.add(p2);
		
		Imagine i = new Imagine("poza");
		ImageProxy i2 = new ImageProxy("Poza2");
		
		s.add(i);
		s.add(i2);
		c.addContinut(s);
		
		DocumentStatVisitor v = new DocumentStatVisitor();
		for(Element sectiune : c.getContinut()) {
			sectiune.accept(v);
			for(Element e : ((Sectiune) sectiune).getContinut()) {
				e.accept(v);
			}
		}
		v.printStatistics();
		
		XmlVisitor xml = new XmlVisitor();
		for(Element sectiune : c.getContinut()) {
			sectiune.accept(xml);
			for(Element e : ((Sectiune) sectiune).getContinut()) {
				e.accept(xml);
			}
		}
		xml.writeXML();
		
	}

}
