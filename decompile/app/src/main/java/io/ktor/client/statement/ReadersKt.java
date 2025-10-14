package io.ktor.client.statement;

import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteReadChannelKt;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Readers.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m7105d2 = {"discardRemaining", "", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readBytes", "", CatchStreamerKeys.COUNT_KEY, "", "(Lio/ktor/client/statement/HttpResponse;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ReadersKt {

    /* compiled from: Readers.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.statement.ReadersKt", m7120f = "Readers.kt", m7121i = {}, m7122l = {16}, m7123m = "readBytes", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.statement.ReadersKt$readBytes$1 */
    /* loaded from: classes8.dex */
    public static final class C102871 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C102871(Continuation<? super C102871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersKt.readBytes(null, 0, this);
        }
    }

    /* compiled from: Readers.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.statement.ReadersKt", m7120f = "Readers.kt", m7121i = {}, m7122l = {24}, m7123m = "readBytes", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.client.statement.ReadersKt$readBytes$3 */
    /* loaded from: classes8.dex */
    public static final class C102883 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C102883(Continuation<? super C102883> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersKt.readBytes(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readBytes(@NotNull HttpResponse httpResponse, int i, @NotNull Continuation<? super byte[]> continuation) throws Throwable {
        C102871 c102871;
        if (continuation instanceof C102871) {
            c102871 = (C102871) continuation;
            int i2 = c102871.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c102871.label = i2 - Integer.MIN_VALUE;
            } else {
                c102871 = new C102871(continuation);
            }
        }
        Object obj = c102871.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c102871.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byte[] bArr = (byte[]) c102871.L$0;
            ResultKt.throwOnFailure(obj);
            return bArr;
        }
        ResultKt.throwOnFailure(obj);
        byte[] bArr2 = new byte[i];
        ByteReadChannel content = httpResponse.getContent();
        c102871.L$0 = bArr2;
        c102871.label = 1;
        return ByteReadChannelKt.readFully(content, bArr2, c102871) == coroutine_suspended ? coroutine_suspended : bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readBytes(@NotNull HttpResponse httpResponse, @NotNull Continuation<? super byte[]> continuation) throws Throwable {
        C102883 c102883;
        if (continuation instanceof C102883) {
            c102883 = (C102883) continuation;
            int i = c102883.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c102883.label = i - Integer.MIN_VALUE;
            } else {
                c102883 = new C102883(continuation);
            }
        }
        C102883 c1028832 = c102883;
        Object remaining$default = c1028832.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1028832.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(remaining$default);
            ByteReadChannel content = httpResponse.getContent();
            c1028832.label = 1;
            remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default(content, 0L, c1028832, 1, null);
            if (remaining$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(remaining$default);
        }
        return StringsKt.readBytes$default((ByteReadPacket) remaining$default, 0, 1, null);
    }

    @Nullable
    public static final Object discardRemaining(@NotNull HttpResponse httpResponse, @NotNull Continuation<? super Unit> continuation) {
        Object objDiscard = ByteReadChannelKt.discard(httpResponse.getContent(), continuation);
        return objDiscard == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDiscard : Unit.INSTANCE;
    }
}
