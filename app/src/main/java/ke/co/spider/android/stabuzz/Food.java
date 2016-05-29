package ke.co.spider.android.stabuzz;

/**
 * Created by kevin on 28/05/16.
 */
public class Food {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Food[] food = {
            new Food("Ugali", "A couple of espresso shots with steamed milk", R.drawable.ugali),
            new Food("Sukuma Wiki","Espresso, hot milk, and a steamed milk foam", R.drawable.sukuma),
            new Food("Waru", "Highest quality beans roasted and brewed fresh", R.drawable.potatoes)
    };

    public Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public static Food[] getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
