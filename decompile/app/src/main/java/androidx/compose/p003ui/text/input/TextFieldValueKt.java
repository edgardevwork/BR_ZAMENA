package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldValue.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, m7105d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class TextFieldValueKt {
    @NotNull
    public static final AnnotatedString getTextBeforeSelection(@NotNull TextFieldValue textFieldValue, int i) {
        return textFieldValue.getText().subSequence(Math.max(0, TextRange.m13163getMinimpl(textFieldValue.getSelection()) - i), TextRange.m13163getMinimpl(textFieldValue.getSelection()));
    }

    @NotNull
    public static final AnnotatedString getTextAfterSelection(@NotNull TextFieldValue textFieldValue, int i) {
        return textFieldValue.getText().subSequence(TextRange.m13162getMaximpl(textFieldValue.getSelection()), Math.min(TextRange.m13162getMaximpl(textFieldValue.getSelection()) + i, textFieldValue.getText().length()));
    }

    @NotNull
    public static final AnnotatedString getSelectedText(@NotNull TextFieldValue textFieldValue) {
        return textFieldValue.getText().m13028subSequence5zctL8(textFieldValue.getSelection());
    }
}
