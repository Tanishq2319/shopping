package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Find the profile button by ID
        ImageView profileButton = view.findViewById(R.id.profileButton);

        // Set an OnClickListener for the profile button
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProfileMenu(v);
            }
        });

        return view;
    }

    // Method to show the popup menu for profile options
    private void showProfileMenu(View anchorView) {
        // Create a PopupMenu linked to the profile button
        PopupMenu popupMenu = new PopupMenu(getContext(), anchorView);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.profile_menu, popupMenu.getMenu());  // Inflate menu from resource

        // Set up listener to handle menu item clicks using if-else
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                // Using if-else instead of switch-case to avoid the "constant expression required" error
                if (item.getItemId() == R.id.menu_settings) {
                    openSettings();
                    return true;
                } else if (item.getItemId() == R.id.menu_payments) {
                    openPayments();
                    return true;
                } else if (item.getItemId() == R.id.menu_address) {
                    openAddress();
                    return true;
                } else if (item.getItemId() == R.id.menu_profile) {
                    openProfile();
                    return true;
                } else {
                    return false;
                }
            }
        });

        // Show the popup menu
        popupMenu.show();
    }

    // Methods to handle menu actions (can open respective activities or fragments)
    private void openSettings() {
        // Logic to open Settings activity or fragment
    }

    private void openPayments() {
        // Logic to open Payments activity or fragment
    }

    private void openAddress() {
        // Logic to open Address activity or fragment
    }

    private void openProfile() {
        // Logic to open Profile activity or fragment
    }
}
