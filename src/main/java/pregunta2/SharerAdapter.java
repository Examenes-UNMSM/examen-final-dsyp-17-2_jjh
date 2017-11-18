package pregunta2;

public class SharerAdapter implements Sharing{

	RedditPoster red;
	
	public SharerAdapter(RedditPoster red) {
		this.red = red;
	} 
	
	@Override
	public void share(String message) {
		red.post(message);
		
	}


}
