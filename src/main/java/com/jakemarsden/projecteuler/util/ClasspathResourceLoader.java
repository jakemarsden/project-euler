package com.jakemarsden.projecteuler.util;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;

public final class ClasspathResourceLoader implements ResourceLoader {

  public static ClasspathResourceLoader fromPackage(Class<?> clazz) {
    var cl = clazz.getClassLoader();
    if (cl == null)
      throw new IllegalStateException("Class was loaded by the bootstrap class loader: " + clazz);
    return ClasspathResourceLoader.fromPackage(cl, clazz.getPackage());
  }

  public static ClasspathResourceLoader fromPackage(ClassLoader cl, Package pkg) {
    var baseName = pkg.getName().replace('.', '/');
    return new ClasspathResourceLoader(cl, baseName + "/");
  }

  private final ClassLoader classLoader;
  private final String baseName;

  private ClasspathResourceLoader(ClassLoader classLoader, String baseName) {
    this.classLoader = classLoader;
    this.baseName = baseName;
  }

  @Override
  public String loadText(String name) {
    var fullName = this.fullNameFor(name);

    byte[] bytes;
    try (var in = this.resourceStream(fullName)) {
      bytes = in.readAllBytes();
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
    return new String(bytes, UTF_8);
  }

  private InputStream resourceStream(String fullName) throws FileNotFoundException {
    var in = this.classLoader.getResourceAsStream(fullName);
    if (in == null)
      throw new FileNotFoundException("Resource not found on classpath: \"" + fullName + "\"");
    return in;
  }

  private String fullNameFor(String name) {
    assert name != null && !name.isEmpty();
    return this.baseName + name;
  }
}
