package sixPrinciples.OpenClose;

public class OffNovelBook extends NovelBook {

	public OffNovelBook(String name, String author, int price) {
		super(name, author, price);
	}
	
	@Override
	public int getPrice(){
		int price=super.getPrice();
		return (price>4000)?(price*80/100):(price*90/100);
	}

}
