package com.jakemarsden.projecteuler.util;

import java.io.UncheckedIOException;

public interface ResourceLoader {

  String loadText(String name) throws UncheckedIOException;
}
