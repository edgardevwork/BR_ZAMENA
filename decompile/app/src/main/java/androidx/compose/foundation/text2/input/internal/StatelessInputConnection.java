package androidx.compose.foundation.text2.input.internal;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StatelessInputConnection.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0011\u001a\u00020\u000b2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u0006H\u0016J\u0018\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0016J\u0018\u0010*\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0016J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016J\u001a\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\n\u00104\u001a\u0004\u0018\u000105H\u0016J\u0012\u00106\u001a\u0004\u0018\u00010%2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0018\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0018\u00109\u001a\u00020%2\u0006\u00108\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0010\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0006H\u0016J\u0010\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u0006H\u0016J\u001c\u0010A\u001a\u00020\u00142\b\u0010B\u001a\u0004\u0018\u00010<2\b\u0010C\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u0014H\u0016J\u0010\u0010F\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u0006H\u0016J\u0010\u0010H\u001a\u00020\u00142\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u0006H\u0002J\u0018\u0010M\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u0006H\u0016J\u001a\u0010P\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u0006H\u0016J\u0018\u0010Q\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00062\u0006\u0010O\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010\u0007\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006R"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/StatelessInputConnection;", "Landroid/view/inputmethod/InputConnection;", "session", "Landroidx/compose/foundation/text2/input/internal/TextInputSession;", "(Landroidx/compose/foundation/text2/input/internal/TextInputSession;)V", "batchDepth", "", "editCommands", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "", "Lkotlin/ExtensionFunctionType;", "text", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "addEditCommandWithBatch", "editCommand", "beginBatchEdit", "", "beginBatchEditInternal", "clearMetaKeyStates", "states", "closeConnection", "commitCompletion", "Landroid/view/inputmethod/CompletionInfo;", "commitContent", "inputContentInfo", "Landroid/view/inputmethod/InputContentInfo;", "flags", "opts", "Landroid/os/Bundle;", "commitCorrection", "correctionInfo", "Landroid/view/inputmethod/CorrectionInfo;", "commitText", "", "newCursorPosition", "deleteSurroundingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "endBatchEdit", "endBatchEditInternal", "finishComposingText", "getCursorCapsMode", "reqModes", "getExtractedText", "Landroid/view/inputmethod/ExtractedText;", "request", "Landroid/view/inputmethod/ExtractedTextRequest;", "getHandler", "Landroid/os/Handler;", "getSelectedText", "getTextAfterCursor", "maxChars", "getTextBeforeCursor", "logDebug", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "performContextMenuAction", "id", "performEditorAction", "editorAction", "performPrivateCommand", "action", "data", "reportFullscreenMode", "enabled", "requestCursorUpdates", "cursorUpdateMode", "sendKeyEvent", "event", "Landroid/view/KeyEvent;", "sendSynthesizedKeyEvent", "code", "setComposingRegion", TtmlNode.START, "end", "setComposingText", "setSelection", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,372:1\n1208#2:373\n1187#2,2:374\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection\n*L\n72#1:373\n72#1:374,2\n*E\n"})
/* loaded from: classes3.dex */
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 8;
    private int batchDepth;

    @NotNull
    private final MutableVector<Function1<EditingBuffer, Unit>> editCommands = new MutableVector<>(new Function1[16], 0);

    @NotNull
    private final TextInputSession session;

    private final void logDebug(String message) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        return true;
    }

    public StatelessInputConnection(@NotNull TextInputSession textInputSession) {
        this.session = textInputSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldCharSequence getText() {
        return this.session.getText();
    }

    private final void addEditCommandWithBatch(Function1<? super EditingBuffer, Unit> editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && this.editCommands.isNotEmpty()) {
            this.session.requestEdit(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StatelessInputConnection.endBatchEditInternal.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                    invoke2(editingBuffer);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull EditingBuffer editingBuffer) {
                    MutableVector mutableVector = StatelessInputConnection.this.editCommands;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        Object[] content = mutableVector.getContent();
                        int i2 = 0;
                        do {
                            ((Function1) content[i2]).invoke(editingBuffer);
                            i2++;
                        } while (i2 < size);
                    }
                }
            });
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        logDebug("closeConnection()");
        this.editCommands.clear();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable final CharSequence text, final int newCursorPosition) {
        logDebug("commitText(\"" + ((Object) text) + "\", " + newCursorPosition + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StatelessInputConnection.commitText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull EditingBuffer editingBuffer) {
                EditCommandKt.commitText(editingBuffer, String.valueOf(text), newCursorPosition);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(final int start, final int end) {
        logDebug("setComposingRegion(" + start + ", " + end + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StatelessInputConnection.setComposingRegion.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull EditingBuffer editingBuffer) {
                EditCommandKt.setComposingRegion(editingBuffer, start, end);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable final CharSequence text, final int newCursorPosition) {
        logDebug("setComposingText(\"" + ((Object) text) + "\", " + newCursorPosition + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StatelessInputConnection.setComposingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull EditingBuffer editingBuffer) {
                EditCommandKt.setComposingText(editingBuffer, String.valueOf(text), newCursorPosition);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(final int beforeLength, final int afterLength) {
        logDebug("deleteSurroundingTextInCodePoints(" + beforeLength + ", " + afterLength + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StatelessInputConnection.deleteSurroundingTextInCodePoints.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull EditingBuffer editingBuffer) {
                EditCommandKt.deleteSurroundingTextInCodePoints(editingBuffer, beforeLength, afterLength);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(final int beforeLength, final int afterLength) {
        logDebug("deleteSurroundingText(" + beforeLength + ", " + afterLength + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StatelessInputConnection.deleteSurroundingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull EditingBuffer editingBuffer) {
                EditCommandKt.deleteSurroundingText(editingBuffer, beforeLength, afterLength);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(final int start, final int end) {
        logDebug("setSelection(" + start + ", " + end + ')');
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StatelessInputConnection.setSelection.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull EditingBuffer editingBuffer) {
                editingBuffer.setSelection(start, end);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        logDebug("finishComposingText()");
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StatelessInputConnection.finishComposingText.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull EditingBuffer editingBuffer) {
                EditCommandKt.finishComposingText(editingBuffer);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent event) {
        logDebug("sendKeyEvent(" + event + ')');
        this.session.sendKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        String string = TextFieldCharSequenceKt.getTextBeforeSelection(getText(), maxChars).toString();
        logDebug("getTextBeforeCursor(" + maxChars + ", " + flags + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        String string = TextFieldCharSequenceKt.getTextAfterSelection(getText(), maxChars).toString();
        logDebug("getTextAfterCursor(" + maxChars + ", " + flags + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int flags) {
        String string = TextRange.m13159getCollapsedimpl(getText().getSelectionInChars()) ? null : TextFieldCharSequenceKt.getSelectedText(getText()).toString();
        logDebug("getSelectedText(" + flags + "): " + ((Object) string));
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        logDebug("requestCursorUpdates(" + cursorUpdateMode + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest request, int flags) {
        logDebug("getExtractedText(" + request + ", " + flags + ')');
        return StatelessInputConnection_androidKt.toExtractedText(getText());
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        logDebug("getCursorCapsMode(" + reqModes + ')');
        return TextUtils.getCapsMode(getText(), TextRange.m13163getMinimpl(getText().getSelectionInChars()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        logDebug("performContextMenuAction(" + id + ')');
        switch (id) {
            case R.id.selectAll:
                addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StatelessInputConnection.performContextMenuAction.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                        invoke2(editingBuffer);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull EditingBuffer editingBuffer) {
                        editingBuffer.setSelection(0, StatelessInputConnection.this.getText().length());
                    }
                });
                break;
            case R.id.cut:
                sendSynthesizedKeyEvent(277);
                break;
            case R.id.copy:
                sendSynthesizedKeyEvent(278);
                break;
            case R.id.paste:
                sendSynthesizedKeyEvent(279);
                break;
        }
        return false;
    }

    private final void sendSynthesizedKeyEvent(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int iM13341getDefaulteUduSuo;
        logDebug("performEditorAction(" + editorAction + ')');
        if (editorAction == 0) {
            iM13341getDefaulteUduSuo = ImeAction.INSTANCE.m13341getDefaulteUduSuo();
        } else {
            switch (editorAction) {
                case 2:
                    iM13341getDefaulteUduSuo = ImeAction.INSTANCE.m13343getGoeUduSuo();
                    break;
                case 3:
                    iM13341getDefaulteUduSuo = ImeAction.INSTANCE.m13347getSearcheUduSuo();
                    break;
                case 4:
                    iM13341getDefaulteUduSuo = ImeAction.INSTANCE.m13348getSendeUduSuo();
                    break;
                case 5:
                    iM13341getDefaulteUduSuo = ImeAction.INSTANCE.m13344getNexteUduSuo();
                    break;
                case 6:
                    iM13341getDefaulteUduSuo = ImeAction.INSTANCE.m13342getDoneeUduSuo();
                    break;
                case 7:
                    iM13341getDefaulteUduSuo = ImeAction.INSTANCE.m13346getPreviouseUduSuo();
                    break;
                default:
                    logDebug("IME sent an unrecognized editor action: " + editorAction);
                    iM13341getDefaulteUduSuo = ImeAction.INSTANCE.m13341getDefaulteUduSuo();
                    break;
            }
        }
        this.session.mo8664onImeActionKlQnJC8(iM13341getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo text) {
        StringBuilder sb = new StringBuilder();
        sb.append("commitCompletion(");
        sb.append((Object) (text != null ? text.getText() : null));
        sb.append(')');
        logDebug(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        logDebug("clearMetaKeyStates(" + states + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        logDebug("reportFullscreenMode(" + enabled + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String action, @Nullable Bundle data) {
        logDebug("performPrivateCommand(" + action + ", " + data + ')');
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int flags, @Nullable Bundle opts) {
        logDebug("commitContent(" + inputContentInfo + ", " + flags + ", " + opts + ')');
        return false;
    }
}
