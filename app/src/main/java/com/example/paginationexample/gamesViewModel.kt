package com.example.paginationexample

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class gamesViewModel(private  val gamespagingSource:GamesPagingSource= GamesPagingSource()): ViewModel() {

val gamesList : Flow<PagingData<Games>> = Pager(pagingSourceFactory = { gamespagingSource
}, config = PagingConfig(pageSize = 25)).flow.cachedIn(viewModelScope)

}

