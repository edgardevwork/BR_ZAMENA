package io.ktor.utils.p050io;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Coroutines.kt */
@Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"Lio/ktor/utils/io/WriterJob;", "Lkotlinx/coroutines/Job;", "channel", "Lio/ktor/utils/io/ByteReadChannel;", "getChannel", "()Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface WriterJob extends Job {
    @NotNull
    ByteReadChannel getChannel();

    /* compiled from: Coroutines.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull WriterJob writerJob, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) Job.DefaultImpls.fold(writerJob, r, operation);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(@NotNull WriterJob writerJob, @NotNull CoroutineContext.Key<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (E) Job.DefaultImpls.get(writerJob, key);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull WriterJob writerJob, @NotNull CoroutineContext.Key<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Job.DefaultImpls.minusKey(writerJob, key);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull WriterJob writerJob, @NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Job.DefaultImpls.plus(writerJob, context);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static Job plus(@NotNull WriterJob writerJob, @NotNull Job other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Job.DefaultImpls.plus((Job) writerJob, other);
        }
    }
}
