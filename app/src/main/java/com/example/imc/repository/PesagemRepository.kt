package com.example.imc.repository

import android.content.Context
import com.example.imc.model.Pesagem
import kotlin.coroutines.coroutineContext

class PesagemRepository (var context: Context){

    fun getListaPesagem(): List<Pesagem> {
        val listaPesagem = listOf<Pesagem>()

        // Preencher a lista da pesagem
        val dados = context
                        .getSharedPreferences(
                            "usuario",
                            Context.MODE_PRIVATE
                        )

        val pesosString = dados.getString("pesagem", "")
        //""

        val pesos = pesosString!!.split(";").toTypedArray()

        val datasString = dados.getString(("data_pesagem", "")

        val datas = datasString!!.split(";").toTypedArray()


        return listaPesagem
    }
}