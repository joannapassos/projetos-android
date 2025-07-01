// Este repositório terá a responsabilidade de buscar os dados
// Ele depende de um Context para acessar a pasta ássets'
// Basicamente essa class vai ler o JSON e retornar uma lista de objetos

package com.joanna.androidmentoring.data

import android.content.Context
import kotlinx.serialization.json.Json

class ItemRepository(private val context: Context) {

    fun getItems(): List<MentorshipItem> {
        val jsonString = context.assets.open("mentorship_items.json")
            .bufferedReader()
            .use { it.readText() }

        return Json.decodeFromString<List<MentorshipItem>>(jsonString)
    }
}