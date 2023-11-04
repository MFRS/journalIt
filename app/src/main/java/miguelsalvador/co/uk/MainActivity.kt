package miguelsalvador.co.uk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      Connect to main layout
        setContentView(R.layout.activity_main)

        var btn1 = findViewById<Button>(R.id.btnShowToast);
        btn1.setOnClickListener{
//            Log.i("MainActivity","btn was clicked!")
//           shows alert on app screen
            Toast.makeText(this,"Button was clicked!",Toast.LENGTH_SHORT).show()
        }
    //        btnSendMsgNoActivity.setOnClickListener
    }


}