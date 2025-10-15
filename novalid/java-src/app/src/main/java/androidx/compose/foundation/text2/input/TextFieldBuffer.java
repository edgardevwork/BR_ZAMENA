package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text2.input.internal.ChangeTracker;
import androidx.compose.foundation.text2.input.internal.PartialGapBuffer;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldBuffer.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001VB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\u0014\u0010!\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\"\u001a\u00020#H\u0016J\u0016\u0010!\u001a\u00060\u0001j\u0002`\u00022\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010!\u001a\u00060\u0001j\u0002`\u00022\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0006\u0010(\u001a\u00020%J\u000e\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0011J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u0011H\u0002J\u001a\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u0011H\u0002J\u001a\u00103\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u0010/J \u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011H\u0002J\u000e\u00109\u001a\u0002012\u0006\u0010*\u001a\u00020\u0011J\u000e\u0010:\u001a\u0002012\u0006\u0010*\u001a\u00020\u0011J\u000e\u0010;\u001a\u0002012\u0006\u0010*\u001a\u00020\u0011J\u000e\u0010<\u001a\u0002012\u0006\u0010*\u001a\u00020\u0011J\u001e\u0010=\u001a\u0002012\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%J9\u0010=\u001a\u0002012\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010>\u001a\u00020\u00112\b\b\u0002\u0010?\u001a\u00020\u0011H\u0000¢\u0006\u0002\b@J(\u0010A\u001a\u0002012\u0006\u0010*\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u0015H\u0002J\"\u0010E\u001a\u0002012\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u0006\u0010H\u001a\u000201J\u0018\u0010I\u001a\u0002012\u0006\u0010-\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u0018\u0010L\u001a\u0002012\u0006\u0010-\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\bM\u0010KJ\u0015\u0010N\u001a\u0002012\u0006\u0010O\u001a\u00020%H\u0000¢\u0006\u0002\bPJ\b\u0010Q\u001a\u00020RH\u0016J\u001c\u0010S\u001a\u00020\u00042\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001aH\u0000ø\u0001\u0000¢\u0006\u0002\bUR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R&\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001a8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "initialValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "initialChanges", "Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "sourceValue", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/ChangeTracker;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V", "buffer", "Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer;", "changeTracker", "changes", "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "getChanges", "()Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "codepointLength", "", "getCodepointLength", "()I", "hasSelection", "", "()Z", CacheFileMetadataIndex.COLUMN_LENGTH, "getLength", "<set-?>", "Landroidx/compose/ui/text/TextRange;", "selectionInChars", "getSelectionInChars-d9O1mEE", "()J", "J", "selectionInCodepoints", "getSelectionInCodepoints-d9O1mEE", "append", "char", "", "text", "", TtmlNode.START, "end", "asCharSequence", "charAt", FirebaseAnalytics.Param.INDEX, "charIndexToCodepointIndex", "charsToCodepoints", P2MetadataParser.RequiredHandler.RANGE, "charsToCodepoints-GEjPoXI", "(J)J", "clearChangeList", "", "codepointIndexToCharIndex", "codepointsToChars", "codepointsToChars-GEjPoXI", "onTextWillChange", "replaceStart", "replaceEnd", "newLength", "placeCursorAfterCharAt", "placeCursorAfterCodepointAt", "placeCursorBeforeCharAt", "placeCursorBeforeCodepointAt", "replace", "textStart", "textEnd", "replace$foundation_release", "requireValidIndex", "startExclusive", "endExclusive", "inCodepoints", "requireValidRange", "requireValidRange-72CqOWE", "(JZ)V", "revertAllChanges", "selectCharsIn", "selectCharsIn-5zc-tL8", "(J)V", "selectCodepointsIn", "selectCodepointsIn-5zc-tL8", "setTextIfChanged", "newText", "setTextIfChanged$foundation_release", "toString", "", "toTextFieldCharSequence", "composition", "toTextFieldCharSequence-OEnZFl4$foundation_release", "ChangeList", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBufferKt\n*L\n1#1,646:1\n1#2:647\n589#3,43:648\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBuffer\n*L\n162#1:648,43\n*E\n"})
/* loaded from: classes3.dex */
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;

    @NotNull
    private final PartialGapBuffer buffer;

    @Nullable
    private ChangeTracker changeTracker;
    private long selectionInChars;

    @NotNull
    private final TextFieldCharSequence sourceValue;

    /* compiled from: TextFieldBuffer.kt */
    @ExperimentalFoundationApi
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "", "changeCount", "", "getChangeCount", "()I", "getOriginalRange", "Landroidx/compose/ui/text/TextRange;", "changeIndex", "getOriginalRange--jx7JFs", "(I)J", "getRange", "getRange--jx7JFs", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public interface ChangeList {
        int getChangeCount();

        /* renamed from: getOriginalRange--jx7JFs */
        long mo8634getOriginalRangejx7JFs(int changeIndex);

        /* renamed from: getRange--jx7JFs */
        long mo8635getRangejx7JFs(int changeIndex);
    }

    private final int charIndexToCodepointIndex(int index) {
        return index;
    }

    private final int codepointIndexToCharIndex(int index) {
        return index;
    }

    public TextFieldBuffer(@NotNull TextFieldCharSequence textFieldCharSequence, @Nullable ChangeTracker changeTracker, @NotNull TextFieldCharSequence textFieldCharSequence2) {
        this.sourceValue = textFieldCharSequence2;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        this.changeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.getSelectionInChars();
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldCharSequence, (i & 2) != 0 ? null : changeTracker, (i & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2);
    }

    public final int getLength() {
        return this.buffer.length();
    }

    public final int getCodepointLength() {
        return Character.codePointCount(this.buffer, 0, getLength());
    }

    @NotNull
    public final ChangeList getChanges() {
        ChangeTracker changeTracker = this.changeTracker;
        return changeTracker != null ? changeTracker : EmptyChangeList.INSTANCE;
    }

    @JvmName(name = "hasSelection")
    public final boolean hasSelection() {
        return !TextRange.m13159getCollapsedimpl(this.selectionInChars);
    }

    /* renamed from: getSelectionInChars-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelectionInChars() {
        return this.selectionInChars;
    }

    /* renamed from: getSelectionInCodepoints-d9O1mEE, reason: not valid java name */
    public final long m8641getSelectionInCodepointsd9O1mEE() {
        return m8636charsToCodepointsGEjPoXI(this.selectionInChars);
    }

    public final void replace(int start, int end, @NotNull CharSequence text) {
        replace$foundation_release(start, end, text, 0, text.length());
    }

    public static /* synthetic */ void replace$foundation_release$default(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        textFieldBuffer.replace$foundation_release(i, i2, charSequence, i6, i4);
    }

    public final void replace$foundation_release(int start, int end, @NotNull CharSequence text, int textStart, int textEnd) {
        if (start > end) {
            throw new IllegalArgumentException(("Expected start=" + start + " <= end=" + end).toString());
        }
        if (textStart > textEnd) {
            throw new IllegalArgumentException(("Expected textStart=" + textStart + " <= textEnd=" + textEnd).toString());
        }
        onTextWillChange(start, end, textEnd - textStart);
        this.buffer.replace(start, end, text, textStart, textEnd);
    }

    public final void setTextIfChanged$foundation_release(@NotNull CharSequence newText) {
        int i;
        int i2;
        int i3;
        int i4;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = newText.length();
        boolean z = false;
        if (partialGapBuffer.length() <= 0 || newText.length() <= 0) {
            i = length;
            i2 = length2;
            i3 = 0;
            i4 = 0;
        } else {
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            while (true) {
                if (!z) {
                    if (partialGapBuffer.charAt(i5) == newText.charAt(i6)) {
                        i5++;
                        i6++;
                    } else {
                        z = true;
                    }
                }
                if (!z2) {
                    if (partialGapBuffer.charAt(length - 1) == newText.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z2 = true;
                    }
                }
                if (i5 >= length || i6 >= length2 || (z && z2)) {
                    break;
                }
            }
            i = length;
            i2 = length2;
            i3 = i5;
            i4 = i6;
        }
        if (i3 < i || i4 < i2) {
            replace$foundation_release(i3, i, newText, i4, i2);
        }
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence text) {
        if (text != null) {
            onTextWillChange(getLength(), getLength(), text.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), text, 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence text, int start, int end) {
        if (text != null) {
            onTextWillChange(getLength(), getLength(), end - start);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), text.subSequence(start, end), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(char c) {
        onTextWillChange(getLength(), getLength(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(c), 0, 0, 24, null);
        return this;
    }

    private final void onTextWillChange(int replaceStart, int replaceEnd, int newLength) {
        int i;
        ChangeTracker changeTracker = this.changeTracker;
        if (changeTracker == null) {
            changeTracker = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
            this.changeTracker = changeTracker;
        }
        changeTracker.trackChange(replaceStart, replaceEnd, newLength);
        int iMin = Math.min(replaceStart, replaceEnd);
        int iMax = Math.max(replaceStart, replaceEnd);
        int iM13163getMinimpl = TextRange.m13163getMinimpl(this.selectionInChars);
        int iM13162getMaximpl = TextRange.m13162getMaximpl(this.selectionInChars);
        if (iM13162getMaximpl < iMin) {
            return;
        }
        if (iM13163getMinimpl <= iMin && iMax <= iM13162getMaximpl) {
            i = newLength - (iMax - iMin);
            if (iM13163getMinimpl == iM13162getMaximpl) {
                iM13163getMinimpl += i;
            }
            iMin = iM13162getMaximpl + i;
        } else if (iM13163getMinimpl > iMin && iM13162getMaximpl < iMax) {
            iMin += newLength;
            iM13163getMinimpl = iMin;
        } else if (iM13163getMinimpl >= iMax) {
            i = newLength - (iMax - iMin);
            iM13163getMinimpl += i;
            iMin = iM13162getMaximpl + i;
        } else if (iMin < iM13163getMinimpl) {
            iM13163getMinimpl = iMin + newLength;
            i = newLength - (iMax - iMin);
            iMin = iM13162getMaximpl + i;
        }
        this.selectionInChars = TextRangeKt.TextRange(iM13163getMinimpl, iMin);
    }

    public final char charAt(int index) {
        return this.buffer.charAt(index);
    }

    @NotNull
    public String toString() {
        return this.buffer.toString();
    }

    @NotNull
    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    private final void clearChangeList() {
        ChangeTracker changeTracker = this.changeTracker;
        if (changeTracker != null) {
            changeTracker.clearChanges();
        }
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.sourceValue.toString());
        this.selectionInChars = this.sourceValue.getSelectionInChars();
        clearChangeList();
    }

    public final void placeCursorBeforeCodepointAt(int index) {
        requireValidIndex(index, true, false, true);
        this.selectionInChars = TextRangeKt.TextRange(codepointIndexToCharIndex(index));
    }

    public final void placeCursorBeforeCharAt(int index) {
        requireValidIndex(index, true, false, false);
        this.selectionInChars = TextRangeKt.TextRange(index);
    }

    public final void placeCursorAfterCodepointAt(int index) {
        requireValidIndex(index, false, true, true);
        this.selectionInChars = TextRangeKt.TextRange(codepointIndexToCharIndex(RangesKt___RangesKt.coerceAtMost(index + 1, getCodepointLength())));
    }

    public final void placeCursorAfterCharAt(int index) {
        requireValidIndex(index, false, true, false);
        this.selectionInChars = TextRangeKt.TextRange(RangesKt___RangesKt.coerceAtMost(index + 1, getLength()));
    }

    /* renamed from: selectCodepointsIn-5zc-tL8, reason: not valid java name */
    public final void m8643selectCodepointsIn5zctL8(long range) {
        m8638requireValidRange72CqOWE(range, true);
        this.selectionInChars = m8637codepointsToCharsGEjPoXI(range);
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m8642selectCharsIn5zctL8(long range) {
        m8638requireValidRange72CqOWE(range, false);
        this.selectionInChars = range;
    }

    /* renamed from: toTextFieldCharSequence-OEnZFl4$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m8639toTextFieldCharSequenceOEnZFl4$foundation_release$default(TextFieldBuffer textFieldBuffer, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            textRange = null;
        }
        return textFieldBuffer.m8644toTextFieldCharSequenceOEnZFl4$foundation_release(textRange);
    }

    @NotNull
    /* renamed from: toTextFieldCharSequence-OEnZFl4$foundation_release, reason: not valid java name */
    public final TextFieldCharSequence m8644toTextFieldCharSequenceOEnZFl4$foundation_release(@Nullable TextRange composition) {
        return TextFieldCharSequenceKt.m8647TextFieldCharSequence3r_uNRQ(this.buffer.toString(), this.selectionInChars, composition);
    }

    private final void requireValidIndex(int index, boolean startExclusive, boolean endExclusive, boolean inCodepoints) {
        int iCharIndexToCodepointIndex = startExclusive ? 0 : -1;
        int length = endExclusive ? getLength() : getLength() + 1;
        if (inCodepoints) {
            iCharIndexToCodepointIndex = charIndexToCodepointIndex(iCharIndexToCodepointIndex);
            length = charIndexToCodepointIndex(length);
        }
        if (iCharIndexToCodepointIndex > index || index >= length) {
            throw new IllegalArgumentException(("Expected " + index + " to be in [" + iCharIndexToCodepointIndex + ", " + length + ") " + (inCodepoints ? "codepoints" : "chars")).toString());
        }
    }

    /* renamed from: requireValidRange-72CqOWE, reason: not valid java name */
    private final void m8638requireValidRange72CqOWE(long range, boolean inCodepoints) {
        long jTextRange = TextRangeKt.TextRange(0, getLength());
        if (inCodepoints) {
            jTextRange = m8636charsToCodepointsGEjPoXI(jTextRange);
        }
        if (TextRange.m13155contains5zctL8(jTextRange, range)) {
            return;
        }
        throw new IllegalArgumentException(("Expected " + ((Object) TextRange.m13168toStringimpl(range)) + " to be in " + ((Object) TextRange.m13168toStringimpl(jTextRange)) + " (" + (inCodepoints ? "codepoints" : "chars") + ')').toString());
    }

    /* renamed from: codepointsToChars-GEjPoXI, reason: not valid java name */
    private final long m8637codepointsToCharsGEjPoXI(long range) {
        return TextRangeKt.TextRange(codepointIndexToCharIndex(TextRange.m13165getStartimpl(range)), codepointIndexToCharIndex(TextRange.m13160getEndimpl(range)));
    }

    /* renamed from: charsToCodepoints-GEjPoXI, reason: not valid java name */
    private final long m8636charsToCodepointsGEjPoXI(long range) {
        return TextRangeKt.TextRange(charIndexToCodepointIndex(TextRange.m13165getStartimpl(range)), charIndexToCodepointIndex(TextRange.m13160getEndimpl(range)));
    }
}
