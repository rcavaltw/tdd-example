package tdd.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library library = new Library();

        boolean result = library.someLibraryMethod();

        assertThat(result).as("some library result").isTrue();
    }
}
