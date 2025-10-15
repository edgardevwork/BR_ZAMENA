package io.ktor.utils.p050io.jvm.javaio;

import io.ktor.utils.p050io.ByteWriteChannelKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Blocking.kt */
@Metadata(m7104d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m7105d2 = {"io/ktor/utils/io/jvm/javaio/OutputAdapter$loop$1", "Lio/ktor/utils/io/jvm/javaio/BlockingAdapter;", "loop", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlocking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blocking.kt\nio/ktor/utils/io/jvm/javaio/OutputAdapter$loop$1\n+ 2 Blocking.kt\nio/ktor/utils/io/jvm/javaio/BlockingAdapter\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n275#2,4:317\n1#3:321\n*S KotlinDebug\n*F\n+ 1 Blocking.kt\nio/ktor/utils/io/jvm/javaio/OutputAdapter$loop$1\n*L\n88#1:317,4\n*E\n"})
/* loaded from: classes8.dex */
public final class OutputAdapter$loop$1 extends BlockingAdapter {
    public final /* synthetic */ OutputAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputAdapter$loop$1(Job job, OutputAdapter outputAdapter) {
        super(job);
        this.this$0 = outputAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087 A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:24:0x004c, B:26:0x005e, B:29:0x0064, B:39:0x0087, B:41:0x008d, B:44:0x00a3, B:45:0x00a4, B:47:0x00a8, B:20:0x0043), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.utils.io.jvm.javaio.OutputAdapter$loop$1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [io.ktor.utils.io.jvm.javaio.BlockingAdapter, io.ktor.utils.io.jvm.javaio.OutputAdapter$loop$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.utils.io.jvm.javaio.BlockingAdapter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [io.ktor.utils.io.jvm.javaio.OutputAdapter$loop$1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a2 -> B:23:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00a6 -> B:23:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:23:0x004b). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.p050io.jvm.javaio.BlockingAdapter
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loop(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        OutputAdapter$loop$1$loop$1 outputAdapter$loop$1$loop$1;
        Throwable closedCause;
        Throwable closedCause2;
        if (continuation instanceof OutputAdapter$loop$1$loop$1) {
            outputAdapter$loop$1$loop$1 = (OutputAdapter$loop$1$loop$1) continuation;
            int i = outputAdapter$loop$1$loop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                outputAdapter$loop$1$loop$1.label = i - Integer.MIN_VALUE;
            } else {
                outputAdapter$loop$1$loop$1 = new OutputAdapter$loop$1$loop$1(this, continuation);
            }
        }
        Object objRendezvousBlock = outputAdapter$loop$1$loop$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = outputAdapter$loop$1$loop$1.label;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(objRendezvousBlock);
                r2 = this;
            } else if (r2 == 1) {
                r2 = (OutputAdapter$loop$1) outputAdapter$loop$1$loop$1.L$0;
                ResultKt.throwOnFailure(objRendezvousBlock);
                if (objRendezvousBlock != BlockingKt.CloseToken) {
                    if (objRendezvousBlock == BlockingKt.FlushToken) {
                        r2.this$0.channel.flush();
                        Throwable closedCause3 = r2.this$0.channel.getClosedCause();
                        if (closedCause3 != null) {
                            throw closedCause3;
                        }
                        r2 = r2;
                    } else {
                        r2 = r2;
                        if (objRendezvousBlock instanceof byte[]) {
                            int offset = r2.getOffset();
                            int length = r2.getLength();
                            outputAdapter$loop$1$loop$1.L$0 = r2;
                            outputAdapter$loop$1$loop$1.L$1 = null;
                            outputAdapter$loop$1$loop$1.label = 2;
                            Object objWriteFully = r2.this$0.channel.writeFully((byte[]) objRendezvousBlock, offset, length, outputAdapter$loop$1$loop$1);
                            r2 = r2;
                            if (objWriteFully == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    if (ByteWriteChannelKt.close(r2.this$0.channel) || (closedCause2 = r2.this$0.channel.getClosedCause()) == null) {
                        return Unit.INSTANCE;
                    }
                    throw closedCause2;
                }
            } else {
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                OutputAdapter$loop$1 outputAdapter$loop$1 = (OutputAdapter$loop$1) outputAdapter$loop$1$loop$1.L$0;
                ResultKt.throwOnFailure(objRendezvousBlock);
                r2 = outputAdapter$loop$1;
            }
            r2.result = 0;
            outputAdapter$loop$1$loop$1.L$0 = r2;
            outputAdapter$loop$1$loop$1.L$1 = r2;
            outputAdapter$loop$1$loop$1.label = 1;
            objRendezvousBlock = r2.rendezvousBlock(outputAdapter$loop$1$loop$1);
            if (objRendezvousBlock == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(outputAdapter$loop$1$loop$1);
            }
            if (objRendezvousBlock == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (objRendezvousBlock != BlockingKt.CloseToken) {
            }
        } catch (Throwable th) {
            try {
                if (!(th instanceof CancellationException)) {
                    r2.this$0.channel.close(th);
                }
                throw th;
            } catch (Throwable th2) {
                if (ByteWriteChannelKt.close(r2.this$0.channel) || (closedCause = r2.this$0.channel.getClosedCause()) == null) {
                    throw th2;
                }
                throw closedCause;
            }
        }
    }
}
