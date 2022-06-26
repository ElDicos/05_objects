package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        var newId = 1
        for (postId in posts)
            if (postId.id >= newId) {
                newId = postId.id + 1
            }
        val newPost = post.copy(id = newId)
        posts += newPost
        return newPost
    }

    fun update(post: Post): Boolean {
        for ((index, postId) in posts.withIndex())
            if (post.id == postId.id) {
                val (id, _, fromId, createdBy, _,
                    text, replyOwnerId, replyPostId, friendsOnly, comments,
                    copyright, likes, reports, views, singerId,
                    canPin, canEdit, isPinned, markedAsAds, isFavorite,
                    donut, postponedId) = post
                posts[index].copy(
                    id = id,
                    fromId = fromId,
                    createdBy = createdBy,
                    text = text,
                    replyOwnerId = replyOwnerId,
                    replyPostId = replyPostId,
                    friendsOnly = friendsOnly,
                    comments = comments,
                    copyright = copyright,
                    likes = likes,
                    reports = reports,
                    views = views,
                    singerId = singerId,
                    canPin = canPin,
                    canEdit = canEdit,
                    isPinned = isPinned,
                    markedAsAds = markedAsAds,
                    isFavorite = isFavorite,
                    donut = donut,
                    postponedId = postponedId
                )
                return true
            }
        return false
    }
}