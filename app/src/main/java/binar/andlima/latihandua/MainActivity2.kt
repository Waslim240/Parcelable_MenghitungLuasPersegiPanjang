package binar.andlima.latihandua

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val luasPersegiPanjang = intent.getParcelableExtra<DataParcel>("luas") as DataParcel

        val luas = luasPersegiPanjang.panjang * luasPersegiPanjang.lebar

        hasil.append("Hasilnya : $luas")


    }
}