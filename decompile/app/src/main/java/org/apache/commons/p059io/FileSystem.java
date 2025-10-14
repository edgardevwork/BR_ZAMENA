package org.apache.commons.p059io;

import com.google.common.xml.XmlEscapers;
import io.ktor.util.date.GMTDateParser;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes8.dex */
public enum FileSystem {
    GENERIC(false, false, Integer.MAX_VALUE, Integer.MAX_VALUE, new char[]{0}, new String[0], false),
    LINUX(true, true, 255, 4096, new char[]{0, '/'}, new String[0], false),
    MAC_OSX(true, true, 255, 1024, new char[]{0, '/', ':'}, new String[0], false),
    WINDOWS(false, true, 255, 32000, new char[]{0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, XmlEscapers.MAX_ASCII_CONTROL_CHAR, '\"', GMTDateParser.ANY, '/', ':', '<', '>', '?', '\\', '|'}, new String[]{"AUX", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "CON", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9", "NUL", "PRN"}, true);

    public static final boolean IS_OS_LINUX = getOsMatchesName("Linux");
    public static final boolean IS_OS_MAC = getOsMatchesName("Mac");
    public static final boolean IS_OS_WINDOWS = getOsMatchesName("Windows");
    public static final String OS_NAME_WINDOWS_PREFIX = "Windows";
    public final boolean casePreserving;
    public final boolean caseSensitive;
    public final char[] illegalFileNameChars;
    public final int maxFileNameLength;
    public final int maxPathLength;
    public final String[] reservedFileNames;
    public final boolean supportsDriveLetter;

    public static FileSystem getCurrent() {
        if (IS_OS_LINUX) {
            return LINUX;
        }
        if (IS_OS_MAC) {
            return MAC_OSX;
        }
        if (IS_OS_WINDOWS) {
            return WINDOWS;
        }
        return GENERIC;
    }

    public static boolean getOsMatchesName(String str) {
        return isOsNameMatch(getSystemProperty("os.name"), str);
    }

    public static String getSystemProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            System.err.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    public static boolean isOsNameMatch(String str, String str2) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str.toUpperCase(locale).startsWith(str2.toUpperCase(locale));
    }

    FileSystem(boolean z, boolean z2, int i, int i2, char[] cArr, String[] strArr, boolean z3) {
        this.maxFileNameLength = i;
        this.maxPathLength = i2;
        Objects.requireNonNull(cArr, "illegalFileNameChars");
        this.illegalFileNameChars = cArr;
        Objects.requireNonNull(strArr, "reservedFileNames");
        this.reservedFileNames = strArr;
        this.caseSensitive = z;
        this.casePreserving = z2;
        this.supportsDriveLetter = z3;
    }

    public char[] getIllegalFileNameChars() {
        return (char[]) this.illegalFileNameChars.clone();
    }

    public int getMaxFileNameLength() {
        return this.maxFileNameLength;
    }

    public int getMaxPathLength() {
        return this.maxPathLength;
    }

    public String[] getReservedFileNames() {
        return (String[]) this.reservedFileNames.clone();
    }

    public boolean isCasePreserving() {
        return this.casePreserving;
    }

    public boolean isCaseSensitive() {
        return this.caseSensitive;
    }

    public final boolean isIllegalFileNameChar(char c) {
        return Arrays.binarySearch(this.illegalFileNameChars, c) >= 0;
    }

    public boolean isLegalFileName(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() > this.maxFileNameLength || isReservedFileName(charSequence)) {
            return false;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (isIllegalFileNameChar(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isReservedFileName(CharSequence charSequence) {
        return Arrays.binarySearch(this.reservedFileNames, charSequence) >= 0;
    }

    public boolean supportsDriveLetter() {
        return this.supportsDriveLetter;
    }

    public String toLegalFileName(String str, char c) {
        if (isIllegalFileNameChar(c)) {
            throw new IllegalArgumentException(String.format("The replacement character '%s' cannot be one of the %s illegal characters: %s", c == 0 ? "\\0" : Character.valueOf(c), name(), Arrays.toString(this.illegalFileNameChars)));
        }
        int length = str.length();
        int i = this.maxFileNameLength;
        if (length > i) {
            str = str.substring(0, i);
        }
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (isIllegalFileNameChar(charArray[i2])) {
                charArray[i2] = c;
                z = true;
            }
        }
        return z ? String.valueOf(charArray) : str;
    }
}
