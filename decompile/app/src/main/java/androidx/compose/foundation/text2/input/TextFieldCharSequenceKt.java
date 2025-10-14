package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p003ui.text.TextRange;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldCharSequence.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\f\u0010\f\u001a\u00020\u0003*\u00020\u0001H\u0000\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a,\u0010\u0011\u001a\u00020\u0012*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m7105d2 = {"TextFieldCharSequence", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "TextFieldCharSequence-3r_uNRQ", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "", "TextFieldCharSequence-FDrldGo", "(Ljava/lang/String;J)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getSelectedText", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "toCharArray", "", FirebaseAnalytics.Param.DESTINATION, "", "destinationOffset", "sourceStartIndex", "sourceEndIndex", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldCharSequenceKt {
    /* renamed from: TextFieldCharSequence-FDrldGo$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m8650TextFieldCharSequenceFDrldGo$default(String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            j = TextRange.INSTANCE.m13170getZerod9O1mEE();
        }
        return m8649TextFieldCharSequenceFDrldGo(str, j);
    }

    @ExperimentalFoundationApi
    @NotNull
    /* renamed from: TextFieldCharSequence-FDrldGo, reason: not valid java name */
    public static final TextFieldCharSequence m8649TextFieldCharSequenceFDrldGo(@NotNull String str, long j) {
        return new TextFieldCharSequenceWrapper(str, j, null, null);
    }

    /* renamed from: TextFieldCharSequence-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m8648TextFieldCharSequence3r_uNRQ$default(CharSequence charSequence, long j, TextRange textRange, int i, Object obj) {
        if ((i & 4) != 0) {
            textRange = null;
        }
        return m8647TextFieldCharSequence3r_uNRQ(charSequence, j, textRange);
    }

    @NotNull
    /* renamed from: TextFieldCharSequence-3r_uNRQ, reason: not valid java name */
    public static final TextFieldCharSequence m8647TextFieldCharSequence3r_uNRQ(@NotNull CharSequence charSequence, long j, @Nullable TextRange textRange) {
        return new TextFieldCharSequenceWrapper(charSequence, j, textRange, null);
    }

    public static final void toCharArray(@NotNull TextFieldCharSequence textFieldCharSequence, @NotNull char[] cArr, int i, int i2, int i3) {
        Intrinsics.checkNotNull(textFieldCharSequence, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.TextFieldCharSequenceWrapper");
        ((TextFieldCharSequenceWrapper) textFieldCharSequence).toCharArray(cArr, i, i2, i3);
    }

    @NotNull
    public static final CharSequence getTextBeforeSelection(@NotNull TextFieldCharSequence textFieldCharSequence, int i) {
        return textFieldCharSequence.subSequence(Math.max(0, TextRange.m13163getMinimpl(textFieldCharSequence.getSelectionInChars()) - i), TextRange.m13163getMinimpl(textFieldCharSequence.getSelectionInChars()));
    }

    @NotNull
    public static final CharSequence getTextAfterSelection(@NotNull TextFieldCharSequence textFieldCharSequence, int i) {
        return textFieldCharSequence.subSequence(TextRange.m13162getMaximpl(textFieldCharSequence.getSelectionInChars()), Math.min(TextRange.m13162getMaximpl(textFieldCharSequence.getSelectionInChars()) + i, textFieldCharSequence.length()));
    }

    @NotNull
    public static final CharSequence getSelectedText(@NotNull TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m13163getMinimpl(textFieldCharSequence.getSelectionInChars()), TextRange.m13162getMaximpl(textFieldCharSequence.getSelectionInChars()));
    }
}
