package org.Phone;

public class InternalStorage extends ExternalStorage {

	public void processorName() {
		// TODO Auto-generated method stub
		System.out.println("Processor name is IOS");
	}

	public void ramSize() {
		// TODO Auto-generated method stub
		System.out.println("Ram size is 2 gb");
	}

	public static void main(String[] args) {
		InternalStorage a = new InternalStorage();
		a.processorName();
		a.ramSize();
		a.size();

	}

}
