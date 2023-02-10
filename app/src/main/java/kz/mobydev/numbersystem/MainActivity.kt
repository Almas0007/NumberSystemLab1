package kz.mobydev.numbersystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.mobydev.numbersystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.apply {



        }

    }

    fun convertNumber(input: String, fromBase: Int, toBase: Int): String {
        val decimalValue = java.lang.Long.parseLong(input, fromBase)
        return java.lang.Long.toString(decimalValue, toBase).toUpperCase()
    }


}