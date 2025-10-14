package com.blackhub.bronline.game.p019ui.donate;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
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
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonWithTopNarrowOvalGradientKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateDepositCoinsItem.kt */
@SourceDebugExtension({"SMAP\nDonateDepositCoinsItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonateDepositCoinsItem.kt\ncom/blackhub/bronline/game/ui/donate/DonateDepositCoinsItemKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,214:1\n74#2:215\n1116#3,6:216\n1116#3,6:364\n68#4,6:222\n74#4:256\n68#4,6:329\n74#4:363\n78#4:374\n78#4:379\n79#5,11:228\n79#5,11:259\n79#5,11:290\n92#5:322\n92#5:327\n79#5,11:335\n92#5:373\n92#5:378\n456#6,8:239\n464#6,3:253\n456#6,8:270\n464#6,3:284\n456#6,8:301\n464#6,3:315\n467#6,3:319\n467#6,3:324\n456#6,8:346\n464#6,3:360\n467#6,3:370\n467#6,3:375\n3737#7,6:247\n3737#7,6:278\n3737#7,6:309\n3737#7,6:354\n78#8,2:257\n80#8:287\n84#8:328\n91#9,2:288\n93#9:318\n97#9:323\n81#10:380\n107#10,2:381\n*S KotlinDebug\n*F\n+ 1 DonateDepositCoinsItem.kt\ncom/blackhub/bronline/game/ui/donate/DonateDepositCoinsItemKt\n*L\n63#1:215\n65#1:216,6\n191#1:364,6\n71#1:222,6\n71#1:256\n176#1:329,6\n176#1:363\n176#1:374\n71#1:379\n71#1:228,11\n86#1:259,11\n111#1:290,11\n111#1:322\n86#1:327\n176#1:335,11\n176#1:373\n71#1:378\n71#1:239,8\n71#1:253,3\n86#1:270,8\n86#1:284,3\n111#1:301,8\n111#1:315,3\n111#1:319,3\n86#1:324,3\n176#1:346,8\n176#1:360,3\n176#1:370,3\n71#1:375,3\n71#1:247,6\n86#1:278,6\n111#1:309,6\n176#1:354,6\n86#1:257,2\n86#1:287\n86#1:328\n111#1:288,2\n111#1:318\n111#1:323\n65#1:380\n65#1:381,2\n*E\n"})

