public class NoteBook extends Book{
	String contents="";

	public NoteBook(int page,int price){
		super(page,price);
	}
	public void writeToNote(String contents){
		this.contents+=contents;
	}
	@Override
	public void showBook(){
		super.showBook();
		System.out.println("内容:"+this.contents);
	}
}
