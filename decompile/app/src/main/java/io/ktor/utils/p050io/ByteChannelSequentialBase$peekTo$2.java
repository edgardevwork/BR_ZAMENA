package io.ktor.utils.p050io;

import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteChannelSequential.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/SuspendableReadSession;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.utils.io.ByteChannelSequentialBase$peekTo$2", m7120f = "ByteChannelSequential.kt", m7121i = {0}, m7122l = {823}, m7123m = "invokeSuspend", m7124n = {"$this$readSuspendableSession"}, m7125s = {"L$0"})
@SourceDebugExtension({"SMAP\nByteChannelSequential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelSequential.kt\nio/ktor/utils/io/ByteChannelSequentialBase$peekTo$2\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 3 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n*L\n1#1,855:1\n69#2:856\n69#2:857\n15#3:858\n*S KotlinDebug\n*F\n+ 1 ByteChannelSequential.kt\nio/ktor/utils/io/ByteChannelSequentialBase$peekTo$2\n*L\n826#1:856\n827#1:857\n827#1:858\n*E\n"})
/* loaded from: classes7.dex */
public final class ByteChannelSequentialBase$peekTo$2 extends SuspendLambda implements Function2<SuspendableReadSession, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.LongRef $bytesCopied;
    public final /* synthetic */ ByteBuffer $destination;
    public final /* synthetic */ long $destinationOffset;
    public final /* synthetic */ long $max;
    public final /* synthetic */ long $min;
    public final /* synthetic */ long $offset;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialBase$peekTo$2(long j, long j2, Ref.LongRef longRef, long j3, ByteBuffer byteBuffer, long j4, Continuation<? super ByteChannelSequentialBase$peekTo$2> continuation) {
        super(2, continuation);
        this.$min = j;
        this.$offset = j2;
        this.$bytesCopied = longRef;
        this.$max = j3;
        this.$destination = byteBuffer;
        this.$destinationOffset = j4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ByteChannelSequentialBase$peekTo$2 byteChannelSequentialBase$peekTo$2 = new ByteChannelSequentialBase$peekTo$2(this.$min, this.$offset, this.$bytesCopied, this.$max, this.$destination, this.$destinationOffset, continuation);
        byteChannelSequentialBase$peekTo$2.L$0 = obj;
        return byteChannelSequentialBase$peekTo$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SuspendableReadSession suspendableReadSession, @Nullable Continuation<? super Unit> continuation) {
        return ((ByteChannelSequentialBase$peekTo$2) create(suspendableReadSession, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        SuspendableReadSession suspendableReadSession;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SuspendableReadSession suspendableReadSession2 = (SuspendableReadSession) this.L$0;
            int iCoerceAtMost = (int) RangesKt___RangesKt.coerceAtMost(this.$min + this.$offset, ByteChannelSequentialKt.EXPECTED_CAPACITY);
            this.L$0 = suspendableReadSession2;
            this.label = 1;
            if (suspendableReadSession2.await(iCoerceAtMost, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            suspendableReadSession = suspendableReadSession2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            suspendableReadSession = (SuspendableReadSession) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ChunkBuffer chunkBufferRequest = suspendableReadSession.request(1);
        if (chunkBufferRequest == null) {
            chunkBufferRequest = ChunkBuffer.INSTANCE.getEmpty();
        }
        if (chunkBufferRequest.getWritePosition() - chunkBufferRequest.getReadPosition() > this.$offset) {
            this.$bytesCopied.element = Math.min((chunkBufferRequest.getWritePosition() - chunkBufferRequest.getReadPosition()) - this.$offset, Math.min(this.$max, this.$destination.limit() - this.$destinationOffset));
            Memory.m15425copyToJT6ljtQ(chunkBufferRequest.getMemory(), this.$destination, this.$offset, this.$bytesCopied.element, this.$destinationOffset);
        }
        return Unit.INSTANCE;
    }
}
