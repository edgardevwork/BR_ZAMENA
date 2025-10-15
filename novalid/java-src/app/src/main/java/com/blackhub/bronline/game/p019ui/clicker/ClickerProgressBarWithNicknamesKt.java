package com.blackhub.bronline.game.p019ui.clicker;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.progressbar.ProgressBarHorizontalCustomKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickerProgressBarWithNicknames.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, m7105d2 = {"ClickerProgressBarWithNicknames", "", "valueOfProgress", "", "myNick", "", "opponentNick", "(ILjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "PreviewClickerProgressBarWithNicknames", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "animatedTrackProgress", ""}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nClickerProgressBarWithNicknames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerProgressBarWithNicknames.kt\ncom/blackhub/bronline/game/ui/clicker/ClickerProgressBarWithNicknamesKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,145:1\n68#2,6:146\n74#2:180\n68#2,6:181\n74#2:215\n78#2:220\n78#2:231\n79#3,11:152\n79#3,11:187\n92#3:219\n92#3:230\n456#4,8:163\n464#4,3:177\n456#4,8:198\n464#4,3:212\n467#4,3:216\n467#4,3:227\n3737#5,6:171\n3737#5,6:206\n1116#6,6:221\n81#7:232\n*S KotlinDebug\n*F\n+ 1 ClickerProgressBarWithNicknames.kt\ncom/blackhub/bronline/game/ui/clicker/ClickerProgressBarWithNicknamesKt\n*L\n55#1:146,6\n55#1:180\n58#1:181,6\n58#1:215\n58#1:220\n55#1:231\n55#1:152,11\n58#1:187,11\n58#1:219\n55#1:230\n55#1:163,8\n55#1:177,3\n58#1:198,8\n58#1:212,3\n58#1:216,3\n55#1:227,3\n55#1:171,6\n58#1:206,6\n120#1:221,6\n49#1:232\n*E\n"})
/* loaded from: classes2.dex */
public final class ClickerProgressBarWithNicknamesKt {

