package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: String.kt */
@Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0086\b¨\u0006\u0002"}, m7105d2 = {"htmlEncode", "", "core-ktx_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class StringKt {
    @NotNull
    public static final String htmlEncode(@NotNull String str) {
        return TextUtils.htmlEncode(str);
    }
}
