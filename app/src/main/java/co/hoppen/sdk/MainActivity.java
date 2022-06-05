package co.hoppen.sdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.hoppen.camera.Camera;
import co.hoppen.devices.Devices;
import co.hoppen.filter.Filter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Filter filter = new Filter();
        filter.use();

        Camera camera = new Camera();
        camera.use();

        Devices devices = new Devices();
        devices.use();

    }
}