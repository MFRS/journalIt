package miguelsalvador.co.uk

import android.content.Intent
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
        var eT1 = findViewById<EditText>(R.id.eTNoUser)
        var btn2 = findViewById<Button>(R.id.btnSendMsgNoActivity);
        btn2.setOnClickListener{
            val message: String = eT1.text.toString();
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            var intent = Intent(this,SecondActivity::class.java)
            startActivity((intent))
        }
    //        btnSendMsgNoActivity.setOnClickListener
    }


}