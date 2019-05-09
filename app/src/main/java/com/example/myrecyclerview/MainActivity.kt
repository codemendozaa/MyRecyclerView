package com.example.myrecyclerview

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private var lstOption: ArrayList<LstOtion> = ArrayList()

    class LstOtion(image: Int, name: String, position: Int, id: Int) {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lstOption.add(
            LstOtion(
                image = R.drawable.ic_home_post_pago_cambio_numero,
                name = "Cambio numero",
                position = 0,
                id = 1
            )
        )
        lstOption.add(
            LstOtion(
                image = R.drawable.ic_home_post_pago_datos_compartidos,
                name = "Datos Compartidos",
                position = 1,
                id = 2
            )
        )
        lstOption.add(
                LstOtion(
                    image = R.drawable.ic_home_post_pago_familia_amigos,
                    name = "Familia y Amigos",
                    position = 2,
                    id = 3
                )
                )


}
}



