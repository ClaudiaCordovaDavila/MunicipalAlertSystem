package com.alumno.municipalalertsystem;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng sant = new LatLng(-12.0421263,-76.9659663);
        LatLng munic = new LatLng(-12.0433296, -76.9712805);
        LatLng comisaria = new LatLng(-12.0448818, -76.9766408);
        LatLng hosp1 = new LatLng(-12.0459554,-76.9460781);
        LatLng hosp2 = new LatLng(-12.0457243,-76.9479382);
        LatLng hosp3 = new LatLng(-12.0473132,-76.9474486);
        LatLng hosp4 = new LatLng(-12.0354006,-76.9517749);

        googleMap.addMarker(new MarkerOptions()
                .position(munic)
                .title("Municipalidad de Santa Anita"));

        googleMap.addMarker(new MarkerOptions()
            .position(comisaria)
            .title("Comisaria de Santa Anita"));

        googleMap.addMarker(new MarkerOptions()
                .position(hosp1)
                .title("Hospital Hermilio Valdizan"));

        googleMap.addMarker(new MarkerOptions()
                .position(hosp2)
                .title("Hospital EsSalud San Isidro Labrador"));
        googleMap.addMarker(new MarkerOptions()
                .position(hosp3)
                .title("Hospital Jorge Voto Bernales"));

        googleMap.addMarker(new MarkerOptions()
                .position(hosp4)
                .title("Clínica Municipal de Santa Anita"));

        CameraPosition cam = new CameraPosition.Builder()
                .target(sant)
                .zoom(13)
                .build();

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cam));

    }
}
