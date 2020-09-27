package domain

import org.assertj.core.api.SoftAssertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class PersonTest {

    @Test
    @DisplayName("パラメータを渡すと文字列`Hello, I am Michel.`を生成する")
    fun greetingTest() {
        val expected = "Hello, I am Michel."
        val michel = Person("Michel")
        val actual = michel.greeting()

        SoftAssertions().apply {
            assertThat(actual)
                .`as`("メッセージチェック")
                .isEqualTo(expected)
                .contains("Michel")
                .isInstanceOf(String::class.java)
        }.assertAll()
    }

    @Test
    fun arrayTest() {
        val sut = intArrayOf(3, 1, 4)

        SoftAssertions().apply {
            assertThat(sut).hasSize(3).doesNotContain(2)
            assertThat(sut[0]).isEqualTo(3)
            assertThat(sut[1]).isPositive
            assertThat(sut[2]).isLessThanOrEqualTo(4)
        }.assertAll()
    }

}