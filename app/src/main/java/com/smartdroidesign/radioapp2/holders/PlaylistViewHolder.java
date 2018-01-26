package com.smartdroidesign.radioapp2.holders;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartdroidesign.radioapp2.R;
import com.smartdroidesign.radioapp2.model.Playlist;

/**
 * Created by mstara on 25/01/2018.
 */

public class PlaylistViewHolder extends RecyclerView.ViewHolder {

    private ImageView mainPlaylistImage;
    private TextView playlistTitleTextView;
    private TextView playListSubtitle;

    public PlaylistViewHolder(View itemView) {
        super(itemView);

        this.mainPlaylistImage = itemView.findViewById(R.id.main_playlist_image);
        this.mainPlaylistImage.setScaleType(ImageView.ScaleType.FIT_XY);
        this.playlistTitleTextView = itemView.findViewById(R.id.main_playlist_text);
        this.playListSubtitle = itemView.findViewById(R.id.main_playlist_sub_text);
    }

    public void updatePlaylistUI(Playlist playlist){
        String uri = playlist.getImgUri();
        int resource = mainPlaylistImage.getResources().getIdentifier(uri,null, mainPlaylistImage.getContext().getPackageName());
        mainPlaylistImage.setImageResource(resource);

        playlistTitleTextView.setText(playlist.getPlaylistTitle());
        playListSubtitle.setText(playlist.getPlaylistSubTitle());

    }
}
