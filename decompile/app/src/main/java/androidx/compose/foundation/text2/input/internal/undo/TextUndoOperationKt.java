package androidx.compose.foundation.text2.input.internal.undo;

import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.EditingBuffer;
import androidx.compose.p003ui.text.TextRange;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextUndoOperation.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, m7105d2 = {"redo", "", "Landroidx/compose/foundation/text2/input/TextFieldState;", BlackPassKeys.OP_PRICE_TITLE, "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "undo", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextUndoOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,179:1\n218#2,14:180\n218#2,14:194\n*S KotlinDebug\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt\n*L\n117#1:180,14\n128#1:194,14\n*E\n"})
/* loaded from: classes3.dex */
public final class TextUndoOperationKt {
    public static final void undo(@NotNull TextFieldState textFieldState, @NotNull TextUndoOperation textUndoOperation) {
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        mainBuffer.setSelection(TextRange.m13165getStartimpl(textUndoOperation.getPreSelection()), TextRange.m13160getEndimpl(textUndoOperation.getPreSelection()));
        TextFieldCharSequence textFieldCharSequenceM8647TextFieldCharSequence3r_uNRQ = TextFieldCharSequenceKt.m8647TextFieldCharSequence3r_uNRQ(textFieldState.getMainBuffer().toString(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA());
        textFieldState.setText(textFieldCharSequenceM8647TextFieldCharSequence3r_uNRQ);
        textFieldState.notifyIme(text, textFieldCharSequenceM8647TextFieldCharSequence3r_uNRQ);
    }

    public static final void redo(@NotNull TextFieldState textFieldState, @NotNull TextUndoOperation textUndoOperation) {
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        mainBuffer.setSelection(TextRange.m13165getStartimpl(textUndoOperation.getPostSelection()), TextRange.m13160getEndimpl(textUndoOperation.getPostSelection()));
        TextFieldCharSequence textFieldCharSequenceM8647TextFieldCharSequence3r_uNRQ = TextFieldCharSequenceKt.m8647TextFieldCharSequence3r_uNRQ(textFieldState.getMainBuffer().toString(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA());
        textFieldState.setText(textFieldCharSequenceM8647TextFieldCharSequence3r_uNRQ);
        textFieldState.notifyIme(text, textFieldCharSequenceM8647TextFieldCharSequence3r_uNRQ);
    }
}
