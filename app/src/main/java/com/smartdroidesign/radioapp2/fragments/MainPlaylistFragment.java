package com.smartdroidesign.radioapp2.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.smartdroidesign.radioapp2.R;
import com.smartdroidesign.radioapp2.activities.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainPlaylistFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainPlaylistFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public MainPlaylistFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainPlaylistFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainPlaylistFragment newInstance(String param1, String param2) {
        MainPlaylistFragment fragment = new MainPlaylistFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


       // View layout = inflater.inflate(R.layout.fragment_main, container, false);

        View v = inflater.inflate(R.layout.fragment_main_playlist, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();


        Button backBtn = v.findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.getMainActivity().loadMainScreen();
            }
        });

        FragmentManager fm = getActivity().getSupportFragmentManager();
        PlaylistFragment playlistFragment1;
        PlaylistFragment playlistFragment2;
        PlaylistFragment playlistFragment3;



        playlistFragment1 = PlaylistFragment.newInstance(PlaylistFragment.PLAYLIST_TYPE_FEATURED);
        fm.beginTransaction().add(R.id.playlist_container_one, playlistFragment1).commit();

        playlistFragment2 = PlaylistFragment.newInstance(PlaylistFragment.PLAYLIST_TYPE_RECENT);
        fm.beginTransaction().add(R.id.playlist_container_two, playlistFragment2).commit();

        playlistFragment3 = PlaylistFragment.newInstance(PlaylistFragment.PLAYLIST_TYPE_PARTY);
        fm.beginTransaction().add(R.id.playlist_container_three, playlistFragment3).commit();

        return v;
    }

}
