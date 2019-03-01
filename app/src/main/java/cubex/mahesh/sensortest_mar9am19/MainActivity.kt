package cubex.mahesh.sensortest_mar9am19

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sManager:SensorManager = getSystemService(
                Context.SENSOR_SERVICE) as SensorManager
        var s:Sensor = sManager.getDefaultSensor(
            Sensor.TYPE_PROXIMITY)
        sManager.registerListener(
            object:SensorEventListener{
                override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

                }
                override fun onSensorChanged(p0: SensorEvent?) {
                     textView.setText("X Value : "+p0!!.values[0])
                  //   textView2.setText("Y Value :"+p0!!.values[1])
                }
            },s,SensorManager.SENSOR_DELAY_NORMAL)
    }
}
