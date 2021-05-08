package palu.developer.net.f55115012_atm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng a1 = new LatLng(-0.889582, 119.890595);
            LatLng a2 = new LatLng(-0.889563, 119.890373);
            LatLng a3 = new LatLng(-0.890050, 119.890201);
            LatLng a4 = new LatLng(-0.890110, 119.890279);
            LatLng a5 = new LatLng(-0.892259, 119.890445);
            LatLng a6 = new LatLng(-0.8946859839065718, 119.8905532983174);
            LatLng a7 = new LatLng(-0.8958677006180951, 119.89050818911876);
            LatLng a8 = new LatLng(-0.8958940990524403, 119.89046107868343);
            LatLng a9 = new LatLng(-0.8960790791572883, 119.89042918166325);
            LatLng a10 = new LatLng(-0.8977120065144057, 119.89048659629887);
            LatLng a11 = new LatLng(-0.8977171698042428, 119.89003108723239);
            LatLng a12 = new LatLng(-0.9006423964255076, 119.89014992823327);
            LatLng atm = new LatLng(-0.9006081,119.8902026);
            googleMap.addMarker(new MarkerOptions().position(atm).title("ATM BALAIKOTA").icon(BitmapDescriptorFactory.fromResource(R.drawable.atm)));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(atm));

            LatLng lokasiku = new LatLng(-0.8898194333022614, 119.89055574024121);
            googleMap.addMarker(new MarkerOptions().position(lokasiku).title("Lokasiku").icon(BitmapDescriptorFactory.fromResource(R.drawable.rumah)));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasiku, 15f));

            PolylineOptions jalur = new PolylineOptions()
                    .add(a1).add(a2).add(a3)
                    .add(a4).add(a5).add(a6)
                    .add(a7).add(a8).add(a9)
                    .add(a10).add(a11).add(a12);
            Polyline garisjalur = googleMap.addPolyline(jalur);

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}