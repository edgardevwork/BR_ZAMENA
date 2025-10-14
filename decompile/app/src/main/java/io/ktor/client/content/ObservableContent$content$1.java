package io.ktor.client.content;

import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.WriterScope;
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

/* compiled from: ObservableContent.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.client.content.ObservableContent$content$1", m7120f = "ObservableContent.kt", m7121i = {}, m7122l = {36}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class ObservableContent$content$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ObservableContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableContent$content$1(ObservableContent observableContent, Continuation<? super ObservableContent$content$1> continuation) {
        super(2, continuation);
        this.this$0 = observableContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ObservableContent$content$1 observableContent$content$1 = new ObservableContent$content$1(this.this$0, continuation);
        observableContent$content$1.L$0 = obj;
        return observableContent$content$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ObservableContent$content$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WriterScope writerScope = (WriterScope) this.L$0;
            OutgoingContent.WriteChannelContent writeChannelContent = (OutgoingContent.WriteChannelContent) this.this$0.delegate;
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
