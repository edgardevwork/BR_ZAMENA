package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PullToRefresh.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PullToRefreshKt {

    @NotNull
    public static final ComposableSingletons$PullToRefreshKt INSTANCE = new ComposableSingletons$PullToRefreshKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<PullToRefreshState, Composer, Integer, Unit> f11133lambda1 = ComposableLambdaKt.composableLambdaInstance(1116780789, false, new Function3<PullToRefreshState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.ComposableSingletons$PullToRefreshKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PullToRefreshState pullToRefreshState, Composer composer, Integer num) {
            invoke(pullToRefreshState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull PullToRefreshState pullToRefreshState, @Nullable Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= composer.changed(pullToRefreshState) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1116780789, i, -1, "androidx.compose.material3.pulltorefresh.ComposableSingletons$PullToRefreshKt.lambda-1.<anonymous> (PullToRefresh.kt:110)");
            }
            PullToRefreshDefaults.INSTANCE.m10189IndicatorFNF3uiM(pullToRefreshState, null, 0L, composer, (i & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function3<PullToRefreshState, Composer, Integer, Unit> m10188getLambda1$material3_release() {
        return f11133lambda1;
    }
}
