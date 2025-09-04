package alcala.jose.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnLongitud: Button=findViewById(R.id.btnLongitud)
        val btnPeso: Button=findViewById(R.id.btnPeso)
        val btnTemp: Button=findViewById(R.id.btnTemp)
        val btnVolumen: Button=findViewById(R.id.btnVolumen)
        val tvConvertir: TextView=findViewById(R.id.tvConvertir)
        val etConver: EditText=findViewById(R.id.etConver)
        val tvResultado: TextView=findViewById(R.id.tvResultado)
        val btnResultado: Button=findViewById(R.id.btnResultado)

        btnLongitud.setOnClickListener {
            tvConvertir.setText("Convertir Kilometros a Millas")
            //1 Km=0.621371 Mill.
            btnResultado.setOnClickListener {
                var valor=etConver.text.toString().toDouble()
                var restulado=valor/1.609
                tvResultado.setText(restulado.toString())
            }
        }
        btnPeso.setOnClickListener {
            tvConvertir.setText("Convertir Kilogramos a Libras")
            //1 Kg=2.20462 Lb.
            btnResultado.setOnClickListener {
                var valor=etConver.text.toString().toDouble()
                var restulado=valor*2.205
                tvResultado.setText(restulado.toString())
            }
        }
        btnTemp.setOnClickListener {
            tvConvertir.setText("Convertir Celcius a Fahrenheit")
            //1 °C= 33.8°F.
            btnResultado.setOnClickListener {
                var valor=etConver.text.toString().toDouble()
                var restulado=((valor*(9.0/5.0))+32.0)
                tvResultado.setText(restulado.toString())
            }
        }
        btnVolumen.setOnClickListener {
            tvConvertir.setText("Convertir Litros a Galones")
            //1 Lt= 0.264172 gal.
            btnResultado.setOnClickListener {
                var valor=etConver.text.toString().toDouble()
                var restulado=valor/3.785
                tvResultado.setText(restulado.toString())
            }
        }

    }
}