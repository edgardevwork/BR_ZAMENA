package io.appmetrica.analytics.coreutils.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m7105d2 = {"replaceFirstCharWithTitleCase", "", "locale", "Ljava/util/Locale;", "core-utils_release"}, m7106k = 2, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String str, @NotNull Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt__CharJVMKt.titlecase(cCharAt, locale) : String.valueOf(cCharAt)));
        sb.append(str.substring(1));
        return sb.toString();
    }
}
