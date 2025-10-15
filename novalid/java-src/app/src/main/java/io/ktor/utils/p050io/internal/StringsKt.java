package io.ktor.utils.p050io.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import io.ktor.utils.p050io.charsets.UTFKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Strings.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000\u001a$\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a9\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0082\b\u001a$\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a9\u0010\r\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0082\b\u001a(\u0010\u000e\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000\u001a$\u0010\u000f\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a$\u0010\u0010\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¨\u0006\u0011"}, m7105d2 = {"decodeASCII", "", "Ljava/nio/ByteBuffer;", "out", "", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH, "decodeASCII3_array", "", "predicate", "Lkotlin/Function1;", "", "", "decodeASCII3_buffer", "decodeASCIILine", "decodeASCIILine_array", "decodeASCIILine_buffer", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nio/ktor/utils/io/internal/StringsKt\n*L\n1#1,241:1\n166#1,30:242\n204#1,36:272\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nio/ktor/utils/io/internal/StringsKt\n*L\n25#1:242,30\n68#1:272,36\n*E\n"})
/* loaded from: classes5.dex */
public final class StringsKt {
    public static /* synthetic */ int decodeASCII$default(ByteBuffer byteBuffer, char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return decodeASCII(byteBuffer, cArr, i, i2);
    }

    public static final int decodeASCII(@NotNull ByteBuffer byteBuffer, @NotNull char[] out, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        if (byteBuffer.hasArray()) {
            return decodeASCII3_array(byteBuffer, out, i, i2);
        }
        return decodeASCII3_buffer(byteBuffer, out, i, i2);
    }

    public static /* synthetic */ long decodeASCIILine$default(ByteBuffer byteBuffer, char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return decodeASCIILine(byteBuffer, cArr, i, i2);
    }

    public static final long decodeASCIILine(@NotNull ByteBuffer byteBuffer, @NotNull char[] out, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        return byteBuffer.hasArray() ? decodeASCIILine_array(byteBuffer, out, i, i2) : decodeASCIILine_buffer(byteBuffer, out, i, i2);
    }

    public static final int decodeASCII3_array(ByteBuffer byteBuffer, char[] cArr, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iRemaining = byteBuffer.remaining() + iArrayOffset;
        if (i4 > cArr.length || iRemaining > bArrArray.length) {
            i3 = i;
        } else {
            i3 = i;
            while (iArrayOffset < iRemaining && i3 < i4) {
                byte b = bArrArray[iArrayOffset];
                if (b < 0) {
                    break;
                }
                cArr[i3] = (char) b;
                i3++;
                iArrayOffset++;
            }
            byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
        }
        return i3 - i;
    }

    public static final int decodeASCII3_buffer(ByteBuffer byteBuffer, char[] cArr, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        boolean z = false;
        if (i4 <= cArr.length) {
            i3 = i;
            while (byteBuffer.hasRemaining()) {
                byte b = byteBuffer.get();
                if (b < 0 || i3 >= i4) {
                    z = true;
                    break;
                }
                cArr[i3] = (char) b;
                i3++;
            }
        } else {
            i3 = i;
        }
        if (z) {
            byteBuffer.position(byteBuffer.position() - 1);
        }
        return i3 - i;
    }

