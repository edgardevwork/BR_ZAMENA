package io.ktor.client.request;

import io.ktor.http.Headers;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.InternalAPI;
import io.ktor.utils.p050io.ByteChannel;
import io.ktor.utils.p050io.ByteChannelKt;
import io.ktor.utils.p050io.ByteReadChannelKt;
import io.ktor.utils.p050io.ByteWriteChannel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClientUpgradeContent.kt */
@InternalAPI
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m7105d2 = {"Lio/ktor/client/request/ClientUpgradeContent;", "Lio/ktor/http/content/OutgoingContent$NoContent;", "()V", "content", "Lio/ktor/utils/io/ByteChannel;", "getContent", "()Lio/ktor/utils/io/ByteChannel;", "content$delegate", "Lkotlin/Lazy;", P2ArtifactParser.RuleHandler.OUTPUT, "Lio/ktor/utils/io/ByteWriteChannel;", "getOutput", "()Lio/ktor/utils/io/ByteWriteChannel;", "pipeTo", "", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verify", "headers", "Lio/ktor/http/Headers;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public abstract class ClientUpgradeContent extends OutgoingContent.NoContent {

    /* renamed from: content$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy content = LazyKt__LazyJVMKt.lazy(new Function0<ByteChannel>() { // from class: io.ktor.client.request.ClientUpgradeContent$content$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ByteChannel invoke() {
            return ByteChannelKt.ByteChannel$default(false, 1, null);
        }
    });

    public abstract void verify(@NotNull Headers headers);

    public final ByteChannel getContent() {
        return (ByteChannel) this.content.getValue();
    }

    @NotNull
    public final ByteWriteChannel getOutput() {
        return getContent();
    }

    @Nullable
    public final Object pipeTo(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Continuation<? super Unit> continuation) {
        Object objCopyAndClose$default = ByteReadChannelKt.copyAndClose$default(getContent(), byteWriteChannel, 0L, continuation, 2, null);
        return objCopyAndClose$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCopyAndClose$default : Unit.INSTANCE;
    }
}
