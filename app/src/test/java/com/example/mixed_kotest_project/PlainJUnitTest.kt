package com.example.mixed_kotest_project

import org.junit.Test
import org.junit.Assert.*

class PlainJUnitTest {

    @Test
    fun shouldFails() {
        assertEquals(4, 2 + 5)
    }
}
