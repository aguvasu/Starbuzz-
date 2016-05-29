package ke.co.spider.android.stabuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<Food> listAdapter = new ArrayAdapter<Food>(this, android.R.layout.simple_list_item_1, Food.food);

        ListView listView = getListView();
        listView.setAdapter(listAdapter);

    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKING, (int)id);

        startActivity(intent);
    }
}
