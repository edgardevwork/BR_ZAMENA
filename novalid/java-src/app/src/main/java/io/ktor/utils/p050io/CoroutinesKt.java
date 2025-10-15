package io.ktor.utils.p050io;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Coroutines.kt */
@Metadata(m7104d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aU\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aW\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0018\u001a\u00020\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00112'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001aO\u0010\u0000\u001a\u00020\u0001*\u00020\u001b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001aO\u0010\u0000\u001a\u00020\u0001*\u00020\u001b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0002\u0010 \u001aO\u0010\u0013\u001a\u00020\u0014*\u00020\u001b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010!\u001aO\u0010\u0013\u001a\u00020\u0014*\u00020\u001b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0002\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m7105d2 = {"reader", "Lio/ktor/utils/io/ReaderJob;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "channel", "Lio/ktor/utils/io/ByteChannel;", "parent", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lio/ktor/utils/io/ReaderScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "autoFlush", "", "(Lkotlin/coroutines/CoroutineContext;ZLkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "writer", "Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/WriterScope;", "(Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/WriterJob;", "(Lkotlin/coroutines/CoroutineContext;ZLkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/WriterJob;", "launchChannel", "Lio/ktor/utils/io/ChannelJob;", "S", "Lkotlinx/coroutines/CoroutineScope;", "context", "attachJob", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;ZLkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ChannelJob;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/ReaderJob;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteChannel;Lkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/WriterJob;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lio/ktor/utils/io/WriterJob;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class CoroutinesKt {
    public static /* synthetic */ ReaderJob reader$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, ByteChannel byteChannel, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return reader(coroutineScope, coroutineContext, byteChannel, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
    @NotNull
    public static final ReaderJob reader(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull ByteChannel channel, @NotNull Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        return launchChannel(coroutineScope, coroutineContext, channel, false, block);
    }

    public static /* synthetic */ ReaderJob reader$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return reader(coroutineScope, coroutineContext, z, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @NotNull
    public static final ReaderJob reader(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, boolean z, @NotNull Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return launchChannel(coroutineScope, coroutineContext, ByteChannelKt.ByteChannel(z), true, block);
    }

    public static /* synthetic */ ReaderJob reader$default(CoroutineContext coroutineContext, ByteChannel byteChannel, Job job, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            job = null;
        }
        return reader(coroutineContext, byteChannel, job, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @Deprecated(message = "Use scope.reader instead")
    @NotNull
    public static final ReaderJob reader(@NotNull CoroutineContext coroutineContext, @NotNull ByteChannel channel, @Nullable Job job, @NotNull Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        CoroutineContext coroutineContextNewCoroutineContext;
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        if (job != null) {
            coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext.plus(job));
        } else {
            coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext);
        }
        return reader(CoroutineScopeKt.CoroutineScope(coroutineContextNewCoroutineContext), EmptyCoroutineContext.INSTANCE, channel, block);
    }

    public static /* synthetic */ ReaderJob reader$default(CoroutineContext coroutineContext, boolean z, Job job, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            job = null;
        }
        return reader(coroutineContext, z, job, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @Deprecated(message = "Use scope.reader instead")
    @NotNull
    public static final ReaderJob reader(@NotNull CoroutineContext coroutineContext, boolean z, @Nullable Job job, @NotNull Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteChannel ByteChannel = ByteChannelKt.ByteChannel(z);
        ReaderJob erVar = reader(coroutineContext, ByteChannel, job, block);
        ByteChannel.attachJob(erVar);
        return erVar;
    }

    public static /* synthetic */ WriterJob writer$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, ByteChannel byteChannel, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return writer(coroutineScope, coroutineContext, byteChannel, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
    @NotNull
    public static final WriterJob writer(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull ByteChannel channel, @NotNull Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        return launchChannel(coroutineScope, coroutineContext, channel, false, block);
    }

    public static /* synthetic */ WriterJob writer$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return writer(coroutineScope, coroutineContext, z, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @NotNull
    public static final WriterJob writer(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, boolean z, @NotNull Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return launchChannel(coroutineScope, coroutineContext, ByteChannelKt.ByteChannel(z), true, block);
    }

    public static /* synthetic */ WriterJob writer$default(CoroutineContext coroutineContext, ByteChannel byteChannel, Job job, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            job = null;
        }
        return writer(coroutineContext, byteChannel, job, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @Deprecated(message = "Use scope.writer instead")
    @NotNull
    public static final WriterJob writer(@NotNull CoroutineContext coroutineContext, @NotNull ByteChannel channel, @Nullable Job job, @NotNull Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        CoroutineContext coroutineContextNewCoroutineContext;
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        if (job != null) {
            coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext.plus(job));
        } else {
            coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext);
        }
        return writer(CoroutineScopeKt.CoroutineScope(coroutineContextNewCoroutineContext), EmptyCoroutineContext.INSTANCE, channel, block);
    }

    public static /* synthetic */ WriterJob writer$default(CoroutineContext coroutineContext, boolean z, Job job, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            job = null;
        }
        return writer(coroutineContext, z, job, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @Deprecated(message = "Use scope.writer instead")
    @NotNull
    public static final WriterJob writer(@NotNull CoroutineContext coroutineContext, boolean z, @Nullable Job job, @NotNull Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteChannel ByteChannel = ByteChannelKt.ByteChannel(z);
        WriterJob writerJobWriter = writer(coroutineContext, ByteChannel, job, block);
        ByteChannel.attachJob(writerJobWriter);
        return writerJobWriter;
    }

    public static final <S extends CoroutineScope> ChannelJob launchChannel(CoroutineScope coroutineScope, CoroutineContext coroutineContext, ByteChannel byteChannel, boolean z, Function2<? super S, ? super Continuation<? super Unit>, ? extends Object> function2) {
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new CoroutinesKt$launchChannel$job$1(z, byteChannel, function2, (CoroutineDispatcher) coroutineScope.getCoroutineContext().get(CoroutineDispatcher.INSTANCE), null), 2, null);
        jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.utils.io.CoroutinesKt.launchChannel.1
            public C104841() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable Throwable th) {
                byteChannel.close(th);
            }
        });
        return new ChannelJob(jobLaunch$default, byteChannel);
    }

    /* compiled from: Coroutines.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "S", "Lkotlinx/coroutines/CoroutineScope;", "cause", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.utils.io.CoroutinesKt$launchChannel$1 */
    /* loaded from: classes7.dex */
    public static final class C104841 extends Lambda implements Function1<Throwable, Unit> {
        public C104841() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@Nullable Throwable th) {
            byteChannel.close(th);
        }
    }
}
