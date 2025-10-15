package io.ktor.utils.p050io.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputLittleEndian.kt */
@Metadata(m7104d1 = {"\u0000\u008e\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0082\b¢\u0006\u0002\u0010\b\u001aG\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0082\b¢\u0006\u0002\u0010\u000b\u001a&\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a3\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a3\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001d2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a&\u0010\f\u001a\u00020\r*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010\f\u001a\u00020\r*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010\f\u001a\u00020\r*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010\f\u001a\u00020\r*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010\f\u001a\u00020\r*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a3\u0010\f\u001a\u00020\r*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010!\u001a3\u0010\f\u001a\u00020\r*\u00020 2\u0006\u0010\u000f\u001a\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\"\u001a3\u0010\f\u001a\u00020\r*\u00020 2\u0006\u0010\u000f\u001a\u00020\u001d2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010#\u001a\u0012\u0010$\u001a\u00020%*\u00020 2\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010&\u001a\u00020%*\u00020\u000e\u001a\n\u0010&\u001a\u00020%*\u00020 \u001a\u0012\u0010'\u001a\u00020(*\u00020 2\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010)\u001a\u00020(*\u00020\u000e\u001a\n\u0010)\u001a\u00020(*\u00020 \u001a&\u0010*\u001a\u00020+*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010*\u001a\u00020+*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010*\u001a\u00020+*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010*\u001a\u00020+*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010*\u001a\u00020+*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a3\u0010*\u001a\u00020+*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a3\u0010*\u001a\u00020+*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a3\u0010*\u001a\u00020+*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001d2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a&\u0010*\u001a\u00020+*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010*\u001a\u00020+*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010*\u001a\u00020+*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010*\u001a\u00020+*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a&\u0010*\u001a\u00020+*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a3\u0010*\u001a\u00020+*\u00020 2\u0006\u0010\u000f\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u00102\u001a3\u0010*\u001a\u00020+*\u00020 2\u0006\u0010\u000f\u001a\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u00103\u001a3\u0010*\u001a\u00020+*\u00020 2\u0006\u0010\u000f\u001a\u00020\u001d2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00104\u001a\u0012\u00105\u001a\u00020\r*\u00020 2\u0006\u0010\t\u001a\u00020\n\u001a\n\u00106\u001a\u00020\r*\u00020\u000e\u001a\n\u00106\u001a\u00020\r*\u00020 \u001a\u0012\u00107\u001a\u000208*\u00020 2\u0006\u0010\t\u001a\u00020\n\u001a\n\u00109\u001a\u000208*\u00020\u000e\u001a\n\u00109\u001a\u000208*\u00020 \u001a\u0012\u0010:\u001a\u00020;*\u00020 2\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010<\u001a\u00020;*\u00020\u000e\u001a\n\u0010<\u001a\u00020;*\u00020 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006="}, m7105d2 = {"readPrimitiveTemplate", ExifInterface.GPS_DIRECTION_TRUE, "", "read", "Lkotlin/Function0;", "reverse", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "byteOrder", "Lio/ktor/utils/io/core/ByteOrder;", "(Lio/ktor/utils/io/core/ByteOrder;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "readAvailableLittleEndian", "", "Lio/ktor/utils/io/core/Buffer;", "dst", "", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH, "", "", "", "", "Lkotlin/UIntArray;", "readAvailableLittleEndian-o2ZM2JE", "(Lio/ktor/utils/io/core/Buffer;[III)I", "Lkotlin/ULongArray;", "readAvailableLittleEndian-pqYNikA", "(Lio/ktor/utils/io/core/Buffer;[JII)I", "Lkotlin/UShortArray;", "readAvailableLittleEndian-Wt3Bwxc", "(Lio/ktor/utils/io/core/Buffer;[SII)I", "Lio/ktor/utils/io/core/Input;", "(Lio/ktor/utils/io/core/Input;[III)I", "(Lio/ktor/utils/io/core/Input;[JII)I", "(Lio/ktor/utils/io/core/Input;[SII)I", "readDouble", "", "readDoubleLittleEndian", "readFloat", "", "readFloatLittleEndian", "readFullyLittleEndian", "", "readFullyLittleEndian-o2ZM2JE", "(Lio/ktor/utils/io/core/Buffer;[III)V", "readFullyLittleEndian-pqYNikA", "(Lio/ktor/utils/io/core/Buffer;[JII)V", "readFullyLittleEndian-Wt3Bwxc", "(Lio/ktor/utils/io/core/Buffer;[SII)V", "(Lio/ktor/utils/io/core/Input;[III)V", "(Lio/ktor/utils/io/core/Input;[JII)V", "(Lio/ktor/utils/io/core/Input;[SII)V", "readInt", "readIntLittleEndian", "readLong", "", "readLongLittleEndian", "readShort", "", "readShortLittleEndian", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInputLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputLittleEndian.kt\nio/ktor/utils/io/core/InputLittleEndianKt\n+ 2 ByteOrderJvm.kt\nio/ktor/utils/io/bits/ByteOrderJVMKt\n*L\n1#1,349:1\n344#1,3:350\n344#1,3:354\n344#1,3:358\n344#1,3:362\n344#1,3:372\n336#1:382\n336#1:384\n336#1:386\n336#1:388\n336#1:396\n336#1:404\n336#1:406\n336#1:408\n336#1:410\n336#1:418\n9#2:353\n15#2:357\n21#2:361\n30#2:365\n29#2:366\n28#2,5:367\n41#2:375\n40#2:376\n39#2,5:377\n9#2:383\n15#2:385\n21#2:387\n30#2:389\n29#2:390\n28#2,5:391\n41#2:397\n40#2:398\n39#2,5:399\n9#2:405\n15#2:407\n21#2:409\n30#2:411\n29#2:412\n28#2,5:413\n41#2:419\n40#2:420\n39#2,5:421\n9#2:426\n15#2:427\n21#2:428\n30#2:429\n29#2:430\n28#2,5:431\n41#2:436\n40#2:437\n39#2,5:438\n9#2:443\n15#2:444\n21#2:445\n30#2:446\n29#2:447\n28#2,5:448\n41#2:453\n40#2:454\n39#2,5:455\n9#2:460\n15#2:461\n21#2:462\n30#2:463\n29#2:464\n28#2,5:465\n41#2:470\n40#2:471\n39#2,5:472\n9#2:477\n15#2:478\n21#2:479\n30#2:480\n29#2:481\n28#2,5:482\n41#2:487\n40#2:488\n39#2,5:489\n*S KotlinDebug\n*F\n+ 1 InputLittleEndian.kt\nio/ktor/utils/io/core/InputLittleEndianKt\n*L\n9#1:350,3\n13#1:354,3\n17#1:358,3\n21#1:362,3\n25#1:372,3\n28#1:382\n31#1:384\n34#1:386\n37#1:388\n40#1:396\n43#1:404\n46#1:406\n49#1:408\n52#1:410\n55#1:418\n9#1:353\n13#1:357\n17#1:361\n21#1:365\n21#1:366\n21#1:367,5\n25#1:375\n25#1:376\n25#1:377,5\n28#1:383\n31#1:385\n34#1:387\n37#1:389\n37#1:390\n37#1:391,5\n40#1:397\n40#1:398\n40#1:399,5\n43#1:405\n46#1:407\n49#1:409\n52#1:411\n52#1:412\n52#1:413,5\n55#1:419\n55#1:420\n55#1:421,5\n68#1:426\n83#1:427\n98#1:428\n107#1:429\n107#1:430\n107#1:431,5\n116#1:436\n116#1:437\n116#1:438,5\n132#1:443\n150#1:444\n168#1:445\n180#1:446\n180#1:447\n180#1:448,5\n192#1:453\n192#1:454\n192#1:455,5\n209#1:460\n224#1:461\n239#1:462\n248#1:463\n248#1:464\n248#1:465,5\n257#1:470\n257#1:471\n257#1:472,5\n272#1:477\n288#1:478\n305#1:479\n317#1:480\n317#1:481\n317#1:482,5\n329#1:487\n329#1:488\n329#1:489,5\n*E\n"})
/* loaded from: classes5.dex */
public final class InputLittleEndianKt {

    /* compiled from: InputLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ByteOrder.values().length];
            try {
                iArr[ByteOrder.BIG_ENDIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final short readShortLittleEndian(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return Short.reverseBytes(InputPrimitivesKt.readShort(input));
    }

    public static final int readIntLittleEndian(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return Integer.reverseBytes(InputPrimitivesKt.readInt(input));
    }

    public static final long readLongLittleEndian(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return Long.reverseBytes(InputPrimitivesKt.readLong(input));
    }

    public static final float readFloatLittleEndian(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(InputPrimitivesKt.readFloat(input))));
    }

    public static final double readDoubleLittleEndian(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(InputPrimitivesKt.readDouble(input))));
    }

    public static final short readShortLittleEndian(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return Short.reverseBytes(BufferPrimitivesKt.readShort(buffer));
    }

    public static final int readIntLittleEndian(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return Integer.reverseBytes(BufferPrimitivesKt.readInt(buffer));
    }

    public static final long readLongLittleEndian(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return Long.reverseBytes(BufferPrimitivesKt.readLong(buffer));
    }

    public static final float readFloatLittleEndian(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(BufferPrimitivesKt.readFloat(buffer))));
    }

    public static final double readDoubleLittleEndian(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(BufferPrimitivesKt.readDouble(buffer))));
    }

    /* renamed from: readFullyLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m15628readFullyLittleEndianWt3Bwxc$default(Input input, short[] sArr, int i, int i2, int i3, Object obj) throws Throwable {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m16039getSizeimpl(sArr) - i;
        }
        m15626readFullyLittleEndianWt3Bwxc(input, sArr, i, i2);
    }

    /* renamed from: readFullyLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final void m15626readFullyLittleEndianWt3Bwxc(@NotNull Input readFullyLittleEndian, @NotNull short[] dst, int i, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, short[] sArr, int i, int i2, int i3, Object obj) throws Throwable {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        readFullyLittleEndian(input, sArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Input input, @NotNull short[] dst, int i, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Short.reverseBytes(dst[i]);
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: readFullyLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m15632readFullyLittleEndiano2ZM2JE$default(Input input, int[] iArr, int i, int i2, int i3, Object obj) throws Throwable {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m15855getSizeimpl(iArr) - i;
        }
        m15630readFullyLittleEndiano2ZM2JE(input, iArr, i, i2);
    }

    /* renamed from: readFullyLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final void m15630readFullyLittleEndiano2ZM2JE(@NotNull Input readFullyLittleEndian, @NotNull int[] dst, int i, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, int[] iArr, int i, int i2, int i3, Object obj) throws Throwable {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        readFullyLittleEndian(input, iArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Input input, @NotNull int[] dst, int i, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Integer.reverseBytes(dst[i]);
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: readFullyLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m15636readFullyLittleEndianpqYNikA$default(Input input, long[] jArr, int i, int i2, int i3, Object obj) throws Throwable {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m15934getSizeimpl(jArr) - i;
        }
        m15634readFullyLittleEndianpqYNikA(input, jArr, i, i2);
    }

    /* renamed from: readFullyLittleEndian-pqYNikA, reason: not valid java name */
    public static final void m15634readFullyLittleEndianpqYNikA(@NotNull Input readFullyLittleEndian, @NotNull long[] dst, int i, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, long[] jArr, int i, int i2, int i3, Object obj) throws Throwable {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        readFullyLittleEndian(input, jArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Input input, @NotNull long[] dst, int i, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Long.reverseBytes(dst[i]);
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, float[] fArr, int i, int i2, int i3, Object obj) throws Throwable {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        readFullyLittleEndian(input, fArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Input input, @NotNull float[] dst, int i, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(dst[i])));
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Input input, double[] dArr, int i, int i2, int i3, Object obj) throws Throwable {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        readFullyLittleEndian(input, dArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Input input, @NotNull double[] dst, int i, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        InputArraysKt.readFully(input, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(dst[i])));
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: readAvailableLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ int m15616readAvailableLittleEndianWt3Bwxc$default(Input input, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m16039getSizeimpl(sArr) - i;
        }
        return m15614readAvailableLittleEndianWt3Bwxc(input, sArr, i, i2);
    }

    /* renamed from: readAvailableLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final int m15614readAvailableLittleEndianWt3Bwxc(@NotNull Input readAvailableLittleEndian, @NotNull short[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        return readAvailableLittleEndian(input, sArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Input input, @NotNull short[] dst, int i, int i2) throws Throwable {
        int i3;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i, i2);
        if (available > 0 && i <= (i + available) - 1) {
            while (true) {
                dst[i] = Short.reverseBytes(dst[i]);
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    /* renamed from: readAvailableLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ int m15620readAvailableLittleEndiano2ZM2JE$default(Input input, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m15855getSizeimpl(iArr) - i;
        }
        return m15618readAvailableLittleEndiano2ZM2JE(input, iArr, i, i2);
    }

    /* renamed from: readAvailableLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final int m15618readAvailableLittleEndiano2ZM2JE(@NotNull Input readAvailableLittleEndian, @NotNull int[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        return readAvailableLittleEndian(input, iArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Input input, @NotNull int[] dst, int i, int i2) throws Throwable {
        int i3;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i, i2);
        if (available > 0 && i <= (i + available) - 1) {
            while (true) {
                dst[i] = Integer.reverseBytes(dst[i]);
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    /* renamed from: readAvailableLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ int m15624readAvailableLittleEndianpqYNikA$default(Input input, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m15934getSizeimpl(jArr) - i;
        }
        return m15622readAvailableLittleEndianpqYNikA(input, jArr, i, i2);
    }

    /* renamed from: readAvailableLittleEndian-pqYNikA, reason: not valid java name */
    public static final int m15622readAvailableLittleEndianpqYNikA(@NotNull Input readAvailableLittleEndian, @NotNull long[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        return readAvailableLittleEndian(input, jArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Input input, @NotNull long[] dst, int i, int i2) throws Throwable {
        int i3;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i, i2);
        if (available > 0 && i <= (i + available) - 1) {
            while (true) {
                dst[i] = Long.reverseBytes(dst[i]);
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        return readAvailableLittleEndian(input, fArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Input input, @NotNull float[] dst, int i, int i2) throws Throwable {
        int i3;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i, i2);
        if (available > 0 && i <= (i + available) - 1) {
            while (true) {
                dst[i] = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(dst[i])));
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Input input, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        return readAvailableLittleEndian(input, dArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Input input, @NotNull double[] dst, int i, int i2) throws Throwable {
        int i3;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = InputArraysKt.readAvailable(input, dst, i, i2);
        if (available > 0 && i <= (i + available) - 1) {
            while (true) {
                dst[i] = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(dst[i])));
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    /* renamed from: readFullyLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m15627readFullyLittleEndianWt3Bwxc$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m16039getSizeimpl(sArr) - i;
        }
        m15625readFullyLittleEndianWt3Bwxc(buffer, sArr, i, i2);
    }

    /* renamed from: readFullyLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final void m15625readFullyLittleEndianWt3Bwxc(@NotNull Buffer readFullyLittleEndian, @NotNull short[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        readFullyLittleEndian(buffer, sArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Buffer buffer, @NotNull short[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Short.reverseBytes(dst[i]);
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: readFullyLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m15631readFullyLittleEndiano2ZM2JE$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m15855getSizeimpl(iArr) - i;
        }
        m15629readFullyLittleEndiano2ZM2JE(buffer, iArr, i, i2);
    }

    /* renamed from: readFullyLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final void m15629readFullyLittleEndiano2ZM2JE(@NotNull Buffer readFullyLittleEndian, @NotNull int[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        readFullyLittleEndian(buffer, iArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Buffer buffer, @NotNull int[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Integer.reverseBytes(dst[i]);
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: readFullyLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m15635readFullyLittleEndianpqYNikA$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m15934getSizeimpl(jArr) - i;
        }
        m15633readFullyLittleEndianpqYNikA(buffer, jArr, i, i2);
    }

    /* renamed from: readFullyLittleEndian-pqYNikA, reason: not valid java name */
    public static final void m15633readFullyLittleEndianpqYNikA(@NotNull Buffer readFullyLittleEndian, @NotNull long[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(readFullyLittleEndian, "$this$readFullyLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        readFullyLittleEndian(readFullyLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        readFullyLittleEndian(buffer, jArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Buffer buffer, @NotNull long[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Long.reverseBytes(dst[i]);
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, float[] fArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        readFullyLittleEndian(buffer, fArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Buffer buffer, @NotNull float[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(dst[i])));
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    public static /* synthetic */ void readFullyLittleEndian$default(Buffer buffer, double[] dArr, int i, int i2, int i3, Object obj) throws EOFException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        readFullyLittleEndian(buffer, dArr, i, i2);
    }

    public static final void readFullyLittleEndian(@NotNull Buffer buffer, @NotNull double[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BufferPrimitivesKt.readFully(buffer, dst, i, i2);
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dst[i] = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(dst[i])));
            if (i == i3) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: readAvailableLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ int m15615readAvailableLittleEndianWt3Bwxc$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m16039getSizeimpl(sArr) - i;
        }
        return m15613readAvailableLittleEndianWt3Bwxc(buffer, sArr, i, i2);
    }

    /* renamed from: readAvailableLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final int m15613readAvailableLittleEndianWt3Bwxc(@NotNull Buffer readAvailableLittleEndian, @NotNull short[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        return readAvailableLittleEndian(buffer, sArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Buffer buffer, @NotNull short[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i, i2);
        int i3 = (i + available) - 1;
        if (i <= i3) {
            while (true) {
                dst[i] = Short.reverseBytes(dst[i]);
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    /* renamed from: readAvailableLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ int m15619readAvailableLittleEndiano2ZM2JE$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m15855getSizeimpl(iArr) - i;
        }
        return m15617readAvailableLittleEndiano2ZM2JE(buffer, iArr, i, i2);
    }

    /* renamed from: readAvailableLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final int m15617readAvailableLittleEndiano2ZM2JE(@NotNull Buffer readAvailableLittleEndian, @NotNull int[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        return readAvailableLittleEndian(buffer, iArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Buffer buffer, @NotNull int[] dst, int i, int i2) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i, i2);
        int i3 = (i + available) - 1;
        if (i <= i3) {
            while (true) {
                dst[i] = Integer.reverseBytes(dst[i]);
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    /* renamed from: readAvailableLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ int m15623readAvailableLittleEndianpqYNikA$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m15934getSizeimpl(jArr) - i;
        }
        return m15621readAvailableLittleEndianpqYNikA(buffer, jArr, i, i2);
    }

    /* renamed from: readAvailableLittleEndian-pqYNikA, reason: not valid java name */
    public static final int m15621readAvailableLittleEndianpqYNikA(@NotNull Buffer readAvailableLittleEndian, @NotNull long[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(readAvailableLittleEndian, "$this$readAvailableLittleEndian");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return readAvailableLittleEndian(readAvailableLittleEndian, dst, i, i2);
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        return readAvailableLittleEndian(buffer, jArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Buffer buffer, @NotNull long[] dst, int i, int i2) throws EOFException {
        int i3;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i, i2);
        if (available > 0 && i <= (i + available) - 1) {
            while (true) {
                dst[i] = Long.reverseBytes(dst[i]);
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        return readAvailableLittleEndian(buffer, fArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Buffer buffer, @NotNull float[] dst, int i, int i2) throws EOFException {
        int i3;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i, i2);
        if (available > 0 && i <= (i + available) - 1) {
            while (true) {
                dst[i] = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(dst[i])));
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    public static /* synthetic */ int readAvailableLittleEndian$default(Buffer buffer, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        return readAvailableLittleEndian(buffer, dArr, i, i2);
    }

    public static final int readAvailableLittleEndian(@NotNull Buffer buffer, @NotNull double[] dst, int i, int i2) throws EOFException {
        int i3;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int available = BufferPrimitivesKt.readAvailable(buffer, dst, i, i2);
        if (available > 0 && i <= (i + available) - 1) {
            while (true) {
                dst[i] = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(dst[i])));
                if (i == i3) {
                    break;
                }
                i++;
            }
        }
        return available;
    }

    public static final <T> T readPrimitiveTemplate(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        return function1.invoke(function0.invoke());
    }

    public static final <T> T readPrimitiveTemplate(ByteOrder byteOrder, Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1) {
            return function0.invoke();
        }
        return function1.invoke(function0.invoke());
    }

    public static final short readShort(@NotNull Input input, @NotNull ByteOrder byteOrder) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1) {
            return InputPrimitivesKt.readShort(input);
        }
        return Short.reverseBytes(InputPrimitivesKt.readShort(input));
    }

    public static final int readInt(@NotNull Input input, @NotNull ByteOrder byteOrder) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1) {
            return InputPrimitivesKt.readInt(input);
        }
        return Integer.reverseBytes(InputPrimitivesKt.readInt(input));
    }

    public static final long readLong(@NotNull Input input, @NotNull ByteOrder byteOrder) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1) {
            return InputPrimitivesKt.readLong(input);
        }
        return Long.reverseBytes(InputPrimitivesKt.readLong(input));
    }

    public static final float readFloat(@NotNull Input input, @NotNull ByteOrder byteOrder) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1) {
            return InputPrimitivesKt.readFloat(input);
        }
        return Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(InputPrimitivesKt.readFloat(input))));
    }

    public static final double readDouble(@NotNull Input input, @NotNull ByteOrder byteOrder) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1) {
            return InputPrimitivesKt.readDouble(input);
        }
        return Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(InputPrimitivesKt.readDouble(input))));
    }
}
