package com.blackhub.bronline.game.common.composemanager;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;

import com.blackhub.bronline.game.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComposeViewManager.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ComposeViewManager {
    public static final int $stable = 0;

    @NotNull
    public static final ComposeViewManager INSTANCE = new ComposeViewManager();

    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void setComposableContent(@NotNull ComposeView composeView, @NotNull final ComposableProvider content) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(content, "content");
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(447877139, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.common.composemanager.ComposeViewManager$setComposableContent$1$1

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(447877139, i, -1, "com.blackhub.bronline.game.common.composemanager.ComposeViewManager.setComposableContent.<anonymous>.<anonymous> (ComposeViewManager.kt:16)");
                    }
                    final ComposableProvider composableProvider = content;
                    ThemeKt.BRTheme(false, false, ComposableLambdaKt.composableLambda(composer, 1821433863, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.common.composemanager.ComposeViewManager$setComposableContent$1$1.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i2) {
                            if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1821433863, i2, -1, "com.blackhub.bronline.game.common.composemanager.ComposeViewManager.setComposableContent.<anonymous>.<anonymous>.<anonymous> (ComposeViewManager.kt:17)");
                            }
                            composableProvider.ProvideComposableContent(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0[_]]]")
    public final void setComposableContentForKotlin(@NotNull ComposeView composeView, @NotNull ComposableLambda content) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(content, "content");
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-606214338, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.common.composemanager.ComposeViewManager$setComposableContentForKotlin$1$1

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606214338, i, -1, "com.blackhub.bronline.game.common.composemanager.ComposeViewManager.setComposableContentForKotlin.<anonymous>.<anonymous> (ComposeViewManager.kt:30)");
                    }
                    final Function3<ComposableProvider, Composer, Integer, Unit> function3 = content;
                    ThemeKt.BRTheme(false, false, ComposableLambdaKt.composableLambda(composer, 767342386, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.common.composemanager.ComposeViewManager$setComposableContentForKotlin$1$1.1

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i2) {
                            if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(767342386, i2, -1, "com.blackhub.bronline.game.common.composemanager.ComposeViewManager.setComposableContentForKotlin.<anonymous>.<anonymous>.<anonymous> (ComposeViewManager.kt:31)");
                            }
                            function3.invoke(new ComposableProviderImpl(), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }
}

