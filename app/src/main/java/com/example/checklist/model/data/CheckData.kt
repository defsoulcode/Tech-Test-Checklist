package com.example.checklist.model.data

data class CheckData(
    val checklistCompletionStatus: Boolean,
    val id: Int,
    val items: String?,
    val name: String
)