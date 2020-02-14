package com.jakemarsden.projecteuler;

import java.io.UncheckedIOException;

public interface ResourceLoader {

  String loadText(String name) throws UncheckedIOException;
}
