package io.ktor.utils.p050io.core.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.gui.craft.CraftKeys;
import io.ktor.utils.p050io.charsets.TooLongLineException;
import io.ktor.utils.p050io.core.Buffer;
import io.ktor.utils.p050io.core.Input;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UTF8.kt */
@Metadata(m7104d1 = {"\u0000d\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0014\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0011\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0082\b\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a_\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u00012$\u0010\u0014\u001a \b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0\u001aH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0001H\u0001\u001a\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0001H\u0001\u001a\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0001\u001a\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0001H\u0001\u001a\u0010\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0001H\u0002\u001a$\u0010)\u001a\u00020\u000f*\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u001aH\u0080\bø\u0001\u0001\u001a$\u0010,\u001a\u00020\u0001*\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u001aH\u0080\bø\u0001\u0001\u001aA\u0010-\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001H\u0000ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aQ\u00108\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0001H\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001aQ\u0010?\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0001H\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010>\u001a*\u0010A\u001a\u00020\u0001*\u00020/2\u0006\u0010B\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0080\bø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006E"}, m7105d2 = {"HighSurrogateMagic", "", "MaxCodePoint", "MinHighSurrogate", "MinLowSurrogate", "MinSupplementary", "byteCountUtf8", "firstByte", "charactersSize", "v", "codePoint", "high", "", "low", "decodeUTF8LineLoopSuspend", "", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "limit", "nextChunk", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/utils/io/core/Input;", "", "afterRead", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "highSurrogate", CraftKeys.PRODUCTION_ITEMS_ARRAY_KEY, "isBmpCodePoint", "isValidCodePoint", "lowSurrogate", "malformedByteCount", "", "byteCount", "malformedCodePoint", "value", "prematureEndOfStreamUtf", "size", "decodeASCII", "Lio/ktor/utils/io/core/Buffer;", "consumer", "decodeUTF8", "encodeUTF8", "Lio/ktor/utils/io/core/internal/EncodeResult;", "Lio/ktor/utils/io/bits/Memory;", "text", "", "from", "to", "dstOffset", "dstLimit", "encodeUTF8-lBXzO7A", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIII)I", "encodeUTF8Stage1", "index1", "lastCharIndex", "resultPosition1", "resultLimit", "encodeUTF8Stage1-Vm9B2pQ", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIIIII)I", "encodeUTF8Stage2", "encodeUTF8Stage2-Vm9B2pQ", "putUtf8Char", TypedValues.CycleType.S_WAVE_OFFSET, "putUtf8Char-62zg_DM", "(Ljava/nio/ByteBuffer;II)I", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUTF8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UTF8.kt\nio/ktor/utils/io/core/internal/UTF8Kt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 3 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n+ 4 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 5 Input.kt\nio/ktor/utils/io/core/InputKt\n+ 6 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,379:1\n123#1,5:401\n128#1,2:411\n130#1,61:415\n193#1:478\n319#1,3:517\n322#1,4:522\n326#1,18:527\n309#1,7:545\n319#1,3:552\n322#1,4:557\n326#1,18:562\n372#2,5:380\n377#2,2:387\n372#2,5:406\n377#2,2:476\n372#2,5:506\n377#2,2:513\n84#3:385\n84#3:413\n84#3:511\n99#3:526\n99#3:561\n99#3:582\n99#3:585\n99#3:588\n99#3:591\n99#3:594\n99#3:597\n99#3:600\n99#3:603\n99#3:606\n26#4:386\n26#4:414\n26#4:512\n37#4,2:515\n37#4,2:520\n37#4,2:555\n37#4,2:580\n37#4,2:583\n37#4,2:586\n37#4,2:589\n37#4,2:592\n37#4,2:595\n37#4,2:598\n37#4,2:601\n37#4,2:604\n37#4,2:607\n852#5,8:389\n862#5,3:398\n866#5,11:479\n877#5,15:491\n69#6:397\n59#6:490\n*S KotlinDebug\n*F\n+ 1 UTF8.kt\nio/ktor/utils/io/core/internal/UTF8Kt\n*L\n42#1:401,5\n42#1:411,2\n42#1:415,61\n42#1:478\n255#1:517,3\n255#1:522,4\n255#1:527,18\n297#1:545,7\n301#1:552,3\n301#1:557,4\n301#1:562,18\n9#1:380,5\n9#1:387,2\n42#1:406,5\n42#1:476,2\n127#1:506,5\n127#1:513,2\n11#1:385\n42#1:413\n129#1:511\n255#1:526\n301#1:561\n325#1:582\n326#1:585\n330#1:588\n331#1:591\n332#1:594\n336#1:597\n337#1:600\n338#1:603\n339#1:606\n11#1:386\n42#1:414\n129#1:512\n211#1:515,2\n255#1:520,2\n301#1:555,2\n321#1:580,2\n325#1:583,2\n326#1:586,2\n330#1:589,2\n331#1:592,2\n332#1:595,2\n336#1:598,2\n337#1:601,2\n338#1:604,2\n339#1:607,2\n40#1:389,8\n40#1:398,3\n40#1:479,11\n40#1:491,15\n40#1:397\n40#1:490\n*E\n"})
/* loaded from: classes5.dex */
public final class UTF8Kt {
    public static final int HighSurrogateMagic = 55232;
    public static final int MaxCodePoint = 1114111;
    public static final int MinHighSurrogate = 55296;
    public static final int MinLowSurrogate = 56320;
    public static final int MinSupplementary = 65536;

