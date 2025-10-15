package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.p022io.doubleparser.AbstractFloatValueParser;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexExtensionsKt;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okio.Buffer;
import okio.ByteString;
import okio.C11963SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Buffer.kt */
@Metadata(m7104d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0080\b\u001a\r\u0010\u0018\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0015*\u00020\u0015H\u0080\b\u001a%\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0017\u0010\u001e\u001a\u00020\f*\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0015\u0010#\u001a\u00020$*\u00020\u00152\u0006\u0010%\u001a\u00020\u0007H\u0080\b\u001a\r\u0010&\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a%\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0007*\u00020\u00152\u0006\u0010-\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\r\u0010.\u001a\u00020\n*\u00020\u0017H\u0080\b\u001a-\u0010/\u001a\u00020\f*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a%\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u00100\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00102\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u000203H\u0080\b\u001a\u0014\u00104\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\r\u00106\u001a\u00020$*\u00020\u0015H\u0080\b\u001a\r\u00107\u001a\u00020\u0001*\u00020\u0015H\u0080\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00108\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u00108\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010;\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010<\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\r\u0010=\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010>\u001a\u00020?*\u00020\u0015H\u0080\b\u001a\u0014\u0010@\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\u0015\u0010A\u001a\u00020B*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010C\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\u000f\u0010D\u001a\u0004\u0018\u00010B*\u00020\u0015H\u0080\b\u001a\u0015\u0010E\u001a\u00020B*\u00020\u00152\u0006\u0010F\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u0007*\u00020\u00172\u0006\u0010H\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010I\u001a\u00020\n*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020LH\u0080\b\u001a\u0015\u0010M\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010N\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u0010N\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u000e*\u00020\u00152\u0006\u0010P\u001a\u00020\nH\u0080\b\u001a\u0015\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u0001H\u0080\b\u001a%\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0014*\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a)\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010S\u001a\u00020+2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010U\u001a\u00020\u0007*\u00020\u00152\u0006\u0010R\u001a\u00020TH\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0015*\u00020\u00152\u0006\u0010(\u001a\u00020\nH\u0080\b\u001a\u0015\u0010W\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Y\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Z\u001a\u00020\u0015*\u00020\u00152\u0006\u0010[\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\\\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010]\u001a\u00020\u0015*\u00020\u00152\u0006\u0010^\u001a\u00020\nH\u0080\b\u001a%\u0010_\u001a\u00020\u0015*\u00020\u00152\u0006\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010c\u001a\u00020\u0015*\u00020\u00152\u0006\u0010d\u001a\u00020\nH\u0080\b\u001a\u0014\u0010e\u001a\u00020B*\u00020\u00152\u0006\u0010f\u001a\u00020\u0007H\u0000\u001a?\u0010g\u001a\u0002Hh\"\u0004\b\u0000\u0010h*\u00020\u00152\u0006\u0010)\u001a\u00020\u00072\u001a\u0010i\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002Hh0jH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010k\u001a\u001e\u0010l\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020\fH\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, m7105d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES$annotations", "()V", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", "", "Lokio/Buffer;", "commonClose", "Lokio/Buffer$UnsafeCursor;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "commonEquals", "other", "", "commonExpandBuffer", "minByteCount", "commonGet", "", "pos", "commonHashCode", "commonIndexOf", "b", "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonNext", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadAndWriteUnsafe", "unsafeCursor", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", "", "commonReadUnsafe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonResizeBuffer", "newSize", "commonSeek", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", "source", "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteLong", "commonWriteShort", "s", "commonWriteUtf8", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", ExifInterface.GPS_DIRECTION_TRUE, "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmName(name = "-Buffer")
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
/* renamed from: okio.internal.-Buffer */
/* loaded from: classes7.dex */
public final class Buffer {

    @NotNull
    public static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray(HexExtensionsKt.LOWER_CASE_HEX_DIGITS);
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i, @NotNull byte[] bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i4 = segment.limit;
        byte[] bArr = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull okio.Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.getByte(j2) == 13) {
                String utf8 = buffer.readUtf8(j2);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(@NotNull okio.Buffer buffer, long j, @NotNull Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 <= j) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j2 = j3;
            } else {
                return lambda.invoke(segment, Long.valueOf(j2));
            }
        }
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0065, code lost:
    
        if (r19 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0067, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0068, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int selectPrefix(@NotNull okio.Buffer buffer, @NotNull Options options, boolean z) {
        int i;
        int i2;
        Segment segment;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Segment segment2 = buffer.head;
        if (segment2 != null) {
            byte[] bArr = segment2.data;
            int i5 = segment2.pos;
            int i6 = segment2.limit;
            int[] trie = options.getTrie();
            Segment segment3 = segment2;
            int i7 = -1;
            int i8 = 0;
            loop0: while (true) {
                int i9 = i8 + 1;
                int i10 = trie[i8];
                int i11 = i8 + 2;
                int i12 = trie[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (segment3 == null) {
                    break;
                }
                if (i10 >= 0) {
                    i = i5 + 1;
                    int i13 = bArr[i5] & 255;
                    int i14 = i11 + i10;
                    while (i11 != i14) {
                        if (i13 == trie[i11]) {
                            i2 = trie[i11 + i10];
                            if (i == i6) {
                                segment3 = segment3.next;
                                Intrinsics.checkNotNull(segment3);
                                i = segment3.pos;
                                bArr = segment3.data;
                                i6 = segment3.limit;
                                if (segment3 == segment2) {
                                    segment3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                int i15 = i11 + (i10 * (-1));
                while (true) {
                    int i16 = i5 + 1;
                    int i17 = i11 + 1;
                    if ((bArr[i5] & 255) != trie[i11]) {
                        return i7;
                    }
                    boolean z2 = i17 == i15;
                    if (i16 == i6) {
                        Intrinsics.checkNotNull(segment3);
                        Segment segment4 = segment3.next;
                        Intrinsics.checkNotNull(segment4);
                        i4 = segment4.pos;
                        byte[] bArr2 = segment4.data;
                        i3 = segment4.limit;
                        if (segment4 != segment2) {
                            segment = segment4;
                            bArr = bArr2;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            segment = null;
                        }
                    } else {
                        segment = segment3;
                        i3 = i6;
                        i4 = i16;
                    }
                    if (z2) {
                        i2 = trie[i17];
                        i = i4;
                        i6 = i3;
                        segment3 = segment;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    segment3 = segment;
                    i11 = i17;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
        } else {
            return z ? -2 : -1;
        }
    }

    @NotNull
    public static final okio.Buffer commonCopyTo(@NotNull okio.Buffer buffer, @NotNull okio.Buffer out, long j, long j2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j, j2);
        if (j2 == 0) {
            return buffer;
        }
        out.setSize$okio(out.size() + j2);
        Segment segment = buffer.head;
        while (true) {
            Intrinsics.checkNotNull(segment);
            int i = segment.limit;
            int i2 = segment.pos;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            segment = segment.next;
        }
        while (j2 > 0) {
            Intrinsics.checkNotNull(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            int i3 = segmentSharedCopy.pos + ((int) j);
            segmentSharedCopy.pos = i3;
            segmentSharedCopy.limit = Math.min(i3 + ((int) j2), segmentSharedCopy.limit);
            Segment segment2 = out.head;
            if (segment2 == null) {
                segmentSharedCopy.prev = segmentSharedCopy;
                segmentSharedCopy.next = segmentSharedCopy;
                out.head = segmentSharedCopy;
            } else {
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segmentSharedCopy);
            }
            j2 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
            segment = segment.next;
            j = 0;
        }
        return buffer;
    }

    public static final long commonCompleteSegmentByteCount(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    public static final byte commonReadByte(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        buffer.setSize$okio(buffer.size() - 1);
        if (i3 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    public static final short commonReadShort(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        buffer.setSize$okio(buffer.size() - 2);
        if (i5 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return (short) i6;
    }

    public static final int commonReadInt(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        buffer.setSize$okio(buffer.size() - 4);
        if (i5 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return i6;
    }

    public static final long commonReadLong(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i4 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return j2;
    }

    public static final byte commonGet(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + j) - size)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + j) - j2)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j2 = j3;
        }
    }

    public static final void commonClear(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonSkip(@NotNull okio.Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, segment.limit - segment.pos);
            long j2 = iMin;
            buffer.setSize$okio(buffer.size() - j2);
            j -= j2;
            int i = segment.pos + iMin;
            segment.pos = i;
            if (i == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteDecimalLong(@NotNull okio.Buffer buffer, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < AbstractFloatValueParser.MINIMAL_NINETEEN_DIGIT_INTEGER ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = getHEX_DIGIT_BYTES()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = Cea608Decoder.CTRL_CARRIAGE_RETURN;
        }
        segmentWritableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + i);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        segmentWritableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + i);
        return buffer;
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull okio.Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            Segment segmentTake = SegmentPool.take();
            buffer.head = segmentTake;
            segmentTake.prev = segmentTake;
            segmentTake.next = segmentTake;
            return segmentTake;
        }
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        SegmentedByteString.checkOffsetAndCount(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i3 - i, 8192 - segmentWritableSegment$okio.limit);
            int i4 = i + iMin;
            ArraysKt___ArraysJvmKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i, i4);
            segmentWritableSegment$okio.limit += iMin;
            i = i4;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j < 0 || j > ParserMinimalBase.MAX_INT_L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = buffer.read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i, i2);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i2, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i3 = segment.pos;
        ArraysKt___ArraysJvmKt.copyInto(bArr, sink, i, i3, i3 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - iMin);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final long commonReadDecimalLong(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        okio.Buffer bufferWriteByte = new okio.Buffer().writeDecimalLong(j).writeByte((int) b);
                        if (!z) {
                            bufferWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
                    }
                    j = (j * 10) + i4;
                } else {
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z2) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - i);
        if (i >= (z ? 2 : 1)) {
            return z ? j : -j;
        }
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + SegmentedByteString.toHexString(buffer.getByte(0L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ac A[EDGE_INSN: B:92:0x00ac->B:86:0x00ac BREAK  A[LOOP:0: B:54:0x0012->B:94:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadHexadecimalUnsignedLong(@NotNull okio.Buffer buffer) throws EOFException {
        int i;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            int i4 = segment.limit;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b + ExifInterface.MARKER_SOF9;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + SegmentedByteString.toHexString(b));
                    }
                    z = true;
                    if (i3 != i4) {
                        buffer.head = segment.pop();
                        SegmentPool.recycle(segment);
                    } else {
                        segment.pos = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new okio.Buffer().writeHexadecimalUnsignedLong(j).writeByte((int) b).readUtf8());
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - i2);
        return j;
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j < 0 || j > ParserMinimalBase.MAX_INT_L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j >= 4096) {
            ByteString byteStringSnapshot = buffer.snapshot((int) j);
            buffer.skip(j);
            return byteStringSnapshot;
        }
        return new ByteString(buffer.readByteArray(j));
    }

    public static final int commonSelect(@NotNull okio.Buffer buffer, @NotNull Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() < j) {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
        sink.write(buffer, j);
    }

    public static final long commonReadAll(@NotNull okio.Buffer buffer, @NotNull Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j < 0 || j > ParserMinimalBase.MAX_INT_L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        if (i + j > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
        }
        int i2 = (int) j;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i, i + i2);
        segment.pos += i2;
        buffer.setSize$okio(buffer.size() - j);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull okio.Buffer buffer, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j2);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j2 < buffer.size() && buffer.getByte(j2 - 1) == 13 && buffer.getByte(j2) == 10) {
            return readUtf8Line(buffer, j2);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j) + " content=" + buffer2.readByteString().hex() + Typography.ellipsis);
    }

    public static final int commonReadUtf8CodePoint(@NotNull okio.Buffer buffer) throws EOFException {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b = buffer.getByte(0L);
        if ((b & 128) == 0) {
            i = b & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & 31;
            i2 = 2;
            i3 = 128;
        } else if ((b & 240) == 224) {
            i = b & Ascii.f786SI;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (buffer.size() < j) {
            throw new EOFException("size < " + i2 + ": " + buffer.size() + " (to read code point prefixed 0x" + SegmentedByteString.toHexString(b) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte b2 = buffer.getByte(j2);
            if ((b2 & ExifInterface.MARKER_SOF0) != 128) {
                buffer.skip(j2);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = (i << 6) | (b2 & 63);
        }
        buffer.skip(j);
        return i > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i || i >= 57344) && i >= i3) ? i : Utf8.REPLACEMENT_CODE_POINT;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8(@NotNull okio.Buffer buffer, @NotNull String string, int i, int i2) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i3 = segmentWritableSegment$okio.limit - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = segmentWritableSegment$okio.limit;
                int i6 = (i3 + i) - i5;
                segmentWritableSegment$okio.limit = i5 + i6;
                buffer.setSize$okio(buffer.size() + i6);
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i7 = segmentWritableSegment$okio2.limit;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i7 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i8 = segmentWritableSegment$okio3.limit;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i8 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i11 = segmentWritableSegment$okio4.limit;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i11 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8CodePoint(@NotNull okio.Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i < 128) {
            buffer.writeByte(i);
        } else if (i < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i2 = segmentWritableSegment$okio.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio.limit = i2 + 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else if (55296 <= i && i < 57344) {
            buffer.writeByte(63);
        } else if (i < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i3 = segmentWritableSegment$okio2.limit;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio2.limit = i3 + 3;
            buffer.setSize$okio(buffer.size() + 3);
        } else if (i <= 1114111) {
            Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
            byte[] bArr3 = segmentWritableSegment$okio3.data;
            int i4 = segmentWritableSegment$okio3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            segmentWritableSegment$okio3.limit = i4 + 4;
            buffer.setSize$okio(buffer.size() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i));
        }
        return buffer;
    }

    public static final long commonWriteAll(@NotNull okio.Buffer buffer, @NotNull Source source) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(buffer, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull Source source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j > 0) {
            long j2 = source.read(buffer, j);
            if (j2 == -1) {
                throw new EOFException();
            }
            j -= j2;
        }
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteByte(@NotNull okio.Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteShort(@NotNull okio.Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i2 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteInt(@NotNull okio.Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i2 = segmentWritableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        segmentWritableSegment$okio.limit = i2 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteLong(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i = segmentWritableSegment$okio.limit;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        segmentWritableSegment$okio.limit = i + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final void commonWrite(@NotNull okio.Buffer buffer, @NotNull okio.Buffer source, long j) {
        Segment segment;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == buffer) {
            throw new IllegalArgumentException("source == this".toString());
        }
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j);
        while (j > 0) {
            Segment segment2 = source.head;
            Intrinsics.checkNotNull(segment2);
            int i = segment2.limit;
            Intrinsics.checkNotNull(source.head);
            if (j < i - r1.pos) {
                Segment segment3 = buffer.head;
                if (segment3 != null) {
                    Intrinsics.checkNotNull(segment3);
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= 8192) {
                        Segment segment4 = source.head;
                        Intrinsics.checkNotNull(segment4);
                        segment4.writeTo(segment, (int) j);
                        source.setSize$okio(source.size() - j);
                        buffer.setSize$okio(buffer.size() + j);
                        return;
                    }
                }
                Segment segment5 = source.head;
                Intrinsics.checkNotNull(segment5);
                source.head = segment5.split((int) j);
            }
            Segment segment6 = source.head;
            Intrinsics.checkNotNull(segment6);
            long j2 = segment6.limit - segment6.pos;
            source.head = segment6.pop();
            Segment segment7 = buffer.head;
            if (segment7 == null) {
                buffer.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6;
            } else {
                Intrinsics.checkNotNull(segment7);
                Segment segment8 = segment7.prev;
                Intrinsics.checkNotNull(segment8);
                segment8.push(segment6).compact();
            }
            source.setSize$okio(source.size() - j2);
            buffer.setSize$okio(buffer.size() + j2);
            j -= j2;
        }
    }

    public static final long commonRead(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j > buffer.size()) {
            j = buffer.size();
        }
        sink.write(buffer, j);
        return j;
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, byte b, long j, long j2) {
        Segment segment;
        int i;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > buffer.size()) {
            j2 = buffer.size();
        }
        if (j == j2 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < j2) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + j2) - size);
                i = (int) ((segment.pos + j) - size);
                while (i < iMin) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j = size;
            }
            return -1L;
        }
        while (true) {
            long j3 = (segment.limit - segment.pos) + size;
            if (j3 > j) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j3;
        }
        while (size < j2) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + j2) - size);
            i = (int) ((segment.pos + j) - size);
            while (i < iMin2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j = size;
        }
        return -1L;
        return (i - segment.pos) + size;
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, @NotNull ByteString bytes, long j) {
        long size;
        int i;
        long j2 = j;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j2 >= j2) {
            while (true) {
                long j4 = (segment.limit - segment.pos) + j3;
                if (j4 > j2) {
                    break;
                }
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j3 = j4;
            }
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b = bArrInternalArray$okio[0];
            int size2 = bytes.size();
            long size3 = (buffer.size() - size2) + 1;
            size = j3;
            while (size < size3) {
                byte[] bArr = segment.data;
                long j5 = size3;
                int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                i = (int) ((segment.pos + j2) - size);
                while (i < iMin) {
                    if (bArr[i] == b && rangeEquals(segment, i + 1, bArrInternalArray$okio, 1, size2)) {
                    }
                    i++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size3 = j5;
                j2 = size;
            }
            return -1L;
        }
        size = buffer.size();
        while (size > j2) {
            segment = segment.prev;
            Intrinsics.checkNotNull(segment);
            size -= segment.limit - segment.pos;
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b2 = bArrInternalArray$okio2[0];
        int size4 = bytes.size();
        long size5 = (buffer.size() - size4) + 1;
        while (size < size5) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
            i = (int) ((segment.pos + j2) - size);
            while (i < iMin2) {
                if (bArr2[i] != b2 || !rangeEquals(segment, i + 1, bArrInternalArray$okio2, 1, size4)) {
                    i++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j2 = size;
        }
        return -1L;
        return (i - segment.pos) + size;
    }

    public static final boolean commonRangeEquals(@NotNull okio.Buffer buffer, long j, @NotNull ByteString bytes, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || buffer.size() - j < i2 || bytes.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (buffer.getByte(i3 + j) != bytes.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean commonEquals(@NotNull okio.Buffer buffer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = buffer2.head;
        Intrinsics.checkNotNull(segment2);
        int i = segment.pos;
        int i2 = segment2.pos;
        long j = 0;
        while (j < buffer.size()) {
            long jMin = Math.min(segment.limit - i, segment2.limit - i2);
            long j2 = 0;
            while (j2 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (segment.data[i] != segment2.data[i2]) {
                    return false;
                }
                j2++;
                i = i3;
                i2 = i4;
            }
            if (i == segment.limit) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                i = segment.pos;
            }
            if (i2 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i2 = segment2.pos;
            }
            j += jMin;
        }
        return true;
    }

    public static final int commonHashCode(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i;
    }

    @NotNull
    public static final okio.Buffer commonCopy(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            Intrinsics.checkNotNull(segment3);
            Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() > ParserMinimalBase.MAX_INT_L) {
            throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
        }
        return buffer.snapshot((int) buffer.size());
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i);
        Segment segment = buffer.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(segment);
            int i5 = segment.limit;
            int i6 = segment.pos;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = buffer.head;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(segment2);
            bArr[i7] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.pos;
            segment2.shared = true;
            i7++;
            segment2 = segment2.next;
        }
        return new C11963SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadUnsafe(@NotNull okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(@NotNull okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final int commonNext(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        Intrinsics.checkNotNull(buffer);
        if (j == buffer.size()) {
            throw new IllegalStateException("no more bytes".toString());
        }
        long j2 = unsafeCursor.offset;
        return unsafeCursor.seek(j2 == -1 ? 0L : j2 + (unsafeCursor.end - unsafeCursor.start));
    }

    public static final int commonSeek(@NotNull Buffer.UnsafeCursor unsafeCursor, long j) {
        Segment segmentPush;
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j < -1 || j > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + buffer.size());
        }
        if (j == -1 || j == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment = buffer.head;
        long j2 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j3 = unsafeCursor.offset;
            int i = unsafeCursor.start;
            Intrinsics.checkNotNull(unsafeCursor.getSegment());
            long j4 = j3 - (i - r9.pos);
            if (j4 > j) {
                segmentPush = segment;
                segment = unsafeCursor.getSegment();
                size = j4;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j2 = j4;
            }
        } else {
            segmentPush = segment;
        }
        if (size - j > j - j2) {
            while (true) {
                Intrinsics.checkNotNull(segmentPush);
                int i2 = segmentPush.limit;
                int i3 = segmentPush.pos;
                if (j < (i2 - i3) + j2) {
                    break;
                }
                j2 += i2 - i3;
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j) {
                Intrinsics.checkNotNull(segment);
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            j2 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            Intrinsics.checkNotNull(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment2 = segmentPush.prev;
                Intrinsics.checkNotNull(segment2);
                segment2.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j;
        Intrinsics.checkNotNull(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i4 = segmentPush.pos + ((int) (j - j2));
        unsafeCursor.start = i4;
        int i5 = segmentPush.limit;
        unsafeCursor.end = i5;
        return i5 - i4;
    }

    public static final long commonResizeBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, long j) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        if (j <= size) {
            if (j < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j).toString());
            }
            long j2 = size - j;
            while (true) {
                if (j2 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = segment.prev;
                Intrinsics.checkNotNull(segment2);
                int i = segment2.limit;
                long j3 = i - segment2.pos;
                if (j3 <= j2) {
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j2 -= j3;
                } else {
                    segment2.limit = i - ((int) j2);
                    break;
                }
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j > size) {
            long j4 = j - size;
            boolean z = true;
            while (j4 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j4, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j4 -= iMin;
                if (z) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i2 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i2 - iMin;
                    unsafeCursor.end = i2;
                    z = false;
                }
            }
        }
        buffer.setSize$okio(j);
        return size;
    }

    public static final long commonExpandBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, int i) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (i <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
        int i2 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j = i2;
        buffer.setSize$okio(size + j);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i2;
        unsafeCursor.end = 8192;
        return j;
    }

    public static final void commonClose(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonIndexOfElement(@NotNull okio.Buffer buffer, @NotNull ByteString targetBytes, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j >= j) {
            while (true) {
                long j2 = (segment.limit - segment.pos) + size;
                if (j2 > j) {
                    break;
                }
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size = j2;
            }
            if (targetBytes.size() == 2) {
                byte b = targetBytes.getByte(0);
                byte b2 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((segment.pos + j) - size);
                    int i3 = segment.limit;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 == b || b3 == b2) {
                            i2 = segment.pos;
                        } else {
                            i++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((segment.pos + j) - size);
                    int i4 = segment.limit;
                    while (i < i4) {
                        byte b4 = bArr2[i];
                        for (byte b5 : bArrInternalArray$okio) {
                            if (b4 == b5) {
                                i2 = segment.pos;
                            }
                        }
                        i++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j = size;
                }
            }
            return -1L;
        }
        size = buffer.size();
        while (size > j) {
            segment = segment.prev;
            Intrinsics.checkNotNull(segment);
            size -= segment.limit - segment.pos;
        }
        if (targetBytes.size() == 2) {
            byte b6 = targetBytes.getByte(0);
            byte b7 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((segment.pos + j) - size);
                int i5 = segment.limit;
                while (i < i5) {
                    byte b8 = bArr3[i];
                    if (b8 == b6 || b8 == b7) {
                        i2 = segment.pos;
                    } else {
                        i++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((segment.pos + j) - size);
                int i6 = segment.limit;
                while (i < i6) {
                    byte b9 = bArr4[i];
                    for (byte b10 : bArrInternalArray$okio2) {
                        if (b9 == b10) {
                            i2 = segment.pos;
                        }
                    }
                    i++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j = size;
            }
        }
        return -1L;
        return (i - i2) + size;
    }
}
