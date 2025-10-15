package kotlin;

import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt___URangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: UInt.kt */
@SinceKotlin(version = YouTubePlayerBridge.RATE_1_5)
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001{B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0005J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001a\u0010\u000fJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001b\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b%\u0010\u000fJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b&\u0010\u000bJ\u0018\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b'\u0010\u001dJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u0005J\u0013\u0010+\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b,\u0010\u0005J\u0013\u0010-\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b.\u0010\u0005J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b0\u0010\u000fJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b1\u0010\u000bJ\u0018\u0010/\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b2\u0010\u001dJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b3\u0010\u0016J\u0018\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b5\u00106J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b8\u0010\u001dJ\u0018\u00104\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b<\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b>\u0010\u000fJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b@\u0010\u001dJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bA\u0010\u0016J\u0018\u0010B\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bG\u0010EJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\bI\u0010\u000fJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bJ\u0010\u000bJ\u0018\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bK\u0010\u001dJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bL\u0010\u0016J\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0003H\u0087\fø\u0001\u0000¢\u0006\u0004\bO\u0010\u000bJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0003H\u0087\fø\u0001\u0000¢\u0006\u0004\bQ\u0010\u000bJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\bS\u0010\u000fJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bT\u0010\u000bJ\u0018\u0010R\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bU\u0010\u001dJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bV\u0010\u0016J\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\\H\u0087\b¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020`H\u0087\b¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bd\u0010\u0005J\u0010\u0010e\u001a\u00020fH\u0087\b¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020jH\u0087\b¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020nH\u0016¢\u0006\u0004\bo\u0010pJ\u0013\u0010q\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\br\u0010ZJ\u0013\u0010s\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bt\u0010\u0005J\u0013\u0010u\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bv\u0010hJ\u0013\u0010w\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\bx\u0010lJ\u0018\u0010y\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bz\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006|"}, m7105d2 = {"Lkotlin/UInt;", "", "data", "", "constructor-impl", "(I)I", "getData$annotations", "()V", "and", "other", "and-WZ4Q5Ns", "(II)I", "compareTo", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec", "dec-pVg5ArA", TtmlNode.TAG_DIV, "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "inc", "inc-pVg5ArA", "inv", "inv-pVg5ArA", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(IB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(IS)S", "or", "or-WZ4Q5Ns", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-WZ4Q5Ns", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-pVg5ArA", "shr", "shr-pVg5ArA", ScriptTagPayloadReader.KEY_TIMES, "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(I)B", "toDouble", "", "toDouble-impl", "(I)D", "toFloat", "", "toFloat-impl", "(I)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toShort", "", "toShort-impl", "(I)S", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-WZ4Q5Ns", "Companion", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes8.dex */
public final class UInt implements Comparable<UInt> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    public final int data;

    /* renamed from: box-impl */
    public static final /* synthetic */ UInt m15788boximpl(int i) {
        return new UInt(i);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static int m15793constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl */
    public static boolean m15799equalsimpl(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m15800equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m15805hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    public static final byte m15833toByteimpl(int i) {
        return (byte) i;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    public static final int m15836toIntimpl(int i) {
        return i;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    public static final long m15837toLongimpl(int i) {
        return i & 4294967295L;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    public static final short m15838toShortimpl(int i) {
        return (short) i;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    public static final int m15841toUIntpVg5ArA(int i) {
        return i;
    }

    public boolean equals(Object obj) {
        return m15799equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m15805hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(getData(), uInt.getData());
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public /* synthetic */ UInt(int i) {
        this.data = i;
    }

    /* compiled from: UInt.kt */
    @Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, m7105d2 = {"Lkotlin/UInt$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UInt;", "I", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    public static final int m15789compareTo7apg3OU(int i, byte b) {
        return Integer.compare(i ^ Integer.MIN_VALUE, m15793constructorimpl(b & 255) ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    public static final int m15792compareToxj2QHRw(int i, short s) {
        return Integer.compare(i ^ Integer.MIN_VALUE, m15793constructorimpl(s & UShort.MAX_VALUE) ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    public static int m15791compareToWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.uintCompare(i, i2);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    public final int m15845compareToWZ4Q5Ns(int i) {
        return UnsignedKt.uintCompare(getData(), i);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    public static final int m15790compareToVKZWuLQ(int i, long j) {
        return Long.compare(ULong.m15872constructorimpl(i & 4294967295L) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    public static final int m15817plus7apg3OU(int i, byte b) {
        return m15793constructorimpl(i + m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    public static final int m15820plusxj2QHRw(int i, short s) {
        return m15793constructorimpl(i + m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    public static final int m15819plusWZ4Q5Ns(int i, int i2) {
        return m15793constructorimpl(i + i2);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    public static final long m15818plusVKZWuLQ(int i, long j) {
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl(i & 4294967295L) + j);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    public static final int m15808minus7apg3OU(int i, byte b) {
        return m15793constructorimpl(i - m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    public static final int m15811minusxj2QHRw(int i, short s) {
        return m15793constructorimpl(i - m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    public static final int m15810minusWZ4Q5Ns(int i, int i2) {
        return m15793constructorimpl(i - i2);
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    public static final long m15809minusVKZWuLQ(int i, long j) {
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl(i & 4294967295L) - j);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    public static final int m15829times7apg3OU(int i, byte b) {
        return m15793constructorimpl(i * m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    public static final int m15832timesxj2QHRw(int i, short s) {
        return m15793constructorimpl(i * m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    public static final int m15831timesWZ4Q5Ns(int i, int i2) {
        return m15793constructorimpl(i * i2);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    public static final long m15830timesVKZWuLQ(int i, long j) {
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl(i & 4294967295L) * j);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    public static final int m15795div7apg3OU(int i, byte b) {
        return UByte$$ExternalSyntheticBackport0.m7113m(i, m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    public static final int m15798divxj2QHRw(int i, short s) {
        return UByte$$ExternalSyntheticBackport0.m7113m(i, m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    public static final int m15797divWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m16050uintDivideJ1ME1BU(i, i2);
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    public static final long m15796divVKZWuLQ(int i, long j) {
        return UByte$$ExternalSyntheticBackport3.m7116m(ULong.m15872constructorimpl(i & 4294967295L), j);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    public static final int m15823rem7apg3OU(int i, byte b) {
        return UByte$$ExternalSyntheticBackport1.m7114m(i, m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    public static final int m15826remxj2QHRw(int i, short s) {
        return UByte$$ExternalSyntheticBackport1.m7114m(i, m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    public static final int m15825remWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m16051uintRemainderJ1ME1BU(i, i2);
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    public static final long m15824remVKZWuLQ(int i, long j) {
        return UByte$$ExternalSyntheticBackport2.m7115m(ULong.m15872constructorimpl(i & 4294967295L), j);
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    public static final int m15801floorDiv7apg3OU(int i, byte b) {
        return UByte$$ExternalSyntheticBackport0.m7113m(i, m15793constructorimpl(b & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    public static final int m15804floorDivxj2QHRw(int i, short s) {
        return UByte$$ExternalSyntheticBackport0.m7113m(i, m15793constructorimpl(s & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    public static final int m15803floorDivWZ4Q5Ns(int i, int i2) {
        return UByte$$ExternalSyntheticBackport0.m7113m(i, i2);
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    public static final long m15802floorDivVKZWuLQ(int i, long j) {
        return UByte$$ExternalSyntheticBackport3.m7116m(ULong.m15872constructorimpl(i & 4294967295L), j);
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    public static final byte m15812mod7apg3OU(int i, byte b) {
        return UByte.m15716constructorimpl((byte) UByte$$ExternalSyntheticBackport1.m7114m(i, m15793constructorimpl(b & 255)));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    public static final short m15815modxj2QHRw(int i, short s) {
        return UShort.m15979constructorimpl((short) UByte$$ExternalSyntheticBackport1.m7114m(i, m15793constructorimpl(s & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    public static final int m15814modWZ4Q5Ns(int i, int i2) {
        return UByte$$ExternalSyntheticBackport1.m7114m(i, i2);
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    public static final long m15813modVKZWuLQ(int i, long j) {
        return UByte$$ExternalSyntheticBackport2.m7115m(ULong.m15872constructorimpl(i & 4294967295L), j);
    }

    @InlineOnly
    /* renamed from: inc-pVg5ArA */
    public static final int m15806incpVg5ArA(int i) {
        return m15793constructorimpl(i + 1);
    }

    @InlineOnly
    /* renamed from: dec-pVg5ArA */
    public static final int m15794decpVg5ArA(int i) {
        return m15793constructorimpl(i - 1);
    }

    @InlineOnly
    /* renamed from: rangeTo-WZ4Q5Ns */
    public static final UIntRange m15821rangeToWZ4Q5Ns(int i, int i2) {
        return new UIntRange(i, i2, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-WZ4Q5Ns */
    public static final UIntRange m15822rangeUntilWZ4Q5Ns(int i, int i2) {
        return URangesKt___URangesKt.m16967untilJ1ME1BU(i, i2);
    }

    @InlineOnly
    /* renamed from: shl-pVg5ArA */
    public static final int m15827shlpVg5ArA(int i, int i2) {
        return m15793constructorimpl(i << i2);
    }

    @InlineOnly
    /* renamed from: shr-pVg5ArA */
    public static final int m15828shrpVg5ArA(int i, int i2) {
        return m15793constructorimpl(i >>> i2);
    }

    @InlineOnly
    /* renamed from: and-WZ4Q5Ns */
    public static final int m15787andWZ4Q5Ns(int i, int i2) {
        return m15793constructorimpl(i & i2);
    }

    @InlineOnly
    /* renamed from: or-WZ4Q5Ns */
    public static final int m15816orWZ4Q5Ns(int i, int i2) {
        return m15793constructorimpl(i | i2);
    }

    @InlineOnly
    /* renamed from: xor-WZ4Q5Ns */
    public static final int m15844xorWZ4Q5Ns(int i, int i2) {
        return m15793constructorimpl(i ^ i2);
    }

    @InlineOnly
    /* renamed from: inv-pVg5ArA */
    public static final int m15807invpVg5ArA(int i) {
        return m15793constructorimpl(~i);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    public static final byte m15840toUBytew2LRezQ(int i) {
        return UByte.m15716constructorimpl((byte) i);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    public static final short m15843toUShortMh2AYeg(int i) {
        return UShort.m15979constructorimpl((short) i);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    public static final long m15842toULongsVKNKU(int i) {
        return ULong.m15872constructorimpl(i & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    public static final float m15835toFloatimpl(int i) {
        return (float) UnsignedKt.uintToDouble(i);
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    public static final double m15834toDoubleimpl(int i) {
        return UnsignedKt.uintToDouble(i);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m15839toStringimpl(int i) {
        return String.valueOf(i & 4294967295L);
    }

    @NotNull
    public String toString() {
        return m15839toStringimpl(this.data);
    }
}
