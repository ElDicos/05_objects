package ru.netology

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Test
    fun add_shouldIdNotEqualsZero() {
        val post = Post(
            0, 1, 1, 1, 1, "1",
            1, 1, true,
            1, 1, 1, 1,
            1, 1, true, true,
            1, true,
            true, 1, 1,
        )
        val testPost = WallService.add(post)
        WallService.add(post)

        val expectedResult = 0

        assertNotEquals(expectedResult, testPost.id)
    }

    @Test
    fun update_shouldTrueCorrect() {
        val post = Post(
            1, 1, 1, 1,
            1, "1", 1, 1, true,
            1, 1, 1, 1, 1, 1,
            true, true, 1, true,
            true, 1, 1,
        )
        val postUpdate = Post(
            3, 2, 2, 2,
            2, "2", 2, 2, false,
            2, 2, 2, 2, 2, 2,
            false, false, 2, false,
            false, 2, 2,
        )

        WallService.add(post)
        WallService.add(post)
        WallService.add(post)

        WallService.update(postUpdate)

        val result = WallService.update(postUpdate)

        assertTrue(result)
    }

    @Test
    fun update_shouldFalseCorrect() {
        val post = Post(
            1, 1, 1, 1,
            1, "1", 1, 1, true,
            1, 1, 1, 1, 1, 1,
            true, true, 1, true,
            true, 1, 1,
        )
        val postUpdate = Post(
            100, 2, 2, 2,
            2, "2", 2, 2, false,
            2, 2, 2, 2, 2, 2,
            false, false, 2, false,
            false, 2, 2,
        )

        WallService.add(post)
        WallService.add(post)
        WallService.add(post)

        WallService.update(postUpdate)

        val result = WallService.update(postUpdate)

        assertFalse(result)
    }
}



