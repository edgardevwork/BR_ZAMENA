package com.blackhub.bronline.game.gui.tutorialhints;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.p019ui.tutorial.TutorialGuiKt;
import com.blackhub.bronline.game.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TutorialGuiFragment.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$TutorialGuiFragmentKt {

    @NotNull
    public static final ComposableSingletons$TutorialGuiFragmentKt INSTANCE = new ComposableSingletons$TutorialGuiFragmentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11148lambda1 = ComposableLambdaKt.composableLambdaInstance(2052881300, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.tutorialhints.ComposableSingletons$TutorialGuiFragmentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052881300, i, -1, "com.blackhub.bronline.game.gui.tutorialhints.ComposableSingletons$TutorialGuiFragmentKt.lambda-1.<anonymous> (TutorialGuiFragment.kt:74)");
            }
            TutorialGuiKt.TutorialGui(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11149lambda2 = ComposableLambdaKt.composableLambdaInstance(754627848, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.tutorialhints.ComposableSingletons$TutorialGuiFragmentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(754627848, i, -1, "com.blackhub.bronline.game.gui.tutorialhints.ComposableSingletons$TutorialGuiFragmentKt.lambda-2.<anonymous> (TutorialGuiFragment.kt:73)");
                }
                ThemeKt.BRTheme(false, false, ComposableSingletons$TutorialGuiFragmentKt.INSTANCE.m14757getLambda1$app_siteRelease(), composer, 384, 3);
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
    public final Function2<Composer, Integer, Unit> m14757getLambda1$app_siteRelease() {
        return f11148lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14758getLambda2$app_siteRelease() {
        return f11149lambda2;
    }
}
