package com.example.androidacademyhw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PresentationsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentations_list);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<Presentation> presentations = new ArrayList<>();
        Presentation presentation = new Presentation(
                new Speaker(getString(R.string.speaker)),
                getString(R.string.presentationName),
                getString(R.string.presentationDescription));
        for (int i = 0; i < 20; ++i) {
            presentations.add(presentation);
        }
        RecyclerView.Adapter<PresentationsListAdapter.ViewHolder> adapter = new PresentationsListAdapter(presentations);
        recyclerView.setAdapter(adapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
}
