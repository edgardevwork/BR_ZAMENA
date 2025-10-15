package org.apache.ivy.util;

import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.common.base.Ascii;
import com.google.common.xml.XmlEscapers;
import io.ktor.util.date.GMTDateParser;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.text.ExtendedMessageFormat;

/* loaded from: classes8.dex */
public final class StringUtils {
    public static final char[] SHIFTS = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, XmlEscapers.MAX_ASCII_CONTROL_CHAR, 'r', 'x', '5', 'O', '`', GMTDateParser.MINUTES, 'H', 'l', 'F', ObjectUtils.AT_SIGN, 'L', 'C', 't', 'J', 'D', 'W', 'o', '4', 'K', 'w', '1', '\"', 'R', 'Q', LauncherConstants.UNDERSCORE_CHAR, 'A', 'p', 'V', 'v', 'n', GMTDateParser.ZONE, 'i', ')', '9', 'S', '+', '.', 'f', '(', GMTDateParser.YEAR, '&', 'g', '-', '2', GMTDateParser.ANY, '{', AbstractJsonLexerKt.BEGIN_LIST, '#', '}', '7', '6', 'B', '|', '~', ';', '/', '\\', 'G', GMTDateParser.SECONDS, 'N', 'X', 'k', 'j', '8', '$', 'y', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.HOURS, 'e', GMTDateParser.DAY_OF_MONTH, 'E', 'I', 'c', '?', '^', AbstractJsonLexerKt.END_LIST, ExtendedMessageFormat.QUOTE, '%', '=', '0', ':', 'q', ' ', 'Z', ',', 'b', '<', '3', PublicSuffixDatabase.EXCEPTION_MARKER, 'a', '>', GMTDateParser.MONTH, 'T', 'P', 'U', 223, 225, 216, 187, 166, 229, Typography.half, 222, 188, 141, 249, 148, 200, 184, 136, 248, 190, 199, 170, 181, 204, 138, 232, 218, Typography.middleDot, 255, 234, 220, 247, 213, 203, 226, 193, Typography.registered, 172, 228, 252, 217, 201, 131, 230, 197, 211, 145, 238, 161, 179, Typography.nbsp, 212, 207, 221, 254, 173, 202, 146, 224, 151, 140, 196, 205, 130, 135, 133, 143, 246, 192, 159, 244, 239, 185, 168, Typography.times, 144, 139, 165, 180, 157, 147, 186, 214, Typography.degree, 227, 231, 219, Typography.copyright, 175, 156, 206, 198, 129, 164, 150, 210, 154, Typography.plusMinus, 134, Ascii.MAX, Typography.paragraph, 128, 158, 208, Typography.cent, 132, Typography.section, 209, 149, 241, 153, 251, 237, 236, 171, 195, 243, 233, 253, 240, 194, 250, 191, 155, 142, 137, 245, 235, Typography.pound, 242, 178, 152};

    public static String uncapitalize(String str) {
        if (isNullOrEmpty(str)) {
            return str;
        }
        if (str.length() == 1) {
            return str.toLowerCase(Locale.US);
        }
        return str.substring(0, 1).toLowerCase(Locale.US) + str.substring(1);
    }

    public static String getErrorMessage(Throwable th) {
        if (th == null) {
            return "";
        }
        if (th instanceof InvocationTargetException) {
            th = ((InvocationTargetException) th).getTargetException();
        }
        String message = th instanceof RuntimeException ? th.getMessage() : th.toString();
        if (!isNullOrEmpty(message) && !"null".equals(message)) {
            return message;
        }
        return th.getClass().getName() + " at " + th.getStackTrace()[0].toString();
    }

    public static String getStackTrace(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    @Deprecated
    public static String join(Object[] objArr, String str) {
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (!(obj instanceof String)) {
                objArr[i] = obj.toString();
            }
        }
        return joinArray((String[]) objArr, str);
    }

    public static String joinArray(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append(str);
        }
        if (strArr.length > 0) {
            sb.setLength(sb.length() - str.length());
        }
        return sb.toString();
    }

    public static String[] splitToArray(String str) {
        if (str == null) {
            return null;
        }
        return str.trim().split("\\s*,\\s*");
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void assertNotNullNorEmpty(String str, String str2) {
        if (isNullOrEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Deprecated
    public static void assertNotNullNotEmpty(String str, String str2) {
        assertNotNullNorEmpty(str, str2);
    }

    public static final String encrypt(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            char[] cArr = SHIFTS;
            if (c >= cArr.length) {
                throw new IllegalArgumentException("encrypt method can only be used with simple characters. '" + c + "' not allowed");
            }
            sb.append(cArr[c]);
        }
        return sb.toString();
    }

    public static final String decrypt(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(decrypt(c));
        }
        return sb.toString();
    }

    public static char decrypt(char c) {
        char c2 = 0;
        while (true) {
            char[] cArr = SHIFTS;
            if (c2 < cArr.length) {
                if (cArr[c2] == c) {
                    return c2;
                }
                c2 = (char) (c2 + 1);
            } else {
                throw new IllegalArgumentException("Impossible to decrypt '" + c + "'. Unhandled character.");
            }
        }
    }

    public static String repeat(String str, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
