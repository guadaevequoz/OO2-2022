package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String screenName;
	private String nombre;
	private String mail;
	private List<Tweet> tweets;
	
	
	public Usuario(String screenName, String nombre, String mail) {
		super();
		this.screenName = screenName;
		this.nombre = nombre;
		this.mail = mail;
		this.tweets = new ArrayList<Tweet>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		this.tweets = tweets;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Tweet postear(String texto){
		try {
			Tweet tw = new TweetOriginal(this.getScreenName(), texto);
			this.getTweets().add(tw);
			return tw;
		} catch (Exception e) {
			return null;
		}
	}
	
	public void eliminarTweets() {
		this.getTweets().clear();
	}
	
	public Tweet retweet(Tweet tg1) {
		Tweet rt = new Retweet(tg1);
		this.getTweets().add(rt);
		return rt;
	}
	
	
}