    /* compiled from: ClickerProgressBarWithNicknames.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.clicker.ClickerProgressBarWithNicknamesKt$ClickerProgressBarWithNicknames$2 */
    public static final class C53532 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $myNick;
        public final /* synthetic */ String $opponentNick;
        public final /* synthetic */ int $valueOfProgress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53532(int i, String str, String str2, int i2) {
            super(2);
            i = i;
            str = str;
            str = str2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ClickerProgressBarWithNicknamesKt.ClickerProgressBarWithNicknames(i, str, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: ClickerProgressBarWithNicknames.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.clicker.ClickerProgressBarWithNicknamesKt$PreviewClickerProgressBarWithNicknames$1 */
    public static final class C53541 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53541(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ClickerProgressBarWithNicknamesKt.PreviewClickerProgressBarWithNicknames(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClickerProgressBarWithNicknames(int i, @NotNull String myNick, @NotNull String opponentNick, @Nullable Composer composer, int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(myNick, "myNick");
        Intrinsics.checkNotNullParameter(opponentNick, "opponentNick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1401450488);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(myNick) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(opponentNick) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1401450488, i4, -1, "com.blackhub.bronline.game.ui.clicker.ClickerProgressBarWithNicknames (ClickerProgressBarWithNicknames.kt:39)");
            }
            final long jColorResource = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
            final float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._52wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
            final float fM14409dpToPx8Feqmps2 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._660wdp, composerStartRestartGroup, 6);
            final float fM14409dpToPx8Feqmps3 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((ComposeExtensionKt.m14409dpToPx8Feqmps(fDimensionResource, composerStartRestartGroup, 0) / 100) * i) - (fM14409dpToPx8Feqmps2 / 2), ProgressIndicatorDefaults.INSTANCE.getProgressAnimationSpec(), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, 0, 20);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(companion, fDimensionResource);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenter());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._32wdp, composerStartRestartGroup, 6));
            float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6);
            SolidColor solidColor = new SolidColor(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6), null);
            Brush.Companion companion4 = Brush.INSTANCE;
            ProgressBarHorizontalCustomKt.m15101ProgressBarHorizontalCustomggYRBCk(modifierM8158height3ABfNKs, i, 100, 0, solidColor, Brush.Companion.m11289horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m11289horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), 0.0f, null, null, fDimensionResource2, 0.0f, false, null, false, 0, 0, 0.0f, 0.0f, true, null, false, R.drawable.bg_progress_strips, composerStartRestartGroup, ((i4 << 3) & 112) | 100663680, 805331328, 384, 3648136);
            BoxKt.Box(boxScopeInstance.align(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8174sizeVpY3zN4(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._32wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composerStartRestartGroup, 6), null, 2, null), companion2.getCenter()), composerStartRestartGroup, 0);
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterStart()), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
            Offset.Companion companion5 = Offset.INSTANCE;
            TextKt.m10024Text4IGK_g(myNick, modifierM8127paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, companion5.m11115getZeroF1C5BW0(), 0.0f, null, composerStartRestartGroup, 1600518, 38), composerStartRestartGroup, (i4 >> 3) & 14, 0, 65532);
            TextKt.m10024Text4IGK_g(opponentNick, PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterEnd()), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), 0.0f, 11, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, companion5.m11115getZeroF1C5BW0(), 0.0f, null, composerStartRestartGroup, 1600518, 38), composerStartRestartGroup, (i4 >> 6) & 14, 0, 65532);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._52wdp, composer2, 6)), 0.0f, 1, null);
            composer2.startReplaceableGroup(-1826852172);
            boolean zChanged = composer2.changed(fM14409dpToPx8Feqmps3) | composer2.changed(fM14409dpToPx8Feqmps2) | composer2.changed(fM14409dpToPx8Feqmps) | composer2.changed(stateAnimateFloatAsState) | composer2.changed(jColorResource);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerProgressBarWithNicknamesKt$ClickerProgressBarWithNicknames$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        long jCornerRadius$default = CornerRadiusKt.CornerRadius$default(fM14409dpToPx8Feqmps3, 0.0f, 2, null);
                        long jSize = androidx.compose.p003ui.geometry.SizeKt.Size(fM14409dpToPx8Feqmps2, fM14409dpToPx8Feqmps);
                        DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, jColorResource, OffsetKt.Offset(ClickerProgressBarWithNicknamesKt.ClickerProgressBarWithNicknames$lambda$0(stateAnimateFloatAsState), 0.0f), jSize, jCornerRadius$default, null, 0.0f, null, 0, 240, null);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierFillMaxWidth$default, (Function1) objRememberedValue, composer2, 0);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerProgressBarWithNicknamesKt.ClickerProgressBarWithNicknames.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ String $myNick;
                public final /* synthetic */ String $opponentNick;
                public final /* synthetic */ int $valueOfProgress;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C53532(int i5, String myNick2, String opponentNick2, int i22) {
                    super(2);
                    i = i5;
                    str = myNick2;
                    str = opponentNick2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i5) {
                    ClickerProgressBarWithNicknamesKt.ClickerProgressBarWithNicknames(i, str, str, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewClickerProgressBarWithNicknames(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-570757845);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-570757845, i, -1, "com.blackhub.bronline.game.ui.clicker.PreviewClickerProgressBarWithNicknames (ClickerProgressBarWithNicknames.kt:138)");
            }
            ClickerProgressBarWithNicknames(50, "You", "Opponent UPS", composerStartRestartGroup, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.clicker.ClickerProgressBarWithNicknamesKt.PreviewClickerProgressBarWithNicknames.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C53541(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    ClickerProgressBarWithNicknamesKt.PreviewClickerProgressBarWithNicknames(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float ClickerProgressBarWithNicknames$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }
}
