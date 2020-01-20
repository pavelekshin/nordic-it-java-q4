package com.example.classwork26.classwork26;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.classwork27.classwork27.Classwork27Application;

@SpringBootTest
public class PalindromeTests {
	
	@Test
	public void isTruePalindromeTest() {
		var result = new Classwork27Application().Palindrome("lol");
		assertThat(result).isTrue();
	}
}
