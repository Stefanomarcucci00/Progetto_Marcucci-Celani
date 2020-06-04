package Project.models;

public class User /*extends Tweet*/{
	private long id;
	private String name;
	private String Location;
	private int Follower;
	private int Following;
	/**
	 * CONSTRUCTORS
	 * 
	 * 
	 * */	
	public User() {
		
	}
	public User(long id, String name, int follower, int following) {
		//super();
		this.id = id;
		this.name = name;
		Follower = follower;
		Following = following;
	}
	/**
	 * GETTER AND SETTERS
	 * 
	 */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getFollower() {
		return Follower;
	}
	public void setFollower(int follower) {
		Follower = follower;
	}
	public int getFollowing() {
		return Following;
	}
	public void setFollowing(int following) {
		Following = following;
	}
}
