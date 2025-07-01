// O ViewModel depende do Repository (que será injetado pelo Koin)
// Ele mostra um StateFlow para a UI observar as mudanças na lista
// Depois ele busca os itens do repositório e atualiza o StateFlow


package com.joanna.androidmentoring.ui.theme

import androidx.lifecycle.ViewModel
import com.joanna.androidmentoring.data.ItemRepository
import com.joanna.androidmentoring.data.MentorshipItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ItemListViewModel(private val repository: ItemRepository) : ViewModel() {

    private val _items = MutableStateFlow<List<MentorshipItem>>(emptyList())
    val items = _items.asStateFlow()

    init {
        loadItems()
    }

    private fun loadItems() {
        _items.value = repository.getItems()
    }
}