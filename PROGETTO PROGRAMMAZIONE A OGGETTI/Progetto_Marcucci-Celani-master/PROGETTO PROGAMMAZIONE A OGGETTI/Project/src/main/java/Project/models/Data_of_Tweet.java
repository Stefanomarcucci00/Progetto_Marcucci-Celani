package Project.models;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Data_of_Tweet {
	private ArrayList<Tweet> tweetdata=new ArrayList<>();
	private ArrayList<User> userdata=new ArrayList<>();

public Data_of_Tweet(String datitweet) {
	JSONObject json=(JSONObject ) JSONValue.parse(datitweet);
	JSONArray jsArray= (JSONArray) json.get("statuses");
	
	for(Object o: jsArray) {
		Tweet t=new Tweet();
		User u=new User();
		t.setCreated_at((String)((JSONObject)o).get("created_at"));
		t.setIdtweet((Integer)((JSONObject)o).get("id"));
		t.setText((String[])((JSONObject)o).get("text"));
		t.setSource((String)((JSONObject)o).get("source"));
		t.setN_like((Integer)((JSONObject)o).get("favorite_count"));	
		t.setN_retweet((Integer)((JSONObject)o).get("retweet_count"));
		t.setRetweeted((Boolean)((JSONObject)o).get("retweeted"));
		t.setFavourites((Boolean)((JSONObject)o).get("favorited"));
		
		//u.setCreated_at((String)((JSONObject)o).get("created_at")); BOH
		
		u.setId((Long)((JSONObject) (((JSONObject)o).get("user"))).get("id"));
		u.setName((String)((JSONObject) (((JSONObject)o).get("user"))).get("name"));
		u.setLocation((String)((JSONObject) (((JSONObject)o).get("user"))).get("location"));
		u.setFollower((Integer)((JSONObject) (((JSONObject)o).get("user"))).get("followers_count"));
		u.setFollowing((Integer)((JSONObject) (((JSONObject)o).get("user"))).get("friends_count"));
		tweetdata.add(t); 
		userdata.add(u);
		}
	}
	public ArrayList<Tweet> getTweets(){
		return tweetdata;
	};
	public ArrayList<User> getUsers(){
		return userdata;
	};

}