public final class DonateDepositCoinsItemKt {
    public static final float CARD_HEIGHT = 0.9f;
    public static final float IMAGE_FILL_PERCENT = 0.8f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DonateDepositCoinsItem(@NotNull final String titleText, @NotNull final String buttonText, @NotNull final String imageUri, final int i, final int i2, final boolean z, @NotNull final String valueOfSale, @NotNull final Function0<Unit> onClick, @Nullable Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(valueOfSale, "valueOfSale");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(323421597);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(titleText) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(buttonText) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(imageUri) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(valueOfSale) ? 1048576 : 524288;
        }
        if ((i3 & 29360128) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onClick) ? 8388608 : 4194304;
        }
        if ((23967451 & i4) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(323421597, i4, -1, "com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItem (DonateDepositCoinsItem.kt:61)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(815790703);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(imageUri, new C55391(context, imageUri, mutableState, null), composerStartRestartGroup, ((i4 >> 6) & 14) | 64);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._130sdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6), 0.0f, 2, null), 0.9f);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_bp_item, composerStartRestartGroup, 6), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 7, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composerStartRestartGroup, 6), 7, null), 0.0f, 1, null), 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._17sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
            String upperCase = titleText.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
            TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30);
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            TextKt.m10024Text4IGK_g(upperCase, modifierM8127paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14873mullerBoldCustomSpbl3sdaw, composerStartRestartGroup, 0, 0, 65020);
            ImageBitmapKt.m15118ImageBitmapAy9G7rc(DonateDepositCoinsItem$lambda$1(mutableState), PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.8f), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), 0.0f, 2, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 8, 124);
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(-1327079160);
                Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_string_with_bc, new Object[]{String.valueOf(i)}, composerStartRestartGroup, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, TextDecoration.INSTANCE.getLineThrough(), TextAlign.m13551boximpl(companion5.m13563getStarte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6), 0, 0L, 0.0f, composerStartRestartGroup, 196614, 28), composerStartRestartGroup, 100663296, 0, 64766);
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_string_with_bc, new Object[]{String.valueOf(i2)}, composerStartRestartGroup, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._9wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 0, 0, 65022);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1327077828);
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_string_with_bc, new Object[]{String.valueOf(i2)}, composerStartRestartGroup, 70), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._9wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 48, 0, 65020);
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            ComposeExtensionKt.IfTrue(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1501130363, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemKt$DonateDepositCoinsItem$2$2
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
                public final void invoke(@Nullable Composer composer3, int i5) {
                    if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1501130363, i5, -1, "com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItem.<anonymous>.<anonymous> (DonateDepositCoinsItem.kt:153)");
                        }
                        TextKt.m10024Text4IGK_g(valueOfSale, PaddingKt.m8125paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(OffsetKt.m8083offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._35sdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._14sdp, composer3, 6)), ColorResources_androidKt.colorResource(R.color.yellow, composer3, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composer3, 6))), null, false, 3, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer3, 6), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, Color.INSTANCE.m11366getBlack0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer3, 12582966, 120), composer3, 0, 0, 65532);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i4 >> 15) & 14) | 48);
            Modifier modifierAlign = boxScopeInstance.align(companion2, companion3.getBottomCenter());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._115wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
            TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw2 = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._11wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30);
            long jColorResource = ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6);
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6);
            Integer numValueOf = Integer.valueOf(R.drawable.ic_basket);
            C2046Dp c2046DpM13664boximpl = C2046Dp.m13664boximpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(-1327075666);
            boolean z2 = (29360128 & i4) == 8388608;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemKt$DonateDepositCoinsItem$2$3$1$1
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
                        onClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            MainButtonWithTopNarrowOvalGradientKt.m15078MainButtonWithTopNarrowOvalGradientGE33TkQ(modifierM8174sizeVpY3zN4, buttonText, textStyleM14873mullerBoldCustomSpbl3sdaw2, jColorResource, fDimensionResource, numValueOf, c2046DpM13664boximpl, false, false, false, (Function0) objRememberedValue2, composer2, (i4 & 112) | ProfileVerifier.CompilationStatus.f342xf2722a21, 0, 896);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemKt.DonateDepositCoinsItem.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i5) {
                    DonateDepositCoinsItemKt.DonateDepositCoinsItem(titleText, buttonText, imageUri, i, i2, z, valueOfSale, onClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    /* compiled from: DonateDepositCoinsItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemKt$DonateDepositCoinsItem$1", m7120f = "DonateDepositCoinsItem.kt", m7121i = {}, m7122l = {67}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemKt$DonateDepositCoinsItem$1 */
    /* loaded from: classes7.dex */
    public static final class C55391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Bitmap> $image$delegate;
        public final /* synthetic */ String $imageUri;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55391(Context context, String str, MutableState<Bitmap> mutableState, Continuation<? super C55391> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$imageUri = str;
            this.$image$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C55391(this.$context, this.$imageUri, this.$image$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C55391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DonateDepositCoinsItem.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemKt$DonateDepositCoinsItem$1$1", m7120f = "DonateDepositCoinsItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemKt$DonateDepositCoinsItem$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ MutableState<Bitmap> $image$delegate;
            public final /* synthetic */ String $imageUri;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Context context, String str, MutableState<Bitmap> mutableState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$context = context;
                this.$imageUri = str;
                this.$image$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$context, this.$imageUri, this.$image$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    DonateDepositCoinsItemKt.DonateDepositCoinsItem$lambda$2(this.$image$delegate, BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$imageUri, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$imageUri, this.$image$delegate, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
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

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(heightDp = 192)
    public static final void PreviewDonateDepositCoinsItem(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(799618519);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(799618519, i, -1, "com.blackhub.bronline.game.ui.donate.PreviewDonateDepositCoinsItem (DonateDepositCoinsItem.kt:202)");
            }
            DonateDepositCoinsItem("Обеспеченный", "60,00 P", "", 33, 120, false, "x2", new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemKt.PreviewDonateDepositCoinsItem.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 14380470);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsItemKt.PreviewDonateDepositCoinsItem.2
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
                    DonateDepositCoinsItemKt.PreviewDonateDepositCoinsItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap DonateDepositCoinsItem$lambda$1(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void DonateDepositCoinsItem$lambda$2(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }
}

