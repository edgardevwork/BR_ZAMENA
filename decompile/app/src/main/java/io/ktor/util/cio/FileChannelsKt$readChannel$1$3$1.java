package io.ktor.util.cio;

import io.ktor.util.BufferViewJvmKt;
import io.ktor.utils.p050io.WriterScope;
import io.ktor.utils.p050io.WriterSuspendSession;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileChannels.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterSuspendSession;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.util.cio.FileChannelsKt$readChannel$1$3$1", m7120f = "FileChannels.kt", m7121i = {0}, m7122l = {49}, m7123m = "invokeSuspend", m7124n = {"$this$writeSuspendSession"}, m7125s = {"L$0"})
/* loaded from: classes7.dex */
public final class FileChannelsKt$readChannel$1$3$1 extends SuspendLambda implements Function2<WriterSuspendSession, Continuation<? super Unit>, Object> {
    public final /* synthetic */ WriterScope $$this$writer;
    public final /* synthetic */ FileChannel $fileChannel;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$readChannel$1$3$1(WriterScope writerScope, FileChannel fileChannel, Continuation<? super FileChannelsKt$readChannel$1$3$1> continuation) {
        super(2, continuation);
        this.$$this$writer = writerScope;
        this.$fileChannel = fileChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FileChannelsKt$readChannel$1$3$1 fileChannelsKt$readChannel$1$3$1 = new FileChannelsKt$readChannel$1$3$1(this.$$this$writer, this.$fileChannel, continuation);
        fileChannelsKt$readChannel$1$3$1.L$0 = obj;
        return fileChannelsKt$readChannel$1$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull WriterSuspendSession writerSuspendSession, @Nullable Continuation<? super Unit> continuation) {
        return ((FileChannelsKt$readChannel$1$3$1) create(writerSuspendSession, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        WriterSuspendSession writerSuspendSession;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            writerSuspendSession = (WriterSuspendSession) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            writerSuspendSession = (WriterSuspendSession) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (true) {
            ChunkBuffer chunkBufferRequest = writerSuspendSession.request(1);
            if (chunkBufferRequest == null) {
                this.$$this$writer.getChannel().flush();
                this.L$0 = writerSuspendSession;
                this.label = 1;
                if (writerSuspendSession.tryAwait(1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                int i2 = BufferViewJvmKt.read(this.$fileChannel, chunkBufferRequest);
                if (i2 != -1) {
                    writerSuspendSession.written(i2);
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
