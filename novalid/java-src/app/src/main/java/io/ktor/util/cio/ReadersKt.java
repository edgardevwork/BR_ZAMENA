package io.ktor.util.cio;

import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.core.ManifestParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Readers.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a6\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\f"}, m7105d2 = {"toByteArray", "", "Lio/ktor/utils/io/ByteReadChannel;", "limit", "", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", ManifestParser.ATTR_USE, "", "Lio/ktor/utils/io/ByteWriteChannel;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ReadersKt {

    /* compiled from: Readers.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.cio.ReadersKt", m7120f = "Readers.kt", m7121i = {}, m7122l = {15}, m7123m = "toByteArray", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.util.cio.ReadersKt$toByteArray$1 */
    /* loaded from: classes5.dex */
    public static final class C103691 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C103691(Continuation<? super C103691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersKt.toByteArray(null, 0, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toByteArray(@NotNull ByteReadChannel byteReadChannel, int i, @NotNull Continuation<? super byte[]> continuation) throws Throwable {
        C103691 c103691;
        if (continuation instanceof C103691) {
            c103691 = (C103691) continuation;
            int i2 = c103691.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c103691.label = i2 - Integer.MIN_VALUE;
            } else {
                c103691 = new C103691(continuation);
            }
        }
        Object remaining = c103691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c103691.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(remaining);
            c103691.label = 1;
            remaining = byteReadChannel.readRemaining(i, c103691);
            if (remaining == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(remaining);
        }
        return StringsKt.readBytes$default((ByteReadPacket) remaining, 0, 1, null);
    }

    public static /* synthetic */ Object toByteArray$default(ByteReadChannel byteReadChannel, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        return toByteArray(byteReadChannel, i, continuation);
    }

    public static final void use(@NotNull ByteWriteChannel byteWriteChannel, @NotNull Function1<? super ByteWriteChannel, Unit> block) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke(byteWriteChannel);
        } finally {
        }
    }
}
