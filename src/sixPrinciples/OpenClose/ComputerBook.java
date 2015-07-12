package sixPrinciples.OpenClose;

public class ComputerBook implements IComputerBook {
	private String scope;
	private String name;
	private String author;
	private int price;

	public ComputerBook(String name, String author, int price, String scope) {
		this.name=name;
		this.author=author;
		this.scope=scope;
		this.price=price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public String getScope() {
		return scope;
	}

}
