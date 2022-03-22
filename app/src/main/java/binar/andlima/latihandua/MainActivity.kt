package binar.andlima.latihandua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        proses_parcel.setOnClickListener {

            val panjangnya = panjang.text.toString().toInt()
            val lebarnya = lebar.text.toString().toInt()

            val pindah = Intent(this, MainActivity2::class.java)

            val luasPersegiPanjang = DataParcel(panjangnya, lebarnya)

            pindah.putExtra("luas", luasPersegiPanjang)
            startActivity(pindah)
        }
    }
}