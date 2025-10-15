package com.google.common.base;

import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOWER_UNDERSCORE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class CaseFormat {
    public static final /* synthetic */ CaseFormat[] $VALUES;
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN = new CaseFormat("LOWER_HYPHEN", 0, CharMatcher.m1141is('-'), "-") { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String word) {
            return Ascii.toLowerCase(word);
        }

        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat format, String s) {
            if (format == CaseFormat.LOWER_UNDERSCORE) {
                return s.replace('-', LauncherConstants.UNDERSCORE_CHAR);
            }
            if (format == CaseFormat.UPPER_UNDERSCORE) {
                return Ascii.toUpperCase(s.replace('-', LauncherConstants.UNDERSCORE_CHAR));
            }
            return super.convert(format, s);
        }
    };
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    public final CharMatcher wordBoundary;
    public final String wordSeparator;

    public abstract String normalizeWord(String word);

    public static /* synthetic */ CaseFormat[] $values() {
        return new CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    public static CaseFormat valueOf(String name) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, name);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }

    static {
        CharMatcher charMatcherM1141is = CharMatcher.m1141is(LauncherConstants.UNDERSCORE_CHAR);
        String str = LauncherConstants.UNDERSCORE_STRING;
        LOWER_UNDERSCORE = new CaseFormat("LOWER_UNDERSCORE", 1, charMatcherM1141is, str) { // from class: com.google.common.base.CaseFormat.2
            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String word) {
                return Ascii.toLowerCase(word);
            }

            @Override // com.google.common.base.CaseFormat
            public String convert(CaseFormat format, String s) {
                if (format == CaseFormat.LOWER_HYPHEN) {
                    return s.replace(LauncherConstants.UNDERSCORE_CHAR, '-');
                }
                if (format == CaseFormat.UPPER_UNDERSCORE) {
                    return Ascii.toUpperCase(s);
                }
                return super.convert(format, s);
            }
        };
        String str2 = "";
        LOWER_CAMEL = new CaseFormat("LOWER_CAMEL", 2, CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.3
            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String word) {
                return CaseFormat.firstCharOnlyToUpper(word);
            }

            @Override // com.google.common.base.CaseFormat
            public String normalizeFirstWord(String word) {
                return Ascii.toLowerCase(word);
            }
        };
        UPPER_CAMEL = new CaseFormat("UPPER_CAMEL", 3, CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.4
            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String word) {
                return CaseFormat.firstCharOnlyToUpper(word);
            }
        };
        UPPER_UNDERSCORE = new CaseFormat("UPPER_UNDERSCORE", 4, CharMatcher.m1141is(LauncherConstants.UNDERSCORE_CHAR), str) { // from class: com.google.common.base.CaseFormat.5
            @Override // com.google.common.base.CaseFormat
            public String normalizeWord(String word) {
                return Ascii.toUpperCase(word);
            }

            @Override // com.google.common.base.CaseFormat
            public String convert(CaseFormat format, String s) {
                if (format == CaseFormat.LOWER_HYPHEN) {
                    return Ascii.toLowerCase(s.replace(LauncherConstants.UNDERSCORE_CHAR, '-'));
                }
                if (format == CaseFormat.LOWER_UNDERSCORE) {
                    return Ascii.toLowerCase(s);
                }
                return super.convert(format, s);
            }
        };
        $VALUES = $values();
    }

    public CaseFormat(String $enum$name, int $enum$ordinal, CharMatcher wordBoundary, String wordSeparator) {
        this.wordBoundary = wordBoundary;
        this.wordSeparator = wordSeparator;
    }

    /* renamed from: to */
    public final String m1140to(CaseFormat format, String str) {
        Preconditions.checkNotNull(format);
        Preconditions.checkNotNull(str);
        return format == this ? str : convert(format, str);
    }

    public String convert(CaseFormat format, String s) {
        StringBuilder sb = null;
        int length = 0;
        int iIndexIn = -1;
        while (true) {
            iIndexIn = this.wordBoundary.indexIn(s, iIndexIn + 1);
            if (iIndexIn == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder(s.length() + (format.wordSeparator.length() * 4));
                sb.append(format.normalizeFirstWord(s.substring(length, iIndexIn)));
            } else {
                java.util.Objects.requireNonNull(sb);
                sb.append(format.normalizeWord(s.substring(length, iIndexIn)));
            }
            sb.append(format.wordSeparator);
            length = this.wordSeparator.length() + iIndexIn;
        }
        if (length == 0) {
            return format.normalizeFirstWord(s);
        }
        java.util.Objects.requireNonNull(sb);
        sb.append(format.normalizeWord(s.substring(length)));
        return sb.toString();
    }

    public Converter<String, String> converterTo(CaseFormat targetFormat) {
        return new StringConverter(this, targetFormat);
    }

    /* loaded from: classes8.dex */
    public static final class StringConverter extends Converter<String, String> implements Serializable {
        public static final long serialVersionUID = 0;
        public final CaseFormat sourceFormat;
        public final CaseFormat targetFormat;

        public StringConverter(CaseFormat sourceFormat, CaseFormat targetFormat) {
            this.sourceFormat = (CaseFormat) Preconditions.checkNotNull(sourceFormat);
            this.targetFormat = (CaseFormat) Preconditions.checkNotNull(targetFormat);
        }

        @Override // com.google.common.base.Converter
        public String doForward(String s) {
            return this.sourceFormat.m1140to(this.targetFormat, s);
        }

        @Override // com.google.common.base.Converter
        public String doBackward(String s) {
            return this.targetFormat.m1140to(this.sourceFormat, s);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@CheckForNull Object object) {
            if (!(object instanceof StringConverter)) {
                return false;
            }
            StringConverter stringConverter = (StringConverter) object;
            return this.sourceFormat.equals(stringConverter.sourceFormat) && this.targetFormat.equals(stringConverter.targetFormat);
        }

        public int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        public String toString() {
            return this.sourceFormat + ".converterTo(" + this.targetFormat + ")";
        }
    }

    public String normalizeFirstWord(String word) {
        return normalizeWord(word);
    }

    public static String firstCharOnlyToUpper(String word) {
        if (word.isEmpty()) {
            return word;
        }
        return Ascii.toUpperCase(word.charAt(0)) + Ascii.toLowerCase(word.substring(1));
    }
}
