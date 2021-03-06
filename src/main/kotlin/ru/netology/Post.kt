package ru.netology

import java.util.*

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Any,
    val copyright: Any,
    val likes: Any,
    val reports: Any,
    val views: Int,
    val singerId: Int,
    val canPin: Boolean,
    val canEdit: Boolean,
    val isPinned: Any,
    val markedAsAds: Boolean,
    val IsFavorite: Boolean,
    val donut: Any,
    val postponedId: Int
    ) {

}
