package ar.edu.unlp.info.oo2.ejercicio_1;

public class Retweet extends Tweet{
	private Tweet tweetOrigen;
	
	public Retweet(Tweet tweetOrigen) {
		super();
		this.tweetOrigen = tweetOrigen;
	}

	public Tweet getTweetOrigen() {
		return tweetOrigen;
	}

	public void setTweetOrigen(TweetOriginal tweetOrigen) {
		this.tweetOrigen = tweetOrigen;
	}

	@Override
	protected Object getScreenName() {
		return null;
	}

}
