package ru.netology

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Test
    fun add_shouldIdNotEqualsZero() {
        val post = Post(postSource = 0, geo = 0, copyHistory = emptyArray())
        val testPost = WallService.add(post)
        WallService.add(post)

        val expectedResult = 0

        assertNotEquals(expectedResult, testPost.id)
    }

    @Test
    fun update_shouldTrueCorrect() {
        val post = Post(postSource = 0, geo = 0, copyHistory = emptyArray())
        val postUpdate = Post(id = 1, postSource = 0, geo = 0, copyHistory = emptyArray())

        WallService.add(post)
        WallService.add(post)
        WallService.add(post)

        WallService.update(postUpdate)

        val result = WallService.update(postUpdate)

        assertTrue(result)
    }

    @Test
    fun update_shouldFalseCorrect() {
        val post = Post(postSource = 0, geo = 0, copyHistory = emptyArray())
        val postUpdate = Post(id = 100, postSource = 0, geo = 0, copyHistory = emptyArray())

        WallService.add(post)
        WallService.add(post)
        WallService.add(post)

        WallService.update(postUpdate)

        val result = WallService.update(postUpdate)

        assertFalse(result)
    }
}



