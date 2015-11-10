package task2;

import com.sun.istack.internal.NotNull;

public class Abbreviate {
  /**
   * Write covering tests + refactor code.
   * In this task you can simplify the signature. All usages in project are listed in Usages.java
   */
  public static String abbreviate(@NotNull String str, int offset, int maxWidth) {
    checkArguments(offset, maxWidth);
    int length = str.length();
    offset = fixOffset(length, offset, maxWidth);

    if (length <= maxWidth) {
      return str;
    }

    if (offset <= 4) {
      return str.substring(0, maxWidth - 3) + "...";
    }
    if (maxWidth < 7) {
      throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
    } else {
      return offset + (maxWidth - 3) < length ? "..." + abbreviate(str.substring(offset), 0, maxWidth - 3) : "..." + str.substring(length - (maxWidth - 3));
    }
  }

  /**
   * Checks if offset more than length or maxWidth-3 and returns correct value
   */
  private static int fixOffset(@NotNull int length, int offset, int maxWidth) {
    if (length - offset < maxWidth - 3) {
      return length - (maxWidth - 3);
    }
    return offset;
  }

  private static void checkArguments(int offset, int maxWidth) {
    if (offset < 0) {
      throw new IllegalArgumentException("Minimum offset width is 0");
    }
    if (maxWidth < 4) {
      throw new IllegalArgumentException("Minimum abbreviation width is 4");
    }
  }
}
