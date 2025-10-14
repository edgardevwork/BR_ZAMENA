package io.ktor.utils.p050io.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import kotlin.Metadata;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: OutputLittleEndian.kt */
@Metadata(m7104d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\u0010\u0014\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0006¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0002\u0010\t\u001aU\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0006¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0002\u0010\f\u001aD\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u001d\u0010\u0013\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\bH\u0082\b\u001aD\u0010\r\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u001d\u0010\u0013\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\bH\u0082\b\u001a\u001a\u0010\u0016\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0017\u001a\u001a\u0010\u0019\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u001a\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u001a\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020 2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020!2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\"2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a3\u0010\u001c\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020#2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a3\u0010\u001c\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020&2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u001a3\u0010\u001c\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020)2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020 2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020!2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a&\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\"2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a3\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020#2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010,\u001a3\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020&2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010-\u001a3\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020)2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010.\u001a\u001a\u0010/\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u00100\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0010\u001a\u0012\u00100\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0010\u001a\u001a\u00101\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u0002022\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u00103\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0004\u001a\u000202\u001a\u0012\u00103\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u000202\u001a\u001a\u00104\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u0002052\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u00106\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0004\u001a\u000205\u001a\u0012\u00106\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u000205\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, m7105d2 = {"writePrimitiveTemplate", "", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "write", "Lkotlin/Function1;", "reverse", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "byteOrder", "Lio/ktor/utils/io/core/ByteOrder;", "(Ljava/lang/Object;Lio/ktor/utils/io/core/ByteOrder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "writeArrayTemplate", "Lio/ktor/utils/io/core/Buffer;", TypedValues.CycleType.S_WAVE_OFFSET, "", CacheFileMetadataIndex.COLUMN_LENGTH, "componentSize", "writeComponent", "Lkotlin/Function2;", "Lio/ktor/utils/io/core/Output;", "writeDouble", "", "writeDoubleLittleEndian", "writeFloat", "", "writeFloatLittleEndian", "writeFullyLittleEndian", "source", "", "", "", "", "", "Lkotlin/UIntArray;", "writeFullyLittleEndian-o2ZM2JE", "(Lio/ktor/utils/io/core/Buffer;[III)V", "Lkotlin/ULongArray;", "writeFullyLittleEndian-pqYNikA", "(Lio/ktor/utils/io/core/Buffer;[JII)V", "Lkotlin/UShortArray;", "writeFullyLittleEndian-Wt3Bwxc", "(Lio/ktor/utils/io/core/Buffer;[SII)V", "(Lio/ktor/utils/io/core/Output;[III)V", "(Lio/ktor/utils/io/core/Output;[JII)V", "(Lio/ktor/utils/io/core/Output;[SII)V", "writeInt", "writeIntLittleEndian", "writeLong", "", "writeLongLittleEndian", "writeShort", "", "writeShortLittleEndian", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOutputLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutputLittleEndian.kt\nio/ktor/utils/io/core/OutputLittleEndianKt\n+ 2 ByteOrderJvm.kt\nio/ktor/utils/io/bits/ByteOrderJVMKt\n+ 3 Output.kt\nio/ktor/utils/io/core/OutputKt\n+ 4 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,277:1\n228#1,4:278\n234#1:283\n228#1,4:284\n234#1:289\n228#1,4:290\n234#1:295\n228#1,4:296\n234#1:307\n228#1,4:308\n234#1:319\n219#1:320\n220#1:322\n219#1:323\n220#1:325\n219#1:326\n220#1:328\n219#1:329\n220#1:337\n219#1:338\n220#1:346\n219#1:347\n220#1:349\n219#1:350\n220#1:352\n219#1:353\n220#1:355\n219#1:356\n220#1:364\n219#1:365\n220#1:373\n243#1,3:374\n246#1:383\n247#1,3:385\n251#1,4:389\n257#1:400\n243#1,3:401\n246#1:410\n247#1,3:412\n251#1,4:416\n257#1:427\n243#1,3:428\n246#1:437\n247#1,3:439\n251#1,4:443\n257#1:454\n243#1,3:455\n246#1:464\n247#1,3:466\n251#1,4:476\n257#1:487\n243#1,3:488\n246#1:497\n247#1,3:499\n251#1,4:509\n257#1:520\n266#1,5:521\n271#1,3:527\n275#1,2:531\n266#1,5:533\n271#1,3:539\n275#1,2:543\n266#1,5:545\n271#1,3:551\n275#1,2:555\n266#1,5:557\n271#1,3:563\n275#1,2:573\n266#1,5:575\n271#1,3:581\n275#1,2:591\n9#2:282\n15#2:288\n21#2:294\n30#2:300\n29#2:301\n28#2,5:302\n41#2:312\n40#2:313\n39#2,5:314\n9#2:321\n15#2:324\n21#2:327\n30#2:330\n29#2:331\n28#2,5:332\n41#2:339\n40#2:340\n39#2,5:341\n9#2:348\n15#2:351\n21#2:354\n30#2:357\n29#2:358\n28#2,5:359\n41#2:366\n40#2:367\n39#2,5:368\n9#2:388\n15#2:415\n21#2:442\n30#2:469\n29#2:470\n28#2,5:471\n41#2:502\n40#2:503\n39#2,5:504\n9#2:530\n15#2:542\n21#2:554\n30#2:566\n29#2:567\n28#2,5:568\n41#2:584\n40#2:585\n39#2,5:586\n507#3,6:377\n513#3,7:393\n507#3,6:404\n513#3,7:420\n507#3,6:431\n513#3,7:447\n507#3,6:458\n513#3,7:480\n507#3,6:491\n513#3,7:513\n507#3,6:593\n513#3,7:600\n74#4:384\n74#4:411\n74#4:438\n74#4:465\n74#4:498\n74#4:526\n74#4:538\n74#4:550\n74#4:562\n74#4:580\n74#4:599\n74#4:607\n*S KotlinDebug\n*F\n+ 1 OutputLittleEndian.kt\nio/ktor/utils/io/core/OutputLittleEndianKt\n*L\n9#1:278,4\n9#1:283\n14#1:284,4\n14#1:289\n19#1:290,4\n19#1:295\n24#1:296,4\n24#1:307\n29#1:308,4\n29#1:319\n34#1:320\n34#1:322\n39#1:323\n39#1:325\n44#1:326\n44#1:328\n49#1:329\n49#1:337\n54#1:338\n54#1:346\n65#1:347\n65#1:349\n70#1:350\n70#1:352\n75#1:353\n75#1:355\n80#1:356\n80#1:364\n85#1:365\n85#1:373\n96#1:374,3\n96#1:383\n96#1:385,3\n96#1:389,4\n96#1:400\n112#1:401,3\n112#1:410\n112#1:412,3\n112#1:416,4\n112#1:427\n128#1:428,3\n128#1:437\n128#1:439,3\n128#1:443,4\n128#1:454\n138#1:455,3\n138#1:464\n138#1:466,3\n138#1:476,4\n138#1:487\n148#1:488,3\n148#1:497\n148#1:499,3\n148#1:509,4\n148#1:520\n158#1:521,5\n158#1:527,3\n158#1:531,2\n174#1:533,5\n174#1:539,3\n174#1:543,2\n190#1:545,5\n190#1:551,3\n190#1:555,2\n200#1:557,5\n200#1:563,3\n200#1:573,2\n210#1:575,5\n210#1:581,3\n210#1:591,2\n9#1:282\n14#1:288\n19#1:294\n24#1:300\n24#1:301\n24#1:302,5\n29#1:312\n29#1:313\n29#1:314,5\n34#1:321\n39#1:324\n44#1:327\n49#1:330\n49#1:331\n49#1:332,5\n54#1:339\n54#1:340\n54#1:341,5\n65#1:348\n70#1:351\n75#1:354\n80#1:357\n80#1:358\n80#1:359,5\n85#1:366\n85#1:367\n85#1:368,5\n100#1:388\n116#1:415\n132#1:442\n142#1:469\n142#1:470\n142#1:471,5\n152#1:502\n152#1:503\n152#1:504,5\n162#1:530\n178#1:542\n194#1:554\n204#1:566\n204#1:567\n204#1:568,5\n214#1:584\n214#1:585\n214#1:586,5\n96#1:377,6\n96#1:393,7\n112#1:404,6\n112#1:420,7\n128#1:431,6\n128#1:447,7\n138#1:458,6\n138#1:480,7\n148#1:491,6\n148#1:513,7\n245#1:593,6\n245#1:600,7\n96#1:384\n112#1:411\n128#1:438\n138#1:465\n148#1:498\n158#1:526\n174#1:538\n190#1:550\n200#1:562\n210#1:580\n246#1:599\n270#1:607\n*E\n"})
/* loaded from: classes5.dex */
public final class OutputLittleEndianKt {

    /* compiled from: OutputLittleEndian.kt */
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

    /* renamed from: writeFullyLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m15644writeFullyLittleEndianWt3Bwxc$default(Output output, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m16039getSizeimpl(sArr) - i;
        }
        m15642writeFullyLittleEndianWt3Bwxc(output, sArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final void m15642writeFullyLittleEndianWt3Bwxc(@NotNull Output writeFullyLittleEndian, @NotNull short[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m15643writeFullyLittleEndianWt3Bwxc$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m16039getSizeimpl(sArr) - i;
        }
        m15641writeFullyLittleEndianWt3Bwxc(buffer, sArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final void m15641writeFullyLittleEndianWt3Bwxc(@NotNull Buffer writeFullyLittleEndian, @NotNull short[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        writeFullyLittleEndian(output, sArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m15648writeFullyLittleEndiano2ZM2JE$default(Output output, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m15855getSizeimpl(iArr) - i;
        }
        m15646writeFullyLittleEndiano2ZM2JE(output, iArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final void m15646writeFullyLittleEndiano2ZM2JE(@NotNull Output writeFullyLittleEndian, @NotNull int[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        writeFullyLittleEndian(output, iArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m15652writeFullyLittleEndianpqYNikA$default(Output output, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m15934getSizeimpl(jArr) - i;
        }
        m15650writeFullyLittleEndianpqYNikA(output, jArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-pqYNikA, reason: not valid java name */
    public static final void m15650writeFullyLittleEndianpqYNikA(@NotNull Output writeFullyLittleEndian, @NotNull long[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        writeFullyLittleEndian(output, jArr, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        writeFullyLittleEndian(output, fArr, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        writeFullyLittleEndian(output, dArr, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, short[] sArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        writeFullyLittleEndian(buffer, sArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m15647writeFullyLittleEndiano2ZM2JE$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UIntArray.m15855getSizeimpl(iArr) - i;
        }
        m15645writeFullyLittleEndiano2ZM2JE(buffer, iArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final void m15645writeFullyLittleEndiano2ZM2JE(@NotNull Buffer writeFullyLittleEndian, @NotNull int[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, int[] iArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        writeFullyLittleEndian(buffer, iArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m15651writeFullyLittleEndianpqYNikA$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m15934getSizeimpl(jArr) - i;
        }
        m15649writeFullyLittleEndianpqYNikA(buffer, jArr, i, i2);
    }

    /* renamed from: writeFullyLittleEndian-pqYNikA, reason: not valid java name */
    public static final void m15649writeFullyLittleEndianpqYNikA(@NotNull Buffer writeFullyLittleEndian, @NotNull long[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        Intrinsics.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, long[] jArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        writeFullyLittleEndian(buffer, jArr, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, float[] fArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        writeFullyLittleEndian(buffer, fArr, i, i2);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, double[] dArr, int i, int i2, int i3, Object obj) throws InsufficientSpaceException {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        writeFullyLittleEndian(buffer, dArr, i, i2);
    }

    public static final <T> void writePrimitiveTemplate(T t, Function1<? super T, Unit> function1, Function1<? super T, ? extends T> function12) {
        function1.invoke(function12.invoke(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void writePrimitiveTemplate(T t, ByteOrder byteOrder, Function1<? super T, Unit> function1, Function1<? super T, ? extends T> function12) {
        Object objInvoke = t;
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            objInvoke = function12.invoke(t);
        }
        function1.invoke(objInvoke);
    }

    public static final void writeShort(@NotNull Output output, short s, @NotNull ByteOrder byteOrder) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            s = Short.reverseBytes(s);
        }
        OutputPrimitivesKt.writeShort(output, s);
    }

    public static final void writeInt(@NotNull Output output, int i, @NotNull ByteOrder byteOrder) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            i = Integer.reverseBytes(i);
        }
        OutputPrimitivesKt.writeInt(output, i);
    }

    public static final void writeLong(@NotNull Output output, long j, @NotNull ByteOrder byteOrder) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            j = Long.reverseBytes(j);
        }
        OutputPrimitivesKt.writeLong(output, j);
    }

    public static final void writeFloat(@NotNull Output output, float f, @NotNull ByteOrder byteOrder) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            f = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f)));
        }
        OutputPrimitivesKt.writeFloat(output, f);
    }

    public static final void writeDouble(@NotNull Output output, double d, @NotNull ByteOrder byteOrder) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            d = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d)));
        }
        OutputPrimitivesKt.writeDouble(output, d);
    }

    public static final void writeShortLittleEndian(@NotNull Output output, short s) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeShort(output, Short.reverseBytes(s));
    }

    public static final void writeIntLittleEndian(@NotNull Output output, int i) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeInt(output, Integer.reverseBytes(i));
    }

    public static final void writeLongLittleEndian(@NotNull Output output, long j) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeLong(output, Long.reverseBytes(j));
    }

    public static final void writeFloatLittleEndian(@NotNull Output output, float f) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeFloat(output, Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f))));
    }

    public static final void writeDoubleLittleEndian(@NotNull Output output, double d) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeDouble(output, Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d))));
    }

    public static final void writeShortLittleEndian(@NotNull Buffer buffer, short s) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeShort(buffer, Short.reverseBytes(s));
    }

    public static final void writeIntLittleEndian(@NotNull Buffer buffer, int i) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeInt(buffer, Integer.reverseBytes(i));
    }

    public static final void writeLongLittleEndian(@NotNull Buffer buffer, long j) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeLong(buffer, Long.reverseBytes(j));
    }

    public static final void writeFloatLittleEndian(@NotNull Buffer buffer, float f) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeFloat(buffer, Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f))));
    }

    public static final void writeDoubleLittleEndian(@NotNull Buffer buffer, double d) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeDouble(buffer, Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d))));
    }

    public static final void writeFullyLittleEndian(@NotNull Output output, @NotNull short[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 + i;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 2, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 2, i3 - i) + i;
                int i4 = iMin - 1;
                if (i <= i4) {
                    while (true) {
                        BufferPrimitivesKt.writeShort((Buffer) chunkBufferPrepareWriteHead, Short.reverseBytes(source[i]));
                        if (i == i4) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                int i5 = iMin < i3 ? 2 : 0;
                if (i5 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i5, chunkBufferPrepareWriteHead);
                    i = iMin;
                } else {
                    output.afterHeadWrite();
                    return;
                }
            } catch (Throwable th) {
                output.afterHeadWrite();
                throw th;
            }
        }
    }

    public static final void writeFullyLittleEndian(@NotNull Output output, @NotNull int[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 + i;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 4, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 4, i3 - i) + i;
                int i4 = iMin - 1;
                if (i <= i4) {
                    while (true) {
                        BufferPrimitivesKt.writeInt((Buffer) chunkBufferPrepareWriteHead, Integer.reverseBytes(source[i]));
                        if (i == i4) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                int i5 = iMin < i3 ? 4 : 0;
                if (i5 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i5, chunkBufferPrepareWriteHead);
                    i = iMin;
                } else {
                    output.afterHeadWrite();
                    return;
                }
            } catch (Throwable th) {
                output.afterHeadWrite();
                throw th;
            }
        }
    }

    public static final void writeFullyLittleEndian(@NotNull Output output, @NotNull long[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 + i;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 8, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 8, i3 - i) + i;
                int i4 = iMin - 1;
                if (i <= i4) {
                    while (true) {
                        BufferPrimitivesKt.writeLong((Buffer) chunkBufferPrepareWriteHead, Long.reverseBytes(source[i]));
                        if (i == i4) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                int i5 = iMin < i3 ? 8 : 0;
                if (i5 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i5, chunkBufferPrepareWriteHead);
                    i = iMin;
                } else {
                    output.afterHeadWrite();
                    return;
                }
            } catch (Throwable th) {
                output.afterHeadWrite();
                throw th;
            }
        }
    }

    public static final void writeFullyLittleEndian(@NotNull Output output, @NotNull float[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 + i;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 4, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 4, i3 - i) + i;
                int i4 = iMin - 1;
                if (i <= i4) {
                    while (true) {
                        BufferPrimitivesKt.writeFloat((Buffer) chunkBufferPrepareWriteHead, Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(source[i]))));
                        if (i == i4) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                int i5 = iMin < i3 ? 4 : 0;
                if (i5 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i5, chunkBufferPrepareWriteHead);
                    i = iMin;
                } else {
                    output.afterHeadWrite();
                    return;
                }
            } catch (Throwable th) {
                output.afterHeadWrite();
                throw th;
            }
        }
    }

    public static final void writeFullyLittleEndian(@NotNull Output output, @NotNull double[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 + i;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 8, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 8, i3 - i) + i;
                int i4 = iMin - 1;
                if (i <= i4) {
                    while (true) {
                        BufferPrimitivesKt.writeDouble((Buffer) chunkBufferPrepareWriteHead, Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(source[i]))));
                        if (i == i4) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                int i5 = iMin < i3 ? 8 : 0;
                if (i5 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i5, chunkBufferPrepareWriteHead);
                    i = iMin;
                } else {
                    output.afterHeadWrite();
                    return;
                }
            } catch (Throwable th) {
                output.afterHeadWrite();
                throw th;
            }
        }
    }

    public static final void writeFullyLittleEndian(@NotNull Buffer buffer, @NotNull short[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 2, (i2 + i) - i) + i) - 1;
        if (i > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeShort(buffer, Short.reverseBytes(source[i]));
            if (i == iMin) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void writeFullyLittleEndian(@NotNull Buffer buffer, @NotNull int[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 4, (i2 + i) - i) + i) - 1;
        if (i > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeInt(buffer, Integer.reverseBytes(source[i]));
            if (i == iMin) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void writeFullyLittleEndian(@NotNull Buffer buffer, @NotNull long[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 8, (i2 + i) - i) + i) - 1;
        if (i > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeLong(buffer, Long.reverseBytes(source[i]));
            if (i == iMin) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void writeFullyLittleEndian(@NotNull Buffer buffer, @NotNull float[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 4, (i2 + i) - i) + i) - 1;
        if (i > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeFloat(buffer, Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(source[i]))));
            if (i == iMin) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void writeFullyLittleEndian(@NotNull Buffer buffer, @NotNull double[] source, int i, int i2) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 8, (i2 + i) - i) + i) - 1;
        if (i > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeDouble(buffer, Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(source[i]))));
            if (i == iMin) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void writeArrayTemplate(Output output, int i, int i2, int i3, Function2<? super Buffer, ? super Integer, Unit> function2) {
        int i4 = i2 + i;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i3, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / i3, i4 - i) + i;
                int i5 = iMin - 1;
                if (i <= i5) {
                    while (true) {
                        function2.invoke(chunkBufferPrepareWriteHead, Integer.valueOf(i));
                        if (i == i5) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                int i6 = iMin < i4 ? i3 : 0;
                if (i6 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i6, chunkBufferPrepareWriteHead);
                    i = iMin;
                } else {
                    InlineMarker.finallyStart(1);
                    output.afterHeadWrite();
                    InlineMarker.finallyEnd(1);
                    return;
                }
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                output.afterHeadWrite();
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    public static final void writeArrayTemplate(Buffer buffer, int i, int i2, int i3, Function2<? super Buffer, ? super Integer, Unit> function2) {
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / i3, (i2 + i) - i) + i) - 1;
        if (i > iMin) {
            return;
        }
        while (true) {
            function2.invoke(buffer, Integer.valueOf(i));
            if (i == iMin) {
                return;
            } else {
                i++;
            }
        }
    }
}
