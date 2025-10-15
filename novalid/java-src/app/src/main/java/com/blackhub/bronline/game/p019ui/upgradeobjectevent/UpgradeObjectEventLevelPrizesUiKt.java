package com.blackhub.bronline.game.p019ui.upgradeobjectevent;

import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.TransformOriginKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.GiftPrizeModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventLevelPrizesUi.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aO\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0012\u001aO\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\n\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0007¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"BTN_BACK_PIVOT_FRACTION_X", "", "BTN_BACK_PIVOT_FRACTION_Y", "EventLevelPrizesContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "currentLevel", "", "energyLeftForNextLevel", "currencyTemplate", "levelPrizes", "", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/GiftPrizeModel;", "onCloseClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;IIILjava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewUpgradeObjectEventLevelPrizesUi", "(Landroidx/compose/runtime/Composer;I)V", "UpgradeObjectEventLevelPrizesUi", "currencyLeftForNextLevel", "(Landroidx/compose/ui/Modifier;IILjava/util/List;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUpgradeObjectEventLevelPrizesUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventLevelPrizesUi.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventLevelPrizesUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,202:1\n1116#2,6:203\n1116#2,6:244\n68#3,6:209\n74#3:243\n78#3:293\n79#4,11:215\n79#4,11:255\n92#4:287\n92#4:292\n456#5,8:226\n464#5,3:240\n456#5,8:266\n464#5,3:280\n467#5,3:284\n467#5,3:289\n3737#6,6:234\n3737#6,6:274\n75#7,5:250\n80#7:283\n84#7:288\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventLevelPrizesUi.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventLevelPrizesUiKt\n*L\n77#1:203,6\n92#1:244,6\n82#1:209,6\n82#1:243\n82#1:293\n82#1:215,11\n111#1:255,11\n111#1:287\n82#1:292\n82#1:226,8\n82#1:240,3\n111#1:266,8\n111#1:280,3\n111#1:284,3\n82#1:289,3\n82#1:234,6\n111#1:274,6\n111#1:250,5\n111#1:283\n111#1:288\n*E\n"})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventLevelPrizesUiKt {
    public static final float BTN_BACK_PIVOT_FRACTION_X = 0.0f;
    public static final float BTN_BACK_PIVOT_FRACTION_Y = 0.0f;

    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpgradeObjectEventLevelPrizesUi(@Nullable Modifier modifier, final int i, final int i2, @Nullable List<GiftPrizeModel> list, @StringRes final int i3, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i4, final int i5) {
        Modifier modifier2;
        int i6;
        int i7;
        Composer composer2;
        final Modifier modifier3;
        final List<GiftPrizeModel> list2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-214247169);
        int i8 = i5 & 1;
        if (i8 != 0) {
            i6 = i4 | 6;
            modifier2 = modifier;
        } else if ((i4 & 14) == 0) {
            modifier2 = modifier;
            i6 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i4;
        } else {
            modifier2 = modifier;
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        int i9 = i5 & 8;
        if (i9 != 0) {
            i6 |= 1024;
        }
        if ((i5 & 16) != 0) {
            i6 |= CpioConstants.C_ISBLK;
        } else if ((57344 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
        }
        if ((i5 & 32) == 0) {
            if ((458752 & i4) == 0) {
                i7 = composerStartRestartGroup.changedInstance(onCloseClick) ? 131072 : 65536;
            }
            if (i9 == 8 || (374491 & i6) != 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                List<GiftPrizeModel> listEmptyList = i9 == 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-214247169, i6, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUi (UpgradeObjectEventLevelPrizesUi.kt:49)");
                }
                final Modifier modifier5 = modifier4;
                final List<GiftPrizeModel> list3 = listEmptyList;
                composer2 = composerStartRestartGroup;
                FakeDialogKt.m15089FakeDialog3IgeMak(null, ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -143239285, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt.UpgradeObjectEventLevelPrizesUi.1
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
                    public final void invoke(@Nullable Composer composer3, int i10) {
                        if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-143239285, i10, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUi.<anonymous> (UpgradeObjectEventLevelPrizesUi.kt:53)");
                            }
                            UpgradeObjectEventLevelPrizesUiKt.EventLevelPrizesContent(modifier5, i, i2, i3, list3, onCloseClick, composer3, 32768, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, 384, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                list2 = listEmptyList;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                list2 = list;
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt.UpgradeObjectEventLevelPrizesUi.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i10) {
                        UpgradeObjectEventLevelPrizesUiKt.UpgradeObjectEventLevelPrizesUi(modifier3, i, i2, list2, i3, onCloseClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                    }
                });
                return;
            }
            return;
        }
        i7 = ProfileVerifier.CompilationStatus.f342xf2722a21;
        i6 |= i7;
        if (i9 == 8) {
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Modifier modifier52 = modifier4;
            final List<GiftPrizeModel> list32 = listEmptyList;
            composer2 = composerStartRestartGroup;
            FakeDialogKt.m15089FakeDialog3IgeMak(null, ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -143239285, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt.UpgradeObjectEventLevelPrizesUi.1
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
                public final void invoke(@Nullable Composer composer3, int i10) {
                    if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-143239285, i10, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUi.<anonymous> (UpgradeObjectEventLevelPrizesUi.kt:53)");
                        }
                        UpgradeObjectEventLevelPrizesUiKt.EventLevelPrizesContent(modifier52, i, i2, i3, list32, onCloseClick, composer3, 32768, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 384, 1);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            list2 = listEmptyList;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventLevelPrizesContent(@Nullable Modifier modifier, final int i, final int i2, @StringRes final int i3, @Nullable List<GiftPrizeModel> list, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i4, final int i5) {
        Modifier modifier2;
        int i6;
        int i7;
        LazyListState lazyListStateRememberLazyListState;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue2;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final List<GiftPrizeModel> list2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1537060141);
        int i8 = i5 & 1;
        if (i8 != 0) {
            i6 = i4 | 6;
            modifier2 = modifier;
        } else if ((i4 & 14) == 0) {
            modifier2 = modifier;
            i6 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i4;
        } else {
            modifier2 = modifier;
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i6 |= composerStartRestartGroup.changed(i3) ? 2048 : 1024;
        }
        int i9 = i5 & 16;
        if (i9 != 0) {
            i6 |= 8192;
        }
        if ((i5 & 32) == 0) {
            if ((i4 & 458752) == 0) {
                i7 = composerStartRestartGroup.changedInstance(onCloseClick) ? 131072 : 65536;
            }
            if (i9 == 16 || (374491 & i6) != 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                List<GiftPrizeModel> listEmptyList = i9 == 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1537060141, i6, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.EventLevelPrizesContent (UpgradeObjectEventLevelPrizesUi.kt:72)");
                }
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1757715317);
                zChanged = ((i6 & 112) != 32) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$1$1(i, lazyListStateRememberLazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 70);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierAlign = boxScopeInstance.align(companion3, companion.getTopStart());
                long jTransformOrigin = TransformOriginKt.TransformOrigin(0.0f, 0.0f);
                composerStartRestartGroup.startReplaceableGroup(2027867195);
                z = (i6 & 458752) != 131072;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$1$1
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
                            onCloseClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final List<GiftPrizeModel> list3 = listEmptyList;
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierAlign, null, false, null, false, false, false, false, null, 0, jTransformOrigin, null, (Function0) objRememberedValue2, ComposableSingletons$UpgradeObjectEventLevelPrizesUiKt.INSTANCE.m15033getLambda1$app_siteRelease(), composerStartRestartGroup, 0, 3072, 3070);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion.getStart(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.upgrade_object_event_prizes_title, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20sdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6), 5, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14801montserratBold42spOr32ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15), composerStartRestartGroup, 0, 0, 65020);
                LazyDslKt.LazyRow(companion3, lazyListStateRememberLazyListState, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                        invoke2(lazyListScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LazyListScope LazyRow) {
                        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                        final List<GiftPrizeModel> list4 = list3;
                        final int i10 = i;
                        final int i11 = i2;
                        final int i12 = i3;
                        final C6155x19b412ab c6155x19b412ab = new Function1() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$2$1$invoke$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final Void invoke(GiftPrizeModel giftPrizeModel) {
                                return null;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke((GiftPrizeModel) obj);
                            }
                        };
                        LazyRow.items(list4.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$2$1$invoke$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            @Nullable
                            public final Object invoke(int i13) {
                                return c6155x19b412ab.invoke(list4.get(i13));
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$2$1$invoke$$inlined$items$default$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i13, @Nullable Composer composer2, int i14) {
                                int i15;
                                if ((i14 & 14) == 0) {
                                    i15 = i14 | (composer2.changed(lazyItemScope) ? 4 : 2);
                                } else {
                                    i15 = i14;
                                }
                                if ((i14 & 112) == 0) {
                                    i15 |= composer2.changed(i13) ? 32 : 16;
                                }
                                if ((i15 & 731) == 146 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-632812321, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                }
                                GiftPrizeModel giftPrizeModel = (GiftPrizeModel) list4.get(i13);
                                UpgradeObjectEventLevelPrizesItemKt.UpgradeObjectEventLevelPrizesItem(null, giftPrizeModel.getLevel(), giftPrizeModel.getLevel() == i10 + 1, giftPrizeModel.getIfReceived(), giftPrizeModel.getCurrency(), i11, giftPrizeModel.getProgress(), i12, giftPrizeModel.getPrizeName(), composer2, 0, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                    }
                }, composerStartRestartGroup, 6, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER);
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
                modifier2 = modifier3;
                list2 = list3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                list2 = list;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt.EventLevelPrizesContent.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i10) {
                        UpgradeObjectEventLevelPrizesUiKt.EventLevelPrizesContent(modifier4, i, i2, i3, list2, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                    }
                });
                return;
            }
            return;
        }
        i7 = ProfileVerifier.CompilationStatus.f342xf2722a21;
        i6 |= i7;
        if (i9 == 16) {
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1757715317);
            zChanged = ((i6 & 112) != 32) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$1$1(i, lazyListStateRememberLazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 70);
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting()) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierAlign2 = boxScopeInstance2.align(companion32, companion4.getTopStart());
                    long jTransformOrigin2 = TransformOriginKt.TransformOrigin(0.0f, 0.0f);
                    composerStartRestartGroup.startReplaceableGroup(2027867195);
                    if ((i6 & 458752) != 131072) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$1$1
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
                                onCloseClick.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceableGroup();
                        final List<GiftPrizeModel> list32 = listEmptyList;
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierAlign2, null, false, null, false, false, false, false, null, 0, jTransformOrigin2, null, (Function0) objRememberedValue2, ComposableSingletons$UpgradeObjectEventLevelPrizesUiKt.INSTANCE.m15033getLambda1$app_siteRelease(), composerStartRestartGroup, 0, 3072, 3070);
                        Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, companion4.getStart(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default22);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl2.getInserting()) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.upgrade_object_event_prizes_title, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20sdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6), 5, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14801montserratBold42spOr32ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15), composerStartRestartGroup, 0, 0, 65020);
                            LazyDslKt.LazyRow(companion32, lazyListStateRememberLazyListState, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                    invoke2(lazyListScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull LazyListScope LazyRow) {
                                    Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                                    final List list4 = list32;
                                    final int i10 = i;
                                    final int i11 = i2;
                                    final int i12 = i3;
                                    final Function1 c6155x19b412ab = new Function1() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$2$1$invoke$$inlined$items$default$1
                                        @Override // kotlin.jvm.functions.Function1
                                        @Nullable
                                        public final Void invoke(GiftPrizeModel giftPrizeModel) {
                                            return null;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            return invoke((GiftPrizeModel) obj);
                                        }
                                    };
                                    LazyRow.items(list4.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$2$1$invoke$$inlined$items$default$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                            return invoke(num.intValue());
                                        }

                                        @Nullable
                                        public final Object invoke(int i13) {
                                            return c6155x19b412ab.invoke(list4.get(i13));
                                        }
                                    }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt$EventLevelPrizesContent$2$2$1$invoke$$inlined$items$default$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i13, @Nullable Composer composer2, int i14) {
                                            int i15;
                                            if ((i14 & 14) == 0) {
                                                i15 = i14 | (composer2.changed(lazyItemScope) ? 4 : 2);
                                            } else {
                                                i15 = i14;
                                            }
                                            if ((i14 & 112) == 0) {
                                                i15 |= composer2.changed(i13) ? 32 : 16;
                                            }
                                            if ((i15 & 731) == 146 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-632812321, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                            }
                                            GiftPrizeModel giftPrizeModel = (GiftPrizeModel) list4.get(i13);
                                            UpgradeObjectEventLevelPrizesItemKt.UpgradeObjectEventLevelPrizesItem(null, giftPrizeModel.getLevel(), giftPrizeModel.getLevel() == i10 + 1, giftPrizeModel.getIfReceived(), giftPrizeModel.getCurrency(), i11, giftPrizeModel.getProgress(), i12, giftPrizeModel.getPrizeName(), composer2, 0, 1);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                }
                            }, composerStartRestartGroup, 6, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier3;
                            list2 = list32;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 33, device = "spec:id=reference_phone,shape=Normal,width=844,height=390,unit=dp,dpi=420")
    public static final void PreviewUpgradeObjectEventLevelPrizesUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1865502009);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1865502009, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.PreviewUpgradeObjectEventLevelPrizesUi (UpgradeObjectEventLevelPrizesUi.kt:156)");
            }
            EventLevelPrizesContent(BackgroundKt.m7771backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m11370getGray0d7_KjU(), null, 2, null), 2, 100, R.string.host_machine_prize_value_of_chips, CollectionsKt__CollectionsKt.listOf((Object[]) new GiftPrizeModel[]{new GiftPrizeModel(1, true, 0, 1.0f, "pam param pam pam"), new GiftPrizeModel(2, true, 0, 1.0f, "pam param pam pam"), new GiftPrizeModel(3, false, 1000, 0.2f, "pam param pam pam pam param pam pam pam param pam pam pam param pam pam"), new GiftPrizeModel(4, false, 20000, 0.0f, "pam"), new GiftPrizeModel(5, false, 30000, 0.0f, "pam param pam pam pam param pam pam")}), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt.PreviewUpgradeObjectEventLevelPrizesUi.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 200118, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesUiKt.PreviewUpgradeObjectEventLevelPrizesUi.2
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
                    UpgradeObjectEventLevelPrizesUiKt.PreviewUpgradeObjectEventLevelPrizesUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
