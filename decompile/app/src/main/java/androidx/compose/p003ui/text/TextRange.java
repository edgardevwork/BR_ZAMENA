package androidx.compose.p003ui.text;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextRange.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010\rJ\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m7105d2 = {"Landroidx/compose/ui/text/TextRange;", "", "packedValue", "", "constructor-impl", "(J)J", "collapsed", "", "getCollapsed-impl", "(J)Z", "end", "", "getEnd-impl", "(J)I", CacheFileMetadataIndex.COLUMN_LENGTH, "getLength-impl", "max", "getMax-impl", "min", "getMin-impl", "reversed", "getReversed-impl", TtmlNode.START, "getStart-impl", "contains", "other", "contains-5zc-tL8", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "contains-impl", "(JI)Z", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "intersects", "intersects-5zc-tL8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n55#2:130\n62#2:131\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:130\n50#1:131\n*E\n"})
/* loaded from: classes4.dex */
public final class TextRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* renamed from: box-impl */
    public static final /* synthetic */ TextRange m13153boximpl(long j) {
        return new TextRange(j);
    }

    /* renamed from: constructor-impl */
    public static long m13154constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl */
    public static boolean m13157equalsimpl(long j, Object obj) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).getPackedValue();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m13158equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getEnd-impl */
    public static final int m13160getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getStart-impl */
    public static final int m13165getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl */
    public static int m13166hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m13157equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m13166hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: getMin-impl */
    public static final int m13163getMinimpl(long j) {
        return m13165getStartimpl(j) > m13160getEndimpl(j) ? m13160getEndimpl(j) : m13165getStartimpl(j);
    }

    /* renamed from: getMax-impl */
    public static final int m13162getMaximpl(long j) {
        return m13165getStartimpl(j) > m13160getEndimpl(j) ? m13165getStartimpl(j) : m13160getEndimpl(j);
    }

    /* renamed from: getCollapsed-impl */
    public static final boolean m13159getCollapsedimpl(long j) {
        return m13165getStartimpl(j) == m13160getEndimpl(j);
    }

    /* renamed from: getReversed-impl */
    public static final boolean m13164getReversedimpl(long j) {
        return m13165getStartimpl(j) > m13160getEndimpl(j);
    }

    /* renamed from: getLength-impl */
    public static final int m13161getLengthimpl(long j) {
        return m13162getMaximpl(j) - m13163getMinimpl(j);
    }

    /* renamed from: intersects-5zc-tL8 */
    public static final boolean m13167intersects5zctL8(long j, long j2) {
        return m13163getMinimpl(j) < m13162getMaximpl(j2) && m13163getMinimpl(j2) < m13162getMaximpl(j);
    }

    /* renamed from: contains-5zc-tL8 */
    public static final boolean m13155contains5zctL8(long j, long j2) {
        return m13163getMinimpl(j) <= m13163getMinimpl(j2) && m13162getMaximpl(j2) <= m13162getMaximpl(j);
    }

    /* renamed from: contains-impl */
    public static final boolean m13156containsimpl(long j, int i) {
        return i < m13162getMaximpl(j) && m13163getMinimpl(j) <= i;
    }

    @NotNull
    public String toString() {
        return m13168toStringimpl(this.packedValue);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m13168toStringimpl(long j) {
        return "TextRange(" + m13165getStartimpl(j) + ", " + m13160getEndimpl(j) + ')';
    }

    /* compiled from: TextRange.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m7105d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/text/TextRange;", "getZero-d9O1mEE", "()J", "J", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-d9O1mEE */
        public final long m13170getZerod9O1mEE() {
            return TextRange.Zero;
        }
    }
}
