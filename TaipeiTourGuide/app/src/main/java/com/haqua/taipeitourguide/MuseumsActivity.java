package com.haqua.taipeitourguide;

import android.os.Bundle;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by haqua on 2017/05/25.
 */

public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("National Palace Museum", "This museum contains many ancient Chinese imperial artifacts and artworks, dating back to the Ming Dynasty. A must-go for history fanatics."));
        words.add(new Word("2-28 Memorial Museum", "Aside from the historical roots of the 2-28 Memorial Park , the park is a nice pace to relax."));
        words.add(new Word("Beitou Hot Spring Museum", "The first Japanese Bathhouse built in Taipei in 1913, this place has turned to a museum. It is very cool!"));
        words.add(new Word("Zhongzheng Memorial Hall", "This landmark does not just consist of a museum of history, but also of National Theater as swell as National Concert Hall."));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_museums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
