package com.example.mixed_kotest_project

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SampleKotest : StringSpec({

    "example scenario" {
        4 shouldBe 2 + 2
    }
})
