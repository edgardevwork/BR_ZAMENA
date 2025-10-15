package androidx.window.layout;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.util.Consumer;
import androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0;
import androidx.window.layout.WindowInfoTrackerImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInfoTrackerImpl.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "windowMetricsCalculator", "Landroidx/window/layout/WindowMetricsCalculator;", "windowBackend", "Landroidx/window/layout/WindowBackend;", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/WindowBackend;)V", "windowLayoutInfo", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "Companion", "window_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    public static final int BUFFER_CAPACITY = 10;

    @NotNull
    public final WindowBackend windowBackend;

    @NotNull
    public final WindowMetricsCalculator windowMetricsCalculator;

    public WindowInfoTrackerImpl(@NotNull WindowMetricsCalculator windowMetricsCalculator, @NotNull WindowBackend windowBackend) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    /* compiled from: WindowInfoTrackerImpl.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/window/layout/WindowLayoutInfo;"}, m7106k = 3, m7107mv = {1, 6, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m7120f = "WindowInfoTrackerImpl.kt", m7121i = {0, 0, 1, 1}, m7122l = {54, 55}, m7123m = "invokeSuspend", m7124n = {"$this$flow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "$this$flow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, m7125s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 */
    /* loaded from: classes.dex */
    public static final class C33001 extends SuspendLambda implements Function2<FlowCollector<? super WindowLayoutInfo>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Activity $activity;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33001(Activity activity, Continuation<? super C33001> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C33001 c33001 = WindowInfoTrackerImpl.this.new C33001(this.$activity, continuation);
            c33001.L$0 = obj;
            return c33001;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super WindowLayoutInfo> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((C33001) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x007e A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:40:0x001a, B:51:0x0064, B:55:0x0076, B:57:0x007e, B:47:0x0036, B:50:0x0060), top: B:64:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0090 -> B:41:0x001d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FlowCollector flowCollector;
            Consumer<WindowLayoutInfo> consumer;
            ChannelIterator it;
            FlowCollector flowCollector2;
            Object objHasNext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    final Channel channelChannel$default = ChannelKt.Channel$default(10, BufferOverflow.DROP_OLDEST, null, 4, null);
                    consumer = new Consumer() { // from class: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj2) {
                            WindowInfoTrackerImpl.C33001.m14241invokeSuspend$lambda0(channelChannel$default, (WindowLayoutInfo) obj2);
                        }
                    };
                    WindowInfoTrackerImpl.this.windowBackend.registerLayoutChangeCallback(this.$activity, new DefaultDownloaderFactory$$ExternalSyntheticLambda0(), consumer);
                    it = channelChannel$default.iterator();
                    this.L$0 = flowCollector;
                    this.L$1 = consumer;
                    this.L$2 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                    }
                } else if (i == 1) {
                    it = (ChannelIterator) this.L$2;
                    consumer = (Consumer) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (ChannelIterator) this.L$2;
                    consumer = (Consumer) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector2;
                    this.L$0 = flowCollector;
                    this.L$1 = consumer;
                    this.L$2 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowCollector2 = flowCollector;
                    obj = objHasNext;
                    if (((Boolean) obj).booleanValue()) {
                        WindowInfoTrackerImpl.this.windowBackend.unregisterLayoutChangeCallback(consumer);
                        return Unit.INSTANCE;
                    }
                    WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) it.next();
                    this.L$0 = flowCollector2;
                    this.L$1 = consumer;
                    this.L$2 = it;
                    this.label = 2;
                    if (flowCollector2.emit(windowLayoutInfo, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowCollector = flowCollector2;
                    this.L$0 = flowCollector;
                    this.L$1 = consumer;
                    this.L$2 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                    }
                }
            } catch (Throwable th) {
                WindowInfoTrackerImpl.this.windowBackend.unregisterLayoutChangeCallback(consumer);
                throw th;
            }
        }

        /* renamed from: invokeSuspend$lambda-0 */
        public static final void m14241invokeSuspend$lambda0(Channel channel, WindowLayoutInfo info) {
            Intrinsics.checkNotNullExpressionValue(info, "info");
            channel.mo17201trySendJP2dKIU(info);
        }
    }

    @Override // androidx.window.layout.WindowInfoTracker
    @NotNull
    public Flow<WindowLayoutInfo> windowLayoutInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return FlowKt.flow(new C33001(activity, null));
    }
}
