package com.blackhub.bronline.game.p019ui.marketplace.uiblock;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickNoAnimStopSpamBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketPlacePageNumber.kt */
@SourceDebugExtension({"SMAP\nMarketPlacePageNumber.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketPlacePageNumber.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketPlacePageNumberKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,79:1\n1116#2,6:80\n1116#2,6:86\n1116#2,6:92\n81#3:98\n81#3:99\n*S KotlinDebug\n*F\n+ 1 MarketPlacePageNumber.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketPlacePageNumberKt\n*L\n34#1:80,6\n49#1:86,6\n69#1:92,6\n34#1:98\n49#1:99\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketPlacePageNumberKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MarketPlacePageNumber(final int i, final boolean z, @NotNull final Function1<? super Integer, Unit> onPageSelected, @Nullable Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onPageSelected, "onPageSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(240836550);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPageSelected) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240836550, i4, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketPlacePageNumber (MarketPlacePageNumber.kt:32)");
            }
            composerStartRestartGroup.startReplaceableGroup(742058096);
            int i5 = i4 & 112;
            boolean z2 = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketPlacePageNumberKt$MarketPlacePageNumber$bgAlpha$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(z ? 1.0f : 0.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            float fMarketPlacePageNumber$lambda$1 = MarketPlacePageNumber$lambda$1((State) objRememberedValue);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(fMarketPlacePageNumber$lambda$1, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, AnyExtensionKt.empty(stringCompanionObject), null, composerStartRestartGroup, 0, 20);
            Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
            composerStartRestartGroup.startReplaceableGroup(742058547);
            boolean z3 = i5 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Color>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketPlacePageNumberKt$MarketPlacePageNumber$textColor$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Color invoke() {
                        return Color.m11330boximpl(m15005invoke0d7_KjU());
                    }

                    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                    public final long m15005invoke0d7_KjU() {
                        return z ? Color.INSTANCE.m11366getBlack0d7_KjU() : Color.INSTANCE.m11377getWhite0d7_KjU();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final State<Color> stateM7665animateColorAsStateeuL9pac = SingleValueAnimationKt.m7665animateColorAsStateeuL9pac(MarketPlacePageNumber$lambda$3((State) objRememberedValue2), AnimationSpecKt.tween$default(300, 0, null, 6, null), AnyExtensionKt.empty(stringCompanionObject), null, composerStartRestartGroup, 0, 8);
            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(BackgroundKt.background(Modifier.INSTANCE, brushM11289horizontalGradient8A3gB4$default, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)), stateAnimateFloatAsState.getValue().floatValue()), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(742059185);
            boolean z4 = ((i4 & 896) == 256) | ((i4 & 14) == 4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketPlacePageNumberKt$MarketPlacePageNumber$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        onPageSelected.invoke(Integer.valueOf(i));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock(modifierM8172size3ABfNKs, null, false, null, false, false, false, null, (Function0) objRememberedValue3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2104354760, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketPlacePageNumberKt.MarketPlacePageNumber.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i6) {
                    if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2104354760, i6, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketPlacePageNumber.<anonymous> (MarketPlacePageNumber.kt:70)");
                        }
                        TextKt.m10024Text4IGK_g(String.valueOf(i), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wdp, stateM7665animateColorAsStateeuL9pac.getValue().m11350unboximpl(), 0, 0L, 0.0f, null, null, composer3, 12582918, 124), composer3, 0, 0, 65534);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 805306368, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketPlacePageNumberKt.MarketPlacePageNumber.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i6) {
                    MarketPlacePageNumberKt.MarketPlacePageNumber(i, z, onPageSelected, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final float MarketPlacePageNumber$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final long MarketPlacePageNumber$lambda$3(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }
}

