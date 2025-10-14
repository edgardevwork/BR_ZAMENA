package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftCraftingControlBlock.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CraftCraftingControlBlockKt {

    @NotNull
    public static final ComposableSingletons$CraftCraftingControlBlockKt INSTANCE = new ComposableSingletons$CraftCraftingControlBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11209lambda1 = ComposableLambdaKt.composableLambdaInstance(-1297733344, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.ComposableSingletons$CraftCraftingControlBlockKt$lambda-1$1
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
                    ComposerKt.traceEventStart(-1297733344, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.ComposableSingletons$CraftCraftingControlBlockKt.lambda-1.<anonymous> (CraftCraftingControlBlock.kt:192)");
                }
                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_minus, composer, 6), (String) null, SizeKt.fillMaxSize(Modifier.INSTANCE, 0.5f), Color.INSTANCE.m11377getWhite0d7_KjU(), composer, 3512, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11210lambda2 = ComposableLambdaKt.composableLambdaInstance(1030367305, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.ComposableSingletons$CraftCraftingControlBlockKt$lambda-2$1
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
                    ComposerKt.traceEventStart(1030367305, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.ComposableSingletons$CraftCraftingControlBlockKt.lambda-2.<anonymous> (CraftCraftingControlBlock.kt:230)");
                }
                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_plus, composer, 6), (String) null, SizeKt.fillMaxSize(Modifier.INSTANCE, 0.5f), Color.INSTANCE.m11377getWhite0d7_KjU(), composer, 3512, 0);
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
    public final Function2<Composer, Integer, Unit> m14969getLambda1$app_siteRelease() {
        return f11209lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$app_siteRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14970getLambda2$app_siteRelease() {
        return f11210lambda2;
    }
}
