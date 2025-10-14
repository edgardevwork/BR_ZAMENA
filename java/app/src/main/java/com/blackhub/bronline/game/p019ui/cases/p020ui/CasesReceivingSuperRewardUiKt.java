package com.blackhub.bronline.game.p019ui.cases.p020ui;

import android.graphics.Bitmap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.anim.LottieLoopKt;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientCustomKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesReceivingSuperRewardUi.kt */
@SourceDebugExtension({"SMAP\nCasesReceivingSuperRewardUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesReceivingSuperRewardUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesReceivingSuperRewardUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,321:1\n1116#2,6:322\n1116#2,6:328\n1116#2,6:334\n1116#2,6:340\n1116#2,6:346\n1116#2,6:352\n1116#2,6:358\n1116#2,6:364\n1116#2,6:370\n1116#2,6:376\n1116#2,6:382\n1116#2,6:388\n1116#2,6:394\n1116#2,6:400\n1116#2,6:406\n1116#2,6:412\n1116#2,6:418\n1116#2,6:424\n81#3:430\n81#3:431\n81#3:432\n81#3:433\n81#3:434\n81#3:435\n81#3:436\n81#3:437\n81#3:438\n81#3:439\n81#3:440\n107#3,2:441\n*S KotlinDebug\n*F\n+ 1 CasesReceivingSuperRewardUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesReceivingSuperRewardUiKt\n*L\n68#1:322,6\n69#1:328,6\n70#1:334,6\n71#1:340,6\n73#1:346,6\n74#1:352,6\n75#1:358,6\n77#1:364,6\n78#1:370,6\n79#1:376,6\n80#1:382,6\n81#1:388,6\n82#1:394,6\n83#1:400,6\n84#1:406,6\n85#1:412,6\n86#1:418,6\n88#1:424,6\n69#1:430\n70#1:431\n71#1:432\n74#1:433\n75#1:434\n82#1:435\n83#1:436\n84#1:437\n85#1:438\n86#1:439\n88#1:440\n88#1:441,2\n*E\n"})
/* loaded from: classes2.dex */
public final class CasesReceivingSuperRewardUiKt {
    public static final float ALPHA_MIN_BOTTOM_TEXT = 0.5f;
    public static final int DEFAULT_DELAY_300 = 300;
    public static final int DEFAULT_DELAY_800 = 800;
    public static final int DELAY_REWARD_FIRST_STEP = 1300;
    public static final int DELAY_REWARD_SECOND_STEP = 1000;
    public static final int DELAY_START_FIRST_STEP = 1000;
    public static final float SCALE_REWARD_FIRST_STEP = 1.3f;
    public static final float SCALE_REWARD_SECOND_STEP = 0.9f;
    public static final float SCALE_START_FIRST_STEP = 1.2f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesReceivingSuperRewardUi(@Nullable final Bitmap bitmap, @Nullable final Bitmap bitmap2, @NotNull final String titleReward, @NotNull final Function0<Unit> onOpenRewardClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(titleReward, "titleReward");
        Intrinsics.checkNotNullParameter(onOpenRewardClick, "onOpenRewardClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1604452426);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1604452426, i, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUi (CasesReceivingSuperRewardUi.kt:66)");
        }
        composerStartRestartGroup.startReplaceableGroup(-825464281);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final Animatable animatable = (Animatable) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825464209);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.3f), Integer.valueOf(DELAY_REWARD_FIRST_STEP)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825464089);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(0.9f), 1000), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463965);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 800), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        MutableState mutableState3 = (MutableState) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463871);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        final Animatable animatable2 = (Animatable) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463800);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.2f), 1000), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        MutableState mutableState4 = (MutableState) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463683);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        MutableState mutableState5 = (MutableState) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463587);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        final Animatable animatable3 = (Animatable) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463514);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        final Animatable animatable4 = (Animatable) objRememberedValue9;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463443);
        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
        }
        final Animatable animatable5 = (Animatable) objRememberedValue10;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463369);
        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
        }
        final Animatable animatable6 = (Animatable) objRememberedValue11;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463294);
        Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
        }
        final Animatable animatable7 = (Animatable) objRememberedValue12;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463236);
        Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue13 == companion.getEmpty()) {
            objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
        }
        MutableState mutableState6 = (MutableState) objRememberedValue13;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463143);
        Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
        }
        MutableState mutableState7 = (MutableState) objRememberedValue14;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825463052);
        Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue15 == companion.getEmpty()) {
            objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
        }
        MutableState mutableState8 = (MutableState) objRememberedValue15;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825462964);
        Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue16 == companion.getEmpty()) {
            objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
        }
        MutableState mutableState9 = (MutableState) objRememberedValue16;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825462870);
        Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue17 == companion.getEmpty()) {
            objRememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(0.5f), 800), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
        }
        MutableState mutableState10 = (MutableState) objRememberedValue17;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-825462763);
        Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue18 == companion.getEmpty()) {
            objRememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
        }
        final MutableState mutableState11 = (MutableState) objRememberedValue18;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C51861(animatable3, mutableState6, animatable, animatable5, mutableState, mutableState2, mutableState8, animatable6, mutableState9, animatable7, mutableState11, mutableState10, mutableState3, animatable2, animatable4, mutableState4, mutableState5, mutableState7, null), composerStartRestartGroup, 70);
        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 479446927, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(479446927, i2, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUi.<anonymous> (CasesReceivingSuperRewardUi.kt:200)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap2, SizeKt.fillMaxSize$default(AlphaKt.alpha(companion2, animatable3.getValue().floatValue()), 0.0f, 1, null), null, ContentScale.INSTANCE.getFillHeight(), 0.0f, null, 0, composer2, 3080, 116);
                    LottieLoopKt.LottieLoop(SizeKt.fillMaxSize$default(AlphaKt.alpha(companion2, animatable3.getValue().floatValue()), 0.0f, 1, null), R.raw.anim_cases_super_reward_sqare, 0, composer2, 48, 4);
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer2, 6), 7, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment center = companion3.getCenter();
                    Animatable<Float, AnimationVector1D> animatable8 = animatable4;
                    Animatable<Float, AnimationVector1D> animatable9 = animatable5;
                    Animatable<Float, AnimationVector1D> animatable10 = animatable6;
                    String str = titleReward;
                    Animatable<Float, AnimationVector1D> animatable11 = animatable2;
                    Bitmap bitmap3 = bitmap;
                    Animatable<Float, AnimationVector1D> animatable12 = animatable;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(AlphaKt.alpha(companion2, animatable8.getValue().floatValue()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 0.0f, 13, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._224wdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.yellow_70, composer2, 6), composer2, 0, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(AlphaKt.alpha(companion2, animatable9.getValue().floatValue()), ColorResources_androidKt.colorResource(R.color.white_15, composer2, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._49wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._183wdp, composer2, 6));
                    Alignment center2 = companion3.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierAlpha = AlphaKt.alpha(companion2, animatable10.getValue().floatValue());
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(upperCase, modifierAlpha, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), 0, 0L, 0.0f, null, null, composer2, 12582918, 124), composer2, 0, 0, 65532);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._152wdp, composer2, 6));
                    Alignment center3 = companion3.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_stars, composer2, 6), (String) null, SizeKt.m8174sizeVpY3zN4(ScaleKt.scale(companion2, animatable11.getValue().floatValue()), PrimitiveResources_androidKt.dimensionResource(R.dimen._256wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._145wdp, composer2, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap3, SizeKt.m8172size3ABfNKs(ScaleKt.scale(companion2, animatable12.getValue().floatValue()), PrimitiveResources_androidKt.dimensionResource(R.dimen._152wdp, composer2, 6)), null, null, 0.0f, null, 0, composer2, 8, 124);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
                    Arrangement.Vertical bottom = arrangement.getBottom();
                    Animatable<Float, AnimationVector1D> animatable13 = animatable7;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(bottom, centerHorizontally2, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.cases_press_for_get, composer2, 6), PaddingKt.m8127paddingqDBjuR0$default(AlphaKt.alpha(companion2, animatable13.getValue().floatValue()), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._20wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer2, 6), 0, 0L, 0.0f, null, composer2, 1572870, 60), composer2, 0, 0, 65532);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    composer2.startReplaceableGroup(1528338773);
                    Object objRememberedValue19 = composer2.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    if (objRememberedValue19 == companion5.getEmpty()) {
                        objRememberedValue19 = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue19);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue19;
                    composer2.endReplaceableGroup();
                    boolean zCasesReceivingSuperRewardUi$lambda$28 = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$28(mutableState11);
                    composer2.startReplaceableGroup(1528338920);
                    boolean zChanged = composer2.changed(onOpenRewardClick);
                    final Function0<Unit> function0 = onOpenRewardClick;
                    Object objRememberedValue20 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue20 == companion5.getEmpty()) {
                        objRememberedValue20 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue20);
                    }
                    composer2.endReplaceableGroup();
                    BoxKt.Box(ClickableKt.m7803clickableO2vRcR0$default(modifierFillMaxSize$default2, mutableInteractionSource, null, zCasesReceivingSuperRewardUi$lambda$28, null, null, (Function0) objRememberedValue20, 24, null), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12582918, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi(bitmap, bitmap2, titleReward, onOpenRewardClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CasesReceivingSuperRewardUi$lambda$29(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CasesReceivingSuperRewardUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1", m7120f = "CasesReceivingSuperRewardUi.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1 */
    /* loaded from: classes7.dex */
    public static final class C51861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $bgAlphaAnimatedFloat;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $bgTextAlphaAnimatedFloat;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $gradientAlphaAnimatedFloat;
        public final /* synthetic */ MutableState<Boolean> $isGetRewardSuccess$delegate;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardAnimatedFloat;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $starsAnimatedFloat;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $textBottomAlphaAnimatedFloat;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $textTitleAlphaAnimatedFloat;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForBg$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForBottomText$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForGradient$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardAnimateOne$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardAnimateThree$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardAnimateTwo$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForStarsAnimateOne$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForStarsAnimateTwo$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForText$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForTitleBg$delegate;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51861(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, MutableState<Pair<Float, Integer>> mutableState2, MutableState<Pair<Float, Integer>> mutableState3, MutableState<Pair<Float, Integer>> mutableState4, Animatable<Float, AnimationVector1D> animatable4, MutableState<Pair<Float, Integer>> mutableState5, Animatable<Float, AnimationVector1D> animatable5, MutableState<Boolean> mutableState6, MutableState<Pair<Float, Integer>> mutableState7, MutableState<Pair<Float, Integer>> mutableState8, Animatable<Float, AnimationVector1D> animatable6, Animatable<Float, AnimationVector1D> animatable7, MutableState<Pair<Float, Integer>> mutableState9, MutableState<Pair<Float, Integer>> mutableState10, MutableState<Pair<Float, Integer>> mutableState11, Continuation<? super C51861> continuation) {
            super(2, continuation);
            this.$bgAlphaAnimatedFloat = animatable;
            this.$valueForBg$delegate = mutableState;
            this.$rewardAnimatedFloat = animatable2;
            this.$bgTextAlphaAnimatedFloat = animatable3;
            this.$valueForRewardAnimateOne$delegate = mutableState2;
            this.$valueForRewardAnimateTwo$delegate = mutableState3;
            this.$valueForTitleBg$delegate = mutableState4;
            this.$textTitleAlphaAnimatedFloat = animatable4;
            this.$valueForText$delegate = mutableState5;
            this.$textBottomAlphaAnimatedFloat = animatable5;
            this.$isGetRewardSuccess$delegate = mutableState6;
            this.$valueForBottomText$delegate = mutableState7;
            this.$valueForRewardAnimateThree$delegate = mutableState8;
            this.$starsAnimatedFloat = animatable6;
            this.$gradientAlphaAnimatedFloat = animatable7;
            this.$valueForStarsAnimateOne$delegate = mutableState9;
            this.$valueForStarsAnimateTwo$delegate = mutableState10;
            this.$valueForGradient$delegate = mutableState11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C51861 c51861 = new C51861(this.$bgAlphaAnimatedFloat, this.$valueForBg$delegate, this.$rewardAnimatedFloat, this.$bgTextAlphaAnimatedFloat, this.$valueForRewardAnimateOne$delegate, this.$valueForRewardAnimateTwo$delegate, this.$valueForTitleBg$delegate, this.$textTitleAlphaAnimatedFloat, this.$valueForText$delegate, this.$textBottomAlphaAnimatedFloat, this.$isGetRewardSuccess$delegate, this.$valueForBottomText$delegate, this.$valueForRewardAnimateThree$delegate, this.$starsAnimatedFloat, this.$gradientAlphaAnimatedFloat, this.$valueForStarsAnimateOne$delegate, this.$valueForStarsAnimateTwo$delegate, this.$valueForGradient$delegate, continuation);
            c51861.L$0 = obj;
            return c51861;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C51861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$bgAlphaAnimatedFloat, this.$valueForBg$delegate, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$rewardAnimatedFloat, this.$bgTextAlphaAnimatedFloat, this.$valueForRewardAnimateOne$delegate, this.$valueForRewardAnimateTwo$delegate, this.$valueForTitleBg$delegate, this.$textTitleAlphaAnimatedFloat, this.$valueForText$delegate, this.$textBottomAlphaAnimatedFloat, this.$isGetRewardSuccess$delegate, this.$valueForBottomText$delegate, this.$valueForRewardAnimateThree$delegate, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.$starsAnimatedFloat, this.$gradientAlphaAnimatedFloat, this.$valueForStarsAnimateOne$delegate, this.$valueForStarsAnimateTwo$delegate, this.$valueForGradient$delegate, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CasesReceivingSuperRewardUi.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$1", m7120f = "CasesReceivingSuperRewardUi.kt", m7121i = {}, m7122l = {93}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $bgAlphaAnimatedFloat;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForBg$delegate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$bgAlphaAnimatedFloat = animatable;
                this.$valueForBg$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$bgAlphaAnimatedFloat, this.$valueForBg$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$bgAlphaAnimatedFloat;
                    Object first = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$18(this.$valueForBg$delegate).getFirst();
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$18(this.$valueForBg$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: CasesReceivingSuperRewardUi.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$2", m7120f = "CasesReceivingSuperRewardUi.kt", m7121i = {0, 1, 2}, m7122l = {104, 111, 120, MatroskaExtractor.ID_BLOCK}, m7123m = "invokeSuspend", m7124n = {"$this$launch", "$this$launch", "$this$launch"}, m7125s = {"L$0", "L$0", "L$0"})
        /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $bgTextAlphaAnimatedFloat;
            public final /* synthetic */ MutableState<Boolean> $isGetRewardSuccess$delegate;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardAnimatedFloat;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $textBottomAlphaAnimatedFloat;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $textTitleAlphaAnimatedFloat;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForBottomText$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardAnimateOne$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardAnimateThree$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardAnimateTwo$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForText$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForTitleBg$delegate;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, MutableState<Pair<Float, Integer>> mutableState, MutableState<Pair<Float, Integer>> mutableState2, MutableState<Pair<Float, Integer>> mutableState3, Animatable<Float, AnimationVector1D> animatable3, MutableState<Pair<Float, Integer>> mutableState4, Animatable<Float, AnimationVector1D> animatable4, MutableState<Boolean> mutableState5, MutableState<Pair<Float, Integer>> mutableState6, MutableState<Pair<Float, Integer>> mutableState7, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$rewardAnimatedFloat = animatable;
                this.$bgTextAlphaAnimatedFloat = animatable2;
                this.$valueForRewardAnimateOne$delegate = mutableState;
                this.$valueForRewardAnimateTwo$delegate = mutableState2;
                this.$valueForTitleBg$delegate = mutableState3;
                this.$textTitleAlphaAnimatedFloat = animatable3;
                this.$valueForText$delegate = mutableState4;
                this.$textBottomAlphaAnimatedFloat = animatable4;
                this.$isGetRewardSuccess$delegate = mutableState5;
                this.$valueForBottomText$delegate = mutableState6;
                this.$valueForRewardAnimateThree$delegate = mutableState7;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$rewardAnimatedFloat, this.$bgTextAlphaAnimatedFloat, this.$valueForRewardAnimateOne$delegate, this.$valueForRewardAnimateTwo$delegate, this.$valueForTitleBg$delegate, this.$textTitleAlphaAnimatedFloat, this.$valueForText$delegate, this.$textBottomAlphaAnimatedFloat, this.$isGetRewardSuccess$delegate, this.$valueForBottomText$delegate, this.$valueForRewardAnimateThree$delegate, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x00ef A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x015e A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                CoroutineScope coroutineScope;
                Animatable<Float, AnimationVector1D> animatable;
                Object first;
                TweenSpec tweenSpecTween$default;
                Animatable<Float, AnimationVector1D> animatable2;
                Object first2;
                InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    Animatable<Float, AnimationVector1D> animatable3 = this.$rewardAnimatedFloat;
                    Object first3 = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$2(this.$valueForRewardAnimateOne$delegate).getFirst();
                    TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$2(this.$valueForRewardAnimateOne$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable3, first3, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = coroutineScope2;
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$textTitleAlphaAnimatedFloat, this.$valueForText$delegate, null), 3, null);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C118942(this.$textBottomAlphaAnimatedFloat, this.$valueForText$delegate, this.$isGetRewardSuccess$delegate, this.$valueForBottomText$delegate, null), 3, null);
                            animatable2 = this.$rewardAnimatedFloat;
                            first2 = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$6(this.$valueForRewardAnimateThree$delegate).getFirst();
                            infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$6(this.$valueForRewardAnimateThree$delegate).getSecond()).intValue(), 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null);
                            this.L$0 = null;
                            this.label = 4;
                            if (Animatable.animateTo$default(animatable2, first2, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default, null, null, this, 12, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = coroutineScope3;
                        animatable = this.$bgTextAlphaAnimatedFloat;
                        first = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$22(this.$valueForTitleBg$delegate).getFirst();
                        tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$22(this.$valueForTitleBg$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.L$0 = coroutineScope;
                        this.label = 3;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$textTitleAlphaAnimatedFloat, this.$valueForText$delegate, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C118942(this.$textBottomAlphaAnimatedFloat, this.$valueForText$delegate, this.$isGetRewardSuccess$delegate, this.$valueForBottomText$delegate, null), 3, null);
                        animatable2 = this.$rewardAnimatedFloat;
                        first2 = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$6(this.$valueForRewardAnimateThree$delegate).getFirst();
                        infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$6(this.$valueForRewardAnimateThree$delegate).getSecond()).intValue(), 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null);
                        this.L$0 = null;
                        this.label = 4;
                        if (Animatable.animateTo$default(animatable2, first2, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope4;
                }
                Animatable<Float, AnimationVector1D> animatable4 = this.$rewardAnimatedFloat;
                Object first4 = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$4(this.$valueForRewardAnimateTwo$delegate).getFirst();
                TweenSpec tweenSpecTween$default3 = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$4(this.$valueForRewardAnimateTwo$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.L$0 = coroutineScope;
                this.label = 2;
                if (Animatable.animateTo$default(animatable4, first4, tweenSpecTween$default3, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animatable = this.$bgTextAlphaAnimatedFloat;
                first = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$22(this.$valueForTitleBg$delegate).getFirst();
                tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$22(this.$valueForTitleBg$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.L$0 = coroutineScope;
                this.label = 3;
                if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$textTitleAlphaAnimatedFloat, this.$valueForText$delegate, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C118942(this.$textBottomAlphaAnimatedFloat, this.$valueForText$delegate, this.$isGetRewardSuccess$delegate, this.$valueForBottomText$delegate, null), 3, null);
                animatable2 = this.$rewardAnimatedFloat;
                first2 = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$6(this.$valueForRewardAnimateThree$delegate).getFirst();
                infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$6(this.$valueForRewardAnimateThree$delegate).getSecond()).intValue(), 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null);
                this.L$0 = null;
                this.label = 4;
                if (Animatable.animateTo$default(animatable2, first2, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default, null, null, this, 12, null) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CasesReceivingSuperRewardUi.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$2$1", m7120f = "CasesReceivingSuperRewardUi.kt", m7121i = {}, m7122l = {130}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $textTitleAlphaAnimatedFloat;
                public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForText$delegate;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$textTitleAlphaAnimatedFloat = animatable;
                    this.$valueForText$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.$textTitleAlphaAnimatedFloat, this.$valueForText$delegate, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$textTitleAlphaAnimatedFloat;
                        Object first = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$24(this.$valueForText$delegate).getFirst();
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$24(this.$valueForText$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: CasesReceivingSuperRewardUi.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$2$2", m7120f = "CasesReceivingSuperRewardUi.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DLY, Cea708Decoder.COMMAND_SWA}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$2$2, reason: invalid class name and collision with other inner class name */
            public static final class C118942 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ MutableState<Boolean> $isGetRewardSuccess$delegate;
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $textBottomAlphaAnimatedFloat;
                public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForBottomText$delegate;
                public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForText$delegate;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C118942(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, MutableState<Boolean> mutableState2, MutableState<Pair<Float, Integer>> mutableState3, Continuation<? super C118942> continuation) {
                    super(2, continuation);
                    this.$textBottomAlphaAnimatedFloat = animatable;
                    this.$valueForText$delegate = mutableState;
                    this.$isGetRewardSuccess$delegate = mutableState2;
                    this.$valueForBottomText$delegate = mutableState3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C118942(this.$textBottomAlphaAnimatedFloat, this.$valueForText$delegate, this.$isGetRewardSuccess$delegate, this.$valueForBottomText$delegate, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C118942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$textBottomAlphaAnimatedFloat;
                        Object first = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$24(this.$valueForText$delegate).getFirst();
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$24(this.$valueForText$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$29(this.$isGetRewardSuccess$delegate, true);
                    Animatable<Float, AnimationVector1D> animatable2 = this.$textBottomAlphaAnimatedFloat;
                    Object first2 = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$26(this.$valueForBottomText$delegate).getFirst();
                    InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$26(this.$valueForBottomText$delegate).getSecond()).intValue(), 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null);
                    this.label = 2;
                    if (Animatable.animateTo$default(animatable2, first2, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: CasesReceivingSuperRewardUi.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$3", m7120f = "CasesReceivingSuperRewardUi.kt", m7121i = {}, m7122l = {TsExtractor.TS_STREAM_TYPE_AC4, 179, MatroskaExtractor.ID_PIXEL_HEIGHT}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt$CasesReceivingSuperRewardUi$1$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $gradientAlphaAnimatedFloat;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $starsAnimatedFloat;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForGradient$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForStarsAnimateOne$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForStarsAnimateTwo$delegate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, MutableState<Pair<Float, Integer>> mutableState, MutableState<Pair<Float, Integer>> mutableState2, MutableState<Pair<Float, Integer>> mutableState3, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$starsAnimatedFloat = animatable;
                this.$gradientAlphaAnimatedFloat = animatable2;
                this.$valueForStarsAnimateOne$delegate = mutableState;
                this.$valueForStarsAnimateTwo$delegate = mutableState2;
                this.$valueForGradient$delegate = mutableState3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass3(this.$starsAnimatedFloat, this.$gradientAlphaAnimatedFloat, this.$valueForStarsAnimateOne$delegate, this.$valueForStarsAnimateTwo$delegate, this.$valueForGradient$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00c8 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Animatable<Float, AnimationVector1D> animatable;
                Object first;
                TweenSpec tweenSpecTween$default;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable<Float, AnimationVector1D> animatable2 = this.$starsAnimatedFloat;
                    Object first2 = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$9(this.$valueForStarsAnimateOne$delegate).getFirst();
                    TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$9(this.$valueForStarsAnimateOne$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable2, first2, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        animatable = this.$gradientAlphaAnimatedFloat;
                        first = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$20(this.$valueForGradient$delegate).getFirst();
                        tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$20(this.$valueForGradient$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 3;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Animatable<Float, AnimationVector1D> animatable3 = this.$starsAnimatedFloat;
                Object first3 = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$11(this.$valueForStarsAnimateTwo$delegate).getFirst();
                TweenSpec tweenSpecTween$default3 = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$11(this.$valueForStarsAnimateTwo$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.label = 2;
                if (Animatable.animateTo$default(animatable3, first3, tweenSpecTween$default3, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animatable = this.$gradientAlphaAnimatedFloat;
                first = CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$20(this.$valueForGradient$delegate).getFirst();
                tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi$lambda$20(this.$valueForGradient$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.label = 3;
                if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCasesReceivingSuperRewardUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(837656953);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(837656953, i, -1, "com.blackhub.bronline.game.ui.cases.ui.PreviewCasesReceivingSuperRewardUi (CasesReceivingSuperRewardUi.kt:313)");
            }
            CasesReceivingSuperRewardUi(null, null, "Особый кейс", new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt.PreviewCasesReceivingSuperRewardUi.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesReceivingSuperRewardUiKt.PreviewCasesReceivingSuperRewardUi.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CasesReceivingSuperRewardUiKt.PreviewCasesReceivingSuperRewardUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$2(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$4(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$6(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$9(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$11(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$18(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$20(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$22(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$24(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesReceivingSuperRewardUi$lambda$26(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final boolean CasesReceivingSuperRewardUi$lambda$28(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

