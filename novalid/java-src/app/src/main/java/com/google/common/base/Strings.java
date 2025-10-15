package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.text.FormattableUtils;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Strings {
    public static String nullToEmpty(@CheckForNull String string) {
        return Platform.nullToEmpty(string);
    }

    @CheckForNull
    public static String emptyToNull(@CheckForNull String string) {
        return Platform.emptyToNull(string);
    }

    public static boolean isNullOrEmpty(@CheckForNull String string) {
        return Platform.stringIsNullOrEmpty(string);
    }

    public static String padStart(String string, int minLength, char padChar) {
        Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb = new StringBuilder(minLength);
        for (int length = string.length(); length < minLength; length++) {
            sb.append(padChar);
        }
        sb.append(string);
        return sb.toString();
    }

    public static String padEnd(String string, int minLength, char padChar) {
        Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb = new StringBuilder(minLength);
        sb.append(string);
        for (int length = string.length(); length < minLength; length++) {
            sb.append(padChar);
        }
        return sb.toString();
    }

    public static String repeat(String string, int count) {
        Preconditions.checkNotNull(string);
        if (count <= 1) {
            Preconditions.checkArgument(count >= 0, "invalid count: %s", count);
            return count == 0 ? "" : string;
        }
        int length = string.length();
        long j = length * count;
        int i = (int) j;
        if (i != j) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j);
        }
        char[] cArr = new char[i];
        string.getChars(0, length, cArr, 0);
        while (true) {
            int i2 = i - length;
            if (length < i2) {
                System.arraycopy(cArr, 0, cArr, length, length);
                length <<= 1;
            } else {
                System.arraycopy(cArr, 0, cArr, length, i2);
                return new String(cArr);
            }
        }
    }

    public static String commonPrefix(CharSequence a2, CharSequence b) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b);
        int iMin = Math.min(a2.length(), b.length());
        int i = 0;
        while (i < iMin && a2.charAt(i) == b.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (validSurrogatePairAt(a2, i2) || validSurrogatePairAt(b, i2)) {
            i--;
        }
        return a2.subSequence(0, i).toString();
    }

    public static String commonSuffix(CharSequence a2, CharSequence b) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b);
        int iMin = Math.min(a2.length(), b.length());
        int i = 0;
        while (i < iMin && a2.charAt((a2.length() - i) - 1) == b.charAt((b.length() - i) - 1)) {
            i++;
        }
        if (validSurrogatePairAt(a2, (a2.length() - i) - 1) || validSurrogatePairAt(b, (b.length() - i) - 1)) {
            i--;
        }
        return a2.subSequence(a2.length() - i, a2.length()).toString();
    }

    @VisibleForTesting
    public static boolean validSurrogatePairAt(CharSequence string, int index) {
        return index >= 0 && index <= string.length() + (-2) && Character.isHighSurrogate(string.charAt(index)) && Character.isLowSurrogate(string.charAt(index + 1));
    }

    public static String lenientFormat(@CheckForNull String template, @CheckForNull Object... args) {
        int iIndexOf;
        String strValueOf = String.valueOf(template);
        int i = 0;
        if (args == null) {
            args = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < args.length; i2++) {
                args[i2] = lenientToString(args[i2]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (args.length * 16));
        int i3 = 0;
        while (i < args.length && (iIndexOf = strValueOf.indexOf(FormattableUtils.SIMPLEST_FORMAT, i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(args[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < args.length) {
            sb.append(" [");
            sb.append(args[i]);
            for (int i4 = i + 1; i4 < args.length; i4++) {
                sb.append(", ");
                sb.append(args[i4]);
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    public static String lenientToString(@CheckForNull Object o) {
        if (o == null) {
            return "null";
        }
        try {
            return o.toString();
        } catch (Exception e) {
            String str = o.getClass().getName() + ObjectUtils.AT_SIGN + Integer.toHexString(System.identityHashCode(o));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }
}