    /* compiled from: UTF8.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.core.internal.UTF8Kt", m7120f = "UTF8.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {37}, m7123m = "decodeUTF8LineLoopSuspend", m7124n = {"out", "nextChunk", "afterRead", "decoded", "size", "cr", "end", "limit"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    /* renamed from: io.ktor.utils.io.core.internal.UTF8Kt$decodeUTF8LineLoopSuspend$1 */
    /* loaded from: classes6.dex */
    public static final class C105001 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C105001(Continuation<? super C105001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UTF8Kt.decodeUTF8LineLoopSuspend(null, 0, null, null, this);
        }
    }

    public static final int byteCountUtf8(int i) {
        int i2 = 0;
        int i3 = 128;
        for (int i4 = 1; i4 < 7 && (i & i3) != 0; i4++) {
            i &= ~i3;
            i3 >>= 1;
            i2++;
        }
        return i2;
    }

    public static final int codePoint(char c, char c2) {
        return ((c - 55232) << 10) | (c2 - CharCompanionObject.MIN_LOW_SURROGATE);
    }

    @PublishedApi
    public static final int highSurrogate(int i) {
        return (i >>> 10) + 55232;
    }

    @PublishedApi
    public static final boolean isBmpCodePoint(int i) {
        return (i >>> 16) == 0;
    }

    @PublishedApi
    public static final boolean isValidCodePoint(int i) {
        return i <= 1114111;
    }

    @PublishedApi
    public static final int lowSurrogate(int i) {
        return (i & 1023) + 56320;
    }

    /* JADX WARN: Code restructure failed: missing block: B:315:0x0132, code lost:
    
        r8.element = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0135, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0136, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0148, code lost:
    
        r8.element = true;
        r0.element = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0151, code lost:
    
        r8.element = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x01d7, code lost:
    
        r3.discardExact(r6 - r18);
        r2 = r2.element;
        r10 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0209, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x020a, code lost:
    
        r8.element = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x021e, code lost:
    
        r8.element = true;
        r0.element = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0227, code lost:
    
        r8.element = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0275, code lost:
    
        r8.element = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0285, code lost:
    
        r8.element = true;
        r0.element = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x028e, code lost:
    
        r8.element = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x02ad, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x02ae, code lost:
    
        r8.element = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x02ba, code lost:
    
        r8.element = true;
        r0.element = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x02c3, code lost:
    
        r8.element = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x02a9 A[Catch: all -> 0x027c, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x027c, blocks: (B:392:0x0270, B:412:0x02a9), top: B:510:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0352 A[Catch: all -> 0x01c4, TryCatch #4 {all -> 0x01c4, blocks: (B:438:0x0343, B:440:0x0349, B:441:0x034c, B:445:0x0359, B:444:0x0352, B:434:0x031c, B:346:0x01a3, B:348:0x01a7, B:351:0x01af, B:353:0x01b5, B:356:0x01c7, B:358:0x01d7, B:360:0x01e5, B:362:0x01f6, B:364:0x01fe, B:370:0x020a, B:380:0x0229, B:371:0x020d, B:427:0x02de, B:376:0x021e, B:377:0x0223, B:379:0x0227, B:381:0x0234, B:383:0x0238, B:385:0x0243, B:386:0x025a, B:387:0x025b, B:389:0x0265, B:395:0x0275, B:423:0x02c5, B:396:0x0278, B:409:0x029e, B:415:0x02ae, B:416:0x02b1, B:419:0x02ba, B:420:0x02bf, B:422:0x02c3, B:424:0x02d0, B:426:0x02d4, B:428:0x02e1, B:429:0x02f8, B:401:0x0285, B:402:0x028a, B:404:0x028e, B:406:0x0292, B:408:0x0296, B:430:0x02f9, B:431:0x0310, B:432:0x0311, B:433:0x031b, B:437:0x0332), top: B:501:0x0349 }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0349 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x00aa -> B:293:0x00af). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object decodeUTF8LineLoopSuspend(@NotNull Appendable appendable, int i, @NotNull Function2<? super Integer, ? super Continuation<? super Input>, ? extends Object> function2, @NotNull Function1<? super Integer, Unit> function1, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        C105001 c105001;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        Appendable appendable2;
        Function2<? super Integer, ? super Continuation<? super Input>, ? extends Object> function22;
        Function1<? super Integer, Unit> function12;
        C105001 c1050012;
        int i2;
        int i3;
        Object objInvoke;
        int i4;
        ChunkBuffer chunkBuffer;
        Input input;
        int i5;
        Input input2;
        Object obj;
        Function2<? super Integer, ? super Continuation<? super Input>, ? extends Object> function23;
        C105001 c1050013;
        Function1<? super Integer, Unit> function13;
        long j;
        int i6;
        int i7;
        int i8;
        ChunkBuffer chunkBuffer2;
        ChunkBuffer chunkBuffer3;
        Ref.IntRef intRef3;
        int i9;
        char cLowSurrogate;
        ChunkBuffer chunkBufferPrepareReadFirstHead;
        int i10;
        if (continuation instanceof C105001) {
            c105001 = (C105001) continuation;
            int i11 = c105001.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c105001.label = i11 - Integer.MIN_VALUE;
            } else {
                c105001 = new C105001(continuation);
            }
        }
        Object obj2 = c105001.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c105001.label;
        int i13 = 1;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = c105001.I$0;
            Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) c105001.L$6;
            Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) c105001.L$5;
            Ref.IntRef intRef4 = (Ref.IntRef) c105001.L$4;
            Ref.IntRef intRef5 = (Ref.IntRef) c105001.L$3;
            Function1<? super Integer, Unit> function14 = (Function1) c105001.L$2;
            Function2<? super Integer, ? super Continuation<? super Input>, ? extends Object> function24 = (Function2) c105001.L$1;
            Appendable appendable3 = (Appendable) c105001.L$0;
            ResultKt.throwOnFailure(obj2);
            c1050012 = c105001;
            i2 = i14;
            function22 = function24;
            intRef = intRef5;
            booleanRef = booleanRef4;
            booleanRef2 = booleanRef3;
            function12 = function14;
            intRef2 = intRef4;
            Input input3 = (Input) obj2;
            if (input3 != null) {
                long remaining = input3.getRemaining();
                ChunkBuffer chunkBufferPrepareReadFirstHead2 = UnsafeKt.prepareReadFirstHead(input3, i13);
                if (chunkBufferPrepareReadFirstHead2 == null) {
                    obj = coroutine_suspended;
                    function23 = function22;
                    function13 = function12;
                    c1050013 = c1050012;
                    input = input3;
                    j = remaining;
                } else {
                    ChunkBuffer chunkBuffer4 = chunkBufferPrepareReadFirstHead2;
                    int iCoerceAtLeast = i13;
                    while (true) {
                        try {
                            int writePosition = chunkBuffer4.getWritePosition() - chunkBuffer4.getReadPosition();
                            if (writePosition >= iCoerceAtLeast) {
                                try {
                                    try {
                                        Ref.IntRef intRef6 = new Ref.IntRef();
                                        Ref.IntRef intRef7 = new Ref.IntRef();
                                        Ref.IntRef intRef8 = new Ref.IntRef();
                                        obj = coroutine_suspended;
                                        Ref.IntRef intRef9 = new Ref.IntRef();
                                        function23 = function22;
                                        ByteBuffer memory = chunkBuffer4.getMemory();
                                        int readPosition = chunkBuffer4.getReadPosition();
                                        c1050013 = c1050012;
                                        int writePosition2 = chunkBuffer4.getWritePosition();
                                        function13 = function12;
                                        int i15 = readPosition;
                                        while (i15 < writePosition2) {
                                            j = remaining;
                                            byte b = memory.get(i15);
                                            int i16 = b & 255;
                                            ByteBuffer byteBuffer = memory;
                                            input2 = input3;
                                            Ref.IntRef intRef10 = intRef2;
                                            if ((b & 128) == 0) {
                                                try {
                                                    int i17 = intRef7.element;
                                                    if (i17 != 0) {
                                                        malformedByteCount(i17);
                                                        throw new KotlinNothingValueException();
                                                    }
                                                    char c = (char) i16;
                                                    if (c != '\r') {
                                                        try {
                                                            if (c == '\n') {
                                                                break;
                                                            }
                                                            if (booleanRef.element) {
                                                                break;
                                                            }
                                                            chunkBuffer3 = chunkBuffer4;
                                                            int i18 = intRef.element;
                                                            if (i18 == i2) {
                                                                throw new TooLongLineException("Too many characters in line: limit " + i2 + " exceeded");
                                                            }
                                                            intRef.element = i18 + 1;
                                                            appendable3.append(c);
                                                            intRef3 = intRef7;
                                                            chunkBuffer = chunkBuffer3;
                                                            i15++;
                                                            chunkBuffer4 = chunkBuffer;
                                                            remaining = j;
                                                            memory = byteBuffer;
                                                            input3 = input2;
                                                            intRef2 = intRef10;
                                                            intRef7 = intRef3;
                                                            chunkBuffer2.discardExact(i15 - readPosition);
                                                            chunkBuffer = chunkBuffer2;
                                                            intRef2 = intRef10;
                                                            i7 = -1;
                                                            i6 = 0;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            chunkBuffer = chunkBuffer2;
                                                            chunkBuffer.getWritePosition();
                                                            chunkBuffer.getReadPosition();
                                                            throw th;
                                                        }
                                                        chunkBuffer2 = chunkBuffer4;
                                                    } else {
                                                        try {
                                                            if (booleanRef.element) {
                                                                break;
                                                            }
                                                            booleanRef.element = true;
                                                            chunkBuffer3 = chunkBuffer4;
                                                            intRef3 = intRef7;
                                                            chunkBuffer = chunkBuffer3;
                                                            i15++;
                                                            chunkBuffer4 = chunkBuffer;
                                                            remaining = j;
                                                            memory = byteBuffer;
                                                            input3 = input2;
                                                            intRef2 = intRef10;
                                                            intRef7 = intRef3;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    chunkBuffer2 = chunkBuffer4;
                                                }
                                            } else {
                                                chunkBuffer = chunkBuffer4;
                                                if (intRef7.element == 0) {
                                                    intRef8.element = i16;
                                                    int i19 = 128;
                                                    for (int i20 = 1; i20 < 7; i20++) {
                                                        int i21 = intRef8.element;
                                                        if ((i21 & i19) == 0) {
                                                            break;
                                                        }
                                                        intRef8.element = i21 & (~i19);
                                                        i19 >>= 1;
                                                        intRef7.element++;
                                                    }
                                                    intRef9.element = intRef7.element;
                                                    intRef7.element--;
                                                    if (intRef9.element > writePosition2 - i15) {
                                                        break;
                                                    }
                                                } else {
                                                    intRef8.element = (intRef8.element << 6) | (b & Byte.MAX_VALUE);
                                                    int i22 = intRef7.element - 1;
                                                    intRef7.element = i22;
                                                    if (i22 == 0) {
                                                        if (isBmpCodePoint(intRef8.element)) {
                                                            char c2 = (char) intRef8.element;
                                                            if (c2 == '\r') {
                                                                try {
                                                                    if (booleanRef.element) {
                                                                        break;
                                                                    }
                                                                    booleanRef.element = true;
                                                                    intRef3 = intRef7;
                                                                    intRef8.element = 0;
                                                                    i15++;
                                                                    chunkBuffer4 = chunkBuffer;
                                                                    remaining = j;
                                                                    memory = byteBuffer;
                                                                    input3 = input2;
                                                                    intRef2 = intRef10;
                                                                    intRef7 = intRef3;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    chunkBuffer.getWritePosition();
                                                                    chunkBuffer.getReadPosition();
                                                                    throw th;
                                                                }
                                                            } else {
                                                                intRef3 = intRef7;
                                                                int i23 = 1;
                                                                if (c2 == '\n') {
                                                                    break;
                                                                }
                                                                if (booleanRef.element) {
                                                                    break;
                                                                }
                                                                int i24 = intRef.element;
                                                                if (i24 == i2) {
                                                                    throw new TooLongLineException("Too many characters in line: limit " + i2 + " exceeded");
                                                                }
                                                                intRef.element = i24 + 1;
                                                                appendable3.append(c2);
                                                                intRef8.element = 0;
                                                                i15++;
                                                                chunkBuffer4 = chunkBuffer;
                                                                remaining = j;
                                                                memory = byteBuffer;
                                                                input3 = input2;
                                                                intRef2 = intRef10;
                                                                intRef7 = intRef3;
                                                                chunkBuffer.discardExact(((i15 - readPosition) - intRef9.element) + i23);
                                                                intRef2 = intRef10;
                                                                i7 = -1;
                                                            }
                                                            i6 = 0;
                                                        } else {
                                                            intRef3 = intRef7;
                                                            if (!isValidCodePoint(intRef8.element)) {
                                                                malformedCodePoint(intRef8.element);
                                                                throw new KotlinNothingValueException();
                                                            }
                                                            char cHighSurrogate = (char) highSurrogate(intRef8.element);
                                                            if (cHighSurrogate != '\r') {
                                                                if (cHighSurrogate == '\n') {
                                                                    break;
                                                                }
                                                                if (booleanRef.element) {
                                                                    break;
                                                                }
                                                                int i25 = intRef.element;
                                                                if (i25 == i2) {
                                                                    throw new TooLongLineException("Too many characters in line: limit " + i2 + " exceeded");
                                                                }
                                                                intRef.element = i25 + 1;
                                                                appendable3.append(cHighSurrogate);
                                                                cLowSurrogate = (char) lowSurrogate(intRef8.element);
                                                                if (cLowSurrogate != '\r') {
                                                                    i9 = 1;
                                                                    if (cLowSurrogate == '\n') {
                                                                        break;
                                                                    }
                                                                    if (booleanRef.element) {
                                                                        break;
                                                                    }
                                                                    int i26 = intRef.element;
                                                                    if (i26 == i2) {
                                                                        throw new TooLongLineException("Too many characters in line: limit " + i2 + " exceeded");
                                                                    }
                                                                    intRef.element = i26 + 1;
                                                                    appendable3.append(cLowSurrogate);
                                                                    intRef8.element = 0;
                                                                    i15++;
                                                                    chunkBuffer4 = chunkBuffer;
                                                                    remaining = j;
                                                                    memory = byteBuffer;
                                                                    input3 = input2;
                                                                    intRef2 = intRef10;
                                                                    intRef7 = intRef3;
                                                                    chunkBuffer.discardExact(((i15 - readPosition) - intRef9.element) + i9);
                                                                    intRef2 = intRef10;
                                                                    i7 = -1;
                                                                } else {
                                                                    if (booleanRef.element) {
                                                                        break;
                                                                    }
                                                                    booleanRef.element = true;
                                                                    intRef8.element = 0;
                                                                    i15++;
                                                                    chunkBuffer4 = chunkBuffer;
                                                                    remaining = j;
                                                                    memory = byteBuffer;
                                                                    input3 = input2;
                                                                    intRef2 = intRef10;
                                                                    intRef7 = intRef3;
                                                                }
                                                                i9 = 1;
                                                                chunkBuffer.discardExact(((i15 - readPosition) - intRef9.element) + i9);
                                                                intRef2 = intRef10;
                                                                i7 = -1;
                                                            } else {
                                                                try {
                                                                    if (booleanRef.element) {
                                                                        break;
                                                                    }
                                                                    booleanRef.element = true;
                                                                    cLowSurrogate = (char) lowSurrogate(intRef8.element);
                                                                    if (cLowSurrogate != '\r') {
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    chunkBuffer.getWritePosition();
                                                                    chunkBuffer.getReadPosition();
                                                                    throw th;
                                                                }
                                                            }
                                                            i6 = 0;
                                                        }
                                                    }
                                                }
                                                intRef3 = intRef7;
                                                i15++;
                                                chunkBuffer4 = chunkBuffer;
                                                remaining = j;
                                                memory = byteBuffer;
                                                input3 = input2;
                                                intRef2 = intRef10;
                                                intRef7 = intRef3;
                                            }
                                            intRef2.element = i7;
                                            i8 = intRef6.element;
                                            if (i8 > 0) {
                                                try {
                                                    chunkBuffer.discardExact(i8);
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    chunkBuffer.getWritePosition();
                                                    chunkBuffer.getReadPosition();
                                                    throw th;
                                                }
                                            }
                                            iCoerceAtLeast = !booleanRef2.element ? i6 : RangesKt___RangesKt.coerceAtLeast(intRef2.element, 1);
                                            intRef2.element = iCoerceAtLeast;
                                            writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                                        }
                                        chunkBuffer = chunkBuffer4;
                                        input2 = input3;
                                        j = remaining;
                                        i6 = 0;
                                        chunkBuffer.discardExact(writePosition2 - readPosition);
                                        i7 = 0;
                                        intRef2 = intRef2;
                                        intRef2.element = i7;
                                        i8 = intRef6.element;
                                        if (i8 > 0) {
                                        }
                                        if (!booleanRef2.element) {
                                        }
                                        writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
                                    } catch (Throwable th7) {
                                        th = th7;
                                        chunkBuffer = chunkBuffer4;
                                        input2 = input3;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    input = input2;
                                    i5 = 1;
                                    if (i5 != 0) {
                                        UnsafeKt.completeReadHead(input, chunkBuffer);
                                    }
                                    throw th;
                                }
                                intRef2.element = iCoerceAtLeast;
                            } else {
                                obj = coroutine_suspended;
                                function23 = function22;
                                function13 = function12;
                                c1050013 = c1050012;
                                input2 = input3;
                                j = remaining;
                                i6 = 0;
                                chunkBuffer = chunkBuffer4;
                            }
                            if (writePosition == 0) {
                                input = input2;
                                try {
                                    chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBuffer);
                                } catch (Throwable th9) {
                                    th = th9;
                                    i5 = i6;
                                    if (i5 != 0) {
                                    }
                                    throw th;
                                }
                            } else {
                                input = input2;
                                if (writePosition < iCoerceAtLeast || chunkBuffer.getCapacity() - chunkBuffer.getLimit() < 8) {
                                    UnsafeKt.completeReadHead(input, chunkBuffer);
                                    chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, iCoerceAtLeast);
                                } else {
                                    chunkBufferPrepareReadFirstHead = chunkBuffer;
                                }
                            }
                            if (chunkBufferPrepareReadFirstHead == null) {
                                i10 = i6;
                                break;
                            }
                            if (iCoerceAtLeast <= 0) {
                                chunkBuffer = chunkBufferPrepareReadFirstHead;
                                i10 = 1;
                                break;
                            }
                            function22 = function23;
                            c1050012 = c1050013;
                            function12 = function13;
                            input3 = input;
                            chunkBuffer4 = chunkBufferPrepareReadFirstHead;
                            coroutine_suspended = obj;
                            remaining = j;
                        } catch (Throwable th10) {
                            th = th10;
                            chunkBuffer = chunkBuffer4;
                            input = input3;
                        }
                    }
                    if (i10 != 0) {
                        UnsafeKt.completeReadHead(input, chunkBuffer);
                    }
                }
                function12 = function13;
                function12.invoke(Boxing.boxInt((int) (j - input.getRemaining())));
                function22 = function23;
                c1050012 = c1050013;
                appendable2 = appendable3;
                coroutine_suspended = obj;
                i13 = 1;
                if (!booleanRef2.element && (i3 = intRef2.element) != 0) {
                    Integer numBoxInt = Boxing.boxInt(i3);
                    c1050012.L$0 = appendable2;
                    c1050012.L$1 = function22;
                    c1050012.L$2 = function12;
                    c1050012.L$3 = intRef;
                    c1050012.L$4 = intRef2;
                    c1050012.L$5 = booleanRef;
                    c1050012.L$6 = booleanRef2;
                    c1050012.I$0 = i2;
                    c1050012.label = i13;
                    objInvoke = function22.invoke(numBoxInt, c1050012);
                    if (objInvoke != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appendable3 = appendable2;
                    obj2 = objInvoke;
                    Input input32 = (Input) obj2;
                    if (input32 != null) {
                    }
                }
            }
            i4 = intRef2.element;
            if (i4 <= 1) {
                prematureEndOfStreamUtf(i4);
                throw new KotlinNothingValueException();
            }
            if (booleanRef.element) {
                booleanRef2.element = true;
            }
            return Boxing.boxBoolean(intRef.element > 0 || booleanRef2.element);
        }
        ResultKt.throwOnFailure(obj2);
        Ref.IntRef intRef11 = new Ref.IntRef();
        Ref.IntRef intRef12 = new Ref.IntRef();
        intRef12.element = 1;
        intRef = intRef11;
        intRef2 = intRef12;
        booleanRef = new Ref.BooleanRef();
        booleanRef2 = new Ref.BooleanRef();
        appendable2 = appendable;
        function22 = function2;
        function12 = function1;
        c1050012 = c105001;
        i2 = i;
        if (!booleanRef2.element) {
            Integer numBoxInt2 = Boxing.boxInt(i3);
            c1050012.L$0 = appendable2;
            c1050012.L$1 = function22;
            c1050012.L$2 = function12;
            c1050012.L$3 = intRef;
            c1050012.L$4 = intRef2;
            c1050012.L$5 = booleanRef;
            c1050012.L$6 = booleanRef2;
            c1050012.I$0 = i2;
            c1050012.label = i13;
            objInvoke = function22.invoke(numBoxInt2, c1050012);
            if (objInvoke != coroutine_suspended) {
            }
        }
        i4 = intRef2.element;
        if (i4 <= 1) {
        }
    }

    public static final Void prematureEndOfStreamUtf(int i) throws EOFException {
        throw new EOFException("Premature end of stream: expected " + i + " bytes to decode UTF-8 char");
    }

    /* renamed from: encodeUTF8-lBXzO7A */
    public static final int m15685encodeUTF8lBXzO7A(@NotNull ByteBuffer encodeUTF8, @NotNull CharSequence text, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(encodeUTF8, "$this$encodeUTF8");
        Intrinsics.checkNotNullParameter(text, "text");
        int iMin = Math.min(i2, i + 65535);
        int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(i4, 65535);
        int i5 = i;
        int i6 = i3;
        while (i6 < iCoerceAtMost && i5 < iMin) {
            int i7 = i5 + 1;
            char cCharAt = text.charAt(i5);
            int i8 = cCharAt & CharCompanionObject.MAX_VALUE;
            if ((cCharAt & 65408) != 0) {
                return m15686encodeUTF8Stage1Vm9B2pQ(encodeUTF8, text, i5, iMin, i, i6, iCoerceAtMost, i3);
            }
            encodeUTF8.put(i6, (byte) i8);
            i5 = i7;
            i6++;
        }
        return EncodeResult.m15677constructorimpl(UShort.m15979constructorimpl((short) (i5 - i)), UShort.m15979constructorimpl((short) (i6 - i3)));
    }

    /* renamed from: encodeUTF8Stage1-Vm9B2pQ */
    public static final int m15686encodeUTF8Stage1Vm9B2pQ(ByteBuffer byteBuffer, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6) {
        int iCodePoint;
        int i7;
        int i8 = i5 - 3;
        int i9 = i;
        int i10 = i4;
        while (i8 - i10 > 0 && i9 < i2) {
            int i11 = i9 + 1;
            char cCharAt = charSequence.charAt(i9);
            if (!Character.isHighSurrogate(cCharAt)) {
                i9 = i11;
                iCodePoint = cCharAt;
            } else if (i11 == i2 || !Character.isLowSurrogate(charSequence.charAt(i11))) {
                i9 = i11;
                iCodePoint = 63;
            } else {
                i9 += 2;
                iCodePoint = codePoint(cCharAt, charSequence.charAt(i11));
            }
            if (iCodePoint >= 0 && iCodePoint < 128) {
                byteBuffer.put(i10, (byte) iCodePoint);
                i7 = 1;
            } else if (128 <= iCodePoint && iCodePoint < 2048) {
                byteBuffer.put(i10, (byte) (((iCodePoint >> 6) & 31) | 192));
                byteBuffer.put(i10 + 1, (byte) (128 | (iCodePoint & 63)));
                i7 = 2;
            } else if (2048 <= iCodePoint && iCodePoint < 65536) {
                byteBuffer.put(i10, (byte) (((iCodePoint >> 12) & 15) | 224));
                byteBuffer.put(i10 + 1, (byte) ((63 & (iCodePoint >> 6)) | 128));
                byteBuffer.put(i10 + 2, (byte) (128 | (iCodePoint & 63)));
                i7 = 3;
            } else {
                if (65536 > iCodePoint || iCodePoint >= 1114112) {
                    malformedCodePoint(iCodePoint);
                    throw new KotlinNothingValueException();
                }
                byteBuffer.put(i10, (byte) (((iCodePoint >> 18) & 7) | 240));
                byteBuffer.put(i10 + 1, (byte) (((iCodePoint >> 12) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) ((63 & (iCodePoint >> 6)) | 128));
                byteBuffer.put(i10 + 3, (byte) (128 | (iCodePoint & 63)));
                i7 = 4;
            }
            i10 += i7;
        }
        if (i10 == i8) {
            return m15687encodeUTF8Stage2Vm9B2pQ(byteBuffer, charSequence, i9, i2, i3, i10, i5, i6);
        }
        return EncodeResult.m15677constructorimpl(UShort.m15979constructorimpl((short) (i9 - i3)), UShort.m15979constructorimpl((short) (i10 - i6)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e2, code lost:
    
        malformedCodePoint(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00ea, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00fd, code lost:
    
        return io.ktor.utils.p050io.core.internal.EncodeResult.m15677constructorimpl(kotlin.UShort.m15979constructorimpl((short) (r3 - r20)), kotlin.UShort.m15979constructorimpl((short) (r4 - r23)));
     */
    /* renamed from: encodeUTF8Stage2-Vm9B2pQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m15687encodeUTF8Stage2Vm9B2pQ(ByteBuffer byteBuffer, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6) {
        int iCodePoint;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i4;
        while (true) {
            int i11 = i5 - i10;
            if (i11 <= 0 || i9 >= i2) {
                break;
            }
            int i12 = i9 + 1;
            char cCharAt = charSequence.charAt(i9);
            if (!Character.isHighSurrogate(cCharAt)) {
                i9 = i12;
                iCodePoint = cCharAt;
            } else if (i12 == i2 || !Character.isLowSurrogate(charSequence.charAt(i12))) {
                i9 = i12;
                iCodePoint = 63;
            } else {
                i9 += 2;
                iCodePoint = codePoint(cCharAt, charSequence.charAt(i12));
            }
            if (1 <= iCodePoint && iCodePoint < 128) {
                i7 = 1;
            } else if (128 <= iCodePoint && iCodePoint < 2048) {
                i7 = 2;
            } else if (2048 <= iCodePoint && iCodePoint < 65536) {
                i7 = 3;
            } else {
                if (65536 > iCodePoint || iCodePoint >= 1114112) {
                    break;
                }
                i7 = 4;
            }
            if (i7 > i11) {
                i9--;
                break;
            }
            if (iCodePoint >= 0 && iCodePoint < 128) {
                byteBuffer.put(i10, (byte) iCodePoint);
                i8 = 1;
            } else if (128 <= iCodePoint && iCodePoint < 2048) {
                byteBuffer.put(i10, (byte) (((iCodePoint >> 6) & 31) | 192));
                byteBuffer.put(i10 + 1, (byte) ((iCodePoint & 63) | 128));
                i8 = 2;
            } else if (2048 <= iCodePoint && iCodePoint < 65536) {
                byteBuffer.put(i10, (byte) (((iCodePoint >> 12) & 15) | 224));
                byteBuffer.put(i10 + 1, (byte) (((iCodePoint >> 6) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) ((iCodePoint & 63) | 128));
                i8 = 3;
            } else {
                if (65536 > iCodePoint || iCodePoint >= 1114112) {
                    break;
                }
                byteBuffer.put(i10, (byte) (((iCodePoint >> 18) & 7) | 240));
                byteBuffer.put(i10 + 1, (byte) (((iCodePoint >> 12) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) (((iCodePoint >> 6) & 63) | 128));
                byteBuffer.put(i10 + 3, (byte) ((iCodePoint & 63) | 128));
                i8 = 4;
            }
            i10 += i8;
        }
        malformedCodePoint(iCodePoint);
        throw new KotlinNothingValueException();
    }

    public static final int charactersSize(int i) {
        if (1 <= i && i < 128) {
            return 1;
        }
        if (128 <= i && i < 2048) {
            return 2;
        }
        if (2048 <= i && i < 65536) {
            return 3;
        }
        if (65536 <= i && i < 1114112) {
            return 4;
        }
        malformedCodePoint(i);
        throw new KotlinNothingValueException();
    }

    @PublishedApi
    @NotNull
    public static final Void malformedByteCount(int i) throws MalformedUTF8InputException {
        throw new MalformedUTF8InputException("Expected " + i + " more character bytes");
    }

    @PublishedApi
    @NotNull
    public static final Void malformedCodePoint(int i) {
        throw new IllegalArgumentException("Malformed code-point " + i + " found");
    }

    public static final boolean decodeASCII(@NotNull Buffer buffer, @NotNull Function1<? super Character, Boolean> consumer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        for (int i = readPosition; i < writePosition; i++) {
            byte b = memory.get(i);
            int i2 = b & 255;
            if ((b & 128) == 128 || !consumer.invoke(Character.valueOf((char) i2)).booleanValue()) {
                buffer.discardExact(i - readPosition);
                return false;
            }
        }
        buffer.discardExact(writePosition - readPosition);
        return true;
    }

    public static final int decodeUTF8(@NotNull Buffer buffer, @NotNull Function1<? super Character, Boolean> consumer) throws MalformedUTF8InputException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = readPosition; i4 < writePosition; i4++) {
            byte b = memory.get(i4);
            int i5 = b & 255;
            if ((b & 128) != 0) {
                if (i == 0) {
                    int i6 = 128;
                    i2 = i5;
                    for (int i7 = 1; i7 < 7 && (i2 & i6) != 0; i7++) {
                        i2 &= ~i6;
                        i6 >>= 1;
                        i++;
                    }
                    int i8 = i - 1;
                    if (i > writePosition - i4) {
                        buffer.discardExact(i4 - readPosition);
                        return i;
                    }
                    i3 = i;
                    i = i8;
                } else {
                    i2 = (i2 << 6) | (b & Byte.MAX_VALUE);
                    i--;
                    if (i != 0) {
                        continue;
                    } else {
                        if (isBmpCodePoint(i2)) {
                            if (!consumer.invoke(Character.valueOf((char) i2)).booleanValue()) {
                                buffer.discardExact(((i4 - readPosition) - i3) + 1);
                                return -1;
                            }
                        } else {
                            if (!isValidCodePoint(i2)) {
                                malformedCodePoint(i2);
                                throw new KotlinNothingValueException();
                            }
                            if (!consumer.invoke(Character.valueOf((char) highSurrogate(i2))).booleanValue() || !consumer.invoke(Character.valueOf((char) lowSurrogate(i2))).booleanValue()) {
                                buffer.discardExact(((i4 - readPosition) - i3) + 1);
                                return -1;
                            }
                        }
                        i2 = 0;
                    }
                }
            } else {
                if (i != 0) {
                    malformedByteCount(i);
                    throw new KotlinNothingValueException();
                }
                if (!consumer.invoke(Character.valueOf((char) i5)).booleanValue()) {
                    buffer.discardExact(i4 - readPosition);
                    return -1;
                }
            }
        }
        buffer.discardExact(writePosition - readPosition);
        return 0;
    }

    /* renamed from: putUtf8Char-62zg_DM */
    public static final int m15688putUtf8Char62zg_DM(@NotNull ByteBuffer putUtf8Char, int i, int i2) {
        Intrinsics.checkNotNullParameter(putUtf8Char, "$this$putUtf8Char");
        if (i2 >= 0 && i2 < 128) {
            putUtf8Char.put(i, (byte) i2);
            return 1;
        }
        if (128 <= i2 && i2 < 2048) {
            putUtf8Char.put(i, (byte) (((i2 >> 6) & 31) | 192));
            putUtf8Char.put(i + 1, (byte) ((i2 & 63) | 128));
            return 2;
        }
        if (2048 <= i2 && i2 < 65536) {
            putUtf8Char.put(i, (byte) (((i2 >> 12) & 15) | 224));
            putUtf8Char.put(i + 1, (byte) (((i2 >> 6) & 63) | 128));
            putUtf8Char.put(i + 2, (byte) ((i2 & 63) | 128));
            return 3;
        }
        if (65536 > i2 || i2 >= 1114112) {
            malformedCodePoint(i2);
            throw new KotlinNothingValueException();
        }
        putUtf8Char.put(i, (byte) (((i2 >> 18) & 7) | 240));
        putUtf8Char.put(i + 1, (byte) (((i2 >> 12) & 63) | 128));
        putUtf8Char.put(i + 2, (byte) (((i2 >> 6) & 63) | 128));
        putUtf8Char.put(i + 3, (byte) ((i2 & 63) | 128));
        return 4;
    }
}
