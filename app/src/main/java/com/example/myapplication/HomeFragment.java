package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.example.myapplication.adapters.ImageCarouselAdapter;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Get the ViewPager2 from the layout
        ViewPager2 imageCarousel = view.findViewById(R.id.imageCarousel);

        // Set up the ImageCarouselAdapter with images
        ImageCarouselAdapter adapter = new ImageCarouselAdapter(getContext());
        imageCarousel.setAdapter(adapter);

        return view;
    }
}
