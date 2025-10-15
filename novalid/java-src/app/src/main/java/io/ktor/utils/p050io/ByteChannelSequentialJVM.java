package io.ktor.utils.p050io;

import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.core.ByteBuffersKt;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.OutputArraysJVMKt;
import io.ktor.utils.p050io.core.StringsKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteChannelSequentialJVM.kt */
@Metadata(m7104d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0017J\u0011\u0010\f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002H\u000f0\u0011¢\u0006\u0002\b\u0013H\u0017¢\u0006\u0002\u0010\u0014J@\u0010\u0015\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¢\u0006\u0002\b\u0013H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ-\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J$\u0010!\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u0019\u0010%\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0019\u0010&\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J!\u0010'\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001fH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001fH\u0002J-\u0010-\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010.\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J$\u0010.\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u0019\u0010/\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0019\u00100\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0019\u00101\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J%\u00102\u001a\u00020\n2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00050\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u00103R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, m7105d2 = {"Lio/ktor/utils/io/ByteChannelSequentialJVM;", "Lio/ktor/utils/io/ByteChannelSequentialBase;", "initial", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "autoFlush", "", "(Lio/ktor/utils/io/core/internal/ChunkBuffer;Z)V", "attachedJob", "Lkotlinx/coroutines/Job;", "attachJob", "", "job", "awaitContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookAhead", "R", "visitor", "Lkotlin/Function1;", "Lio/ktor/utils/io/LookAheadSession;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "lookAheadSuspend", "Lkotlin/Function2;", "Lio/ktor/utils/io/LookAheadSuspendSession;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "read", "min", "", "consumer", "Ljava/nio/ByteBuffer;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAvailable", "dst", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "block", "readAvailableSuspend", "readFully", "readFullySuspend", "rc0", "(Ljava/nio/ByteBuffer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryReadAvailable", "tryWriteAvailable", "src", "write", "writeAvailable", "writeAvailableSuspend", "writeFully", "writeFullySuspend", "writeWhile", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Session", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nByteChannelSequentialJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelSequentialJVM.kt\nio/ktor/utils/io/ByteChannelSequentialJVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ByteBuffers.kt\nio/ktor/utils/io/core/ByteBuffersKt\n+ 4 PacketDirect.kt\nio/ktor/utils/io/core/PacketDirectKt\n+ 5 BufferUtilsJvm.kt\nio/ktor/utils/io/core/BufferUtilsJvmKt\n+ 6 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 7 Output.kt\nio/ktor/utils/io/core/Output\n*L\n1#1,256:1\n1#2:257\n1#2:285\n1#2:329\n1#2:373\n1#2:405\n1#2:436\n91#3,5:258\n96#3:271\n97#3:289\n98#3:301\n91#3,5:302\n96#3:315\n97#3:333\n98#3:345\n59#3,5:346\n80#3,5:351\n85#3:359\n64#3:382\n80#3,5:383\n85#3:391\n80#3,5:414\n85#3:422\n9#4,8:263\n18#4,11:290\n9#4,8:307\n18#4,11:334\n95#5,5:272\n100#5,3:282\n104#5:286\n95#5,5:316\n100#5,3:326\n104#5:330\n111#5,5:360\n116#5,3:370\n120#5:374\n111#5,5:392\n116#5,3:402\n120#5:406\n111#5,5:423\n116#5,3:433\n120#5:437\n372#6,5:277\n377#6,2:287\n372#6,5:321\n377#6,2:331\n390#6,5:365\n395#6,2:375\n390#6,5:397\n395#6,2:407\n390#6,5:428\n395#6,2:438\n371#7,3:356\n374#7,5:377\n371#7,3:388\n374#7,5:409\n371#7,3:419\n374#7,5:440\n*S KotlinDebug\n*F\n+ 1 ByteChannelSequentialJVM.kt\nio/ktor/utils/io/ByteChannelSequentialJVM\n*L\n102#1:285\n198#1:329\n220#1:373\n235#1:405\n247#1:436\n102#1:258,5\n102#1:271\n102#1:289\n102#1:301\n198#1:302,5\n198#1:315\n198#1:333\n198#1:345\n220#1:346,5\n220#1:351,5\n220#1:359\n220#1:382\n235#1:383,5\n235#1:391\n247#1:414,5\n247#1:422\n102#1:263,8\n102#1:290,11\n198#1:307,8\n198#1:334,11\n102#1:272,5\n102#1:282,3\n102#1:286\n198#1:316,5\n198#1:326,3\n198#1:330\n220#1:360,5\n220#1:370,3\n220#1:374\n235#1:392,5\n235#1:402,3\n235#1:406\n247#1:423,5\n247#1:433,3\n247#1:437\n102#1:277,5\n102#1:287,2\n198#1:321,5\n198#1:331,2\n220#1:365,5\n220#1:375,2\n235#1:397,5\n235#1:407,2\n247#1:428,5\n247#1:438,2\n220#1:356,3\n220#1:377,5\n235#1:388,3\n235#1:409,5\n247#1:419,3\n247#1:440,5\n*E\n"})
/* loaded from: classes7.dex */
public final class ByteChannelSequentialJVM extends ByteChannelSequentialBase {

    @Nullable
    private volatile Job attachedJob;

    /* compiled from: ByteChannelSequentialJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialJVM", m7120f = "ByteChannelSequentialJVM.kt", m7121i = {0, 0, 0}, m7122l = {BcBands.WIDE}, m7123m = "read", m7124n = {"this", "consumer", "min"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$read$1 */
    public static final class C104611 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104611(Continuation<? super C104611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.read(0, null, this);
        }
    }

    /* compiled from: ByteChannelSequentialJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialJVM", m7120f = "ByteChannelSequentialJVM.kt", m7121i = {0, 0}, m7122l = {112, 113}, m7123m = "readAvailableSuspend", m7124n = {"this", "dst"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$readAvailableSuspend$1 */
    public static final class C104621 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104621(Continuation<? super C104621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.readAvailableSuspend(null, this);
        }
    }

    /* compiled from: ByteChannelSequentialJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialJVM", m7120f = "ByteChannelSequentialJVM.kt", m7121i = {0, 0, 0}, m7122l = {128}, m7123m = "readFullySuspend", m7124n = {"this", "dst", CatchStreamerKeys.COUNT_KEY}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$readFullySuspend$1 */
    public static final class C104631 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104631(Continuation<? super C104631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.readFullySuspend((ByteBuffer) null, 0, this);
        }
    }

    /* compiled from: ByteChannelSequentialJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialJVM", m7120f = "ByteChannelSequentialJVM.kt", m7121i = {0, 0, 0}, m7122l = {ArjArchiveInputStream.ARJ_MAGIC_2}, m7123m = "write", m7124n = {"this", "block", "min"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$write$1 */
    public static final class C104641 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104641(Continuation<? super C104641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.write(0, null, this);
        }
    }

    /* compiled from: ByteChannelSequentialJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialJVM", m7120f = "ByteChannelSequentialJVM.kt", m7121i = {0, 0}, m7122l = {41, 42}, m7123m = "writeAvailableSuspend", m7124n = {"this", "src"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$writeAvailableSuspend$1 */
    public static final class C104651 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104651(Continuation<? super C104651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.writeAvailableSuspend((ByteBuffer) null, this);
        }
    }

    /* compiled from: ByteChannelSequentialJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialJVM", m7120f = "ByteChannelSequentialJVM.kt", m7121i = {0, 0}, m7122l = {54}, m7123m = "writeFullySuspend", m7124n = {"this", "src"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$writeFullySuspend$1 */
    public static final class C104661 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C104661(Continuation<? super C104661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.writeFullySuspend(null, this);
        }
    }

    /* compiled from: ByteChannelSequentialJVM.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialJVM", m7120f = "ByteChannelSequentialJVM.kt", m7121i = {0, 0, 0}, m7122l = {246}, m7123m = "writeWhile", m7124n = {"this", "block", "shouldContinue"}, m7125s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$writeWhile$1 */
    public static final class C104671 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C104671(Continuation<? super C104671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.writeWhile(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialJVM(@NotNull ChunkBuffer initial, boolean z) {
        super(initial, z, null, 4, null);
        Intrinsics.checkNotNullParameter(initial, "initial");
    }

    @Override // io.ktor.utils.p050io.ByteChannel
    @Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
    public void attachJob(@NotNull Job job) {
        Intrinsics.checkNotNullParameter(job, "job");
        Job job2 = this.attachedJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.attachedJob = job;
        Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new Function1<Throwable, Unit>() { // from class: io.ktor.utils.io.ByteChannelSequentialJVM.attachJob.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                ByteChannelSequentialJVM.this.attachedJob = null;
                if (th != null) {
                    ByteChannelSequentialJVM.this.cancel(ExceptionUtilsKt.unwrapCancellationException(th));
                }
            }
        }, 2, null);
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeAvailable(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        int iTryWriteAvailable = tryWriteAvailable(byteBuffer);
        if (iTryWriteAvailable <= 0) {
            if (byteBuffer.hasRemaining()) {
                return writeAvailableSuspend(byteBuffer, continuation);
            }
            iTryWriteAvailable = 0;
        }
        return Boxing.boxInt(iTryWriteAvailable);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeAvailableSuspend(ByteBuffer byteBuffer, Continuation<? super Integer> continuation) throws Throwable {
        C104651 c104651;
        ByteChannelSequentialJVM byteChannelSequentialJVM;
        if (continuation instanceof C104651) {
            c104651 = (C104651) continuation;
            int i = c104651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104651.label = i - Integer.MIN_VALUE;
            } else {
                c104651 = new C104651(continuation);
            }
        }
        Object objWriteAvailable = c104651.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104651.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWriteAvailable);
            c104651.L$0 = this;
            c104651.L$1 = byteBuffer;
            c104651.label = 1;
            if (awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104651) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialJVM = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objWriteAvailable);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) c104651.L$1;
            byteChannelSequentialJVM = (ByteChannelSequentialJVM) c104651.L$0;
            ResultKt.throwOnFailure(objWriteAvailable);
        }
        c104651.L$0 = null;
        c104651.L$1 = null;
        c104651.label = 2;
        objWriteAvailable = byteChannelSequentialJVM.writeAvailable(byteBuffer, c104651);
        return objWriteAvailable == coroutine_suspended ? coroutine_suspended : objWriteAvailable;
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    public Object writeFully(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWriteFullySuspend;
        tryWriteAvailable(byteBuffer);
        return (byteBuffer.hasRemaining() && (objWriteFullySuspend = writeFullySuspend(byteBuffer, continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objWriteFullySuspend : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:20:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeFullySuspend(ByteBuffer byteBuffer, Continuation<? super Unit> continuation) throws Throwable {
        C104661 c104661;
        ByteChannelSequentialJVM byteChannelSequentialJVM;
        if (continuation instanceof C104661) {
            c104661 = (C104661) continuation;
            int i = c104661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104661.label = i - Integer.MIN_VALUE;
            } else {
                c104661 = new C104661(continuation);
            }
        }
        Object obj = c104661.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104661.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialJVM = this;
            if (byteBuffer.hasRemaining()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) c104661.L$1;
            byteChannelSequentialJVM = (ByteChannelSequentialJVM) c104661.L$0;
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialJVM.afterWrite(byteChannelSequentialJVM.tryWriteAvailable(byteBuffer));
            if (byteBuffer.hasRemaining()) {
                c104661.L$0 = byteChannelSequentialJVM;
                c104661.L$1 = byteBuffer;
                c104661.label = 1;
                if (byteChannelSequentialJVM.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104661) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteChannelSequentialJVM.afterWrite(byteChannelSequentialJVM.tryWriteAvailable(byteBuffer));
                if (byteBuffer.hasRemaining()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int tryWriteAvailable(ByteBuffer src) throws Throwable {
        int iRemaining = src.remaining();
        int availableForWrite = getAvailableForWrite();
        if (getClosed()) {
            Throwable closedCause = getClosedCause();
            if (closedCause == null) {
                throw new ClosedSendChannelException("Channel closed for write");
            }
            throw closedCause;
        }
        if (iRemaining != 0) {
            if (iRemaining <= availableForWrite) {
                OutputArraysJVMKt.writeFully(getWritable(), src);
            } else if (availableForWrite == 0) {
                iRemaining = 0;
            } else {
                int iLimit = src.limit();
                src.limit(src.position() + availableForWrite);
                OutputArraysJVMKt.writeFully(getWritable(), src);
                src.limit(iLimit);
                iRemaining = availableForWrite;
            }
        }
        afterWrite(iRemaining);
        return iRemaining;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readAvailable(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        int iTryReadAvailable = tryReadAvailable(byteBuffer);
        if (iTryReadAvailable != 0) {
            return Boxing.boxInt(iTryReadAvailable);
        }
        return !byteBuffer.hasRemaining() ? Boxing.boxInt(0) : readAvailableSuspend(byteBuffer, continuation);
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    public int readAvailable(int min, @NotNull Function1<? super ByteBuffer, Unit> block) throws Throwable {
        Intrinsics.checkNotNullParameter(block, "block");
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        if (get_availableForRead() < min) {
            return -1;
        }
        prepareFlushedBytes();
        ByteReadPacket readable = getReadable();
        ChunkBuffer chunkBufferPrepareRead = readable.prepareRead(min);
        if (chunkBufferPrepareRead == null) {
            StringsKt.prematureEndOfStream(min);
            throw new KotlinNothingValueException();
        }
        int readPosition = chunkBufferPrepareRead.getReadPosition();
        try {
            ByteBuffer memory = chunkBufferPrepareRead.getMemory();
            int readPosition2 = chunkBufferPrepareRead.getReadPosition();
            int writePosition = chunkBufferPrepareRead.getWritePosition() - readPosition2;
            ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, readPosition2, writePosition);
            int iPosition = byteBufferM15433slice87lwejk.position();
            block.invoke(byteBufferM15433slice87lwejk);
            int iPosition2 = byteBufferM15433slice87lwejk.position() - iPosition;
            if (byteBufferM15433slice87lwejk.limit() != writePosition) {
                throw new IllegalStateException("Buffer's limit change is not allowed".toString());
            }
            chunkBufferPrepareRead.discardExact(byteBufferM15433slice87lwejk.position());
            int readPosition3 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition3 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                readable.ensureNext(chunkBufferPrepareRead);
            } else {
                readable.setHeadPosition(readPosition3);
            }
            return iPosition2;
        } catch (Throwable th) {
            int readPosition4 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition4 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition4 == chunkBufferPrepareRead.getWritePosition()) {
                readable.ensureNext(chunkBufferPrepareRead);
            } else {
                readable.setHeadPosition(readPosition4);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAvailableSuspend(ByteBuffer byteBuffer, Continuation<? super Integer> continuation) throws Throwable {
        C104621 c104621;
        ByteChannelSequentialJVM byteChannelSequentialJVM;
        if (continuation instanceof C104621) {
            c104621 = (C104621) continuation;
            int i = c104621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104621.label = i - Integer.MIN_VALUE;
            } else {
                c104621 = new C104621(continuation);
            }
        }
        Object objAwait = c104621.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104621.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            c104621.L$0 = this;
            c104621.L$1 = byteBuffer;
            c104621.label = 1;
            objAwait = await(1, c104621);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialJVM = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objAwait);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer = (ByteBuffer) c104621.L$1;
            byteChannelSequentialJVM = (ByteChannelSequentialJVM) c104621.L$0;
            ResultKt.throwOnFailure(objAwait);
        }
        if (!((Boolean) objAwait).booleanValue()) {
            return Boxing.boxInt(-1);
        }
        c104621.L$0 = null;
        c104621.L$1 = null;
        c104621.label = 2;
        objAwait = byteChannelSequentialJVM.readAvailable(byteBuffer, c104621);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object readFully(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        int iTryReadAvailable = tryReadAvailable(byteBuffer);
        if (iTryReadAvailable != -1) {
            return !byteBuffer.hasRemaining() ? Boxing.boxInt(iTryReadAvailable) : readFullySuspend(byteBuffer, iTryReadAvailable, continuation);
        }
        throw new EOFException("Channel closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:20:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFullySuspend(ByteBuffer byteBuffer, int i, Continuation<? super Integer> continuation) throws Throwable {
        C104631 c104631;
        ByteChannelSequentialJVM byteChannelSequentialJVM;
        if (continuation instanceof C104631) {
            c104631 = (C104631) continuation;
            int i2 = c104631.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104631.label = i2 - Integer.MIN_VALUE;
            } else {
                c104631 = new C104631(continuation);
            }
        }
        Object objAwait = c104631.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104631.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwait);
            byteChannelSequentialJVM = this;
            if (!byteBuffer.hasRemaining()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c104631.I$0;
            ByteBuffer byteBuffer2 = (ByteBuffer) c104631.L$1;
            byteChannelSequentialJVM = (ByteChannelSequentialJVM) c104631.L$0;
            ResultKt.throwOnFailure(objAwait);
            i = i4;
            byteBuffer = byteBuffer2;
            if (!((Boolean) objAwait).booleanValue()) {
                throw new EOFException("Channel closed");
            }
            int iTryReadAvailable = byteChannelSequentialJVM.tryReadAvailable(byteBuffer);
            if (iTryReadAvailable != -1) {
                i += iTryReadAvailable;
                if (!byteBuffer.hasRemaining()) {
                    c104631.L$0 = byteChannelSequentialJVM;
                    c104631.L$1 = byteBuffer;
                    c104631.I$0 = i;
                    c104631.label = 1;
                    objAwait = byteChannelSequentialJVM.await(1, c104631);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) objAwait).booleanValue()) {
                    }
                } else {
                    return Boxing.boxInt(i);
                }
            } else {
                throw new EOFException("Channel closed");
            }
        }
    }

    public final int tryReadAvailable(ByteBuffer dst) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        if (getClosed() && get_availableForRead() == 0) {
            return -1;
        }
        if (!getReadable().canRead()) {
            prepareFlushedBytes();
        }
        int available = ByteBuffersKt.readAvailable(getReadable(), dst);
        afterRead(available);
        return available;
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Deprecated(message = "Use read { } instead.")
    public <R> R lookAhead(@NotNull Function1<? super LookAheadSession, ? extends R> visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.invoke(new Session(this));
    }

    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Deprecated(message = "Use read { } instead.")
    @Nullable
    public <R> Object lookAheadSuspend(@NotNull Function2<? super LookAheadSuspendSession, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return function2.invoke(new Session(this), continuation);
    }

    /* compiled from: ByteChannelSequentialJVM.kt */
    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/utils/io/ByteChannelSequentialJVM$Session;", "Lio/ktor/utils/io/LookAheadSuspendSession;", "channel", "Lio/ktor/utils/io/ByteChannelSequentialJVM;", "(Lio/ktor/utils/io/ByteChannelSequentialJVM;)V", "awaitAtLeast", "", "n", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumed", "", "request", "Ljava/nio/ByteBuffer;", "skip", "atLeast", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nByteChannelSequentialJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelSequentialJVM.kt\nio/ktor/utils/io/ByteChannelSequentialJVM$Session\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Packet.kt\nio/ktor/utils/io/core/PacketKt\n+ 4 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,256:1\n1#2:257\n39#3:258\n69#4:259\n*S KotlinDebug\n*F\n+ 1 ByteChannelSequentialJVM.kt\nio/ktor/utils/io/ByteChannelSequentialJVM$Session\n*L\n179#1:258\n184#1:259\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Session implements LookAheadSuspendSession {

        @NotNull
        public final ByteChannelSequentialJVM channel;

        public Session(@NotNull ByteChannelSequentialJVM channel) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.channel = channel;
        }

        @Override // io.ktor.utils.p050io.LookAheadSuspendSession
        @Nullable
        public Object awaitAtLeast(int i, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
            Throwable closedCause = this.channel.getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            return this.channel.await(i, continuation);
        }

        @Override // io.ktor.utils.p050io.LookAheadSession
        /* renamed from: consumed */
        public void mo15689consumed(int n) throws Throwable {
            Throwable closedCause = this.channel.getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            this.channel.discard(n);
        }

        @Override // io.ktor.utils.p050io.LookAheadSession
        @Nullable
        public ByteBuffer request(int skip, int atLeast) throws Throwable {
            Throwable closedCause = this.channel.getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            if (this.channel.isClosedForRead()) {
                return null;
            }
            if (this.channel.getReadable().getEndOfInput()) {
                this.channel.prepareFlushedBytes();
            }
            ChunkBuffer head = this.channel.getReadable().getHead();
            if (head.getWritePosition() - head.getReadPosition() < atLeast + skip) {
                return null;
            }
            ByteBuffer byteBufferSlice = head.getMemory().slice();
            byteBufferSlice.position(head.getReadPosition() + skip);
            byteBufferSlice.limit(head.getWritePosition());
            return byteBufferSlice;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object read(int i, @NotNull Function1<? super ByteBuffer, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C104611 c104611;
        ByteChannelSequentialJVM byteChannelSequentialJVM;
        if (continuation instanceof C104611) {
            c104611 = (C104611) continuation;
            int i2 = c104611.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104611.label = i2 - Integer.MIN_VALUE;
            } else {
                c104611 = new C104611(continuation);
            }
        }
        Object objAwait = c104611.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104611.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (i < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c104611.L$0 = this;
            c104611.L$1 = function1;
            c104611.I$0 = i;
            c104611.label = 1;
            objAwait = await(i, c104611);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialJVM = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c104611.I$0;
            function1 = (Function1) c104611.L$1;
            byteChannelSequentialJVM = (ByteChannelSequentialJVM) c104611.L$0;
            ResultKt.throwOnFailure(objAwait);
        }
        if (!((Boolean) objAwait).booleanValue()) {
            throw new EOFException("Channel closed while " + i + " bytes expected");
        }
        ByteReadPacket readable = byteChannelSequentialJVM.getReadable();
        ChunkBuffer chunkBufferPrepareRead = readable.prepareRead(i);
        if (chunkBufferPrepareRead == null) {
            StringsKt.prematureEndOfStream(i);
            throw new KotlinNothingValueException();
        }
        int readPosition = chunkBufferPrepareRead.getReadPosition();
        try {
            ByteBuffer memory = chunkBufferPrepareRead.getMemory();
            int readPosition2 = chunkBufferPrepareRead.getReadPosition();
            int writePosition = chunkBufferPrepareRead.getWritePosition() - readPosition2;
            ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, readPosition2, writePosition);
            function1.invoke(byteBufferM15433slice87lwejk);
            if (byteBufferM15433slice87lwejk.limit() != writePosition) {
                throw new IllegalStateException("Buffer's limit change is not allowed".toString());
            }
            chunkBufferPrepareRead.discardExact(byteBufferM15433slice87lwejk.position());
            int readPosition3 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition3 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                readable.ensureNext(chunkBufferPrepareRead);
            } else {
                readable.setHeadPosition(readPosition3);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            int readPosition4 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition4 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition4 == chunkBufferPrepareRead.getWritePosition()) {
                readable.ensureNext(chunkBufferPrepareRead);
            } else {
                readable.setHeadPosition(readPosition4);
            }
            throw th;
        }
    }

    @Override // io.ktor.utils.p050io.ByteChannelSequentialBase, io.ktor.utils.p050io.ByteReadChannel
    @Nullable
    public Object awaitContent(@NotNull Continuation<? super Unit> continuation) {
        Object objAwait = await(1, continuation);
        return objAwait == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }

    @Override // io.ktor.utils.p050io.ByteWriteChannel
    public int writeAvailable(int min, @NotNull Function1<? super ByteBuffer, Unit> block) throws Throwable {
        Intrinsics.checkNotNullParameter(block, "block");
        if (getClosed()) {
            Throwable closedCause = getClosedCause();
            if (closedCause == null) {
                throw new ClosedSendChannelException("Channel closed for write");
            }
            throw closedCause;
        }
        if (getAvailableForWrite() < min) {
            return 0;
        }
        BytePacketBuilder writable = getWritable();
        ChunkBuffer chunkBufferPrepareWriteHead = writable.prepareWriteHead(min);
        try {
            ByteBuffer memory = chunkBufferPrepareWriteHead.getMemory();
            int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
            int limit = chunkBufferPrepareWriteHead.getLimit() - writePosition;
            ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, writePosition, limit);
            int iPosition = byteBufferM15433slice87lwejk.position();
            block.invoke(byteBufferM15433slice87lwejk);
            int iPosition2 = byteBufferM15433slice87lwejk.position() - iPosition;
            if (byteBufferM15433slice87lwejk.limit() != limit) {
                throw new IllegalStateException("Buffer's limit change is not allowed".toString());
            }
            int iPosition3 = byteBufferM15433slice87lwejk.position();
            chunkBufferPrepareWriteHead.commitWritten(iPosition3);
            if (iPosition3 < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative".toString());
            }
            writable.afterHeadWrite();
            return iPosition2;
        } catch (Throwable th) {
            writable.afterHeadWrite();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object write(int i, @NotNull Function1<? super ByteBuffer, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C104641 c104641;
        ByteChannelSequentialJVM byteChannelSequentialJVM;
        if (continuation instanceof C104641) {
            c104641 = (C104641) continuation;
            int i2 = c104641.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c104641.label = i2 - Integer.MIN_VALUE;
            } else {
                c104641 = new C104641(continuation);
            }
        }
        Object obj = c104641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c104641.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (getClosed()) {
                Throwable closedCause = getClosedCause();
                if (closedCause == null) {
                    throw new ClosedSendChannelException("Channel closed for write");
                }
                throw closedCause;
            }
            c104641.L$0 = this;
            c104641.L$1 = function1;
            c104641.I$0 = i;
            c104641.label = 1;
            if (awaitAtLeastNBytesAvailableForWrite$ktor_io(i, c104641) == coroutine_suspended) {
                return coroutine_suspended;
            }
            byteChannelSequentialJVM = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c104641.I$0;
            function1 = (Function1) c104641.L$1;
            byteChannelSequentialJVM = (ByteChannelSequentialJVM) c104641.L$0;
            ResultKt.throwOnFailure(obj);
        }
        BytePacketBuilder writable = byteChannelSequentialJVM.getWritable();
        ChunkBuffer chunkBufferPrepareWriteHead = writable.prepareWriteHead(i);
        try {
            ByteBuffer memory = chunkBufferPrepareWriteHead.getMemory();
            int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
            int limit = chunkBufferPrepareWriteHead.getLimit() - writePosition;
            ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, writePosition, limit);
            function1.invoke(byteBufferM15433slice87lwejk);
            if (byteBufferM15433slice87lwejk.limit() != limit) {
                throw new IllegalStateException("Buffer's limit change is not allowed".toString());
            }
            int iPosition = byteBufferM15433slice87lwejk.position();
            chunkBufferPrepareWriteHead.commitWritten(iPosition);
            if (iPosition < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative".toString());
            }
            writable.afterHeadWrite();
            byteChannelSequentialJVM.afterWrite(iPosition);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            writable.afterHeadWrite();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #0 {all -> 0x00ba, blocks: (B:26:0x0073, B:28:0x0096, B:35:0x00ae, B:36:0x00b9, B:39:0x00bc, B:40:0x00c7), top: B:43:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc A[Catch: all -> 0x00ba, TryCatch #0 {all -> 0x00ba, blocks: (B:26:0x0073, B:28:0x0096, B:35:0x00ae, B:36:0x00b9, B:39:0x00bc, B:40:0x00c7), top: B:43:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:25:0x006b). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p050io.ByteWriteChannel
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeWhile(@NotNull Function1<? super ByteBuffer, Boolean> function1, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C104671 c104671;
        ByteChannelSequentialJVM byteChannelSequentialJVM;
        if (continuation instanceof C104671) {
            c104671 = (C104671) continuation;
            int i = c104671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104671.label = i - Integer.MIN_VALUE;
            } else {
                c104671 = new C104671(continuation);
            }
        }
        Object obj = c104671.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byteChannelSequentialJVM = this;
            if (!byteChannelSequentialJVM.getClosed()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.BooleanRef booleanRef = (Ref.BooleanRef) c104671.L$2;
            Function1<? super ByteBuffer, Boolean> function12 = (Function1) c104671.L$1;
            byteChannelSequentialJVM = (ByteChannelSequentialJVM) c104671.L$0;
            ResultKt.throwOnFailure(obj);
            BytePacketBuilder writable = byteChannelSequentialJVM.getWritable();
            ChunkBuffer chunkBufferPrepareWriteHead = writable.prepareWriteHead(1);
            try {
                ByteBuffer memory = chunkBufferPrepareWriteHead.getMemory();
                int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
                int limit = chunkBufferPrepareWriteHead.getLimit() - writePosition;
                ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, writePosition, limit);
                booleanRef.element = function12.invoke(byteBufferM15433slice87lwejk).booleanValue();
                if (byteBufferM15433slice87lwejk.limit() != limit) {
                    int iPosition = byteBufferM15433slice87lwejk.position();
                    chunkBufferPrepareWriteHead.commitWritten(iPosition);
                    if (iPosition < 0) {
                        throw new IllegalStateException("The returned value shouldn't be negative".toString());
                    }
                    writable.afterHeadWrite();
                    byteChannelSequentialJVM.afterWrite(iPosition);
                    if (booleanRef.element) {
                        function1 = function12;
                        if (!byteChannelSequentialJVM.getClosed()) {
                            Throwable closedCause = byteChannelSequentialJVM.getClosedCause();
                            if (closedCause == null) {
                                throw new ClosedSendChannelException("Channel closed for write");
                            }
                            throw closedCause;
                        }
                        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                        c104671.L$0 = byteChannelSequentialJVM;
                        c104671.L$1 = function1;
                        c104671.L$2 = booleanRef2;
                        c104671.label = 1;
                        if (byteChannelSequentialJVM.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, c104671) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function12 = function1;
                        booleanRef = booleanRef2;
                        BytePacketBuilder writable2 = byteChannelSequentialJVM.getWritable();
                        ChunkBuffer chunkBufferPrepareWriteHead2 = writable2.prepareWriteHead(1);
                        ByteBuffer memory2 = chunkBufferPrepareWriteHead2.getMemory();
                        int writePosition2 = chunkBufferPrepareWriteHead2.getWritePosition();
                        int limit2 = chunkBufferPrepareWriteHead2.getLimit() - writePosition2;
                        ByteBuffer byteBufferM15433slice87lwejk2 = Memory.m15433slice87lwejk(memory2, writePosition2, limit2);
                        booleanRef.element = function12.invoke(byteBufferM15433slice87lwejk2).booleanValue();
                        if (byteBufferM15433slice87lwejk2.limit() != limit2) {
                            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            } catch (Throwable th) {
                writable2.afterHeadWrite();
                throw th;
            }
        }
    }
}
