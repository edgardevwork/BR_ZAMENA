package kotlin;

import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt___URangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: UByte.kt */
@SinceKotlin(version = YouTubePlayerBridge.RATE_1_5)
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0012J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b'\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b(\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0013\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b3\u0010\u000fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b4\u0010\u0012J\u0018\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b6\u0010\u0018J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b8\u0010\u000bJ\u0018\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b9\u0010\u0012J\u0018\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b:\u0010\u001fJ\u0018\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u000bJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b@\u0010\u000fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bA\u0010\u0012J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bB\u0010\u001fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bC\u0010\u0018J\u0018\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010GJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bK\u0010\u000fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bL\u0010\u0012J\u0018\u0010J\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bM\u0010\u001fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bQ\u0010\u0012J\u0018\u0010O\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bR\u0010\u001fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bm\u0010\u0005J\u0013\u0010n\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0013\u0010p\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\bq\u0010cJ\u0013\u0010r\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\bs\u0010gJ\u0018\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006w"}, m7105d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", TtmlNode.TAG_DIV, "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", ScriptTagPayloadReader.KEY_TIMES, "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes8.dex */
public final class UByte implements Comparable<UByte> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    public final byte data;

    /* renamed from: box-impl */
    public static final /* synthetic */ UByte m15711boximpl(byte b) {
        return new UByte(b);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static byte m15716constructorimpl(byte b) {
        return b;
    }

    /* renamed from: equals-impl */
    public static boolean m15722equalsimpl(byte b, Object obj) {
        return (obj instanceof UByte) && b == ((UByte) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m15723equalsimpl0(byte b, byte b2) {
        return b == b2;
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m15728hashCodeimpl(byte b) {
        return Byte.hashCode(b);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    public static final byte m15754toByteimpl(byte b) {
        return b;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    public static final double m15755toDoubleimpl(byte b) {
        return b & 255;
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    public static final float m15756toFloatimpl(byte b) {
        return b & 255;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    public static final int m15757toIntimpl(byte b) {
        return b & 255;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    public static final long m15758toLongimpl(byte b) {
        return b & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    public static final short m15759toShortimpl(byte b) {
        return (short) (b & 255);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    public static final byte m15761toUBytew2LRezQ(byte b) {
        return b;
    }

    public boolean equals(Object obj) {
        return m15722equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m15728hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & 255, uByte.getData() & 255);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public /* synthetic */ UByte(byte b) {
        this.data = b;
    }

    /* compiled from: UByte.kt */
    @Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, m7105d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    public static int m15712compareTo7apg3OU(byte b, byte b2) {
        return Intrinsics.compare(b & 255, b2 & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    public final int m15766compareTo7apg3OU(byte b) {
        return Intrinsics.compare(getData() & 255, b & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    public static final int m15715compareToxj2QHRw(byte b, short s) {
        return Intrinsics.compare(b & 255, s & UShort.MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    public static final int m15714compareToWZ4Q5Ns(byte b, int i) {
        return Integer.compare(UInt.m15793constructorimpl(b & 255) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    public static final int m15713compareToVKZWuLQ(byte b, long j) {
        return Long.compare(ULong.m15872constructorimpl(b & 255) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    public static final int m15740plus7apg3OU(byte b, byte b2) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(b & 255) + UInt.m15793constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    public static final int m15743plusxj2QHRw(byte b, short s) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(b & 255) + UInt.m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    public static final int m15742plusWZ4Q5Ns(byte b, int i) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(b & 255) + i);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    public static final long m15741plusVKZWuLQ(byte b, long j) {
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl(b & 255) + j);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    public static final int m15731minus7apg3OU(byte b, byte b2) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(b & 255) - UInt.m15793constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    public static final int m15734minusxj2QHRw(byte b, short s) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(b & 255) - UInt.m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    public static final int m15733minusWZ4Q5Ns(byte b, int i) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(b & 255) - i);
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    public static final long m15732minusVKZWuLQ(byte b, long j) {
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl(b & 255) - j);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    public static final int m15750times7apg3OU(byte b, byte b2) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(b & 255) * UInt.m15793constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    public static final int m15753timesxj2QHRw(byte b, short s) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(b & 255) * UInt.m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    public static final int m15752timesWZ4Q5Ns(byte b, int i) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(b & 255) * i);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    public static final long m15751timesVKZWuLQ(byte b, long j) {
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl(b & 255) * j);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    public static final int m15718div7apg3OU(byte b, byte b2) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    public static final int m15721divxj2QHRw(byte b, short s) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    public static final int m15720divWZ4Q5Ns(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(b & 255), i);
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    public static final long m15719divVKZWuLQ(byte b, long j) {
        return UByte$$ExternalSyntheticBackport3.m7116m(ULong.m15872constructorimpl(b & 255), j);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    public static final int m15746rem7apg3OU(byte b, byte b2) {
        return UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    public static final int m15749remxj2QHRw(byte b, short s) {
        return UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    public static final int m15748remWZ4Q5Ns(byte b, int i) {
        return UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(b & 255), i);
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    public static final long m15747remVKZWuLQ(byte b, long j) {
        return UByte$$ExternalSyntheticBackport2.m7115m(ULong.m15872constructorimpl(b & 255), j);
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    public static final int m15724floorDiv7apg3OU(byte b, byte b2) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    public static final int m15727floorDivxj2QHRw(byte b, short s) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    public static final int m15726floorDivWZ4Q5Ns(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(b & 255), i);
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    public static final long m15725floorDivVKZWuLQ(byte b, long j) {
        return UByte$$ExternalSyntheticBackport3.m7116m(ULong.m15872constructorimpl(b & 255), j);
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    public static final byte m15735mod7apg3OU(byte b, byte b2) {
        return m15716constructorimpl((byte) UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(b2 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    public static final short m15738modxj2QHRw(byte b, short s) {
        return UShort.m15979constructorimpl((short) UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(s & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    public static final int m15737modWZ4Q5Ns(byte b, int i) {
        return UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(b & 255), i);
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    public static final long m15736modVKZWuLQ(byte b, long j) {
        return UByte$$ExternalSyntheticBackport2.m7115m(ULong.m15872constructorimpl(b & 255), j);
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ */
    public static final byte m15729incw2LRezQ(byte b) {
        return m15716constructorimpl((byte) (b + 1));
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ */
    public static final byte m15717decw2LRezQ(byte b) {
        return m15716constructorimpl((byte) (b - 1));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU */
    public static final UIntRange m15744rangeTo7apg3OU(byte b, byte b2) {
        return new UIntRange(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(b2 & 255), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-7apg3OU */
    public static final UIntRange m15745rangeUntil7apg3OU(byte b, byte b2) {
        return URangesKt___URangesKt.m16967untilJ1ME1BU(UInt.m15793constructorimpl(b & 255), UInt.m15793constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: and-7apg3OU */
    public static final byte m15710and7apg3OU(byte b, byte b2) {
        return m15716constructorimpl((byte) (b & b2));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU */
    public static final byte m15739or7apg3OU(byte b, byte b2) {
        return m15716constructorimpl((byte) (b | b2));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU */
    public static final byte m15765xor7apg3OU(byte b, byte b2) {
        return m15716constructorimpl((byte) (b ^ b2));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ */
    public static final byte m15730invw2LRezQ(byte b) {
        return m15716constructorimpl((byte) (~b));
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    public static final short m15764toUShortMh2AYeg(byte b) {
        return UShort.m15979constructorimpl((short) (b & 255));
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    public static final int m15762toUIntpVg5ArA(byte b) {
        return UInt.m15793constructorimpl(b & 255);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    public static final long m15763toULongsVKNKU(byte b) {
        return ULong.m15872constructorimpl(b & 255);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m15760toStringimpl(byte b) {
        return String.valueOf(b & 255);
    }

    @NotNull
    public String toString() {
        return m15760toStringimpl(this.data);
    }
}
