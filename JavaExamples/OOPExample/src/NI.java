
public class NI implements MySite {
	
	
	private int page;
	
	
	public NI(int page) {
		this.page = page;
	}
	
	
	public void totalPage() {
		System.out.println("Total page: " + page);
	}

	public String browsePage(String url) {
		return "Content from " + url;
	}

	public boolean contactForm(String message) {

		return message.isEmpty() ? false : true;
		
	}
	
	public void showTitle() {
		System.out.println(this.siteTitle);
	}


	@Override
	public void displayTitle() {
		// TODO Auto-generated method stub
		
	}

}
