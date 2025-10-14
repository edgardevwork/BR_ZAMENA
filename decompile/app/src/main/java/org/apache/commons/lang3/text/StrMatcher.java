package org.apache.commons.lang3.text;

import java.util.Arrays;
import org.apache.commons.lang3.ArraySorter;
import org.apache.commons.lang3.StringUtils;

@Deprecated
/* loaded from: classes8.dex */
public abstract class StrMatcher {
    public static final StrMatcher COMMA_MATCHER = new CharMatcher(',');
    public static final StrMatcher TAB_MATCHER = new CharMatcher('\t');
    public static final StrMatcher SPACE_MATCHER = new CharMatcher(' ');
    public static final StrMatcher SPLIT_MATCHER = new CharSetMatcher(" \t\n\r\f".toCharArray());
    public static final StrMatcher TRIM_MATCHER = new TrimMatcher();
    public static final StrMatcher SINGLE_QUOTE_MATCHER = new CharMatcher(ExtendedMessageFormat.QUOTE);
    public static final StrMatcher DOUBLE_QUOTE_MATCHER = new CharMatcher('\"');
    public static final StrMatcher QUOTE_MATCHER = new CharSetMatcher("'\"".toCharArray());
    public static final StrMatcher NONE_MATCHER = new NoMatcher();

    /* loaded from: classes7.dex */
    public static final class NoMatcher extends StrMatcher {
        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            return 0;
        }
    }

    public abstract int isMatch(char[] cArr, int i, int i2, int i3);

    public static StrMatcher commaMatcher() {
        return COMMA_MATCHER;
    }

    public static StrMatcher tabMatcher() {
        return TAB_MATCHER;
    }

    public static StrMatcher spaceMatcher() {
        return SPACE_MATCHER;
    }

    public static StrMatcher splitMatcher() {
        return SPLIT_MATCHER;
    }

    public static StrMatcher trimMatcher() {
        return TRIM_MATCHER;
    }

    public static StrMatcher singleQuoteMatcher() {
        return SINGLE_QUOTE_MATCHER;
    }

    public static StrMatcher doubleQuoteMatcher() {
        return DOUBLE_QUOTE_MATCHER;
    }

    public static StrMatcher quoteMatcher() {
        return QUOTE_MATCHER;
    }

    public static StrMatcher noneMatcher() {
        return NONE_MATCHER;
    }

    public static StrMatcher charMatcher(char c) {
        return new CharMatcher(c);
    }

    public static StrMatcher charSetMatcher(char... cArr) {
        if (cArr == null || cArr.length == 0) {
            return NONE_MATCHER;
        }
        if (cArr.length == 1) {
            return new CharMatcher(cArr[0]);
        }
        return new CharSetMatcher(cArr);
    }

    public static StrMatcher charSetMatcher(String str) {
        if (StringUtils.isEmpty(str)) {
            return NONE_MATCHER;
        }
        if (str.length() == 1) {
            return new CharMatcher(str.charAt(0));
        }
        return new CharSetMatcher(str.toCharArray());
    }

    public static StrMatcher stringMatcher(String str) {
        if (StringUtils.isEmpty(str)) {
            return NONE_MATCHER;
        }
        return new StringMatcher(str);
    }

    public int isMatch(char[] cArr, int i) {
        return isMatch(cArr, i, 0, cArr.length);
    }

    /* loaded from: classes7.dex */
    public static final class CharSetMatcher extends StrMatcher {
        public final char[] chars;

        public CharSetMatcher(char[] cArr) {
            this.chars = ArraySorter.sort((char[]) cArr.clone());
        }

        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            return Arrays.binarySearch(this.chars, cArr[i]) >= 0 ? 1 : 0;
        }
    }

    /* loaded from: classes7.dex */
    public static final class CharMatcher extends StrMatcher {

        /* renamed from: ch */
        public final char f9907ch;

        public CharMatcher(char c) {
            this.f9907ch = c;
        }

        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            return this.f9907ch == cArr[i] ? 1 : 0;
        }
    }

    /* loaded from: classes7.dex */
    public static final class StringMatcher extends StrMatcher {
        public final char[] chars;

        public StringMatcher(String str) {
            this.chars = str.toCharArray();
        }

        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            int length = this.chars.length;
            if (i + length > i3) {
                return 0;
            }
            int i4 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i4 >= cArr2.length) {
                    return length;
                }
                if (cArr2[i4] != cArr[i]) {
                    return 0;
                }
                i4++;
                i++;
            }
        }

        public String toString() {
            return super.toString() + ' ' + Arrays.toString(this.chars);
        }
    }

    /* loaded from: classes7.dex */
    public static final class TrimMatcher extends StrMatcher {
        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            return cArr[i] <= ' ' ? 1 : 0;
        }
    }
}
