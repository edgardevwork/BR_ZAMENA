package com.blackhub.bronline.game.p019ui.upgradeobjectevent;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.UpgradeObjectEventTopListOfServersItem;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventTopServers.kt */
/* loaded from: classes3.dex */
public final class ComposableSingletons$UpgradeObjectEventTopServersKt {

    @NotNull
    public static final ComposableSingletons$UpgradeObjectEventTopServersKt INSTANCE = new ComposableSingletons$UpgradeObjectEventTopServersKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<LazyItemScope, Composer, Integer, Unit> f11255lambda1 = ComposableLambdaKt.composableLambdaInstance(1315364979, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.ComposableSingletons$UpgradeObjectEventTopServersKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull LazyItemScope item, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1315364979, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.ComposableSingletons$UpgradeObjectEventTopServersKt.lambda-1.<anonymous> (UpgradeObjectEventTopServers.kt:105)");
                }
                UpgradeObjectEventTopServersItemKt.UpgradeObjectEventTopServersItem(new UpgradeObjectEventTopListOfServersItem(StringResources_androidKt.stringResource(R.string.common_place, composer, 6), StringResources_androidKt.stringResource(R.string.common_server, composer, 6), StringResources_androidKt.stringResource(R.string.common_level, composer, 6), false, 8, null), composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m15037getLambda1$app_siteRelease() {
        return f11255lambda1;
    }
}

