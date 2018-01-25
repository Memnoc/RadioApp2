package com.smartdroidesign.radioapp2.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartdroidesign.radioapp2.R;
import com.smartdroidesign.radioapp2.adapters.PlaylistAdapter;
import com.smartdroidesign.radioapp2.data.DataServicePlaylist;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlaylistFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlaylistFragment extends Fragment {

    private static final String ARG_PLAYLIST_TYPE = "playlistType";
    private static final String ARG_PARAM2 = "param2";



    public static final int PLAYLIST_TYPE_FEATURED = 0;
    public static final int PLAYLIST_TYPE_RECENT = 1;
    public static final int PLAYLIST_TYPE_PARTY= 2;

    public static int playlistType;



    public PlaylistFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param playlistType Type of playlist.
     * @return A new instance of fragment PlaylistFragment.
     */
    public static PlaylistFragment newInstance(int playlistType) {
        PlaylistFragment fragment = new PlaylistFragment();
        Bundle args = new Bundle();
        args.putInt("", playlistType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
          playlistType = getArguments().getInt(ARG_PLAYLIST_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_playlist, container, false);

        RecyclerView recyclerView = v.findViewById(R.id.recycler_playlist_stations);
        recyclerView.setHasFixedSize(true);

        PlaylistAdapter adapter;

        if(playlistType == PLAYLIST_TYPE_FEATURED){
            adapter = new PlaylistAdapter(DataServicePlaylist.getInstance().getFeaturedPlaylists());
        } else if (playlistType == PLAYLIST_TYPE_RECENT){
            adapter = new PlaylistAdapter(DataServicePlaylist.getInstance().getRecentPlaylists());
        } else {
            adapter = new PlaylistAdapter(DataServicePlaylist.getInstance().getPartyPlaylists());

        }

        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        return v;
    }

}

