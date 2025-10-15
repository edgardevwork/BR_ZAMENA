package androidx.compose.foundation.text2.input.internal;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditingBuffer.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002J\u0006\u0010,\u001a\u00020)J\u0016\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011J\u0011\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0011H\u0086\u0002J\u0006\u00101\u001a\u000202J\u001e\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u000204J\u0016\u00105\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011J\u0016\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011J\u0006\u00107\u001a\u00020\u0007J\b\u00108\u001a\u00020\u0003H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u001aR$\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "changeTracker", "Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "getChangeTracker", "()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "composition", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "<set-?>", "", "compositionEnd", "getCompositionEnd", "()I", "compositionStart", "getCompositionStart", "cursor", "getCursor", "setCursor", "(I)V", "gapBuffer", "Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer;", CacheFileMetadataIndex.COLUMN_LENGTH, "getLength", "getSelection-d9O1mEE", "()J", "value", "selectionEnd", "getSelectionEnd", "setSelectionEnd", "selectionStart", "getSelectionStart", "setSelectionStart", "checkRange", "", TtmlNode.START, "end", "commitComposition", "delete", "get", "", FirebaseAnalytics.Param.INDEX, "hasComposition", "", "replace", "", "setComposition", "setSelection", "toAnnotatedString", "toString", "Companion", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/foundation/text2/input/internal/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes3.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;

    @NotNull
    private final ChangeTracker changeTracker;
    private int compositionEnd;
    private int compositionStart;

    @NotNull
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    public /* synthetic */ EditingBuffer(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.changeTracker = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.selectionStart = TextRange.m13165getStartimpl(j);
        this.selectionEnd = TextRange.m13160getEndimpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        checkRange(TextRange.m13165getStartimpl(j), TextRange.m13160getEndimpl(j));
    }

    @NotNull
    public final ChangeTracker getChangeTracker() {
        return this.changeTracker;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    private final void setSelectionStart(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
        }
        this.selectionStart = i;
    }

    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    private final void setSelectionEnd(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
        }
        this.selectionEnd = i;
    }

    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    public final boolean hasComposition() {
        return this.compositionStart != -1;
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m8665getCompositionMzsxiRA() {
        if (hasComposition()) {
            return TextRange.m13153boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m8666getSelectiond9O1mEE() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getCursor() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final void setCursor(int i) {
        setSelection(i, i);
    }

    public final char get(int index) {
        return this.gapBuffer.charAt(index);
    }

    public final int getLength() {
        return this.gapBuffer.length();
    }

    private EditingBuffer(String str, long j) {
        this(new AnnotatedString(str, null, null, 6, null), j, (DefaultConstructorMarker) null);
    }

    public final void replace(int start, int end, @NotNull CharSequence text) {
        checkRange(start, end);
        int iMin = Math.min(start, end);
        int iMax = Math.max(start, end);
        int i = 0;
        int i2 = iMin;
        while (i2 < iMax && i < text.length() && text.charAt(i) == this.gapBuffer.charAt(i2)) {
            i++;
            i2++;
        }
        int length = text.length();
        int i3 = iMax;
        while (i3 > iMin && length > i && text.charAt(length - 1) == this.gapBuffer.charAt(i3 - 1)) {
            length--;
            i3--;
        }
        this.changeTracker.trackChange(i2, i3, length - i);
        PartialGapBuffer.replace$default(this.gapBuffer, iMin, iMax, text, 0, 0, 24, null);
        setSelectionStart(text.length() + iMin);
        setSelectionEnd(iMin + text.length());
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete(int start, int end) {
        checkRange(start, end);
        long jTextRange = TextRangeKt.TextRange(start, end);
        this.changeTracker.trackChange(start, end, 0);
        PartialGapBuffer.replace$default(this.gapBuffer, TextRange.m13163getMinimpl(jTextRange), TextRange.m13162getMaximpl(jTextRange), "", 0, 0, 24, null);
        long jM8667updateRangeAfterDeletepWDy79M = EditingBufferKt.m8667updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m13165getStartimpl(jM8667updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m13160getEndimpl(jM8667updateRangeAfterDeletepWDy79M));
        if (hasComposition()) {
            long jM8667updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m8667updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m13159getCollapsedimpl(jM8667updateRangeAfterDeletepWDy79M2)) {
                commitComposition();
            } else {
                this.compositionStart = TextRange.m13163getMinimpl(jM8667updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m13162getMaximpl(jM8667updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final void setSelection(int start, int end) {
        int iCoerceIn = RangesKt___RangesKt.coerceIn(start, 0, getLength());
        int iCoerceIn2 = RangesKt___RangesKt.coerceIn(end, 0, getLength());
        setSelectionStart(iCoerceIn);
        setSelectionEnd(iCoerceIn2);
    }

    public final void setComposition(int start, int end) {
        if (start < 0 || start > this.gapBuffer.length()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.length());
        }
        if (end < 0 || end > this.gapBuffer.length()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.length());
        }
        if (start >= end) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
        }
        this.compositionStart = start;
        this.compositionEnd = end;
    }

    public final void commitComposition() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    @NotNull
    public String toString() {
        return this.gapBuffer.toString();
    }

    @NotNull
    public final AnnotatedString toAnnotatedString() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    private final void checkRange(int start, int end) {
        if (start < 0 || start > this.gapBuffer.length()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.length());
        }
        if (end < 0 || end > this.gapBuffer.length()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.length());
        }
    }
}
