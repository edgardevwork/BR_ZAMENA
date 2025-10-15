package androidx.compose.foundation.text2.input.internal;

import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m7105d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m8667updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM13161getLengthimpl;
        int iM13163getMinimpl = TextRange.m13163getMinimpl(j);
        int iM13162getMaximpl = TextRange.m13162getMaximpl(j);
        if (TextRange.m13167intersects5zctL8(j2, j)) {
            if (TextRange.m13155contains5zctL8(j2, j)) {
                iM13163getMinimpl = TextRange.m13163getMinimpl(j2);
                iM13162getMaximpl = iM13163getMinimpl;
            } else {
                if (TextRange.m13155contains5zctL8(j, j2)) {
                    iM13161getLengthimpl = TextRange.m13161getLengthimpl(j2);
                } else if (TextRange.m13156containsimpl(j2, iM13163getMinimpl)) {
                    iM13163getMinimpl = TextRange.m13163getMinimpl(j2);
                    iM13161getLengthimpl = TextRange.m13161getLengthimpl(j2);
                } else {
                    iM13162getMaximpl = TextRange.m13163getMinimpl(j2);
                }
                iM13162getMaximpl -= iM13161getLengthimpl;
            }
        } else if (iM13162getMaximpl > TextRange.m13163getMinimpl(j2)) {
            iM13163getMinimpl -= TextRange.m13161getLengthimpl(j2);
            iM13161getLengthimpl = TextRange.m13161getLengthimpl(j2);
            iM13162getMaximpl -= iM13161getLengthimpl;
        }
        return TextRangeKt.TextRange(iM13163getMinimpl, iM13162getMaximpl);
    }
}
