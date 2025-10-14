package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextPreparedSelection.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\b\u0000\u0018\u0000 O2\u00020\u0001:\u0001OB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ,\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001eH\u0082\bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u001f\u0010\"\u001a\u00020\u00002\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001eJ\u001f\u0010$\u001a\u00020\u00002\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001eJ\u0019\u0010%\u001a\u00020\u001d2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100&H\u0086\bJ\u0006\u0010'\u001a\u00020\u0000J\u0006\u0010(\u001a\u00020 J\u0006\u0010)\u001a\u00020 J\u0006\u0010*\u001a\u00020 J\u0006\u0010+\u001a\u00020 J\u0006\u0010,\u001a\u00020 J\u0006\u0010-\u001a\u00020 J\b\u0010.\u001a\u00020\u001aH\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020 H\u0002J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020\u0000J\u0006\u00103\u001a\u00020\u0000J\u0006\u00104\u001a\u00020\u0000J\b\u00105\u001a\u00020\u0000H\u0002J\u0006\u00106\u001a\u00020\u0000J\b\u00107\u001a\u00020\u0000H\u0002J\b\u00108\u001a\u00020\u0000H\u0002J\u0006\u00109\u001a\u00020\u0000J\b\u0010:\u001a\u00020\u0000H\u0002J\u0006\u0010;\u001a\u00020\u0000J\u0006\u0010<\u001a\u00020\u0000J\u0006\u0010=\u001a\u00020\u0000J\u0006\u0010>\u001a\u00020\u0000J\u0006\u0010?\u001a\u00020\u0000J\u0006\u0010@\u001a\u00020\u0000J\u0006\u0010A\u001a\u00020\u0000J\u0006\u0010B\u001a\u00020\u0000J\u0006\u0010C\u001a\u00020\u0000J\u0006\u0010D\u001a\u00020\u0000J\u0006\u0010E\u001a\u00020\u0000J\u0006\u0010F\u001a\u00020\u0000J\u0010\u0010G\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0002J\u0016\u0010H\u001a\u00020 *\u00020\u00052\b\b\u0002\u0010I\u001a\u00020 H\u0002J\u0016\u0010J\u001a\u00020 *\u00020\u00052\b\b\u0002\u0010I\u001a\u00020 H\u0002J\u0017\u0010K\u001a\u00020 *\u00020\u00052\b\b\u0002\u0010I\u001a\u00020 H\u0082\u0010J\u0017\u0010L\u001a\u00020 *\u00020\u00052\b\b\u0002\u0010I\u001a\u00020 H\u0082\u0010J\u0014\u0010M\u001a\u00020 *\u00020\u00052\u0006\u0010N\u001a\u00020 H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u0010X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;", "", "state", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "visibleTextLayoutHeight", "", "textPreparedSelectionState", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;FLandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;)V", "initialValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "selection", "Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", "J", "text", "", "applyIfNotEmpty", "resetCachedX", "", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "charOffset", "", TypedValues.CycleType.S_WAVE_OFFSET, "collapseLeftOr", "or", "collapseRightOr", "deleteIfSelectedOr", "Lkotlin/Function0;", "deselect", "getLineEndByOffset", "getLineStartByOffset", "getNextCharacterIndex", "getNextWordOffset", "getPrecedingCharacterIndex", "getPreviousWordOffset", "isLtr", "jumpByPagesOffset", "pagesAmount", "moveCursorDownByLine", "moveCursorDownByPage", "moveCursorLeft", "moveCursorLeftByWord", "moveCursorNext", "moveCursorNextByParagraph", "moveCursorNextByWord", "moveCursorPrev", "moveCursorPrevByParagraph", "moveCursorPrevByWord", "moveCursorRight", "moveCursorRightByWord", "moveCursorToEnd", "moveCursorToHome", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorUpByLine", "moveCursorUpByPage", "selectAll", "selectMovement", "setCursor", "getLineEndByOffsetForLayout", "currentOffset", "getLineStartByOffsetForLayout", "getNextWordOffsetForLayout", "getPrevWordOffsetForLayout", "jumpByLinesOffset", "linesAmount", "Companion", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n159#1,7:444\n159#1,7:451\n155#1,11:458\n155#1,11:469\n155#1,11:480\n155#1,11:491\n155#1,11:502\n155#1,11:513\n155#1,11:524\n155#1,11:535\n155#1,11:546\n155#1,11:557\n155#1,11:568\n155#1,11:579\n155#1,11:590\n155#1,11:601\n155#1,11:612\n155#1,11:623\n159#1,7:634\n159#1,7:641\n155#1,11:648\n155#1,11:659\n155#1,11:670\n155#1,11:681\n159#1,7:692\n495#2,4:433\n500#2:442\n129#3,5:437\n1#4:443\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n*L\n114#1:444,7\n121#1:451,7\n175#1:458,11\n179#1:469,11\n183#1:480,11\n191#1:491,11\n202#1:502,11\n217#1:513,11\n240#1:524,11\n245#1:535,11\n250#1:546,11\n254#1:557,11\n258#1:568,11\n266#1:579,11\n276#1:590,11\n282#1:601,11\n286#1:612,11\n294#1:623,11\n302#1:634,7\n306#1:641,7\n312#1:648,11\n318#1:659,11\n322#1:670,11\n330#1:681,11\n339#1:692,7\n87#1:433,4\n87#1:442\n87#1:437,5\n*E\n"})
/* loaded from: classes3.dex */
public final class TextFieldPreparedSelection {
    public static final int NoCharacterFound = -1;

