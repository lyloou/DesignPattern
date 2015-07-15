package _4Proxy;

public class ProxyImage implements Image {
	
	RealImage realImage;
	String filename;
	ProxyImage(String filename){
		this.filename = filename;
	}
	 
	@Override
	public void display() {
		if(realImage==null){
			realImage = new RealImage(filename);
			System.out.println(realImage);
		}
		realImage.display();
	}

}
