package ntphong.example.betaptinh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btncong.setOnClickListener {
            var st1:Int =(edtnhapso1.text.toString()).toInt()
            var st2:Int=(edtnhapso2.text.toString()).toInt()
            var kq:Int=st1+st2
            texketqua.text=kq.toString()
        }
        btntru.setOnClickListener {
            var st1:Int =(edtnhapso1.text.toString()).toInt()
            var st2:Int=(edtnhapso2.text.toString()).toInt()
            var kq:Int=st1-st2
            texketqua.text=kq.toString()
        }
        btnchia.setOnClickListener {
            var st1:Int =(edtnhapso1.text.toString()).toInt()
            var st2:Int=(edtnhapso2.text.toString()).toInt()
            var kq:Int=st1/st2
            texketqua.text=kq.toString()
        }
        btnnhan.setOnClickListener {
            var st1:Int =(edtnhapso1.text.toString()).toInt()
            var st2:Int=(edtnhapso2.text.toString()).toInt()
            var kq:Int=st1*st2
            texketqua.text=kq.toString()
        }
    }
}
