package oopsConcept;

abstract class Car {
	String name;
	String model;
	long price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	

}

