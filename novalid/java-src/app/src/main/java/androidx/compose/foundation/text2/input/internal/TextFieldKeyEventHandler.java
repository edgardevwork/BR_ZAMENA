package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.input.key.KeyEventType;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldKeyEventHandler.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J:\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J2\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170$¢\u0006\u0002\b&H\u0082\bJ\u0013\u0010'\u001a\u0004\u0018\u00010(*\u00020\u0010H\u0002¢\u0006\u0002\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "", "()V", "deadKeyCombiner", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "preparedSelectionState", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;", "onKeyEvent", "", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "editable", "singleLine", "onSubmit", "Lkotlin/Function0;", "", "onKeyEvent-6ptp14s", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;ZZLkotlin/jvm/functions/Function0;)Z", "onPreKeyEvent", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "preparedSelectionContext", "state", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "getVisibleTextLayoutHeight", "", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)Ljava/lang/Float;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 4 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n229#1,9:284\n238#1,5:384\n197#2,6:257\n206#2:283\n197#2,6:330\n206#2:356\n197#2,6:357\n206#2:383\n186#3,20:263\n186#3,20:336\n186#3,20:363\n104#4,4:293\n109#4:299\n104#4,4:300\n109#4:305\n104#4,4:306\n109#4:311\n104#4,4:312\n109#4:317\n104#4,4:318\n109#4:323\n104#4,4:324\n109#4:329\n1#5:297\n1#5:298\n1#5:304\n1#5:310\n1#5:316\n1#5:322\n1#5:328\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler\n*L\n105#1:284,9\n105#1:384,5\n88#1:257,6\n88#1:283\n170#1:330,6\n170#1:356\n181#1:357,6\n181#1:383\n88#1:263,20\n170#1:336,20\n181#1:363,20\n127#1:293,4\n127#1:299\n137#1:300,4\n137#1:305\n145#1:306,4\n145#1:311\n151#1:312,4\n151#1:317\n157#1:318,4\n157#1:323\n163#1:324,4\n163#1:329\n127#1:298\n137#1:304\n145#1:310\n151#1:316\n157#1:322\n163#1:328\n*E\n"})
/* loaded from: classes3.dex */
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 8;

    @NotNull
    private final TextFieldPreparedSelectionState preparedSelectionState = new TextFieldPreparedSelectionState();

    @NotNull
    private final DeadKeyCombiner deadKeyCombiner = new DeadKeyCombiner();

    @NotNull
    private final KeyMapping keyMapping = KeyMapping_androidKt.getPlatformDefaultKeyMapping();

    /* compiled from: TextFieldKeyEventHandler.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KeyCommand.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[KeyCommand.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[KeyCommand.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[KeyCommand.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[KeyCommand.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[KeyCommand.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[KeyCommand.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[KeyCommand.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[KeyCommand.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[KeyCommand.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo8662onPreKeyEventMyFupTE(@NotNull KeyEvent event, @NotNull TransformedTextFieldState textFieldState, @NotNull TextFieldSelectionState textFieldSelectionState, @NotNull FocusManager focusManager, @NotNull SoftwareKeyboardController keyboardController) {
        if (TextRange.m13159getCollapsedimpl(textFieldState.getText().getSelectionInChars()) || !KeyEventHelpers_androidKt.m8419cancelsTextSelectionZmokQxo(event)) {
            return false;
        }
        textFieldSelectionState.deselect();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: onKeyEvent-6ptp14s, reason: not valid java name */
    public boolean m8691onKeyEvent6ptp14s(@NotNull KeyEvent event, @NotNull TransformedTextFieldState textFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, boolean editable, boolean singleLine, @NotNull Function0<Unit> onSubmit) {
        Float visibleTextLayoutHeight;
        TextRange textRangeM13153boximpl;
        Integer numM8418consumeZmokQxo;
        boolean z = false;
        if (!KeyEventType.m12341equalsimpl0(KeyEvent_androidKt.m12349getTypeZmokQxo(event), KeyEventType.INSTANCE.m12345getKeyDownCS__XNY())) {
            return false;
        }
        if (TextFieldKeyInput_androidKt.m8482isTypedEventZmokQxo(event) && (numM8418consumeZmokQxo = this.deadKeyCombiner.m8418consumeZmokQxo(event)) != null) {
            String string = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(2), numM8418consumeZmokQxo.intValue()).toString();
            if (!editable) {
                return false;
            }
            TextFieldState textFieldState2 = textFieldState.textFieldState;
            InputTransformation inputTransformation = textFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            TextFieldCharSequence text = textFieldState2.getText();
            textFieldState2.getMainBuffer().getChangeTracker().clearChanges();
            EditingBuffer mainBuffer = textFieldState2.getMainBuffer();
            mainBuffer.commitComposition();
            EditCommandKt.commitText(mainBuffer, string, 1);
            if (textFieldState2.getMainBuffer().getChangeTracker().getChangeCount() != 0 || !TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState2.getMainBuffer().m8666getSelectiond9O1mEE()) || !Intrinsics.areEqual(text.getCompositionInChars(), textFieldState2.getMainBuffer().m8665getCompositionMzsxiRA())) {
                textFieldState2.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
            }
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        KeyCommand keyCommandMo8420mapZmokQxo = this.keyMapping.mo8420mapZmokQxo(event);
        if (keyCommandMo8420mapZmokQxo == null || (keyCommandMo8420mapZmokQxo.getEditsText() && !editable)) {
            return false;
        }
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (visibleTextLayoutHeight = getVisibleTextLayoutHeight(textLayoutState)) == null) {
            return true;
        }
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(textFieldState, layoutResult, visibleTextLayoutHeight.floatValue(), this.preparedSelectionState);
        switch (WhenMappings.$EnumSwitchMapping$0[keyCommandMo8420mapZmokQxo.ordinal()]) {
            case 1:
                textFieldSelectionState.copy(false);
                z = true;
                break;
            case 2:
                textFieldSelectionState.paste();
                z = true;
                break;
            case 3:
                textFieldSelectionState.cut();
                z = true;
                break;
            case 4:
                textFieldPreparedSelection.collapseLeftOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler$onKeyEvent$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                        invoke2(textFieldPreparedSelection2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                        textFieldPreparedSelection2.moveCursorLeft();
                    }
                });
                z = true;
                break;
            case 5:
                textFieldPreparedSelection.collapseRightOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler$onKeyEvent$2$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                        invoke2(textFieldPreparedSelection2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                        textFieldPreparedSelection2.moveCursorRight();
                    }
                });
                z = true;
                break;
            case 6:
                textFieldPreparedSelection.moveCursorLeftByWord();
                z = true;
                break;
            case 7:
                textFieldPreparedSelection.moveCursorRightByWord();
                z = true;
                break;
            case 8:
                textFieldPreparedSelection.moveCursorPrevByParagraph();
                z = true;
                break;
            case 9:
                textFieldPreparedSelection.moveCursorNextByParagraph();
                z = true;
                break;
            case 10:
                textFieldPreparedSelection.moveCursorUpByLine();
                z = true;
                break;
            case 11:
                textFieldPreparedSelection.moveCursorDownByLine();
                z = true;
                break;
            case 12:
                textFieldPreparedSelection.moveCursorUpByPage();
                z = true;
                break;
            case 13:
                textFieldPreparedSelection.moveCursorDownByPage();
                z = true;
                break;
            case 14:
                textFieldPreparedSelection.moveCursorToLineStart();
                z = true;
                break;
            case 15:
                textFieldPreparedSelection.moveCursorToLineEnd();
                z = true;
                break;
            case 16:
                textFieldPreparedSelection.moveCursorToLineLeftSide();
                z = true;
                break;
            case 17:
                textFieldPreparedSelection.moveCursorToLineRightSide();
                z = true;
                break;
            case 18:
                textFieldPreparedSelection.moveCursorToHome();
                z = true;
                break;
            case 19:
                textFieldPreparedSelection.moveCursorToEnd();
                z = true;
                break;
            case 20:
                if (!TextRange.m13159getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    Integer numValueOf = Integer.valueOf(textFieldPreparedSelection.getPrecedingCharacterIndex());
                    if (numValueOf.intValue() == -1) {
                        numValueOf = null;
                    }
                    textRangeM13153boximpl = numValueOf != null ? TextRange.m13153boximpl(TextRangeKt.TextRange(numValueOf.intValue(), TextRange.m13160getEndimpl(textFieldPreparedSelection.getSelection()))) : null;
                    if (textRangeM13153boximpl != null) {
                        TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textRangeM13153boximpl.getPackedValue(), null, 4, null);
                    }
                }
                z = true;
                break;
            case 21:
                if (!TextRange.m13159getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    Integer numValueOf2 = Integer.valueOf(textFieldPreparedSelection.getNextCharacterIndex());
                    if (numValueOf2.intValue() == -1) {
                        numValueOf2 = null;
                    }
                    textRangeM13153boximpl = numValueOf2 != null ? TextRange.m13153boximpl(TextRangeKt.TextRange(TextRange.m13165getStartimpl(textFieldPreparedSelection.getSelection()), numValueOf2.intValue())) : null;
                    if (textRangeM13153boximpl != null) {
                        TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textRangeM13153boximpl.getPackedValue(), null, 4, null);
                    }
                }
                z = true;
                break;
            case 22:
                if (!TextRange.m13159getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(textFieldPreparedSelection.getPreviousWordOffset(), TextRange.m13160getEndimpl(textFieldPreparedSelection.getSelection())), null, 4, null);
                }
                z = true;
                break;
            case 23:
                if (!TextRange.m13159getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(TextRange.m13165getStartimpl(textFieldPreparedSelection.getSelection()), textFieldPreparedSelection.getNextWordOffset()), null, 4, null);
                }
                z = true;
                break;
            case 24:
                if (!TextRange.m13159getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(textFieldPreparedSelection.getLineStartByOffset(), TextRange.m13160getEndimpl(textFieldPreparedSelection.getSelection())), null, 4, null);
                }
                z = true;
                break;
            case 25:
                if (!TextRange.m13159getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.getSelection(), null, 4, null);
                } else {
                    TransformedTextFieldState.m8712replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(TextRange.m13165getStartimpl(textFieldPreparedSelection.getSelection()), textFieldPreparedSelection.getLineEndByOffset()), null, 4, null);
                }
                z = true;
                break;
            case 26:
                if (!singleLine) {
                    TextFieldState textFieldState3 = textFieldState.textFieldState;
                    InputTransformation inputTransformation2 = textFieldState.inputTransformation;
                    TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = TextFieldEditUndoBehavior.MergeIfPossible;
                    TextFieldCharSequence text2 = textFieldState3.getText();
                    textFieldState3.getMainBuffer().getChangeTracker().clearChanges();
                    EditingBuffer mainBuffer2 = textFieldState3.getMainBuffer();
                    mainBuffer2.commitComposition();
                    EditCommandKt.commitText(mainBuffer2, StringUtils.f9903LF, 1);
                    if (textFieldState3.getMainBuffer().getChangeTracker().getChangeCount() != 0 || !TextRange.m13158equalsimpl0(text2.getSelectionInChars(), textFieldState3.getMainBuffer().m8666getSelectiond9O1mEE()) || !Intrinsics.areEqual(text2.getCompositionInChars(), textFieldState3.getMainBuffer().m8665getCompositionMzsxiRA())) {
                        textFieldState3.commitEditAsUser(text2, inputTransformation2, true, textFieldEditUndoBehavior2);
                    }
                } else {
                    onSubmit.invoke();
                }
                z = true;
                break;
            case 27:
                if (!singleLine) {
                    TextFieldState textFieldState4 = textFieldState.textFieldState;
                    InputTransformation inputTransformation3 = textFieldState.inputTransformation;
                    TextFieldEditUndoBehavior textFieldEditUndoBehavior3 = TextFieldEditUndoBehavior.MergeIfPossible;
                    TextFieldCharSequence text3 = textFieldState4.getText();
                    textFieldState4.getMainBuffer().getChangeTracker().clearChanges();
                    EditingBuffer mainBuffer3 = textFieldState4.getMainBuffer();
                    mainBuffer3.commitComposition();
                    EditCommandKt.commitText(mainBuffer3, "\t", 1);
                    if (textFieldState4.getMainBuffer().getChangeTracker().getChangeCount() != 0 || !TextRange.m13158equalsimpl0(text3.getSelectionInChars(), textFieldState4.getMainBuffer().m8666getSelectiond9O1mEE()) || !Intrinsics.areEqual(text3.getCompositionInChars(), textFieldState4.getMainBuffer().m8665getCompositionMzsxiRA())) {
                        textFieldState4.commitEditAsUser(text3, inputTransformation3, true, textFieldEditUndoBehavior3);
                    }
                    z = true;
                    break;
                }
                break;
            case 28:
                textFieldPreparedSelection.selectAll();
                z = true;
                break;
            case 29:
                textFieldPreparedSelection.moveCursorLeft().selectMovement();
                z = true;
                break;
            case 30:
                textFieldPreparedSelection.moveCursorRight().selectMovement();
                z = true;
                break;
            case 31:
                textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                z = true;
                break;
            case 32:
                textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                z = true;
                break;
            case 33:
                textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                z = true;
                break;
            case 34:
                textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                z = true;
                break;
            case 35:
                textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                z = true;
                break;
            case 36:
                textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                z = true;
                break;
            case 37:
                textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                z = true;
                break;
            case 38:
                textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                z = true;
                break;
            case 39:
                textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                z = true;
                break;
            case 40:
                textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                z = true;
                break;
            case 41:
                textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                z = true;
                break;
            case 42:
                textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                z = true;
                break;
            case 43:
                textFieldPreparedSelection.moveCursorToHome().selectMovement();
                z = true;
                break;
            case 44:
                textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                z = true;
                break;
            case 45:
                textFieldPreparedSelection.deselect();
                z = true;
                break;
            case 46:
                textFieldState.undo();
                z = true;
                break;
            case 47:
                textFieldState.redo();
                z = true;
                break;
            case 48:
                KeyEventHelpers_androidKt.showCharacterPalette();
                z = true;
                break;
            default:
                z = true;
                break;
        }
        if (!TextRange.m13158equalsimpl0(textFieldPreparedSelection.getSelection(), textFieldPreparedSelection.getInitialValue().getSelectionInChars())) {
            textFieldState.m8717selectCharsIn5zctL8(textFieldPreparedSelection.getSelection());
        }
        return z;
    }

    private final void preparedSelectionContext(TransformedTextFieldState state, TextLayoutState textLayoutState, Function1<? super TextFieldPreparedSelection, Unit> block) {
        Float visibleTextLayoutHeight;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (visibleTextLayoutHeight = getVisibleTextLayoutHeight(textLayoutState)) == null) {
            return;
        }
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(state, layoutResult, visibleTextLayoutHeight.floatValue(), this.preparedSelectionState);
        block.invoke(textFieldPreparedSelection);
        if (TextRange.m13158equalsimpl0(textFieldPreparedSelection.getSelection(), textFieldPreparedSelection.getInitialValue().getSelectionInChars())) {
            return;
        }
        state.m8717selectCharsIn5zctL8(textFieldPreparedSelection.getSelection());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Float getVisibleTextLayoutHeight(TextLayoutState textLayoutState) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return null;
        }
        if (!textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        if (textLayoutNodeCoordinates == null) {
            return null;
        }
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates == null) {
            rectLocalBoundingBoxOf$default = null;
        } else {
            if (!decoratorNodeCoordinates.isAttached()) {
                decoratorNodeCoordinates = null;
            }
            if (decoratorNodeCoordinates != null) {
                rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
            }
        }
        if (rectLocalBoundingBoxOf$default != null) {
            return Float.valueOf(Size.m11165getHeightimpl(rectLocalBoundingBoxOf$default.m11132getSizeNHjbRc()));
        }
        return null;
    }
}