    @NotNull
    private final TextFieldCharSequence initialValue;
    private long selection;

    @NotNull
    private final TransformedTextFieldState state;

    @NotNull
    private final String text;

    @NotNull
    private final TextLayoutResult textLayoutResult;

    @NotNull
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;
    public static final int $stable = 8;

    public TextFieldPreparedSelection(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextLayoutResult textLayoutResult, float f, @NotNull TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.visibleTextLayoutHeight = f;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                TextFieldCharSequence text = transformedTextFieldState.getText();
                snapshotCreateNonObservableSnapshot.dispose();
                this.initialValue = text;
                this.selection = text.getSelectionInChars();
                this.text = text.toString();
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } catch (Throwable th) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th;
        }
    }

    @NotNull
    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    /* renamed from: getSelection-d9O1mEE, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* renamed from: setSelection-5zc-tL8 */
    public final void m8699setSelection5zctL8(long j) {
        this.selection = j;
    }

    public final void deleteIfSelectedOr(@NotNull Function0<TextRange> block) {
        if (!TextRange.m13159getCollapsedimpl(getSelection())) {
            TransformedTextFieldState.m8712replaceTextSbBc2M$default(this.state, "", getSelection(), null, 4, null);
            return;
        }
        TextRange textRangeInvoke = block.invoke();
        if (textRangeInvoke != null) {
            TransformedTextFieldState.m8712replaceTextSbBc2M$default(this.state, "", textRangeInvoke.getPackedValue(), null, 4, null);
        }
    }

    private final int jumpByPagesOffset(int pagesAmount) {
        Rect rectTranslate = this.textLayoutResult.getCursorRect(TextRange.m13160getEndimpl(this.initialValue.getSelectionInChars())).translate(0.0f, this.visibleTextLayoutHeight * pagesAmount);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(rectTranslate.getTop()));
        if (Math.abs(rectTranslate.getTop() - lineBottom) > Math.abs(rectTranslate.getBottom() - lineBottom)) {
            return this.textLayoutResult.m13137getOffsetForPositionk4lQ0M(rectTranslate.m11134getTopLeftF1C5BW0());
        }
        return this.textLayoutResult.m13137getOffsetForPositionk4lQ0M(rectTranslate.m11127getBottomLeftF1C5BW0());
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean resetCachedX, Function1<? super TextFieldPreparedSelection, Unit> block) {
        if (resetCachedX) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            block.invoke(this);
        }
        return this;
    }

    public static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            function1.invoke(textFieldPreparedSelection);
        }
        return textFieldPreparedSelection;
    }

    private final void setCursor(int i) {
        this.selection = TextRangeKt.TextRange(i, i);
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m13160getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m13160getEndimpl(this.selection));
    }

    public final int getNextWordOffset() {
        return getNextWordOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    public final int getPreviousWordOffset() {
        return getPrevWordOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    public final int getLineStartByOffset() {
        return getLineStartByOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    public final int getLineEndByOffset() {
        return getLineEndByOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    private final boolean isLtr() {
        return this.textLayoutResult.getParagraphDirection(TextRange.m13160getEndimpl(this.selection)) == ResolvedTextDirection.Ltr;
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m13160getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i < this.initialValue.length()) {
            long jM13139getWordBoundaryjx7JFs = textLayoutResult.m13139getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m13160getEndimpl(jM13139getWordBoundaryjx7JFs) > i) {
                return TextRange.m13160getEndimpl(jM13139getWordBoundaryjx7JFs);
            }
            i++;
        }
        return this.initialValue.length();
    }

    public static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m13160getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i > 0) {
            long jM13139getWordBoundaryjx7JFs = textLayoutResult.m13139getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m13165getStartimpl(jM13139getWordBoundaryjx7JFs) < i) {
                return TextRange.m13165getStartimpl(jM13139getWordBoundaryjx7JFs);
            }
            i--;
        }
        return 0;
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m13163getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i));
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m13162getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true);
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int iM13160getEndimpl = TextRange.m13160getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(iM13160getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iM13160getEndimpl) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return this.text.length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m13137getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX, lineBottom));
    }

    private final int charOffset(int i) {
        return RangesKt___RangesKt.coerceAtMost(i, this.text.length() - 1);
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if (this.text.length() > 0) {
            setCursor(jumpByPagesOffset(-1));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if (this.text.length() > 0) {
            setCursor(jumpByPagesOffset(1));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(TextRange.m13160getEndimpl(this.selection));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorLeft() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorRight() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection collapseLeftOr(@NotNull Function1<? super TextFieldPreparedSelection, Unit> or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m13159getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m13163getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m13162getMaximpl(this.selection));
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection collapseRightOr(@NotNull Function1<? super TextFieldPreparedSelection, Unit> or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m13159getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m13162getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m13163getMinimpl(this.selection));
            }
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorPrev() {
        int precedingCharacterIndex;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorNext() {
        int nextCharacterIndex;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(0);
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(this.text.length());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorRightByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getNextWordOffset());
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getPreviousWordOffset());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m13163getMinimpl(this.selection));
            if (iFindParagraphStart == TextRange.m13163getMinimpl(this.selection) && iFindParagraphStart != 0) {
                iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, iFindParagraphStart - 1);
            }
            setCursor(iFindParagraphStart);
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m13162getMaximpl(this.selection));
            if (iFindParagraphEnd == TextRange.m13162getMaximpl(this.selection) && iFindParagraphEnd != this.text.length()) {
                iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, iFindParagraphEnd + 1);
            }
            setCursor(iFindParagraphEnd);
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorUpByLine() {
        if (this.text.length() > 0) {
            setCursor(jumpByLinesOffset(this.textLayoutResult, -1));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorDownByLine() {
        if (this.text.length() > 0) {
            setCursor(jumpByLinesOffset(this.textLayoutResult, 1));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getLineStartByOffset());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getLineEndByOffset());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection selectMovement() {
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m13165getStartimpl(this.initialValue.getSelectionInChars()), TextRange.m13160getEndimpl(this.selection));
        }
        return this;
    }
}
