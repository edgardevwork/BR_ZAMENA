package io.ktor.utils.p050io;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Coroutines.kt */
@Metadata(m7104d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0097\u0001J\t\u0010\"\u001a\u00020#H\u0097\u0001J\u0015\u0010\"\u001a\u00020\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0097\u0001J\u001b\u0010\"\u001a\u00020#2\u0010\b\u0002\u0010$\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0096\u0001J6\u0010(\u001a\u0002H)\"\u0004\b\u0000\u0010)2\u0006\u0010*\u001a\u0002H)2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u0002H)0,H\u0096\u0001¢\u0006\u0002\u0010.J(\u0010/\u001a\u0004\u0018\u0001H0\"\b\b\u0000\u00100*\u00020-2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H00\u0014H\u0096\u0003¢\u0006\u0002\u00101J\r\u00102\u001a\u00060&j\u0002`'H\u0097\u0001JF\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000f2'\u00107\u001a#\u0012\u0015\u0012\u0013\u0018\u00010%¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b($\u0012\u0004\u0012\u00020#08j\u0002`;H\u0097\u0001J2\u00103\u001a\u0002042'\u00107\u001a#\u0012\u0015\u0012\u0013\u0018\u00010%¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b($\u0012\u0004\u0012\u00020#08j\u0002`;H\u0096\u0001J\u0011\u0010<\u001a\u00020#H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010=J\u0015\u0010>\u001a\u00020?2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0096\u0001J\u0011\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?H\u0096\u0003J\u0011\u0010@\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0003H\u0097\u0003J\t\u0010C\u001a\u00020\u000fH\u0096\u0001J\b\u0010D\u001a\u00020EH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0012\u0010\u0012\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, m7105d2 = {"Lio/ktor/utils/io/ChannelJob;", "Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/WriterJob;", "Lkotlinx/coroutines/Job;", "delegate", "channel", "Lio/ktor/utils/io/ByteChannel;", "(Lkotlinx/coroutines/Job;Lio/ktor/utils/io/ByteChannel;)V", "getChannel", "()Lio/ktor/utils/io/ByteChannel;", P2CompositeParser.ChildrenHandler.CHILDREN, "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "()Z", "isCancelled", "isCompleted", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", P2CompositeParser.ChildHandler.CHILD, "Lkotlinx/coroutines/ChildJob;", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", ExifInterface.LONGITUDE_EAST, "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getCancellationException", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "plus", "context", "other", TtmlNode.START, "toString", "", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ChannelJob implements ReaderJob, WriterJob, Job {

    @NotNull
    public final ByteChannel channel;

    @NotNull
    public final Job delegate;

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    @NotNull
    public ChildHandle attachChild(@NotNull ChildJob child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return this.delegate.attachChild(child);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        this.delegate.cancel();
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(@Nullable CancellationException cause) {
        this.delegate.cancel(cause);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(Throwable cause) {
        return this.delegate.cancel(cause);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.delegate.fold(initial, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (E) this.delegate.get(key);
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    @NotNull
    public CancellationException getCancellationException() {
        return this.delegate.getCancellationException();
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public Sequence<Job> getChildren() {
        return this.delegate.getChildren();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.Key<?> getKey() {
        return this.delegate.getKey();
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public SelectClause0 getOnJoin() {
        return this.delegate.getOnJoin();
    }

    @Override // kotlinx.coroutines.Job
    @Nullable
    public Job getParent() {
        return this.delegate.getParent();
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public DisposableHandle invokeOnCompletion(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.delegate.invokeOnCompletion(handler);
    }

    @Override // kotlinx.coroutines.Job
    @InternalCoroutinesApi
    @NotNull
    public DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.delegate.invokeOnCompletion(onCancelling, invokeImmediately, handler);
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return this.delegate.isActive();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return this.delegate.isCompleted();
    }

    @Override // kotlinx.coroutines.Job
    @Nullable
    public Object join(@NotNull Continuation<? super Unit> continuation) {
        return this.delegate.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.delegate.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.delegate.plus(context);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public Job plus(@NotNull Job other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.delegate.plus(other);
    }

    @Override // kotlinx.coroutines.Job
    public boolean start() {
        return this.delegate.start();
    }

    public ChannelJob(@NotNull Job delegate, @NotNull ByteChannel channel) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.delegate = delegate;
        this.channel = channel;
    }

    @Override // io.ktor.utils.p050io.ReaderJob, io.ktor.utils.p050io.WriterJob
    @NotNull
    public ByteChannel getChannel() {
        return this.channel;
    }

    @NotNull
    public String toString() {
        return "ChannelJob[" + this.delegate + AbstractJsonLexerKt.END_LIST;
    }
}
