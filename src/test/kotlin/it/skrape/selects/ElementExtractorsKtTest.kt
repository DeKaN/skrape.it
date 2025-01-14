package it.skrape.selects

import it.skrape.aValidDocument
import it.skrape.matchers.toBe
import it.skrape.selects.html5.p
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class ElementExtractorsKtTest {

    private val document = aValidDocument()

    @Test
    fun `can pick element from element`() {
        // TODO
    }

    @Test
    fun `can pick elements from element`() {
        // TODO
    }

    @Test
    fun `can pick element from elements`() {
        // TODO
    }

    @Test
    fun `can pick elements from elements`() {
        // TODO
    }

    @Test
    fun `can pick elements firstOccurrence`() {
        val firstText = document.p {
            firstOccurrence {
                text() toBe "i'm a paragraph"
            }
        }
        expectThat(firstText).isEqualTo("i'm a paragraph")
    }

    @Test
    fun `can pick elements secondOccurrence`() {
        val secondText = document.p {
            secondOccurrence {
                text() toBe "i'm a second paragraph"
            }
        }
        expectThat(secondText).isEqualTo("i'm a second paragraph")
    }

    @Test
    fun `can pick elements by index`() {
        val secondText = document.p {
            nthOccurrence(1) {
                text() toBe "i'm a second paragraph"
            }
        }
        expectThat(secondText).isEqualTo("i'm a second paragraph")
    }

    @Test
    fun `can pick elements thirdOccurrence`() {
        val thirdText = document.p {
            thirdOccurrence {
                text() toBe "i'm a paragraph with word break"
            }
        }
        expectThat(thirdText).isEqualTo("i'm a paragraph with word break")
    }

    @Test
    fun `can pick elements lastOccurrence`() {
        val lastText = document.p {
            lastOccurrence {
                text() toBe "i'm the last paragraph"
            }
        }
        expectThat(lastText).isEqualTo("i'm the last paragraph")
    }

    @Test
    fun `can pick elements secondlastOccurrence`() {
        val secondLastText = document.p {
            secondLastOccurrence {
                text() toBe "i'm a paragraph with word break"
            }
        }
        expectThat(secondLastText).isEqualTo("i'm a paragraph with word break")
    }
}