    public static final long decodeASCII3_array(ByteBuffer byteBuffer, char[] cArr, int i, int i2, Function1<? super Character, Boolean> function1) {
        int i3;
        int i4 = i2 + i;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iRemaining = byteBuffer.remaining() + iArrayOffset;
        if (i4 > cArr.length || iRemaining > bArrArray.length) {
            i3 = i;
        } else {
            i3 = i;
            while (iArrayOffset < iRemaining) {
                byte b = bArrArray[iArrayOffset];
                if (b < 0) {
                    break;
                }
                char c = (char) b;
                if (!function1.invoke(Character.valueOf(c)).booleanValue()) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    return UTFKt.decodeUtf8Result(i3 - i, -1);
                }
                if (i3 >= i4) {
                    break;
                }
                cArr[i3] = c;
                i3++;
                iArrayOffset++;
            }
            byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
        }
        return UTFKt.decodeUtf8Result(i3 - i, 0);
    }

    public static final long decodeASCII3_buffer(ByteBuffer byteBuffer, char[] cArr, int i, int i2, Function1<? super Character, Boolean> function1) {
        int i3;
        boolean z;
        boolean z2;
        int i4 = i2 + i;
        if (i4 <= cArr.length) {
            i3 = i;
            while (byteBuffer.hasRemaining()) {
                byte b = byteBuffer.get();
                if (b >= 0) {
                    char c = (char) b;
                    if (!function1.invoke(Character.valueOf(c)).booleanValue()) {
                        z = true;
                        break;
                    }
                    if (i3 < i4) {
                        cArr[i3] = c;
                        i3++;
                    }
                }
                z = true;
                z2 = false;
            }
        } else {
            i3 = i;
        }
        z = false;
        z2 = z;
        if (z) {
            byteBuffer.position(byteBuffer.position() - 1);
        }
        return UTFKt.decodeUtf8Result(i3 - i, z2 ? -1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long decodeASCIILine_array(ByteBuffer byteBuffer, char[] cArr, int i, int i2) {
        int i3;
        boolean z;
        long jDecodeUtf8Result;
        boolean z2;
        int i4 = i2 + i;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iRemaining = byteBuffer.remaining() + iArrayOffset;
        if (i4 > cArr.length || iRemaining > bArrArray.length) {
            i3 = i;
            z = false;
        } else {
            i3 = i;
            z = false;
            while (iArrayOffset < iRemaining) {
                byte b = bArrArray[iArrayOffset];
                if (b < 0) {
                    break;
                }
                char c = (char) b;
                if (c == '\r') {
                    z = true;
                } else if (c == '\n') {
                    z = false;
                } else {
                    z2 = !z;
                    if (z2) {
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        jDecodeUtf8Result = UTFKt.decodeUtf8Result(i3 - i, -1);
                        break;
                    }
                    if (i3 >= i4) {
                        break;
                    }
                    cArr[i3] = c;
                    i3++;
                    iArrayOffset++;
                }
                z2 = z;
                if (z2) {
                }
            }
            byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
        }
        jDecodeUtf8Result = UTFKt.decodeUtf8Result(i3 - i, 0);
        if (((int) (4294967295L & jDecodeUtf8Result)) == -1) {
            int i5 = (int) (jDecodeUtf8Result >> 32);
            if (z) {
                return UTFKt.decodeUtf8Result(i5 - 1, -1);
            }
            byteBuffer.position(byteBuffer.position() + 1);
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (cArr[i6] == '\r') {
                    return UTFKt.decodeUtf8Result(i6, -1);
                }
            }
        } else if (z) {
            int i7 = (int) (jDecodeUtf8Result >> 32);
            byteBuffer.position(byteBuffer.position() - 1);
            return UTFKt.decodeUtf8Result(i7 - 1, 2);
        }
        return jDecodeUtf8Result;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long decodeASCIILine_buffer(ByteBuffer byteBuffer, char[] cArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3 = i2 + i;
        int i4 = i;
        if (i3 <= cArr.length) {
            z2 = false;
            while (true) {
                if (!byteBuffer.hasRemaining()) {
                    z = false;
                    break;
                }
                byte b = byteBuffer.get();
                if (b < 0) {
                    break;
                }
                char c = (char) b;
                if (c == '\r') {
                    z2 = true;
                } else if (c == '\n') {
                    z2 = false;
                } else {
                    z4 = !z2;
                    if (z4) {
                        z = true;
                        break;
                    }
                    if (i4 >= i3) {
                        break;
                    }
                    cArr[i4] = c;
                    i4++;
                }
                z4 = z2;
                if (z4) {
                }
            }
            z = true;
            z3 = false;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        if (z) {
            byteBuffer.position(byteBuffer.position() - 1);
        }
        long jDecodeUtf8Result = UTFKt.decodeUtf8Result(i4 - i, z3 ? -1 : 0);
        if (((int) (4294967295L & jDecodeUtf8Result)) == -1) {
            int i5 = (int) (jDecodeUtf8Result >> 32);
            if (z2) {
                return UTFKt.decodeUtf8Result(i5 - 1, -1);
            }
            byteBuffer.position(byteBuffer.position() + 1);
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (cArr[i6] == '\r') {
                    return UTFKt.decodeUtf8Result(i6, -1);
                }
            }
        } else if (z2) {
            byteBuffer.position(byteBuffer.position() - 1);
            return UTFKt.decodeUtf8Result(((int) (jDecodeUtf8Result >> 32)) - 1, 2);
        }
        return jDecodeUtf8Result;
    }
}
