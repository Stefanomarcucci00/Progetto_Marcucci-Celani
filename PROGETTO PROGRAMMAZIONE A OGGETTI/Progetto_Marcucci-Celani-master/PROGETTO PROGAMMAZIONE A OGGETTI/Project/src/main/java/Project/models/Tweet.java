package Project.models;

public class Tweet {
	private String created_at;
	private long idtweet;
	private String[] text;
	private String source;
	private int n_like;
	private int n_retweet;
    private boolean favourites;
    private boolean retweeted;
	
	/**
	 * CONSTRUCTORS 
	 */	
	public Tweet() {
		
	}

	public Tweet(String created_at, long idtweet, String[] text, String source, 
			int n_like, int n_retweet, boolean favourites, boolean retweeted) {
		super();
		this.created_at = created_at;
		this.idtweet = idtweet;
		this.text = text;
		this.source = source;
		this.n_like = n_like;
		this.n_retweet = n_retweet;
		this.favourites = favourites;
		this.retweeted = retweeted;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public long getIdtweet() {
		return idtweet;
	}

	public void setIdtweet(long idtweet) {
		this.idtweet = idtweet;
	}

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public int getN_like() {
		return n_like;
	}

	public void setN_like(int n_like) {
		this.n_like = n_like;
	}

	public int getN_retweet() {
		return n_retweet;
	}

	public void setN_retweet(int n_retweet) {
		this.n_retweet = n_retweet;
	}

	public boolean isFavourites() {
		return favourites;
	}

	public void setFavourites(boolean favourites) {
		this.favourites = favourites;
	}

	public boolean isRetweeted() {
		return retweeted;
	}

	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}
	

}
