package com.jakemarsden.projecteuler.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringParserTest {

  @Test
  void peek() {
    var parser = new StringParser("hello, world", 8, 12);
    assertEquals('o', parser.peek());
    assertEquals('o', parser.peek()); // shouldn't have advanced
  }

  @Test
  void peekAtOffset() {
    var parser = new StringParser("hello, world", 8, 12);
    assertEquals('l', parser.peek(2));
    assertEquals('l', parser.peek(2)); // shouldn't have advanced
  }

  @Test
  void peekAtEnd() {
    var parser = new StringParser("hello, world", 8, 8);
    assertEquals('\0', parser.peek());
  }

  @Test
  void consume() {
    var parser = new StringParser("hello, world", 8, 12);
    assertEquals('o', parser.consume());
    assertEquals('r', parser.peek()); // should have advanced
  }

  @Test
  void consumeAtEnd() {
    var parser = new StringParser("hello, world", 8, 8);
    assertEquals('\0', parser.consume());
  }

  @Test
  void consumeExact() {
    var parser = new StringParser("hello, world", 8, 12);
    assertEquals('o', parser.consumeExact('o'));
    assertEquals('r', parser.peek()); // should have advanced
  }

  @Test
  void consumeExactNonMatch() {
    var parser = new StringParser("hello, world", 8, 12);
    assertEquals('\0', parser.consumeExact('Z'));
    assertEquals('o', parser.peek()); // shouldn't have advanced
  }
}
