package io.ktor.utils.p050io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delimited.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/LookAheadSuspendSession;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$copied$1", m7120f = "Delimited.kt", m7121i = {0, 0, 1, 1}, m7122l = {85, 95}, m7123m = "invokeSuspend", m7124n = {"$this$lookAheadSuspend", "copied", "$this$lookAheadSuspend", "copied"}, m7125s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes7.dex */
public final class DelimitedKt$readUntilDelimiterSuspend$copied$1 extends SuspendLambda implements Function2<LookAheadSuspendSession, Continuation<? super Integer>, Object> {
    public final /* synthetic */ int $copied0;
    public final /* synthetic */ ByteBuffer $delimiter;
    public final /* synthetic */ ByteBuffer $dst;
    public final /* synthetic */ Ref.BooleanRef $endFound;
    public final /* synthetic */ ByteReadChannel $this_readUntilDelimiterSuspend;
    public int I$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelimitedKt$readUntilDelimiterSuspend$copied$1(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, Ref.BooleanRef booleanRef, ByteReadChannel byteReadChannel, Continuation<? super DelimitedKt$readUntilDelimiterSuspend$copied$1> continuation) {
        super(2, continuation);
        this.$copied0 = i;
        this.$delimiter = byteBuffer;
        this.$dst = byteBuffer2;
        this.$endFound = booleanRef;
        this.$this_readUntilDelimiterSuspend = byteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DelimitedKt$readUntilDelimiterSuspend$copied$1 delimitedKt$readUntilDelimiterSuspend$copied$1 = new DelimitedKt$readUntilDelimiterSuspend$copied$1(this.$copied0, this.$delimiter, this.$dst, this.$endFound, this.$this_readUntilDelimiterSuspend, continuation);
        delimitedKt$readUntilDelimiterSuspend$copied$1.L$0 = obj;
        return delimitedKt$readUntilDelimiterSuspend$copied$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull LookAheadSuspendSession lookAheadSuspendSession, @Nullable Continuation<? super Integer> continuation) {
        return ((DelimitedKt$readUntilDelimiterSuspend$copied$1) create(lookAheadSuspendSession, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r6.$endFound.element == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r1 = r1 + r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0077 -> B:26:0x007a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        LookAheadSuspendSession lookAheadSuspendSession;
        int i;
        LookAheadSuspendSession lookAheadSuspendSession2;
        int iTryCopyUntilDelimiter;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            lookAheadSuspendSession = (LookAheadSuspendSession) this.L$0;
            i = this.$copied0;
            this.L$0 = lookAheadSuspendSession;
            this.I$0 = i;
            this.label = 1;
            if (lookAheadSuspendSession.awaitAtLeast(1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lookAheadSuspendSession2 = lookAheadSuspendSession;
            iTryCopyUntilDelimiter = DelimitedKt.tryCopyUntilDelimiter(lookAheadSuspendSession2, this.$delimiter, this.$dst);
            if (iTryCopyUntilDelimiter == 0) {
            }
            lookAheadSuspendSession = lookAheadSuspendSession2;
            if (this.$dst.hasRemaining()) {
            }
            return Boxing.boxInt(i);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            lookAheadSuspendSession2 = (LookAheadSuspendSession) this.L$0;
            ResultKt.throwOnFailure(obj);
            lookAheadSuspendSession = lookAheadSuspendSession2;
            if (this.$dst.hasRemaining()) {
            }
            return Boxing.boxInt(i);
        }
        i = this.I$0;
        lookAheadSuspendSession2 = (LookAheadSuspendSession) this.L$0;
        ResultKt.throwOnFailure(obj);
        iTryCopyUntilDelimiter = DelimitedKt.tryCopyUntilDelimiter(lookAheadSuspendSession2, this.$delimiter, this.$dst);
        if (iTryCopyUntilDelimiter == 0) {
            if (DelimitedKt.startsWithDelimiter(lookAheadSuspendSession2, this.$delimiter) == this.$delimiter.remaining()) {
                this.$endFound.element = true;
            } else if (!this.$this_readUntilDelimiterSuspend.isClosedForWrite()) {
                int iRemaining = this.$delimiter.remaining();
                this.L$0 = lookAheadSuspendSession2;
                this.I$0 = i;
                this.label = 2;
                if (lookAheadSuspendSession2.awaitAtLeast(iRemaining, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxInt(i);
        }
        if (iTryCopyUntilDelimiter <= 0) {
            this.$endFound.element = true;
            i += -iTryCopyUntilDelimiter;
        } else {
            i += -iTryCopyUntilDelimiter;
        }
        lookAheadSuspendSession = lookAheadSuspendSession2;
        if (this.$dst.hasRemaining()) {
        }
        return Boxing.boxInt(i);
    }
}
