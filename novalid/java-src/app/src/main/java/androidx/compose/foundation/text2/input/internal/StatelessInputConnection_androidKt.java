package androidx.compose.foundation.text2.input.internal;

import android.view.inputmethod.ExtractedText;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.p003ui.text.TextRange;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: StatelessInputConnection.android.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"DEBUG_CLASS", "", "SIC_DEBUG", "", "getSIC_DEBUG$annotations", "()V", "TAG", "toExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class StatelessInputConnection_androidKt {

    @NotNull
    private static final String DEBUG_CLASS = "StatelessInputConnection";
    public static final boolean SIC_DEBUG = false;

    @NotNull
    private static final String TAG = "StatelessIC";

    @VisibleForTesting
    public static /* synthetic */ void getSIC_DEBUG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(TextFieldCharSequence textFieldCharSequence) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldCharSequence;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m13163getMinimpl(textFieldCharSequence.getSelectionInChars());
        extractedText.selectionEnd = TextRange.m13162getMaximpl(textFieldCharSequence.getSelectionInChars());
        extractedText.flags = !StringsKt__StringsKt.contains$default((CharSequence) textFieldCharSequence, '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }
}
