package sixPrinciples.OpenClose;

public class NovelBook implements IBook {
	private String name;
	private String author;
	private int price;
	
	public NovelBook(String name, String author, int price) {
		this.name=name;
		this.author=author;
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

}
