package ex1;

public interface INotepad {
	
	void addText(int pageNumber, String addNewText);
	void addNewText(int pageNumber, String addNewText);
	void deleteText(int pageNumber);
	void sholAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();

}
