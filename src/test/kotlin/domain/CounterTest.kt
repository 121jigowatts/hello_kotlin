package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class CounterTest {

    @Nested
    inner class Init001 {
        private lateinit var sut: Counter

        @BeforeEach
        fun setUp() {
            sut = Counter(1)
        }

        @Test
        fun increment() {
            sut.increment()
            val actual = sut.count
            val expected = 2
            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun decrement() {
            sut.decrement()
            val actual = sut.count
            val expected = 0
            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun getCount() {
            assertThat(sut.count).isEqualTo(1)
        }

        @Test
        fun setCount() {
            sut.count = 3
            assertThat(sut.count).isEqualTo(3)
        }
    }

    @Nested
    inner class Init100 {
        private lateinit var sut: Counter

        @BeforeEach
        fun setUp() {
            sut = Counter(100)
        }

        @Test
        fun increment() {
            sut.increment()
            val actual = sut.count
            val expected = 101
            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun decrement() {
            sut.decrement()
            val actual = sut.count
            val expected = 99
            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun getCount() {
            assertThat(sut.count).isEqualTo(100)
        }

        @Test
        fun setCount() {
            sut.count = 103
            assertThat(sut.count).isEqualTo(103)
        }
    }


}