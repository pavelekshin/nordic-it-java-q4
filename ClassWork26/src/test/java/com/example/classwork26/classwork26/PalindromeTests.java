package com.example.classwork26.classwork26;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class PalindromeTests {
	
	@Test
	@DisplayName("Проверка четной строки на палиндром")
	public void isTruePalindromeTest1() {
		new Palindrome();
		var result = Palindrome.IsPalindrome("lol");
		assertThat(result).isTrue();
	}
	
	@Test
	public void isTruePalindromeTest2() {
		new Palindrome();
		var result = Palindrome.IsPalindrome("lool");
		assertThat(result).isTrue();
	}
	
	@Test
	public void isFlasePalindromeTest1() {
		new Palindrome();
		var result = Palindrome.IsPalindrome("asd");
		assertThat(result).isFalse();
	}
	
	@Test
	public void isFlasePalindromeTest2() {
		new Palindrome();
		var result = Palindrome.IsPalindrome("assfa");
		assertThat(result).isFalse();
	}
}
