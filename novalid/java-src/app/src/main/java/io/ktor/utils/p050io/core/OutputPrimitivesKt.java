package io.ktor.utils.p050io.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.bits.Memory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: OutputPrimitives.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\b\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0002\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0002\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\f\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0002\u001a)\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012H\u0082\b\u001aA\u0010\u0014\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\b2'\u0010\u0015\u001a#\u0012\u0004\u0012\u00020\u0017\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0016H\u0082\bø\u0001\u0000\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u001cH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m7105d2 = {"writeDouble", "", "Lio/ktor/utils/io/core/Output;", "value", "", "writeFloat", "", "writeInt", "", "writeIntByteByByte", "writeIntFallback", "writeLong", "", "writeLongFallback", "writePrimitiveFallbackTemplate", "", "componentSize", "writeOperation", "Lkotlin/Function1;", "Lio/ktor/utils/io/core/Buffer;", "writePrimitiveTemplate", "block", "Lkotlin/Function2;", "Lio/ktor/utils/io/bits/Memory;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "writeShort", "", "writeShortFallback", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOutputPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutputPrimitives.kt\nio/ktor/utils/io/core/OutputPrimitivesKt\n+ 2 MemoryPrimitivesJvm.kt\nio/ktor/utils/io/bits/MemoryPrimitivesJvmKt\n+ 3 ByteOrder.kt\nio/ktor/utils/io/bits/ByteOrderKt\n*L\n1#1,100:1\n80#1,4:101\n84#1,4:107\n95#1,4:111\n80#1,4:117\n84#1,4:123\n95#1,4:127\n80#1,4:137\n84#1,4:143\n95#1,4:147\n80#1,4:153\n84#1,4:159\n80#1,4:163\n84#1,4:169\n65#2,2:105\n51#2,2:121\n79#2,2:141\n93#2,2:157\n107#2,2:167\n43#3:115\n45#3:116\n47#3:131\n43#3:132\n45#3:133\n49#3:134\n43#3:135\n45#3:136\n51#3:151\n53#3:152\n*S KotlinDebug\n*F\n+ 1 OutputPrimitives.kt\nio/ktor/utils/io/core/OutputPrimitivesKt\n*L\n7#1:101,4\n7#1:107,4\n14#1:111,4\n22#1:117,4\n22#1:123,4\n29#1:127,4\n48#1:137,4\n48#1:143,4\n55#1:147,4\n63#1:153,4\n63#1:159,4\n70#1:163,4\n70#1:169,4\n7#1:105,2\n22#1:121,2\n48#1:141,2\n63#1:157,2\n70#1:167,2\n15#1:115\n16#1:116\n36#1:131\n37#1:132\n38#1:133\n40#1:134\n41#1:135\n42#1:136\n56#1:151\n57#1:152\n*E\n"})
/* loaded from: classes5.dex */
public final class OutputPrimitivesKt {
    public static final void writeIntByteByByte(Output output, int i) throws InsufficientSpaceException {
        short s = (short) (i >>> 16);
        output.writeByte((byte) (s >>> 8));
        output.writeByte((byte) (s & 255));
        short s2 = (short) (i & 65535);
        output.writeByte((byte) (s2 >>> 8));
        output.writeByte((byte) (s2 & 255));
    }

    public static final boolean writePrimitiveTemplate(Output output, int i, Function2<? super Memory, ? super Integer, Unit> function2) {
        int tailPosition = output.getTailPosition();
        if (output.getTailEndExclusive() - tailPosition <= i) {
            return false;
        }
        output.setTailPosition$ktor_io(i + tailPosition);
        function2.invoke(Memory.m15422boximpl(output.getTailMemory()), Integer.valueOf(tailPosition));
        return true;
    }

    public static final boolean writePrimitiveFallbackTemplate(Output output, int i, Function1<? super Buffer, Unit> function1) {
        function1.invoke(output.prepareWriteHead(i));
        output.afterHeadWrite();
        return true;
    }

    public static final void writeShort(@NotNull Output output, short s) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        int tailPosition = output.getTailPosition();
        if (output.getTailEndExclusive() - tailPosition <= 2) {
            writeShortFallback(output, s);
        } else {
            output.setTailPosition$ktor_io(tailPosition + 2);
            output.getTailMemory().putShort(tailPosition, s);
        }
    }

    public static final void writeShortFallback(Output output, short s) throws InsufficientSpaceException {
        BufferPrimitivesKt.writeShort((Buffer) output.prepareWriteHead(2), s);
        output.afterHeadWrite();
    }

    public static final void writeInt(@NotNull Output output, int i) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        int tailPosition = output.getTailPosition();
        if (output.getTailEndExclusive() - tailPosition <= 4) {
            writeIntFallback(output, i);
        } else {
            output.setTailPosition$ktor_io(tailPosition + 4);
            output.getTailMemory().putInt(tailPosition, i);
        }
    }

    public static final void writeIntFallback(Output output, int i) throws InsufficientSpaceException {
        BufferPrimitivesKt.writeInt((Buffer) output.prepareWriteHead(4), i);
        output.afterHeadWrite();
    }

    public static final void writeLong(@NotNull Output output, long j) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        int tailPosition = output.getTailPosition();
        if (output.getTailEndExclusive() - tailPosition <= 8) {
            writeLongFallback(output, j);
        } else {
            output.setTailPosition$ktor_io(tailPosition + 8);
            output.getTailMemory().putLong(tailPosition, j);
        }
    }

    public static final void writeLongFallback(Output output, long j) throws InsufficientSpaceException {
        BufferPrimitivesKt.writeLong((Buffer) output.prepareWriteHead(8), j);
        output.afterHeadWrite();
    }

    public static final void writeFloat(@NotNull Output output, float f) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        int tailPosition = output.getTailPosition();
        if (output.getTailEndExclusive() - tailPosition <= 4) {
            writeIntFallback(output, Float.floatToRawIntBits(f));
        } else {
            output.setTailPosition$ktor_io(tailPosition + 4);
            output.getTailMemory().putFloat(tailPosition, f);
        }
    }

    public static final void writeDouble(@NotNull Output output, double d) throws InsufficientSpaceException {
        Intrinsics.checkNotNullParameter(output, "<this>");
        int tailPosition = output.getTailPosition();
        if (output.getTailEndExclusive() - tailPosition <= 8) {
            writeLongFallback(output, Double.doubleToRawLongBits(d));
        } else {
            output.setTailPosition$ktor_io(tailPosition + 8);
            output.getTailMemory().putDouble(tailPosition, d);
        }
    }
}
