package kz.mobydev.numbersystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.mobydev.numbersystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? = null
    private var fromBase:Int = 2
    private var toBase:Int =2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.apply {
            btnBinInput.setOnClickListener { fromBase = 2 }
            btnDecInput.setOnClickListener { fromBase = 10 }
            btnOctInput.setOnClickListener { fromBase = 8 }
            btnHexInput.setOnClickListener { fromBase = 16 }
        }
        binding?.apply {
            btnBinOutput.setOnClickListener { toBase = 2 }
            btnDecOutput.setOnClickListener { toBase = 10 }
            btnOctOutput.setOnClickListener { toBase = 8 }
            btnHexOutput.setOnClickListener { toBase = 16 }
        }

        binding?.apply {
            btnConvert.setOnClickListener {
                var input = editTextInput.text.toString()
                textTvResult.text = convertNumber(input,fromBase, toBase).toString()
            }
        }

    }

    fun convertNumber(input: String, fromBase: Int, toBase: Int): String {
        val decimalValue = java.lang.Long.parseLong(input, fromBase)
        return java.lang.Long.toString(decimalValue, toBase).toUpperCase()
    }


}