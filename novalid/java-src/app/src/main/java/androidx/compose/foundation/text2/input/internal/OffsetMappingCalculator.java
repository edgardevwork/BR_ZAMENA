package androidx.compose.foundation.text2.input.internal;

import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: OffsetMappingCalculator.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J=\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "", "()V", "ops", "Landroidx/compose/foundation/text2/input/internal/OpArray;", "[I", "opsSize", "", "map", "Landroidx/compose/ui/text/TextRange;", TypedValues.CycleType.S_WAVE_OFFSET, "fromSource", "", "map-fzxv0v0", "(IZ)J", "mapFromDest", "mapFromDest--jx7JFs", "(I)J", "mapFromSource", "mapFromSource--jx7JFs", "mapStep", "opOffset", "untransformedLen", "transformedLen", "mapStep-C6u-MEY", "(IIIIZ)J", "recordEditOperation", "", "sourceStart", "sourceEnd", "newLength", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OpArray\n*L\n1#1,416:1\n1#2:417\n390#3,21:418\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator\n*L\n298#1:418,21\n*E\n"})
/* loaded from: classes3.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;

    @NotNull
    private int[] ops = OpArray.m8673constructorimpl(10);
    private int opsSize;

    public final void recordEditOperation(int sourceStart, int sourceEnd, int newLength) {
        if (newLength < 0) {
            throw new IllegalArgumentException(("Expected newLen to be ≥ 0, was " + newLength).toString());
        }
        int iMin = Math.min(sourceStart, sourceEnd);
        int iMax = Math.max(iMin, sourceEnd) - iMin;
        if (iMax >= 2 || iMax != newLength) {
            int i = this.opsSize + 1;
            if (i > OpArray.m8680getSizeimpl(this.ops)) {
                this.ops = OpArray.m8675copyOfS4kM8k(this.ops, Math.max(i * 2, OpArray.m8680getSizeimpl(this.ops) * 2));
            }
            OpArray.m8682setimpl(this.ops, this.opsSize, iMin, iMax, newLength);
            this.opsSize = i;
        }
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m8671mapFromSourcejx7JFs(int offset) {
        return m8668mapfzxv0v0(offset, true);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m8670mapFromDestjx7JFs(int offset) {
        return m8668mapfzxv0v0(offset, false);
    }

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m8668mapfzxv0v0(int offset, boolean fromSource) {
        int i;
        int[] iArr = this.ops;
        int i2 = this.opsSize;
        boolean z = !fromSource;
        if (i2 < 0) {
            i = offset;
        } else if (z) {
            int i3 = i2 - 1;
            int iMin = offset;
            while (-1 < i3) {
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                int i6 = iArr[i4 + 1];
                int i7 = iArr[i4 + 2];
                long jM8669mapStepC6uMEY = m8669mapStepC6uMEY(iMin, i5, i6, i7, fromSource);
                long jM8669mapStepC6uMEY2 = m8669mapStepC6uMEY(offset, i5, i6, i7, fromSource);
                i3--;
                iMin = Math.min(TextRange.m13165getStartimpl(jM8669mapStepC6uMEY), TextRange.m13165getStartimpl(jM8669mapStepC6uMEY2));
                offset = Math.max(TextRange.m13160getEndimpl(jM8669mapStepC6uMEY), TextRange.m13160getEndimpl(jM8669mapStepC6uMEY2));
            }
            i = offset;
            offset = iMin;
        } else {
            int i8 = 0;
            int iMin2 = offset;
            while (i8 < i2) {
                int i9 = i8 * 3;
                int i10 = iArr[i9];
                int i11 = iArr[i9 + 1];
                int i12 = iArr[i9 + 2];
                long jM8669mapStepC6uMEY3 = m8669mapStepC6uMEY(iMin2, i10, i11, i12, fromSource);
                long jM8669mapStepC6uMEY4 = m8669mapStepC6uMEY(offset, i10, i11, i12, fromSource);
                i8++;
                iMin2 = Math.min(TextRange.m13165getStartimpl(jM8669mapStepC6uMEY3), TextRange.m13165getStartimpl(jM8669mapStepC6uMEY4));
                offset = Math.max(TextRange.m13160getEndimpl(jM8669mapStepC6uMEY3), TextRange.m13160getEndimpl(jM8669mapStepC6uMEY4));
            }
            i = offset;
            offset = iMin2;
        }
        return TextRangeKt.TextRange(offset, i);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m8669mapStepC6uMEY(int offset, int opOffset, int untransformedLen, int transformedLen, boolean fromSource) {
        int i = fromSource ? untransformedLen : transformedLen;
        if (fromSource) {
            untransformedLen = transformedLen;
        }
        if (offset < opOffset) {
            return TextRangeKt.TextRange(offset);
        }
        if (offset == opOffset) {
            if (i == 0) {
                return TextRangeKt.TextRange(opOffset, untransformedLen + opOffset);
            }
            return TextRangeKt.TextRange(opOffset);
        }
        if (offset >= opOffset + i) {
            return TextRangeKt.TextRange((offset - i) + untransformedLen);
        }
        if (untransformedLen == 0) {
            return TextRangeKt.TextRange(opOffset);
        }
        return TextRangeKt.TextRange(opOffset, untransformedLen + opOffset);
    }
}
