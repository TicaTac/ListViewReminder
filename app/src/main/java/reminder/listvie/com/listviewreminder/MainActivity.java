package reminder.listvie.com.listviewreminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class    MainActivity extends AppCompatActivity {
   ArrayList<Fruit> allFruits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myFruitlist= (ListView) findViewById(R.id.FruitsListLV);

        Fruit banana= new Fruit("yellow", 6.8, "Banana");
        Fruit kiwi= new Fruit("green", 16.3, "Kiwi");
        Fruit strawberry= new Fruit("red", 12.9, "Strawberry");

        allFruits= new ArrayList<>();


        allFruits.add(banana);
        allFruits.add(kiwi);
        allFruits.add(strawberry);
     //   ArrayAdapter<String>  adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fruits);

        ArrayAdapter<Fruit> adapter= new ArrayAdapter<Fruit>(this, R.layout.fruit_item, R.id.fruitTV, allFruits );

        myFruitlist.setAdapter(adapter);


        myFruitlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText( MainActivity.this, allFruits.get(position).color    , Toast.LENGTH_SHORT ).show();

            }
        });


        myFruitlist.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText( MainActivity.this, ""+allFruits.get(position).price    , Toast.LENGTH_SHORT ).show();

                return true;
            }
        });








    }
}
