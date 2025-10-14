package com.blackhub.bronline.game.p019ui.blackpass.uiblock;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassProgressBar.kt */
@Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$BlackPassProgressBarKt {

    @NotNull
    public static final ComposableSingletons$BlackPassProgressBarKt INSTANCE = new ComposableSingletons$BlackPassProgressBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11165lambda1 = ComposableLambdaKt.composableLambdaInstance(653821691, false, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.ComposableSingletons$BlackPassProgressBarKt$lambda-1$1
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
                    ComposerKt.traceEventStart(653821691, i, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.ComposableSingletons$BlackPassProgressBarKt.lambda-1.<anonymous> (BlackPassProgressBar.kt:174)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(BorderKt.m7782borderxT4_qwU(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer, 6)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(R.color.light_blue, composer, 6), (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer, 6), ColorResources_androidKt.colorResource(R.color.light_blue, composer, 6), RoundedCornerShapeKt.getCircleShape()), ColorResources_androidKt.colorResource(R.color.black_gray_blue, composer, 6), RoundedCornerShapeKt.getCircleShape());
                Alignment center = Alignment.INSTANCE.getCenter();
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BoxKt.Box(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wsp, composer, 6)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(R.color.total_black, composer, 6), (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), composer, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_plus, composer, 6), (String) null, SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
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
    public final Function2<Composer, Integer, Unit> m14901getLambda1$app_siteRelease() {
        return f11165lambda1;
    }
}
