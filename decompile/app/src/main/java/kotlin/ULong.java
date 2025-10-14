package kotlin;

import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt___URangesKt;
import okhttp3.internal.p054ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* compiled from: ULong.kt */
@SinceKotlin(version = YouTubePlayerBridge.RATE_1_5)
@Metadata(m7104d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001~B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b)\u0010\u001dJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b*\u0010\u001fJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b+\u0010\u000bJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0013\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b3\u0010\u0005J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b5\u0010\u001dJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b6\u0010\u001fJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b8\u0010\"J\u0018\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b:\u0010;J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b<\u0010\u0013J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b=\u0010\u000bJ\u0018\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bA\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bC\u0010\u001dJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bD\u0010\u001fJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bF\u0010\"J\u0018\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bL\u0010JJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bN\u0010\u001dJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bO\u0010\u001fJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000bJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bQ\u0010\"J\u001b\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bT\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bV\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bX\u0010\u001dJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bY\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bZ\u0010\u000bJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b[\u0010\"J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\rH\u0087\b¢\u0006\u0004\bi\u0010/J\u0010\u0010j\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bk\u0010\u0005J\u0010\u0010l\u001a\u00020mH\u0087\b¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bu\u0010_J\u0013\u0010v\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bw\u0010/J\u0013\u0010x\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\by\u0010\u0005J\u0013\u0010z\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b{\u0010oJ\u0018\u0010|\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b}\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006\u007f"}, m7105d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", TtmlNode.TAG_DIV, "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", ScriptTagPayloadReader.KEY_TIMES, "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes8.dex */
public final class ULong implements Comparable<ULong> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    public final long data;

    /* renamed from: box-impl */
    public static final /* synthetic */ ULong m15867boximpl(long j) {
        return new ULong(j);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static long m15872constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl */
    public static boolean m15878equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m15879equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m15884hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    public static final byte m15912toByteimpl(long j) {
        return (byte) j;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    public static final int m15915toIntimpl(long j) {
        return (int) j;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    public static final long m15916toLongimpl(long j) {
        return j;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    public static final short m15917toShortimpl(long j) {
        return (short) j;
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    public static final long m15921toULongsVKNKU(long j) {
        return j;
    }

    public boolean equals(Object obj) {
        return m15878equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m15884hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public /* synthetic */ ULong(long j) {
        this.data = j;
    }

    /* compiled from: ULong.kt */
    @Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, m7105d2 = {"Lkotlin/ULong$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    public static final int m15868compareTo7apg3OU(long j, byte b) {
        return Long.compare(j ^ Long.MIN_VALUE, m15872constructorimpl(b & 255) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    public static final int m15871compareToxj2QHRw(long j, short s) {
        return Long.compare(j ^ Long.MIN_VALUE, m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    public static final int m15870compareToWZ4Q5Ns(long j, int i) {
        return Long.compare(j ^ Long.MIN_VALUE, m15872constructorimpl(i & 4294967295L) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    public static int m15869compareToVKZWuLQ(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    public final int m15924compareToVKZWuLQ(long j) {
        return UnsignedKt.ulongCompare(getData(), j);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    public static final long m15896plus7apg3OU(long j, byte b) {
        return m15872constructorimpl(j + m15872constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    public static final long m15899plusxj2QHRw(long j, short s) {
        return m15872constructorimpl(j + m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    public static final long m15898plusWZ4Q5Ns(long j, int i) {
        return m15872constructorimpl(j + m15872constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    public static final long m15897plusVKZWuLQ(long j, long j2) {
        return m15872constructorimpl(j + j2);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    public static final long m15887minus7apg3OU(long j, byte b) {
        return m15872constructorimpl(j - m15872constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    public static final long m15890minusxj2QHRw(long j, short s) {
        return m15872constructorimpl(j - m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    public static final long m15889minusWZ4Q5Ns(long j, int i) {
        return m15872constructorimpl(j - m15872constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    public static final long m15888minusVKZWuLQ(long j, long j2) {
        return m15872constructorimpl(j - j2);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    public static final long m15908times7apg3OU(long j, byte b) {
        return m15872constructorimpl(j * m15872constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    public static final long m15911timesxj2QHRw(long j, short s) {
        return m15872constructorimpl(j * m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    public static final long m15910timesWZ4Q5Ns(long j, int i) {
        return m15872constructorimpl(j * m15872constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    public static final long m15909timesVKZWuLQ(long j, long j2) {
        return m15872constructorimpl(j * j2);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    public static final long m15874div7apg3OU(long j, byte b) {
        return UByte$$ExternalSyntheticBackport3.m7116m(j, m15872constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    public static final long m15877divxj2QHRw(long j, short s) {
        return UByte$$ExternalSyntheticBackport3.m7116m(j, m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    public static final long m15876divWZ4Q5Ns(long j, int i) {
        return UByte$$ExternalSyntheticBackport3.m7116m(j, m15872constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    public static final long m15875divVKZWuLQ(long j, long j2) {
        return UnsignedKt.m16052ulongDivideeb3DHEI(j, j2);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    public static final long m15902rem7apg3OU(long j, byte b) {
        return UByte$$ExternalSyntheticBackport2.m7115m(j, m15872constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    public static final long m15905remxj2QHRw(long j, short s) {
        return UByte$$ExternalSyntheticBackport2.m7115m(j, m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    public static final long m15904remWZ4Q5Ns(long j, int i) {
        return UByte$$ExternalSyntheticBackport2.m7115m(j, m15872constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    public static final long m15903remVKZWuLQ(long j, long j2) {
        return UnsignedKt.m16053ulongRemaindereb3DHEI(j, j2);
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    public static final long m15880floorDiv7apg3OU(long j, byte b) {
        return UByte$$ExternalSyntheticBackport3.m7116m(j, m15872constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    public static final long m15883floorDivxj2QHRw(long j, short s) {
        return UByte$$ExternalSyntheticBackport3.m7116m(j, m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    public static final long m15882floorDivWZ4Q5Ns(long j, int i) {
        return UByte$$ExternalSyntheticBackport3.m7116m(j, m15872constructorimpl(i & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    public static final long m15881floorDivVKZWuLQ(long j, long j2) {
        return UByte$$ExternalSyntheticBackport3.m7116m(j, j2);
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    public static final byte m15891mod7apg3OU(long j, byte b) {
        return UByte.m15716constructorimpl((byte) UByte$$ExternalSyntheticBackport2.m7115m(j, m15872constructorimpl(b & 255)));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    public static final short m15894modxj2QHRw(long j, short s) {
        return UShort.m15979constructorimpl((short) UByte$$ExternalSyntheticBackport2.m7115m(j, m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    public static final int m15893modWZ4Q5Ns(long j, int i) {
        return UInt.m15793constructorimpl((int) UByte$$ExternalSyntheticBackport2.m7115m(j, m15872constructorimpl(i & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    public static final long m15892modVKZWuLQ(long j, long j2) {
        return UByte$$ExternalSyntheticBackport2.m7115m(j, j2);
    }

    @InlineOnly
    /* renamed from: inc-s-VKNKU */
    public static final long m15885incsVKNKU(long j) {
        return m15872constructorimpl(j + 1);
    }

    @InlineOnly
    /* renamed from: dec-s-VKNKU */
    public static final long m15873decsVKNKU(long j) {
        return m15872constructorimpl(j - 1);
    }

    @InlineOnly
    /* renamed from: rangeTo-VKZWuLQ */
    public static final ULongRange m15900rangeToVKZWuLQ(long j, long j2) {
        return new ULongRange(j, j2, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-VKZWuLQ */
    public static final ULongRange m15901rangeUntilVKZWuLQ(long j, long j2) {
        return URangesKt___URangesKt.m16969untileb3DHEI(j, j2);
    }

    @InlineOnly
    /* renamed from: shl-s-VKNKU */
    public static final long m15906shlsVKNKU(long j, int i) {
        return m15872constructorimpl(j << i);
    }

    @InlineOnly
    /* renamed from: shr-s-VKNKU */
    public static final long m15907shrsVKNKU(long j, int i) {
        return m15872constructorimpl(j >>> i);
    }

    @InlineOnly
    /* renamed from: and-VKZWuLQ */
    public static final long m15866andVKZWuLQ(long j, long j2) {
        return m15872constructorimpl(j & j2);
    }

    @InlineOnly
    /* renamed from: or-VKZWuLQ */
    public static final long m15895orVKZWuLQ(long j, long j2) {
        return m15872constructorimpl(j | j2);
    }

    @InlineOnly
    /* renamed from: xor-VKZWuLQ */
    public static final long m15923xorVKZWuLQ(long j, long j2) {
        return m15872constructorimpl(j ^ j2);
    }

    @InlineOnly
    /* renamed from: inv-s-VKNKU */
    public static final long m15886invsVKNKU(long j) {
        return m15872constructorimpl(~j);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    public static final byte m15919toUBytew2LRezQ(long j) {
        return UByte.m15716constructorimpl((byte) j);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    public static final short m15922toUShortMh2AYeg(long j) {
        return UShort.m15979constructorimpl((short) j);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    public static final int m15920toUIntpVg5ArA(long j) {
        return UInt.m15793constructorimpl((int) j);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    public static final float m15914toFloatimpl(long j) {
        return (float) UnsignedKt.ulongToDouble(j);
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    public static final double m15913toDoubleimpl(long j) {
        return UnsignedKt.ulongToDouble(j);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m15918toStringimpl(long j) {
        return UnsignedKt.ulongToString(j);
    }

    @NotNull
    public String toString() {
        return m15918toStringimpl(this.data);
    }
}
