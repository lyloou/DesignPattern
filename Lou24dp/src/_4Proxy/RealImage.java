package _4Proxy;

public class RealImage implements Image {
	String filename;
	RealImage(String filename){
		this.filename = filename;
		loadFromDisk(filename);
	}
	public void loadFromDisk(String filename){
		System.out.println("Loading... "+filename);
	}
	@Override
	public void display() {
		System.out.println("display... "+this.filename);
	}

}
