package io.ktor.client.call;

import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedCall.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m7105d2 = {"save", "Lio/ktor/client/call/HttpClientCall;", "(Lio/ktor/client/call/HttpClientCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class SavedCallKt {

    /* compiled from: SavedCall.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.call.SavedCallKt", m7120f = "SavedCall.kt", m7121i = {0}, m7122l = {73}, m7123m = "save", m7124n = {"$this$save"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.client.call.SavedCallKt$save$1 */
    /* loaded from: classes8.dex */
    public static final class C101141 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C101141(Continuation<? super C101141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SavedCallKt.save(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0014  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object save(@NotNull HttpClientCall httpClientCall, @NotNull Continuation<? super HttpClientCall> continuation) throws Throwable {
        C101141 c101141;
        if (continuation instanceof C101141) {
            c101141 = (C101141) continuation;
            int i = c101141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101141.label = i - Integer.MIN_VALUE;
            } else {
                c101141 = new C101141(continuation);
            }
        }
        C101141 c1011412 = c101141;
        Object remaining$default = c1011412.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1011412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(remaining$default);
            ByteReadChannel content = httpClientCall.getResponse().getContent();
            c1011412.L$0 = httpClientCall;
            c1011412.label = 1;
            remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default(content, 0L, c1011412, 1, null);
            if (remaining$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpClientCall = (HttpClientCall) c1011412.L$0;
            ResultKt.throwOnFailure(remaining$default);
        }
        return new SavedHttpCall(httpClientCall.getClient(), httpClientCall.getRequest(), httpClientCall.getResponse(), StringsKt.readBytes$default((ByteReadPacket) remaining$default, 0, 1, null));
    }
}
