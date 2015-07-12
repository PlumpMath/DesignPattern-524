package sixPrinciples.OpenClose;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {

	private final static ArrayList<IBook> BOOKLIST_LIST = new ArrayList<IBook>();

	static {
		BOOKLIST_LIST.add(new NovelBook("�����˲�", "��ӹ", 3200));
		BOOKLIST_LIST.add(new NovelBook("����ʥĸԺ", "���", 5600));
		BOOKLIST_LIST.add(new OffNovelBook("��������", "���", 3500));
		BOOKLIST_LIST.add(new OffNovelBook("��ƿ÷", "����ЦЦ��", 4300));
		BOOKLIST_LIST.add(new ComputerBook("Think in Java", "Bruce Eckel",
				4300, "�������"));
	}

	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		formatter.setMaximumFractionDigits(2);
		System.out.println("------------������ۼ�¼��-----------");
		for (IBook book : BOOKLIST_LIST) {
			System.out.println("�鼮���ƣ�" + book.getName() + "\t�鼮���ߣ�"
					+ book.getAuthor() + "\t�鼮�۸�"
					+ formatter.format(book.getPrice() / 100.0) + "Ԫ");
		}
	}

}
