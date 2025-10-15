package androidx.compose.p003ui.text.intl;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidLocaleDelegate.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, m7105d2 = {"Landroidx/compose/ui/text/intl/AndroidLocale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "javaLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "getJavaLocale", "()Ljava/util/Locale;", "language", "", "getLanguage", "()Ljava/lang/String;", "region", "getRegion", "script", "getScript", "toLanguageTag", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class AndroidLocale implements PlatformLocale {
    public static final int $stable = 8;

    @NotNull
    private final Locale javaLocale;

    public AndroidLocale(@NotNull Locale locale) {
        this.javaLocale = locale;
    }

    @NotNull
    public final Locale getJavaLocale() {
        return this.javaLocale;
    }

    @Override // androidx.compose.p003ui.text.intl.PlatformLocale
    @NotNull
    public String getLanguage() {
        return this.javaLocale.getLanguage();
    }

    @Override // androidx.compose.p003ui.text.intl.PlatformLocale
    @NotNull
    public String getScript() {
        return this.javaLocale.getScript();
    }

    @Override // androidx.compose.p003ui.text.intl.PlatformLocale
    @NotNull
    public String getRegion() {
        return this.javaLocale.getCountry();
    }

    @Override // androidx.compose.p003ui.text.intl.PlatformLocale
    @NotNull
    public String toLanguageTag() {
        return this.javaLocale.toLanguageTag();
    }
}
