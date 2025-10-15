package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Locale.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"layoutDirection", "", "Ljava/util/Locale;", "getLayoutDirection", "(Ljava/util/Locale;)I", "core-ktx_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class LocaleKt {
    public static final int getLayoutDirection(@NotNull Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
