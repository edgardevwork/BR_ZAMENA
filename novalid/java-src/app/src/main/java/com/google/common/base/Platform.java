package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Platform {
    public static final Logger logger = Logger.getLogger(Platform.class.getName());
    public static final PatternCompiler patternCompiler = loadPatternCompiler();

    public static CharMatcher precomputeCharMatcher(CharMatcher matcher) {
        return matcher.precomputedInternal();
    }

    public static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> enumClass, String value) {
        WeakReference<? extends Enum<?>> weakReference = Enums.getEnumConstants(enumClass).get(value);
        return weakReference == null ? Optional.absent() : Optional.m1145of(enumClass.cast(weakReference.get()));
    }

    public static String formatCompact4Digits(double value) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(value));
    }

    public static boolean stringIsNullOrEmpty(@CheckForNull String string) {
        return string == null || string.isEmpty();
    }

    public static String nullToEmpty(@CheckForNull String string) {
        return string == null ? "" : string;
    }

    @CheckForNull
    public static String emptyToNull(@CheckForNull String string) {
        if (stringIsNullOrEmpty(string)) {
            return null;
        }
        return string;
    }

    public static CommonPattern compilePattern(String pattern) {
        Preconditions.checkNotNull(pattern);
        return patternCompiler.compile(pattern);
    }

    public static boolean patternCompilerIsPcreLike() {
        return patternCompiler.isPcreLike();
    }

    public static PatternCompiler loadPatternCompiler() {
        return new JdkPatternCompiler();
    }

    public static void logPatternCompilerError(ServiceConfigurationError e) {
        logger.log(Level.WARNING, "Error loading regex compiler, falling back to next option", (Throwable) e);
    }

    /* loaded from: classes8.dex */
    public static final class JdkPatternCompiler implements PatternCompiler {
        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
            return true;
        }

        public JdkPatternCompiler() {
        }

        public /* synthetic */ JdkPatternCompiler(C71671 c71671) {
            this();
        }

        @Override // com.google.common.base.PatternCompiler
        public CommonPattern compile(String pattern) {
            return new JdkPattern(Pattern.compile(pattern));
        }
    }
}
