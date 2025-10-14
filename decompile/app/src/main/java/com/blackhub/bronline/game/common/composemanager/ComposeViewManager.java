package com.blackhub.bronline.game.common.composemanager;

import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.p003ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
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
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ1\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/composemanager/ComposeViewManager;", "", "()V", "setComposableContent", "", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "content", "Lcom/blackhub/bronline/game/common/composemanager/ComposableProvider;", "setComposableContentForKotlin", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function3;)V", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
            {
                super(2);
            }

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
    public final void setComposableContentForKotlin(@NotNull ComposeView composeView, @NotNull final Function3<? super ComposableProvider, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(content, "content");
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-606214338, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.common.composemanager.ComposeViewManager$setComposableContentForKotlin$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

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
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
