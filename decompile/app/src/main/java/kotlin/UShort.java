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
import okhttp3.internal.p054ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* compiled from: UShort.kt */
@SinceKotlin(version = YouTubePlayerBridge.RATE_1_5)
@Metadata(m7104d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u0010J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0013J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b'\u0010\u0010J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b(\u0010\u0013J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0013\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b3\u0010\u0010J\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b4\u0010\u0013J\u0018\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b6\u0010\u0018J\u0018\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b:\u0010\u0013J\u0018\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b;\u0010\u001fJ\u0018\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b<\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u000bJ\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b@\u0010\u0010J\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bA\u0010\u0013J\u0018\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bB\u0010\u001fJ\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bC\u0010\u0018J\u0018\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010GJ\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bK\u0010\u0010J\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bL\u0010\u0013J\u0018\u0010J\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bM\u0010\u001fJ\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bP\u0010\u0010J\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bQ\u0010\u0013J\u0018\u0010O\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bR\u0010\u001fJ\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\rH\u0087\b¢\u0006\u0004\ba\u0010-J\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bg\u0010\u0005J\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bm\u0010WJ\u0013\u0010n\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0013\u0010p\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\bq\u0010eJ\u0013\u0010r\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bs\u0010\u0005J\u0018\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006w"}, m7105d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", TtmlNode.TAG_DIV, "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", ScriptTagPayloadReader.KEY_TIMES, "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes8.dex */
public final class UShort implements Comparable<UShort> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    public final short data;

    /* renamed from: box-impl */
    public static final /* synthetic */ UShort m15974boximpl(short s) {
        return new UShort(s);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static short m15979constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl */
    public static boolean m15985equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m15986equalsimpl0(short s, short s2) {
        return s == s2;
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m15991hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    public static final byte m16017toByteimpl(short s) {
        return (byte) s;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    public static final double m16018toDoubleimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    public static final float m16019toFloatimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    public static final int m16020toIntimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    public static final long m16021toLongimpl(short s) {
        return s & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    public static final short m16022toShortimpl(short s) {
        return s;
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    public static final short m16027toUShortMh2AYeg(short s) {
        return s;
    }

    public boolean equals(Object obj) {
        return m15985equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m15991hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getData() & MAX_VALUE, uShort.getData() & MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public /* synthetic */ UShort(short s) {
        this.data = s;
    }

    /* compiled from: UShort.kt */
    @Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, m7105d2 = {"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    public static final int m15975compareTo7apg3OU(short s, byte b) {
        return Intrinsics.compare(s & MAX_VALUE, b & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    public static int m15978compareToxj2QHRw(short s, short s2) {
        return Intrinsics.compare(s & MAX_VALUE, s2 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    public final int m16029compareToxj2QHRw(short s) {
        return Intrinsics.compare(getData() & MAX_VALUE, s & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    public static final int m15977compareToWZ4Q5Ns(short s, int i) {
        return Integer.compare(UInt.m15793constructorimpl(s & MAX_VALUE) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    public static final int m15976compareToVKZWuLQ(short s, long j) {
        return Long.compare(ULong.m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    public static final int m16003plus7apg3OU(short s, byte b) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(s & MAX_VALUE) + UInt.m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    public static final int m16006plusxj2QHRw(short s, short s2) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(s & MAX_VALUE) + UInt.m15793constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    public static final int m16005plusWZ4Q5Ns(short s, int i) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(s & MAX_VALUE) + i);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    public static final long m16004plusVKZWuLQ(short s, long j) {
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    public static final int m15994minus7apg3OU(short s, byte b) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(s & MAX_VALUE) - UInt.m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    public static final int m15997minusxj2QHRw(short s, short s2) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(s & MAX_VALUE) - UInt.m15793constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    public static final int m15996minusWZ4Q5Ns(short s, int i) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(s & MAX_VALUE) - i);
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    public static final long m15995minusVKZWuLQ(short s, long j) {
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    public static final int m16013times7apg3OU(short s, byte b) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(s & MAX_VALUE) * UInt.m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    public static final int m16016timesxj2QHRw(short s, short s2) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(s & MAX_VALUE) * UInt.m15793constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    public static final int m16015timesWZ4Q5Ns(short s, int i) {
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl(s & MAX_VALUE) * i);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    public static final long m16014timesVKZWuLQ(short s, long j) {
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    public static final int m15981div7apg3OU(short s, byte b) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    public static final int m15984divxj2QHRw(short s, short s2) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    public static final int m15983divWZ4Q5Ns(short s, int i) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    public static final long m15982divVKZWuLQ(short s, long j) {
        return UByte$$ExternalSyntheticBackport3.m7116m(ULong.m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    public static final int m16009rem7apg3OU(short s, byte b) {
        return UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    public static final int m16012remxj2QHRw(short s, short s2) {
        return UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    public static final int m16011remWZ4Q5Ns(short s, int i) {
        return UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    public static final long m16010remVKZWuLQ(short s, long j) {
        return UByte$$ExternalSyntheticBackport2.m7115m(ULong.m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    public static final int m15987floorDiv7apg3OU(short s, byte b) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    public static final int m15990floorDivxj2QHRw(short s, short s2) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    public static final int m15989floorDivWZ4Q5Ns(short s, int i) {
        return UByte$$ExternalSyntheticBackport0.m7113m(UInt.m15793constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    public static final long m15988floorDivVKZWuLQ(short s, long j) {
        return UByte$$ExternalSyntheticBackport3.m7116m(ULong.m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    public static final byte m15998mod7apg3OU(short s, byte b) {
        return UByte.m15716constructorimpl((byte) UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(b & 255)));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    public static final short m16001modxj2QHRw(short s, short s2) {
        return m15979constructorimpl((short) UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(s2 & MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    public static final int m16000modWZ4Q5Ns(short s, int i) {
        return UByte$$ExternalSyntheticBackport1.m7114m(UInt.m15793constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    public static final long m15999modVKZWuLQ(short s, long j) {
        return UByte$$ExternalSyntheticBackport2.m7115m(ULong.m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: inc-Mh2AYeg */
    public static final short m15992incMh2AYeg(short s) {
        return m15979constructorimpl((short) (s + 1));
    }

    @InlineOnly
    /* renamed from: dec-Mh2AYeg */
    public static final short m15980decMh2AYeg(short s) {
        return m15979constructorimpl((short) (s - 1));
    }

    @InlineOnly
    /* renamed from: rangeTo-xj2QHRw */
    public static final UIntRange m16007rangeToxj2QHRw(short s, short s2) {
        return new UIntRange(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(s2 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-xj2QHRw */
    public static final UIntRange m16008rangeUntilxj2QHRw(short s, short s2) {
        return URangesKt___URangesKt.m16967untilJ1ME1BU(UInt.m15793constructorimpl(s & MAX_VALUE), UInt.m15793constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: and-xj2QHRw */
    public static final short m15973andxj2QHRw(short s, short s2) {
        return m15979constructorimpl((short) (s & s2));
    }

    @InlineOnly
    /* renamed from: or-xj2QHRw */
    public static final short m16002orxj2QHRw(short s, short s2) {
        return m15979constructorimpl((short) (s | s2));
    }

    @InlineOnly
    /* renamed from: xor-xj2QHRw */
    public static final short m16028xorxj2QHRw(short s, short s2) {
        return m15979constructorimpl((short) (s ^ s2));
    }

    @InlineOnly
    /* renamed from: inv-Mh2AYeg */
    public static final short m15993invMh2AYeg(short s) {
        return m15979constructorimpl((short) (~s));
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    public static final byte m16024toUBytew2LRezQ(short s) {
        return UByte.m15716constructorimpl((byte) s);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    public static final int m16025toUIntpVg5ArA(short s) {
        return UInt.m15793constructorimpl(s & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    public static final long m16026toULongsVKNKU(short s) {
        return ULong.m15872constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m16023toStringimpl(short s) {
        return String.valueOf(s & MAX_VALUE);
    }

    @NotNull
    public String toString() {
        return m16023toStringimpl(this.data);
    }
}
