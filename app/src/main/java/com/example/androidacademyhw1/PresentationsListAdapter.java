package com.example.androidacademyhw1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PresentationsListAdapter extends RecyclerView.Adapter<PresentationsListAdapter.ViewHolder> {

    private List<Presentation> presentations;

    public PresentationsListAdapter(List<Presentation> presentations) {
        this.presentations = presentations;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.presentaions_list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bind(presentations.get(i));
    }

    @Override
    public int getItemCount() {
        return presentations.size();
    }

    static public class ViewHolder extends RecyclerView.ViewHolder {
        private final CircleImageView speakerPhoto;
        private final CircleImageView flagImage;
        private final TextView speakerName;
        private final TextView presentationName;

        public ViewHolder(View view) {
            super(view);
            speakerPhoto = view.findViewById(R.id.speakerPhoto);
            flagImage = view.findViewById(R.id.flagImage);
            speakerName = view.findViewById(R.id.speakerName);
            presentationName = view.findViewById(R.id.presentationName);
        }

        public void bind(Presentation presentation) {
            speakerPhoto.setImageResource(R.drawable.photo);
            flagImage.setImageResource(R.drawable.flag);
            presentationName.setText(presentation.getName());
            speakerName.setText(presentation.getSpeaker().getName());
        }
    }
}
