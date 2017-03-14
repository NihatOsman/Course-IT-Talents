package ex1;

public class SimpleNotepad implements INotepad{

	Page [] pages;
	
	SimpleNotepad(Page [] pages){
		this.pages=pages;
	}

	@Override
	public void addText(int pageNumber, String addNewText) {
		if(pageNumber>=1 && pageNumber <= pages.length){
			pages[pageNumber-1].addText(addNewText);
		}
		else{
			System.out.println("Page doesnt exit.");
		}
		
	}

	@Override
	public void addNewText(int pageNumber, String addNewText) {
		if(pageNumber>=1 && pageNumber <= pages.length){
			pages[pageNumber-1].deleteText();
			pages[pageNumber-1].addText(addNewText);
			
		}
		else{
			System.out.println("Page doesnt exit.");
		}
		
	}

	@Override
	public void deleteText(int pageNumber) {
		if(pageNumber>=1 && pageNumber <= pages.length){
			pages[pageNumber-1].deleteText();
		}
		else{
			System.out.println("Page doesnt exit.");
		}
		
	}

	@Override
	public void sholAllPages() {
		for (int i = 0; i < pages.length; i++) {
			int pageNumber = i+1;
			System.out.println("Page number:" + pageNumber);
			pages[i].showpage();
		}
	}

	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].searchWord(word)==true){
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].containsDigits()==true){
				pages[i].showpage();
			}
		}
	}
	
	
}


