package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.CharCompanionObject;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public final class Escapers {
    public static final Escaper NULL_ESCAPER = new CharEscaper() { // from class: com.google.common.escape.Escapers.1
        @Override // com.google.common.escape.CharEscaper
        @CheckForNull
        public char[] escape(char c) {
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String string) {
            return (String) Preconditions.checkNotNull(string);
        }
    };

    public static Escaper nullEscaper() {
        return NULL_ESCAPER;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        public final Map<Character, String> replacementMap;
        public char safeMax;
        public char safeMin;

        @CheckForNull
        public String unsafeReplacement;

        public Builder() {
            this.replacementMap = new HashMap();
            this.safeMin = (char) 0;
            this.safeMax = CharCompanionObject.MAX_VALUE;
            this.unsafeReplacement = null;
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char safeMin, char safeMax) {
            this.safeMin = safeMin;
            this.safeMax = safeMax;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(String unsafeReplacement) {
            this.unsafeReplacement = unsafeReplacement;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addEscape(char c, String replacement) {
            Preconditions.checkNotNull(replacement);
            this.replacementMap.put(Character.valueOf(c), replacement);
            return this;
        }

        public Escaper build() {
            return new ArrayBasedCharEscaper(this.replacementMap, this.safeMin, this.safeMax) { // from class: com.google.common.escape.Escapers.Builder.1

                @CheckForNull
                public final char[] replacementChars;

                {
                    this.replacementChars = Builder.this.unsafeReplacement != null ? Builder.this.unsafeReplacement.toCharArray() : null;
                }

                @Override // com.google.common.escape.ArrayBasedCharEscaper
                @CheckForNull
                public char[] escapeUnsafe(char c) {
                    return this.replacementChars;
                }
            };
        }
    }

    public static UnicodeEscaper asUnicodeEscaper(Escaper escaper) {
        Preconditions.checkNotNull(escaper);
        if (escaper instanceof UnicodeEscaper) {
            return (UnicodeEscaper) escaper;
        }
        if (escaper instanceof CharEscaper) {
            return wrap((CharEscaper) escaper);
        }
        throw new IllegalArgumentException("Cannot create a UnicodeEscaper from: " + escaper.getClass().getName());
    }

    @CheckForNull
    public static String computeReplacement(CharEscaper escaper, char c) {
        return stringOrNull(escaper.escape(c));
    }

    @CheckForNull
    public static String computeReplacement(UnicodeEscaper escaper, int cp) {
        return stringOrNull(escaper.escape(cp));
    }

    @CheckForNull
    public static String stringOrNull(@CheckForNull char[] in) {
        if (in == null) {
            return null;
        }
        return new String(in);
    }

    public static UnicodeEscaper wrap(final CharEscaper escaper) {
        return new UnicodeEscaper() { // from class: com.google.common.escape.Escapers.2
            @Override // com.google.common.escape.UnicodeEscaper
            @CheckForNull
            public char[] escape(int cp) {
                if (cp < 65536) {
                    return escaper.escape((char) cp);
                }
                char[] cArr = new char[2];
                Character.toChars(cp, cArr, 0);
                char[] cArrEscape = escaper.escape(cArr[0]);
                char[] cArrEscape2 = escaper.escape(cArr[1]);
                if (cArrEscape == null && cArrEscape2 == null) {
                    return null;
                }
                int length = cArrEscape != null ? cArrEscape.length : 1;
                char[] cArr2 = new char[(cArrEscape2 != null ? cArrEscape2.length : 1) + length];
                if (cArrEscape != null) {
                    for (int i = 0; i < cArrEscape.length; i++) {
                        cArr2[i] = cArrEscape[i];
                    }
                } else {
                    cArr2[0] = cArr[0];
                }
                if (cArrEscape2 != null) {
                    for (int i2 = 0; i2 < cArrEscape2.length; i2++) {
                        cArr2[length + i2] = cArrEscape2[i2];
                    }
                } else {
                    cArr2[length] = cArr[1];
                }
                return cArr2;
            }
        };
    }
}
