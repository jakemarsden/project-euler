package com.jakemarsden.projecteuler.util;

public final class StringParser {

  private static final char NULL = '\0';

  private final String str;
  private int position;
  private int length;

  public StringParser(String str) {
    this(str, 0, str.length());
  }

  public StringParser(String str, int offset, int length) {
    this.str = str;
    this.position = offset;
    this.length = length;
  }

  public char peek() {
    return this.peek(0);
  }

  public char peek(int offset) {
    assert offset >= 0;
    var pos = this.position + offset;
    if (pos >= this.length) return NULL;
    return this.str.charAt(pos);
  }

  public char consume() {
    if (this.position >= this.length) return NULL;
    var c = this.str.charAt(this.position);
    this.advance();
    return c;
  }

  public char consumeExact(char expected) {
    if (this.peek() != expected) return NULL;
    return this.consume();
  }

  public void advance() {
    this.position++;
  }
}
