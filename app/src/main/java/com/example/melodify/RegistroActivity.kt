package com.example.melodify

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.MotionEvent
import android.view.WindowManager
import com.example.melodify.R
import com.example.melodify.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {


    private lateinit var binding: ActivityRegistroBinding
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window // in Activity's onCreate() for instance
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }

        binding.clave.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                if (event.rawX >= (binding.clave.right - binding.clave.compoundDrawables[2].bounds.width())) {

                    if (binding.clave.transformationMethod is PasswordTransformationMethod) {
                        // Mostrar la contraseña
                        binding.clave.transformationMethod = HideReturnsTransformationMethod.getInstance()
                        binding.clave.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojito_passwd, 0)
                    } else {
                        // Ocultar la contraseña
                        binding.clave.transformationMethod = PasswordTransformationMethod.getInstance()
                        binding.clave.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojito_passwd, 0)
                    }

                    binding.clave.setSelection(binding.clave.text.length)
                    return@setOnTouchListener true
                }
            }
            false
        }

        binding.confirmClave.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                if (event.rawX >= (binding.confirmClave.right - binding.confirmClave.compoundDrawables[2].bounds.width())) {

                    if (binding.confirmClave.transformationMethod is PasswordTransformationMethod) {
                        // Mostrar la contraseña
                        binding.confirmClave.transformationMethod = HideReturnsTransformationMethod.getInstance()
                        binding.confirmClave.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojito_passwd, 0)
                    } else {
                        // Ocultar la contraseña
                        binding.confirmClave.transformationMethod = PasswordTransformationMethod.getInstance()
                        binding.confirmClave.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ojito_passwd, 0)
                    }

                    binding.confirmClave.setSelection(binding.confirmClave.text.length)
                    return@setOnTouchListener true
                }
            }
            false
        }


        binding.buttonRegister.setOnClickListener {
//            registro()
        }



    }

//    fun registro(){
//        var nombre = binding.nombreUser.text.toString()

//        val intent = Intent(this, LAQUESEA::class.java)
//        val bundle = Bundle()
//        bundle.putString("nombre", nombre)
//        intent.putExtras(bundle)
//        startActivity(Intent)

}
