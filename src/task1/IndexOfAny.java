package task1;

import com.sun.istack.internal.NotNull;

public class IndexOfAny {
    /**
     * Write covering tests + refactor code.
     * In this task signature should stay the same
     * Searching for any character
     */
    public static int indexOfAny(@NotNull String str, @NotNull char[] searchChars) {
        if (!str.isEmpty() && searchChars.length > 0) {
            for (int i = 0; i < str.length(); ++i) {
                char ch = str.charAt(i);

                for (char searchChar : searchChars) {
                    if (searchChar == ch) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
