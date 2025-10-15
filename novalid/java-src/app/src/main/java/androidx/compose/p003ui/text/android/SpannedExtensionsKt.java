package androidx.compose.p003ui.text.android;

import android.text.Spanned;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpannedExtensions.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\b"}, m7105d2 = {"hasSpan", "", "Landroid/text/Spanned;", "clazz", "Ljava/lang/Class;", "startInclusive", "", "endExclusive", "ui-text_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class SpannedExtensionsKt {
    public static final boolean hasSpan(@NotNull Spanned spanned, @NotNull Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean hasSpan(@NotNull Spanned spanned, @NotNull Class<?> cls, int i, int i2) {
        return spanned.nextSpanTransition(i - 1, i2, cls) != i2;
    }
}
