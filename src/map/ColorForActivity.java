package map;

import java.util.HashMap;
import java.util.Map;

public class ColorForActivity {
	private String color;
	public String activity;
	private Map<String, String> colorsForActivity;

	private ColorForActivity() {
		this.setColor("");
		colorsForActivity = new HashMap<String, String>();
		colorsForActivity.put("RUNNING", "#FF0000"); // czerwony
		colorsForActivity.put("WALKING", "#F00000");// czarny
		colorsForActivity.put("CYCLING_SPORT", "#0000FF");// niebieski
		colorsForActivity.put("CYCLING_TRANSPORTATION", "#00FFFF");// cyjan
																	// (niebieski)
		colorsForActivity.put("HIKING", "#FF00FF"); // fuksja (rozowyfiolet)
		colorsForActivity.put("NONE", "#FFFFFF");// bialy
	}

	public ColorForActivity(String activity) {
		this();
		this.activity = activity;
	}

	public void findColor() {
		color = colorsForActivity.get(this.activity);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
