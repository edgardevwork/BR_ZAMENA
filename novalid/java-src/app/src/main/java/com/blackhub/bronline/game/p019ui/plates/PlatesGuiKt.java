package com.blackhub.bronline.game.p019ui.plates;

import android.annotation.SuppressLint;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
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
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.plates.PlatesCountryItem;
import com.blackhub.bronline.game.gui.plates.PlatesUiState;
import com.blackhub.bronline.game.gui.plates.PlatesViewModel;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatesGui.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u009f\u0001\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m7105d2 = {"WEIGHT_HORIZONTAL_CONTENT_IN_LEFT_BLOCK", "", "WEIGHT_HORIZONTAL_FIRST_HINT", "WEIGHT_HORIZONTAL_LEFT_BLOCK", "WEIGHT_VERTICAL_TITLE", "PlatesGui", "", "(Landroidx/compose/runtime/Composer;I)V", "PlatesGuiContent", "buttonList", "", "Lcom/blackhub/bronline/game/gui/plates/PlatesCountryItem;", "countryId", "", "hintText", "", "currencyType", "priceOfPurchase", "priceOfRefresh", "isNeedShowRefresh", "", "plateNumber", "Landroidx/compose/runtime/MutableState;", "plateRegion", "sendServerNewPlateNumber", "Lkotlin/Function0;", "onClickButtonExit", "onClickButtonPurchase", "onClickButtonRefresh", "(Ljava/util/List;ILjava/lang/String;IIIZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewPlatesGui", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPlatesGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesGui.kt\ncom/blackhub/bronline/game/ui/plates/PlatesGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,533:1\n81#2,11:534\n1116#3,6:545\n1116#3,6:618\n1116#3,6:927\n1116#3,6:933\n154#4:551\n87#5,6:552\n93#5:586\n91#5,2:664\n93#5:694\n97#5:699\n88#5,5:700\n93#5:733\n97#5:818\n86#5,7:891\n93#5:926\n97#5:943\n97#5:958\n79#6,11:558\n79#6,11:589\n92#6:627\n79#6,11:635\n79#6,11:666\n92#6:698\n79#6,11:705\n79#6,11:740\n92#6:772\n79#6,11:780\n92#6:812\n92#6:817\n79#6,11:821\n79#6,11:857\n92#6:889\n79#6,11:898\n92#6:942\n92#6:947\n92#6:952\n92#6:957\n456#7,8:569\n464#7,3:583\n456#7,8:600\n464#7,3:614\n467#7,3:624\n456#7,8:646\n464#7,3:660\n456#7,8:677\n464#7,3:691\n467#7,3:695\n456#7,8:716\n464#7,3:730\n456#7,8:751\n464#7,3:765\n467#7,3:769\n456#7,8:791\n464#7,3:805\n467#7,3:809\n467#7,3:814\n456#7,8:832\n464#7,3:846\n456#7,8:868\n464#7,3:882\n467#7,3:886\n456#7,8:909\n464#7,3:923\n467#7,3:939\n467#7,3:944\n467#7,3:949\n467#7,3:954\n3737#8,6:577\n3737#8,6:608\n3737#8,6:654\n3737#8,6:685\n3737#8,6:724\n3737#8,6:759\n3737#8,6:799\n3737#8,6:840\n3737#8,6:876\n3737#8,6:917\n78#9,2:587\n80#9:617\n84#9:628\n74#9,6:629\n80#9:663\n78#9,2:819\n80#9:849\n73#9,7:850\n80#9:885\n84#9:890\n84#9:948\n84#9:953\n68#10,6:734\n74#10:768\n78#10:773\n68#10,6:774\n74#10:808\n78#10:813\n*S KotlinDebug\n*F\n+ 1 PlatesGui.kt\ncom/blackhub/bronline/game/ui/plates/PlatesGuiKt\n*L\n69#1:534,11\n82#1:545,6\n279#1:618,6\n430#1:927,6\n452#1:933,6\n215#1:551\n228#1:552,6\n228#1:586\n321#1:664,2\n321#1:694\n321#1:699\n354#1:700,5\n354#1:733\n354#1:818\n418#1:891,7\n418#1:926\n418#1:943\n228#1:958\n228#1:558,11\n231#1:589,11\n231#1:627\n301#1:635,11\n321#1:666,11\n321#1:698\n354#1:705,11\n362#1:740,11\n362#1:772\n377#1:780,11\n377#1:812\n354#1:817\n393#1:821,11\n398#1:857,11\n398#1:889\n418#1:898,11\n418#1:942\n393#1:947\n301#1:952\n228#1:957\n228#1:569,8\n228#1:583,3\n231#1:600,8\n231#1:614,3\n231#1:624,3\n301#1:646,8\n301#1:660,3\n321#1:677,8\n321#1:691,3\n321#1:695,3\n354#1:716,8\n354#1:730,3\n362#1:751,8\n362#1:765,3\n362#1:769,3\n377#1:791,8\n377#1:805,3\n377#1:809,3\n354#1:814,3\n393#1:832,8\n393#1:846,3\n398#1:868,8\n398#1:882,3\n398#1:886,3\n418#1:909,8\n418#1:923,3\n418#1:939,3\n393#1:944,3\n301#1:949,3\n228#1:954,3\n228#1:577,6\n231#1:608,6\n301#1:654,6\n321#1:685,6\n354#1:724,6\n362#1:759,6\n377#1:799,6\n393#1:840,6\n398#1:876,6\n418#1:917,6\n231#1:587,2\n231#1:617\n231#1:628\n301#1:629,6\n301#1:663\n393#1:819,2\n393#1:849\n398#1:850,7\n398#1:885\n398#1:890\n393#1:948\n301#1:953\n362#1:734,6\n362#1:768\n362#1:773\n377#1:774,6\n377#1:808\n377#1:813\n*E\n"})
/* loaded from: classes2.dex */
public final class PlatesGuiKt {
    public static final float WEIGHT_HORIZONTAL_CONTENT_IN_LEFT_BLOCK = 0.7f;
    public static final float WEIGHT_HORIZONTAL_FIRST_HINT = 0.4f;
    public static final float WEIGHT_HORIZONTAL_LEFT_BLOCK = 0.25f;
    public static final float WEIGHT_VERTICAL_TITLE = 0.09f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PlatesGui(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1090702479);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1090702479, i, -1, "com.blackhub.bronline.game.ui.plates.PlatesGui (PlatesGui.kt:67)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(PlatesViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final PlatesViewModel platesViewModel = (PlatesViewModel) viewModel;
            final PlatesUiState platesUiState = (PlatesUiState) FlowExtKt.collectAsStateWithLifecycle(platesViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            final MutableState mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGui$firstNumberField$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
                }
            }, composerStartRestartGroup, 3080, 6);
            final MutableState mutableState2 = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGui$secondNumberField$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
                }
            }, composerStartRestartGroup, 3080, 6);
            MutableIntState mutableIntState = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGui$oldCountry$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableIntState invoke() {
                    return SnapshotIntStateKt.mutableIntStateOf(-1);
                }
            }, composerStartRestartGroup, 3080, 6);
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6);
            String strStringResource = StringResources_androidKt.stringResource(R.string.plates_rus, composerStartRestartGroup, 6);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.plates_ua, composerStartRestartGroup, 6);
            String strStringResource3 = StringResources_androidKt.stringResource(R.string.plates_by, composerStartRestartGroup, 6);
            String strStringResource4 = StringResources_androidKt.stringResource(R.string.plates_kz, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(1799785057);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = CollectionsKt__CollectionsKt.listOf((Object[]) new PlatesCountryItem[]{new PlatesCountryItem(0, strStringResource, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fDimensionResource, fDimensionResource, 0.0f, fDimensionResource, 4, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGui$listOfButtons$1$1
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
                        platesViewModel.changeCountry(0);
                    }
                }, 8, null), new PlatesCountryItem(1, strStringResource2, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fDimensionResource, fDimensionResource, fDimensionResource, 0.0f, 8, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGui$listOfButtons$1$2
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
                        platesViewModel.changeCountry(1);
                    }
                }, 8, null), new PlatesCountryItem(2, strStringResource3, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fDimensionResource, 0.0f, fDimensionResource, fDimensionResource, 2, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGui$listOfButtons$1$3
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
                        platesViewModel.changeCountry(2);
                    }
                }, 8, null), new PlatesCountryItem(3, strStringResource4, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, fDimensionResource, fDimensionResource, fDimensionResource, 1, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGui$listOfButtons$1$4
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
                        platesViewModel.changeCountry(3);
                    }
                }, 8, null)});
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final List list = (List) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(platesUiState.getPlateNumber(), new C60021(platesUiState, mutableState, mutableState2, platesViewModel, null), composerStartRestartGroup, 64);
            if (mutableIntState.getIntValue() != platesUiState.getCountryId()) {
                if (mutableIntState.getIntValue() != -1 && platesUiState.getCountryId() != 0) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    mutableState.setValue(AnyExtensionKt.empty(stringCompanionObject));
                    mutableState2.setValue(AnyExtensionKt.empty(stringCompanionObject));
                }
                mutableIntState.setIntValue(platesUiState.getCountryId());
            }
            SurfaceKt.m9876SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -897053386, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PlatesGui.2
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
                            ComposerKt.traceEventStart(-897053386, i2, -1, "com.blackhub.bronline.game.ui.plates.PlatesGui.<anonymous> (PlatesGui.kt:147)");
                        }
                        List<PlatesCountryItem> list2 = list;
                        int countryId = platesUiState.getCountryId();
                        String hintMainText = platesUiState.getHintMainText();
                        int currencyType = platesUiState.getCurrencyType();
                        int priceOfPurchasePlate = platesUiState.getPriceOfPurchasePlate();
                        int priceOfRefreshPlate = platesUiState.getPriceOfRefreshPlate();
                        boolean zIsNeedShowRefresh = platesUiState.isNeedShowRefresh();
                        final MutableState<String> mutableState3 = mutableState;
                        final MutableState<String> mutableState4 = mutableState2;
                        final PlatesViewModel platesViewModel2 = platesViewModel;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PlatesGui.2.1
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
                                platesViewModel2.changedText(mutableState3.getValue(), mutableState4.getValue());
                            }
                        };
                        final PlatesViewModel platesViewModel3 = platesViewModel;
                        Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PlatesGui.2.2
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
                                platesViewModel3.onClickButtonExit();
                            }
                        };
                        final PlatesViewModel platesViewModel4 = platesViewModel;
                        final MutableState<String> mutableState5 = mutableState;
                        final MutableState<String> mutableState6 = mutableState2;
                        Function0<Unit> function03 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PlatesGui.2.3
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
                                platesViewModel4.purchasePlate(mutableState5.getValue(), mutableState6.getValue());
                            }
                        };
                        final PlatesViewModel platesViewModel5 = platesViewModel;
                        PlatesGuiKt.PlatesGuiContent(list2, countryId, hintMainText, currencyType, priceOfPurchasePlate, priceOfRefreshPlate, zIsNeedShowRefresh, mutableState3, mutableState4, function0, function02, function03, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PlatesGui.2.4
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
                                platesViewModel5.onClickButtonRefresh();
                            }
                        }, composer2, 8, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PlatesGui.3
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
                    PlatesGuiKt.PlatesGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: PlatesGui.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGui$1", m7120f = "PlatesGui.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGui$1 */
    /* loaded from: classes8.dex */
    public static final class C60021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<String> $firstNumberField;
        public final /* synthetic */ MutableState<String> $secondNumberField;
        public final /* synthetic */ PlatesUiState $state;
        public final /* synthetic */ PlatesViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60021(PlatesUiState platesUiState, MutableState<String> mutableState, MutableState<String> mutableState2, PlatesViewModel platesViewModel, Continuation<? super C60021> continuation) {
            super(2, continuation);
            this.$state = platesUiState;
            this.$firstNumberField = mutableState;
            this.$secondNumberField = mutableState2;
            this.$viewModel = platesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C60021(this.$state, this.$firstNumberField, this.$secondNumberField, this.$viewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C60021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$state.isNewPlateInfoFromServer()) {
                this.$firstNumberField.setValue(this.$state.getPlateNumber());
                this.$secondNumberField.setValue(this.$state.getPlateRegion());
                this.$viewModel.changedText(this.$state.getPlateNumber(), this.$state.getPlateRegion());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0c92 A[PHI: r11
  0x0c92: PHI (r11v19 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r11v17 kotlin.jvm.functions.Function0<kotlin.Unit>), (r11v20 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:155:0x0c90, B:151:0x0c86] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0db5  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlatesGuiContent(final List<PlatesCountryItem> list, final int i, final String str, final int i2, final int i3, final int i4, final boolean z, final MutableState<String> mutableState, final MutableState<String> mutableState2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Composer composer, final int i5, final int i6) {
        final Function0<Unit> function05;
        boolean z2;
        Object objRememberedValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(971805867);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(971805867, i5, i6, "com.blackhub.bronline.game.ui.plates.PlatesGuiContent (PlatesGui.kt:186)");
        }
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_green, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11289horizontalGradient8A3gB4$default3 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red_25, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red_25, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6));
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6));
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6));
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._43wdp, composerStartRestartGroup, 6);
        float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._129wdp, composerStartRestartGroup, 6);
        float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_nomera, composerStartRestartGroup, 6), (String) null, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(companion2, 0.25f), 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6), null, 2, null);
        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
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
        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(BackgroundKt.background$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.09f), brushM11289horizontalGradient8A3gB4$default, null, 0.0f, 6, null), null, false, 3, null);
        String strStringResource = StringResources_androidKt.stringResource(R.string.common_info, composerStartRestartGroup, 6);
        Locale locale = Locale.ROOT;
        String upperCase = strStringResource.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextAlign.Companion companion5 = TextAlign.INSTANCE;
        TextKt.m10024Text4IGK_g(upperCase, modifierWrapContentHeight$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26), composerStartRestartGroup, 0, 0, 65020);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 1, null), 0.0f, 1, null);
        String upperCase2 = StringResources_androidKt.stringResource(R.string.plates_change_country, composerStartRestartGroup, 6).toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        TextKt.m10024Text4IGK_g(upperCase2, modifierFillMaxWidth$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26), composerStartRestartGroup, 0, 0, 65532);
        PlatesButtonBlockKt.PlatesButtonBlock(null, list, composerStartRestartGroup, 64, 1);
        BoxKt.Box(BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 0.7f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composerStartRestartGroup, 6), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)), brushM11289horizontalGradient8A3gB4$default3, null, 0.0f, 6, null), composerStartRestartGroup, 0);
        Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composerStartRestartGroup, 6), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._43wdp, composerStartRestartGroup, 6)), 0.7f);
        float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composerStartRestartGroup, 6);
        Brush brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6))}), 0L, 0.0f, 0, 14, (Object) null);
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U2 = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6));
        String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_get_out, composerStartRestartGroup, 6);
        TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26);
        Integer numValueOf = Integer.valueOf(R.drawable.ic_exit_main);
        C2046Dp c2046DpM13664boximpl = C2046Dp.m13664boximpl(fDimensionResource4);
        composerStartRestartGroup.startReplaceableGroup(2121410834);
        boolean z3 = (((i6 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(function02)) || (i6 & 6) == 4;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGuiContent$1$1$1$1
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
                    function02.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(null, modifierFillMaxWidth, strStringResource2, textStyleM14873mullerBoldCustomSpbl3sdaw, 0.0f, 0, numValueOf, c2046DpM13664boximpl, null, 0.0f, 0L, 0.0f, brushM11293radialGradientP_VxKs$default, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStrokeM7798BorderStrokecXLIe8U2, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue2, composerStartRestartGroup, 1572864, 0, 0, 16748337);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.09f), ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6), null, 2, null), null, false, 3, null);
        String upperCase3 = StringResources_androidKt.stringResource(R.string.plates_title, composerStartRestartGroup, 6).toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
        TextKt.m10024Text4IGK_g(upperCase3, modifierWrapContentHeight$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26), composerStartRestartGroup, 0, 0, 65020);
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6), 1, null), 0.0f, 1, null);
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
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
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_warning_message_old, composerStartRestartGroup, 6), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        TextKt.m10024Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14876mullerRegularCustomSpbl3sdaw(R.dimen._11wsp, 0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26), composerStartRestartGroup, (i5 >> 6) & 14, 0, 65534);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        int i7 = (i5 >> 3) & 14;
        int i8 = i5 >> 18;
        PlatesTypeOfPlateKt.PlatesTypeOfPlate(i, mutableState, mutableState2, i2 == 1, function0, composerStartRestartGroup, (i8 & 896) | i7 | (i8 & 112) | ((i5 >> 15) & 57344));
        composerStartRestartGroup.startReplaceableGroup(-77785421);
        if (i != -1) {
            Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._80wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composerStartRestartGroup, 6));
            Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center2, companion3.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(BorderKt.border(SizeKt.fillMaxWidth(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6), 0.0f, 11, null), 0.4f), borderStrokeM7798BorderStrokecXLIe8U, roundedCornerShapeM8392RoundedCornerShape0680j_4), PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
            int i9 = i7 | 48;
            TextKt.m10025TextIbK3jfQ(stringResourceCompose.platesGetCurrentFormat(i, composerStartRestartGroup, i9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14876mullerRegularCustomSpbl3sdaw(R.dimen._9wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 0, 0, 131070);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM8123padding3ABfNKs2 = PaddingKt.m8123padding3ABfNKs(BorderKt.border(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), borderStrokeM7798BorderStrokecXLIe8U, roundedCornerShapeM8392RoundedCornerShape0680j_4), PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor7);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m10025TextIbK3jfQ(stringResourceCompose.platesGetActualSymbols(i, composerStartRestartGroup, i9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14876mullerRegularCustomSpbl3sdaw(R.dimen._9wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 0, 0, 131070);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Arrangement.Vertical bottom = arrangement.getBottom();
            Alignment.Horizontal centerHorizontally3 = companion3.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(bottom, centerHorizontally3, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor8 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor8);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
            }
            function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor9 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor9);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyColumnMeasurePolicy4, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
            }
            function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            int i10 = i5 >> 9;
            int i11 = (i10 & 14) | 384;
            TextKt.m10024Text4IGK_g(stringResourceCompose.platesPriceOfPurchase(i2, i3, composerStartRestartGroup, (i10 & 112) | i11), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14876mullerRegularCustomSpbl3sdaw(R.dimen._11wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 0, 0, 65534);
            composerStartRestartGroup.startReplaceableGroup(-500502027);
            if (z) {
                TextKt.m10024Text4IGK_g(stringResourceCompose.platesPriceOfRefresh(i2, i4, composerStartRestartGroup, ((i5 >> 12) & 112) | i11), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14876mullerRegularCustomSpbl3sdaw(R.dimen._11wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 0, 0, 65534);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor10 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor10);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl10 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl10, measurePolicyRowMeasurePolicy4, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl10, currentCompositionLocalMap10, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                composerM10870constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                composerM10870constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
            }
            function3ModifierMaterializerOf10.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, fDimensionResource3, fDimensionResource3, fDimensionResource3, 1, null), fDimensionResource2, fDimensionResource);
            BorderStroke borderStrokeM7798BorderStrokecXLIe8U3 = BorderStrokeKt.m7798BorderStrokecXLIe8U(fM13666constructorimpl, ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6));
            String strStringResource3 = StringResources_androidKt.stringResource(R.string.common_pay, composerStartRestartGroup, 6);
            TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw2 = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26);
            composerStartRestartGroup.startReplaceableGroup(1364820189);
            if (((i6 & 112) ^ 48) > 32) {
                function05 = function03;
                if (composerStartRestartGroup.changed(function05)) {
                    z2 = true;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGuiContent$1$2$3$2$1$1
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
                                function05.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(null, modifierM8174sizeVpY3zN4, strStringResource3, textStyleM14873mullerBoldCustomSpbl3sdaw2, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStrokeM7798BorderStrokecXLIe8U3, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 0, 0, 16748529);
                    composerStartRestartGroup.startReplaceableGroup(-500500254);
                    if (!z) {
                        Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, fDimensionResource3, 1, null), fDimensionResource2, fDimensionResource);
                        float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6);
                        BorderStroke borderStrokeM7798BorderStrokecXLIe8U4 = BorderStrokeKt.m7798BorderStrokecXLIe8U(fM13666constructorimpl, ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6));
                        String strStringResource4 = StringResources_androidKt.stringResource(R.string.common_repeat, composerStartRestartGroup, 6);
                        TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw3 = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26);
                        Integer numValueOf2 = Integer.valueOf(R.drawable.ic_repeat);
                        C2046Dp c2046DpM13664boximpl2 = C2046Dp.m13664boximpl(fDimensionResource5);
                        composerStartRestartGroup.startReplaceableGroup(1364821346);
                        boolean z4 = (((i6 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(function04)) || (i6 & 384) == 256;
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGuiContent$1$2$3$2$2$1
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
                                    function04.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(null, modifierM8174sizeVpY3zN42, strStringResource4, textStyleM14873mullerBoldCustomSpbl3sdaw3, 0.0f, 0, numValueOf2, c2046DpM13664boximpl2, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default2, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStrokeM7798BorderStrokecXLIe8U4, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue3, composerStartRestartGroup, 1572864, 0, 0, 16748337);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                function05 = function03;
            }
            if ((i6 & 48) != 32) {
                z2 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt$PlatesGuiContent$1$2$3$2$1$1
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
                        function05.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceableGroup();
                MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(null, modifierM8174sizeVpY3zN4, strStringResource3, textStyleM14873mullerBoldCustomSpbl3sdaw2, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStrokeM7798BorderStrokecXLIe8U3, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 0, 0, 16748529);
                composerStartRestartGroup.startReplaceableGroup(-500500254);
                if (!z) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PlatesGuiContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    PlatesGuiKt.PlatesGuiContent(list, i, str, i2, i3, i4, z, mutableState, mutableState2, function0, function02, function03, function04, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @FigmaLargePreview
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    public static final void PreviewPlatesGui(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(246193981);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(246193981, i, -1, "com.blackhub.bronline.game.ui.plates.PreviewPlatesGui (PlatesGui.kt:477)");
            }
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            PlatesGuiContent(CollectionsKt__CollectionsKt.listOf((Object[]) new PlatesCountryItem[]{new PlatesCountryItem(0, "RUS", RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fDimensionResource, fDimensionResource, 0.0f, fDimensionResource, 4, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PreviewPlatesGui.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 9, null), new PlatesCountryItem(0, "UA", RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fDimensionResource, fDimensionResource, fDimensionResource, 0.0f, 8, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PreviewPlatesGui.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 9, null), new PlatesCountryItem(0, "BY", RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fDimensionResource, 0.0f, fDimensionResource, fDimensionResource, 2, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PreviewPlatesGui.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 9, null), new PlatesCountryItem(0, "KZ", RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, fDimensionResource, fDimensionResource, fDimensionResource, 1, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PreviewPlatesGui.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 9, null)}), 3, "Выбраный номер будет добавлен в ваш инвентарь", 0, 1233, 2312, true, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("000mmm", null, 2, null), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("77", null, 2, null), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PreviewPlatesGui.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PreviewPlatesGui.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PreviewPlatesGui.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PreviewPlatesGui.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 807103920, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesGuiKt.PreviewPlatesGui.9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    PlatesGuiKt.PreviewPlatesGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
