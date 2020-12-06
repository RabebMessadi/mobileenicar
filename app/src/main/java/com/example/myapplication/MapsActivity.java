package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.app.FragmentManager;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements LocationListener {

    private GoogleMap mMap;
    private MapFragment mapFragment;
    private LocationManager lm;

    private static final int PERMS_CALL_ID = 1234;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //XML
        setContentView(R.layout.activity_maps);
        FragmentManager fragmentManager = getFragmentManager();
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mapFragment = (MapFragment) fragmentManager.findFragmentById(R.id.map);

        // call onMapReady

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
    @SuppressWarnings("MissingPermission")
    private void loadMap()
    {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            //This class automatically initializes the maps system and the view
            mapFragment.getMapAsync(new OnMapReadyCallback() {
                    @Override
                    public void onMapReady(GoogleMap googleMap) {
                        MapsActivity.this.mMap = googleMap;
                        googleMap.moveCamera(CameraUpdateFactory.zoomBy(15));
                        googleMap.setMyLocationEnabled(true);

                        // Add a marker in Sydney and move the camera
                        LatLng sydney = new LatLng(36.857270, 10.205709);
                        mMap.addMarker(new MarkerOptions().position(sydney).title("oumaima rabeb"));
    }});}}


    @Override
    public void onLocationChanged(Location location) {

        double  latitude = location.getLatitude();
        double longitude = location.getLongitude();
        // Toast.makeText(this, "location"+ latitude+"/"+longitude);
        Toast.makeText(this, "localisation : "+ latitude+" / "+longitude, Toast.LENGTH_LONG).show();
        if(mMap != null){
            LatLng googleLocation = new LatLng(latitude,longitude);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(googleLocation));
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        chekPermission();

    }
    ///pour activée la localisation automatique : vérifie que tous les permission sont activés
    // si non  elle les actives.
    // et passe au block onRequestPermissionsResult pour les activés lors ou on passe a PERMS_CALL_ID.
    //on suit on revient a chekPermission
    //pour passer au block if cette fois si sans pops

    private void chekPermission(){

        lm = (LocationManager) getSystemService(LOCATION_SERVICE);

        // si j'ai un capteur  de gps est activé
        //GESTION DE PERMISSION
        // pour activée la localisation automatique : vérifie que tous les permission sont activés si non  elle les actives.
        if (ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                    //PERMS_CALL_ID :  l'dentificateur de la permission de localisation
                    //si j'ai d'autre permisions il faut faire d'autre id
            },PERMS_CALL_ID);

            // TODO: Consider calling
            //    Activity#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for Activity#requestPermissions for more details.
            //activé la permisiion automatique



            return;
        }
        // prendre les différentes information apartir des différents providers (smartphone, ligne téléphonique,internet)
        // si j'ai un capteur de Gps est activé
        if (lm.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            //abonnee au événement

            lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 60000, 0, this);
        }


        if (lm.isProviderEnabled(LocationManager.PASSIVE_PROVIDER)){
            //abonnee au événement
            lm.requestLocationUpdates(LocationManager.PASSIVE_PROVIDER,60000,0,this);
        }

        if (lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER)){
            //abonnee au événement
            lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,60000,0,this);
        }
        loadMap();
    }
// elle va etre déclancher lors de chaque demande de localisation

    public void onRequestPermissionsResult(int requestCode, String[] permissions,int[] grantResults){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==PERMS_CALL_ID){
            chekPermission();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (lm!= null){
            //LOCATION SERVICE ==TRUE
            lm.removeUpdates(this);

        }
    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
