package sixPrinciples.OpenClose;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {

	private final static ArrayList<IBook> BOOKLIST_LIST = new ArrayList<IBook>();

	static {
		BOOKLIST_LIST.add(new NovelBook("天龙八部", "金庸", 3200));
		BOOKLIST_LIST.add(new NovelBook("巴黎圣母院", "雨果", 5600));
		BOOKLIST_LIST.add(new OffNovelBook("悲惨世界", "雨果", 3500));
		BOOKLIST_LIST.add(new OffNovelBook("金瓶梅", "兰林笑笑生", 4300));
		BOOKLIST_LIST.add(new ComputerBook("Think in Java", "Bruce Eckel",
				4300, "编程语言"));
	}

	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		formatter.setMaximumFractionDigits(2);
		System.out.println("------------书店销售记录：-----------");
		for (IBook book : BOOKLIST_LIST) {
			System.out.println("书籍名称：" + book.getName() + "\t书籍作者："
					+ book.getAuthor() + "\t书籍价格："
					+ formatter.format(book.getPrice() / 100.0) + "元");
		}
	}

}
