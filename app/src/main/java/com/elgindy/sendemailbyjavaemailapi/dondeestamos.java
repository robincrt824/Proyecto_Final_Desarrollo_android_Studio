package com.elgindy.sendemailbyjavaemailapi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.elgindy.sendemailbyjavaemailapi.databinding.ActivityDondeestamosBinding;

public class dondeestamos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityDondeestamosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDondeestamosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // agregar marcadores en el mapa
        LatLng Pctech = new LatLng(5.0292289, -73.9939971);// latitud y longitud.
        mMap.addMarker(new MarkerOptions().position(Pctech).title("Pc Tech")); // nomnbre del marcadore.
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pctech));
    }
}