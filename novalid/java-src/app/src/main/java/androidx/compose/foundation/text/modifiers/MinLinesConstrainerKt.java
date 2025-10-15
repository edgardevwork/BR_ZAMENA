package androidx.compose.foundation.text.modifiers;

import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: MinLinesConstrainer.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m7105d2 = {"DefaultWidthCharCount", "", "EmptyTextReplacement", "", "TwoLineTextReplacement", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class MinLinesConstrainerKt {
    private static final int DefaultWidthCharCount = 10;

    @NotNull
    private static final String EmptyTextReplacement;

    @NotNull
    private static final String TwoLineTextReplacement;

    static {
        String strRepeat = StringsKt__StringsJVMKt.repeat(DurationFormatUtils.f9908H, 10);
        EmptyTextReplacement = strRepeat;
        TwoLineTextReplacement = strRepeat + '\n' + strRepeat;
    }
}
