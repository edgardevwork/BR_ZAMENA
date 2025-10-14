package io.ktor.utils.p050io.core;

import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.game.core.constants.Other;
import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import java.io.EOFException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputPrimitives.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002\u001aK\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u000e0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0014H\u0082\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a4\u0010\u0016\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002H\u000e0\u0018H\u0082\b¢\u0006\u0002\u0010\u001a\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u0002\u001a\f\u0010\u001d\u001a\u00020\u001c*\u00020\u0002H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m7105d2 = {"readDouble", "", "Lio/ktor/utils/io/core/Input;", "readDoubleFallback", "readFloat", "", "readFloatFallback", "readInt", "", "readIntFallback", "readLong", "", "readLongFallback", "readPrimitive", "R", "size", BuildConfig.CDN_USERNAME, "Lkotlin/Function2;", "Lio/ktor/utils/io/bits/Memory;", Other.FALLBACK, "Lkotlin/Function0;", "(Lio/ktor/utils/io/core/Input;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "readPrimitiveFallback", "read", "Lkotlin/Function1;", "Lio/ktor/utils/io/core/Buffer;", "(Lio/ktor/utils/io/core/Input;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "readShort", "", "readShortFallback", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInputPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputPrimitives.kt\nio/ktor/utils/io/core/InputPrimitivesKt\n+ 2 Input.kt\nio/ktor/utils/io/core/Input\n+ 3 MemoryPrimitivesJvm.kt\nio/ktor/utils/io/bits/MemoryPrimitivesJvmKt\n*L\n1#1,74:1\n58#1:75\n59#1,3:77\n64#1:81\n69#1,4:82\n58#1:86\n59#1,3:88\n64#1:92\n69#1,4:93\n58#1:97\n59#1,3:99\n64#1:103\n69#1,4:104\n58#1:108\n59#1,3:110\n64#1:114\n69#1,4:115\n58#1:119\n59#1,3:121\n64#1:125\n69#1,4:126\n77#2:76\n77#2:87\n77#2:98\n77#2:109\n77#2:120\n77#2:130\n8#3:80\n16#3:91\n24#3:102\n32#3:113\n40#3:124\n*S KotlinDebug\n*F\n+ 1 InputPrimitives.kt\nio/ktor/utils/io/core/InputPrimitivesKt\n*L\n8#1:75\n8#1:77,3\n8#1:81\n13#1:82,4\n18#1:86\n18#1:88,3\n18#1:92\n23#1:93,4\n28#1:97\n28#1:99,3\n28#1:103\n33#1:104,4\n38#1:108\n38#1:110,3\n38#1:114\n43#1:115,4\n48#1:119\n48#1:121,3\n48#1:125\n53#1:126,4\n8#1:76\n18#1:87\n28#1:98\n38#1:109\n48#1:120\n58#1:130\n8#1:80\n18#1:91\n28#1:102\n38#1:113\n48#1:124\n*E\n"})
/* loaded from: classes5.dex */
public final class InputPrimitivesKt {
    public static final <R> R readPrimitiveFallback(Input input, int i, Function1<? super Buffer, ? extends R> function1) throws EOFException {
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, i);
        if (chunkBufferPrepareReadFirstHead == null) {
            StringsKt.prematureEndOfStream(i);
            throw new KotlinNothingValueException();
        }
        R rInvoke = function1.invoke(chunkBufferPrepareReadFirstHead);
        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        return rInvoke;
    }

    public static final short readShort(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 2) {
            return readShortFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 2);
        return input.getHeadMemory().getShort(headPosition);
    }

    public static final short readShortFallback(Input input) throws EOFException {
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 2);
        if (chunkBufferPrepareReadFirstHead != null) {
            short s = BufferPrimitivesKt.readShort((Buffer) chunkBufferPrepareReadFirstHead);
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            return s;
        }
        StringsKt.prematureEndOfStream(2);
        throw new KotlinNothingValueException();
    }

    public static final int readInt(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 4) {
            return readIntFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 4);
        return input.getHeadMemory().getInt(headPosition);
    }

    public static final int readIntFallback(Input input) throws EOFException {
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 4);
        if (chunkBufferPrepareReadFirstHead != null) {
            int i = BufferPrimitivesKt.readInt((Buffer) chunkBufferPrepareReadFirstHead);
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            return i;
        }
        StringsKt.prematureEndOfStream(4);
        throw new KotlinNothingValueException();
    }

    public static final long readLong(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 8) {
            return readLongFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 8);
        return input.getHeadMemory().getLong(headPosition);
    }

    public static final long readLongFallback(Input input) throws EOFException {
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 8);
        if (chunkBufferPrepareReadFirstHead != null) {
            long j = BufferPrimitivesKt.readLong((Buffer) chunkBufferPrepareReadFirstHead);
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            return j;
        }
        StringsKt.prematureEndOfStream(8);
        throw new KotlinNothingValueException();
    }

    public static final float readFloat(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 4) {
            return readFloatFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 4);
        return input.getHeadMemory().getFloat(headPosition);
    }

    public static final float readFloatFallback(@NotNull Input input) throws EOFException {
        Intrinsics.checkNotNullParameter(input, "<this>");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 4);
        if (chunkBufferPrepareReadFirstHead != null) {
            float f = BufferPrimitivesKt.readFloat((Buffer) chunkBufferPrepareReadFirstHead);
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            return f;
        }
        StringsKt.prematureEndOfStream(4);
        throw new KotlinNothingValueException();
    }

    public static final double readDouble(@NotNull Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 8) {
            return readDoubleFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 8);
        return input.getHeadMemory().getDouble(headPosition);
    }

    public static final double readDoubleFallback(@NotNull Input input) throws EOFException {
        Intrinsics.checkNotNullParameter(input, "<this>");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 8);
        if (chunkBufferPrepareReadFirstHead != null) {
            double d = BufferPrimitivesKt.readDouble((Buffer) chunkBufferPrepareReadFirstHead);
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            return d;
        }
        StringsKt.prematureEndOfStream(8);
        throw new KotlinNothingValueException();
    }

    public static final <R> R readPrimitive(Input input, int i, Function2<? super Memory, ? super Integer, ? extends R> function2, Function0<? extends R> function0) {
        if (input.getHeadEndExclusive() - input.getHeadPosition() > i) {
            int headPosition = input.getHeadPosition();
            input.setHeadPosition(i + headPosition);
            return function2.invoke(Memory.m15422boximpl(input.getHeadMemory()), Integer.valueOf(headPosition));
        }
        return function0.invoke();
    }
}
