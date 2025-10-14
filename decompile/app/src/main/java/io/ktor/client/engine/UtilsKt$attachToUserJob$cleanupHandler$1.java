package io.ktor.client.engine;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "cause", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nio/ktor/client/engine/UtilsKt$attachToUserJob$cleanupHandler$1\n*L\n1#1,107:1\n*E\n"})
/* loaded from: classes8.dex */
public final class UtilsKt$attachToUserJob$cleanupHandler$1 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ Job $callJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$attachToUserJob$cleanupHandler$1(Job job) {
        super(1);
        this.$callJob = job;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        if (th == null) {
            return;
        }
        this.$callJob.cancel(new CancellationException(th.getMessage()));
    }
}
