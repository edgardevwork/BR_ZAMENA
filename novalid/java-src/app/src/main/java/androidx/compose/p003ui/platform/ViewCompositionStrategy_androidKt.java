package androidx.compose.p003ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, m7105d2 = {"installForLifecycle", "Lkotlin/Function0;", "", SVG.View.NODE_NAME, "Landroidx/compose/ui/platform/AbstractComposeView;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ViewCompositionStrategy_androidKt {
    public static final Function0<Unit> installForLifecycle(final AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        if (lifecycle.getState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1(abstractComposeView, lifecycleOwner, event);
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.installForLifecycle.2
            public final /* synthetic */ LifecycleEventObserver $observer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20022(LifecycleEventObserver lifecycleEventObserver2) {
                super(0);
                lifecycleEventObserver = lifecycleEventObserver2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                lifecycle.removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static final void installForLifecycle$lambda$1(AbstractComposeView abstractComposeView, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2 */
    public static final class C20022 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LifecycleEventObserver $observer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20022(LifecycleEventObserver lifecycleEventObserver2) {
            super(0);
            lifecycleEventObserver = lifecycleEventObserver2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            lifecycle.removeObserver(lifecycleEventObserver);
        }
    }
}
