package com.haqua.taipeitourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by haqua on 2017/05/25.
 */

public class NightMarketsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Raohe Night Market", "One of the oldest night markets in Taipei, this night market has built up a reputation to be a great site for tourists."));
        words.add(new Word("Ningxia Night Market", "My favorite night market. If you come here, you should go try a traditional Taiwanese snack, an egg/oyster omelette."));
        words.add(new Word("Shilin Night Market", "Often considered to be the most famous night market of Taipei, this is the largest night market by far."));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_nightmarkets);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
