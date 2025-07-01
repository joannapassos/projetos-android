// Modelo de dados

package com.joanna.androidmentoring.data

import kotlinx.serialization.Serializable

@Serializable
data class MentorshipItem(
    val id: Int,
    val title: String,
    val subtitle: String,
    val imageUrl: String
)