package io.ktor.client.plugins.logging;

import io.ktor.http.content.OutgoingContent;
import io.ktor.util.ByteChannelsKt;
import io.ktor.utils.p050io.ByteChannel;
import io.ktor.utils.p050io.ByteChannelKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.ByteWriteChannelKt;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.WriterScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ObservingUtils.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m7105d2 = {"observe", "Lio/ktor/http/content/OutgoingContent;", "log", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toReadChannel", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "ktor-client-logging"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ObservingUtilsKt {

    /* compiled from: ObservingUtils.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.ObservingUtilsKt", m7120f = "ObservingUtils.kt", m7121i = {0, 0}, m7122l = {14}, m7123m = "observe", m7124n = {"$this$observe", "log"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1 */
    /* loaded from: classes7.dex */
    public static final class C101971 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101971(Continuation<? super C101971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ObservingUtilsKt.observe(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object observe(@NotNull OutgoingContent outgoingContent, @NotNull ByteWriteChannel byteWriteChannel, @NotNull Continuation<? super OutgoingContent> continuation) throws Throwable {
        C101971 c101971;
        LoggedContent loggedContent;
        if (continuation instanceof C101971) {
            c101971 = (C101971) continuation;
            int i = c101971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101971.label = i - Integer.MIN_VALUE;
            } else {
                c101971 = new C101971(continuation);
            }
        }
        Object obj = c101971.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101971.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
                byte[] bytes = ((OutgoingContent.ByteArrayContent) outgoingContent).getBytes();
                c101971.L$0 = outgoingContent;
                c101971.L$1 = byteWriteChannel;
                c101971.label = 1;
                if (ByteWriteChannelKt.writeFully(byteWriteChannel, bytes, c101971) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
                    ByteChannel byteChannelByteChannel$default = ByteChannelKt.ByteChannel$default(false, 1, null);
                    ByteChannelsKt.copyToBoth(((OutgoingContent.ReadChannelContent) outgoingContent).getChannel(), byteWriteChannel, byteChannelByteChannel$default);
                    loggedContent = new LoggedContent(outgoingContent, byteChannelByteChannel$default);
                } else if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
                    ByteChannel byteChannelByteChannel$default2 = ByteChannelKt.ByteChannel$default(false, 1, null);
                    ByteChannelsKt.copyToBoth(toReadChannel((OutgoingContent.WriteChannelContent) outgoingContent), byteWriteChannel, byteChannelByteChannel$default2);
                    loggedContent = new LoggedContent(outgoingContent, byteChannelByteChannel$default2);
                } else {
                    ByteWriteChannelKt.close(byteWriteChannel);
                    return outgoingContent;
                }
                return loggedContent;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteWriteChannel = (ByteWriteChannel) c101971.L$1;
            outgoingContent = (OutgoingContent) c101971.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ByteWriteChannelKt.close(byteWriteChannel);
        return outgoingContent;
    }

    /* compiled from: ObservingUtils.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1", m7120f = "ObservingUtils.kt", m7121i = {}, m7122l = {41}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1 */
    /* loaded from: classes6.dex */
    public static final class C101981 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ OutgoingContent.WriteChannelContent $this_toReadChannel;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101981(OutgoingContent.WriteChannelContent writeChannelContent, Continuation<? super C101981> continuation) {
            super(2, continuation);
            this.$this_toReadChannel = writeChannelContent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C101981 c101981 = new C101981(this.$this_toReadChannel, continuation);
            c101981.L$0 = obj;
            return c101981;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C101981) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                OutgoingContent.WriteChannelContent writeChannelContent = this.$this_toReadChannel;
                ByteWriteChannel channel = writerScope.getChannel();
                this.label = 1;
                if (writeChannelContent.writeTo(channel, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final ByteReadChannel toReadChannel(OutgoingContent.WriteChannelContent writeChannelContent) {
        return CoroutinesKt.writer$default((CoroutineScope) GlobalScope.INSTANCE, (CoroutineContext) Dispatchers.getDefault(), false, (Function2) new C101981(writeChannelContent, null), 2, (Object) null).getChannel();
    }
}
