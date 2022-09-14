package org.mervegundogmus.oopj.week6.Product;

public class Gift extends AbstractProduct implements Locatable {

	public Gift(String description, String sku) {
		super(description, sku);

	}

	public void specialDay(Product product) {
		System.out.println("This product is a gift: " + super.getDescription() + "\n\n");

	}

	@Override
	public void getDepot() {
		System.out.println("This " + super.getDescription() + " product is in stock.\n");

	}

	@Override
	public void getPlace() {
		System.out.println("This " + super.getDescription() + " product has been placed.\n");

	}

}
