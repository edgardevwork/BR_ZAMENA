package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.UiComposable;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeLayoutKt;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabRow.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a©\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000123\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u009f\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r23\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, m7105d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,521:1\n154#2:522\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n*L\n512#1:522\n*E\n"})
/* loaded from: classes2.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = C2046Dp.m13666constructorimpl(90);

    @NotNull
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0111  */
    @Composable
    @UiComposable
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9055TabRowpAZo6Ak(final int i, @Nullable Modifier modifier, long j, long j2, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long primarySurface;
        long jM8864contentColorForek8zF_U;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function2M8883getLambda1$material_release;
        Modifier modifier2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-249175289);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i8 = composerStartRestartGroup.changed(primarySurface) ? 256 : 128;
                    i4 |= i8;
                } else {
                    primarySurface = j;
                }
                i4 |= i8;
            } else {
                primarySurface = j;
            }
            if ((i2 & 7168) != 0) {
                jM8864contentColorForek8zF_U = j2;
                i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(jM8864contentColorForek8zF_U)) ? 2048 : 1024;
            } else {
                jM8864contentColorForek8zF_U = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((57344 & i2) == 0) {
                    function32 = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                    if ((458752 & i2) == 0) {
                        function2M8883getLambda1$material_release = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function2M8883getLambda1$material_release) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    if ((i4 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda = i5 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                    invoke((List<TabPosition>) list, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i9) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-553782708, i9, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:139)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m9050Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }) : function32;
                            if (i6 != 0) {
                                function2M8883getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m8883getLambda1$material_release();
                            }
                            function33 = function3ComposableLambda;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            modifier2 = modifier;
                            function33 = function32;
                        }
                        long j3 = jM8864contentColorForek8zF_U;
                        int i9 = i4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-249175289, i9, -1, "androidx.compose.material.TabRow (TabRow.kt:148)");
                        }
                        Function2<? super Composer, ? super Integer, Unit> function23 = function2M8883getLambda1$material_release;
                        SurfaceKt.m9025SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j3, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i10) {
                                if ((i10 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1961746365, i10, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:154)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                composer2.startReplaceableGroup(1810840581);
                                boolean zChangedInstance = composer2.changedInstance(function22) | composer2.changedInstance(function2M8883getLambda1$material_release) | composer2.changedInstance(function33);
                                final Function2<Composer, Integer, Unit> function24 = function22;
                                final Function2<Composer, Integer, Unit> function25 = function2M8883getLambda1$material_release;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                            return m9057invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        @NotNull
                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final MeasureResult m9057invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j4) {
                                            Object obj;
                                            final int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j4);
                                            List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function24);
                                            int size = listSubcompose.size();
                                            final int i11 = iM13622getMaxWidthimpl / size;
                                            final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                            int size2 = listSubcompose.size();
                                            int i12 = 0;
                                            int i13 = 0;
                                            while (i13 < size2) {
                                                arrayList.add(listSubcompose.get(i13).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, i11, i11, 0, 0, 12, null)));
                                                i13++;
                                                i12 = i12;
                                                listSubcompose = listSubcompose;
                                            }
                                            int i14 = i12;
                                            if (arrayList.isEmpty()) {
                                                obj = null;
                                            } else {
                                                obj = arrayList.get(i14);
                                                int height = ((Placeable) obj).getHeight();
                                                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                                int i15 = 1;
                                                if (1 <= lastIndex) {
                                                    while (true) {
                                                        Object obj2 = arrayList.get(i15);
                                                        int height2 = ((Placeable) obj2).getHeight();
                                                        if (height < height2) {
                                                            obj = obj2;
                                                            height = height2;
                                                        }
                                                        if (i15 == lastIndex) {
                                                            break;
                                                        }
                                                        i15++;
                                                    }
                                                }
                                            }
                                            Placeable placeable = (Placeable) obj;
                                            int height3 = placeable != null ? placeable.getHeight() : i14;
                                            final ArrayList arrayList2 = new ArrayList(size);
                                            while (i14 < size) {
                                                arrayList2.add(new TabPosition(C2046Dp.m13666constructorimpl(subcomposeMeasureScope.mo7871toDpu2uoSUM(i11) * i14), subcomposeMeasureScope.mo7871toDpu2uoSUM(i11), null));
                                                i14++;
                                            }
                                            final Function2<Composer, Integer, Unit> function26 = function25;
                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                            final int i16 = height3;
                                            return MeasureScope.layout$default(subcomposeMeasureScope, iM13622getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                    List<Placeable> list = arrayList;
                                                    int i17 = i11;
                                                    int size3 = list.size();
                                                    for (int i18 = 0; i18 < size3; i18++) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i18), i18 * i17, 0, 0.0f, 4, null);
                                                    }
                                                    List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function26);
                                                    long j5 = j4;
                                                    int i19 = i16;
                                                    int size4 = listSubcompose2.size();
                                                    for (int i20 = 0; i20 < size4; i20++) {
                                                        Placeable placeableMo12610measureBRTryo0 = listSubcompose2.get(i20).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, i19 - placeableMo12610measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                                    final List<TabPosition> list2 = arrayList2;
                                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-641946361, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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

                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer3, int i21) {
                                                            if ((i21 & 11) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-641946361, i21, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:180)");
                                                            }
                                                            function36.invoke(list2, composer3, 8);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }));
                                                    int i21 = iM13622getMaxWidthimpl;
                                                    int i22 = i16;
                                                    int size5 = listSubcompose3.size();
                                                    for (int i23 = 0; i23 < size5; i23++) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(i21, i22)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 896) | 1572864 | (i9 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM8864contentColorForek8zF_U = j3;
                        function2M8883getLambda1$material_release = function23;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function33 = function32;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        final long j4 = primarySurface;
                        final long j5 = jM8864contentColorForek8zF_U;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function33;
                        final Function2<? super Composer, ? super Integer, Unit> function24 = function2M8883getLambda1$material_release;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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

                            public final void invoke(@Nullable Composer composer2, int i10) {
                                TabRowKt.m9055TabRowpAZo6Ak(i, modifier4, j4, j5, function34, function24, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                function2M8883getLambda1$material_release = function2;
                if ((i3 & 64) == 0) {
                }
                if ((i4 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        function33 = function3ComposableLambda;
                        long j32 = jM8864contentColorForek8zF_U;
                        int i92 = i4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function232 = function2M8883getLambda1$material_release;
                        SurfaceKt.m9025SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j32, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i10) {
                                if ((i10 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1961746365, i10, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:154)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                composer2.startReplaceableGroup(1810840581);
                                boolean zChangedInstance = composer2.changedInstance(function22) | composer2.changedInstance(function2M8883getLambda1$material_release) | composer2.changedInstance(function33);
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function22;
                                final Function2<? super Composer, ? super Integer, Unit> function25 = function2M8883getLambda1$material_release;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function342 = function33;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                            return m9057invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        @NotNull
                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final MeasureResult m9057invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j42) {
                                            Object obj;
                                            final int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j42);
                                            List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function242);
                                            int size = listSubcompose.size();
                                            final int i11 = iM13622getMaxWidthimpl / size;
                                            final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                            int size2 = listSubcompose.size();
                                            int i12 = 0;
                                            int i13 = 0;
                                            while (i13 < size2) {
                                                arrayList.add(listSubcompose.get(i13).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j42, i11, i11, 0, 0, 12, null)));
                                                i13++;
                                                i12 = i12;
                                                listSubcompose = listSubcompose;
                                            }
                                            int i14 = i12;
                                            if (arrayList.isEmpty()) {
                                                obj = null;
                                            } else {
                                                obj = arrayList.get(i14);
                                                int height = ((Placeable) obj).getHeight();
                                                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                                int i15 = 1;
                                                if (1 <= lastIndex) {
                                                    while (true) {
                                                        Object obj2 = arrayList.get(i15);
                                                        int height2 = ((Placeable) obj2).getHeight();
                                                        if (height < height2) {
                                                            obj = obj2;
                                                            height = height2;
                                                        }
                                                        if (i15 == lastIndex) {
                                                            break;
                                                        }
                                                        i15++;
                                                    }
                                                }
                                            }
                                            Placeable placeable = (Placeable) obj;
                                            int height3 = placeable != null ? placeable.getHeight() : i14;
                                            final List<TabPosition> arrayList2 = new ArrayList(size);
                                            while (i14 < size) {
                                                arrayList2.add(new TabPosition(C2046Dp.m13666constructorimpl(subcomposeMeasureScope.mo7871toDpu2uoSUM(i11) * i14), subcomposeMeasureScope.mo7871toDpu2uoSUM(i11), null));
                                                i14++;
                                            }
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function342;
                                            final int i16 = height3;
                                            return MeasureScope.layout$default(subcomposeMeasureScope, iM13622getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                    List<Placeable> list = arrayList;
                                                    int i17 = i11;
                                                    int size3 = list.size();
                                                    for (int i18 = 0; i18 < size3; i18++) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i18), i18 * i17, 0, 0.0f, 4, null);
                                                    }
                                                    List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function26);
                                                    long j52 = j42;
                                                    int i19 = i16;
                                                    int size4 = listSubcompose2.size();
                                                    for (int i20 = 0; i20 < size4; i20++) {
                                                        Placeable placeableMo12610measureBRTryo0 = listSubcompose2.get(i20).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j52, 0, 0, 0, 0, 11, null));
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, i19 - placeableMo12610measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                    final List<TabPosition> list2 = arrayList2;
                                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-641946361, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
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

                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer3, int i21) {
                                                            if ((i21 & 11) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-641946361, i21, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:180)");
                                                            }
                                                            function36.invoke(list2, composer3, 8);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }));
                                                    int i21 = iM13622getMaxWidthimpl;
                                                    int i22 = i16;
                                                    int size5 = listSubcompose3.size();
                                                    for (int i23 = 0; i23 < size5; i23++) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(i21, i22)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i92 & 896) | 1572864 | (i92 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        jM8864contentColorForek8zF_U = j32;
                        function2M8883getLambda1$material_release = function232;
                        modifier3 = modifier2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            function2M8883getLambda1$material_release = function2;
            if ((i3 & 64) == 0) {
            }
            if ((i4 & 2995931) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        function2M8883getLambda1$material_release = function2;
        if ((i3 & 64) == 0) {
        }
        if ((i4 & 2995931) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    @Composable
    @UiComposable
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9054ScrollableTabRowsKfQg0A(final int i, @Nullable Modifier modifier, long j, long j2, float f, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long primarySurface;
        long jM8864contentColorForek8zF_U;
        int i5;
        float f2;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        Modifier modifier2;
        float fM9053getScrollableTabRowPaddingD9Ej5fM;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function2M8884getLambda2$material_release;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1473476840);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i10 = composerStartRestartGroup.changed(primarySurface) ? 256 : 128;
                    i4 |= i10;
                } else {
                    primarySurface = j;
                }
                i4 |= i10;
            } else {
                primarySurface = j;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    jM8864contentColorForek8zF_U = j2;
                    int i11 = composerStartRestartGroup.changed(jM8864contentColorForek8zF_U) ? 2048 : 1024;
                    i4 |= i11;
                } else {
                    jM8864contentColorForek8zF_U = j2;
                }
                i4 |= i11;
            } else {
                jM8864contentColorForek8zF_U = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((57344 & i2) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((458752 & i2) == 0) {
                        function32 = function3;
                        i4 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        if ((29360128 & i2) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        if ((i4 & 23967451) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i9 == 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                                    i4 &= -7169;
                                }
                                fM9053getScrollableTabRowPaddingD9Ej5fM = i5 == 0 ? TabRowDefaults.INSTANCE.m9053getScrollableTabRowPaddingD9Ej5fM() : f2;
                                function3ComposableLambda = i6 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                        invoke((List<TabPosition>) list, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i12) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-655609869, i12, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:234)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                        tabRowDefaults.m9050Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }) : function32;
                                if (i7 == 0) {
                                    i8 = i4;
                                    function2M8884getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m8884getLambda2$material_release();
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1473476840, i8, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:243)");
                                }
                                final float f3 = fM9053getScrollableTabRowPaddingD9Ej5fM;
                                final Function2<? super Composer, ? super Integer, Unit> function24 = function2M8884getLambda2$material_release;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function3ComposableLambda;
                                SurfaceKt.m9025SurfaceFjzlyU(modifier2, null, primarySurface, jM8864contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1455860572, i12, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:249)");
                                            }
                                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                            composer2.startReplaceableGroup(773894976);
                                            composer2.startReplaceableGroup(-492369756);
                                            Object objRememberedValue = composer2.rememberedValue();
                                            Composer.Companion companion = Composer.INSTANCE;
                                            if (objRememberedValue == companion.getEmpty()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                            }
                                            composer2.endReplaceableGroup();
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                            composer2.endReplaceableGroup();
                                            composer2.startReplaceableGroup(511388516);
                                            boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                                            Object objRememberedValue2 = composer2.rememberedValue();
                                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                                composer2.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer2.endReplaceableGroup();
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                            final float f4 = f3;
                                            final Function2<Composer, Integer, Unit> function25 = function22;
                                            final Function2<Composer, Integer, Unit> function26 = function24;
                                            final int i13 = i;
                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                    return m9056invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                }

                                                @NotNull
                                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                public final MeasureResult m9056invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j3) {
                                                    int iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                    final int iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(f4);
                                                    long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j3, iMo7868roundToPx0680j_4, 0, 0, 0, 14, null);
                                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                    final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                                    int size = listSubcompose.size();
                                                    for (int i14 = 0; i14 < size; i14++) {
                                                        arrayList.add(listSubcompose.get(i14).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                                                    }
                                                    final Ref.IntRef intRef = new Ref.IntRef();
                                                    intRef.element = iMo7868roundToPx0680j_42 * 2;
                                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                                    int size2 = arrayList.size();
                                                    for (int i15 = 0; i15 < size2; i15++) {
                                                        Placeable placeable = (Placeable) arrayList.get(i15);
                                                        intRef.element += placeable.getWidth();
                                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                    }
                                                    int i16 = intRef.element;
                                                    int i17 = intRef2.element;
                                                    final Function2<Composer, Integer, Unit> function27 = function26;
                                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                    final int i18 = i13;
                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                                    return MeasureScope.layout$default(subcomposeMeasureScope, i16, i17, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                            invoke2(placementScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                            final ArrayList arrayList2 = new ArrayList();
                                                            int width = iMo7868roundToPx0680j_42;
                                                            List<Placeable> list = arrayList;
                                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                            int size3 = list.size();
                                                            for (int i19 = 0; i19 < size3; i19++) {
                                                                Placeable placeable2 = list.get(i19);
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                                arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo7871toDpu2uoSUM(width), subcomposeMeasureScope2.mo7871toDpu2uoSUM(placeable2.getWidth()), null));
                                                                width += placeable2.getWidth();
                                                            }
                                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                            long j4 = j3;
                                                            Ref.IntRef intRef3 = intRef;
                                                            Ref.IntRef intRef4 = intRef2;
                                                            int i20 = 0;
                                                            for (int size4 = listSubcompose2.size(); i20 < size4; size4 = size4) {
                                                                Measurable measurable = listSubcompose2.get(i20);
                                                                int i21 = intRef3.element;
                                                                Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, i21, i21, 0, 0, 8, null));
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, intRef4.element - placeableMo12610measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                                i20++;
                                                            }
                                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                            TabSlots tabSlots = TabSlots.Indicator;
                                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                                @Composable
                                                                public final void invoke(@Nullable Composer composer3, int i22) {
                                                                    if ((i22 & 11) == 2 && composer3.getSkipping()) {
                                                                        composer3.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-411868839, i22, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:305)");
                                                                    }
                                                                    function36.invoke(arrayList2, composer3, 8);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }));
                                                            Ref.IntRef intRef5 = intRef;
                                                            Ref.IntRef intRef6 = intRef2;
                                                            int size5 = listSubcompose3.size();
                                                            for (int i22 = 0; i22 < size5; i22++) {
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i22).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                            }
                                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo7868roundToPx0680j_42, arrayList2, i18);
                                                        }
                                                    }, 4, null);
                                                }
                                            }, composer2, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function23 = function2M8884getLambda2$material_release;
                                f2 = fM9053getScrollableTabRowPaddingD9Ej5fM;
                                modifier3 = modifier2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                modifier2 = modifier;
                                fM9053getScrollableTabRowPaddingD9Ej5fM = f2;
                                function3ComposableLambda = function32;
                            }
                            i8 = i4;
                            function2M8884getLambda2$material_release = function2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final float f32 = fM9053getScrollableTabRowPaddingD9Ej5fM;
                            final Function2<? super Composer, ? super Integer, Unit> function242 = function2M8884getLambda2$material_release;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function332 = function3ComposableLambda;
                            SurfaceKt.m9025SurfaceFjzlyU(modifier2, null, primarySurface, jM8864contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1455860572, i12, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:249)");
                                        }
                                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                        composer2.startReplaceableGroup(773894976);
                                        composer2.startReplaceableGroup(-492369756);
                                        Object objRememberedValue = composer2.rememberedValue();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        composer2.endReplaceableGroup();
                                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                        composer2.endReplaceableGroup();
                                        composer2.startReplaceableGroup(511388516);
                                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                        final float f4 = f32;
                                        final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function242;
                                        final int i13 = i;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function332;
                                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return m9056invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            @NotNull
                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final MeasureResult m9056invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j3) {
                                                int iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                final int iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(f4);
                                                long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j3, iMo7868roundToPx0680j_4, 0, 0, 0, 14, null);
                                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                                int size = listSubcompose.size();
                                                for (int i14 = 0; i14 < size; i14++) {
                                                    arrayList.add(listSubcompose.get(i14).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                                                }
                                                final Ref.IntRef intRef = new Ref.IntRef();
                                                intRef.element = iMo7868roundToPx0680j_42 * 2;
                                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                                int size2 = arrayList.size();
                                                for (int i15 = 0; i15 < size2; i15++) {
                                                    Placeable placeable = (Placeable) arrayList.get(i15);
                                                    intRef.element += placeable.getWidth();
                                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                }
                                                int i16 = intRef.element;
                                                int i17 = intRef2.element;
                                                final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                final int i18 = i13;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                                return MeasureScope.layout$default(subcomposeMeasureScope, i16, i17, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                        final List<TabPosition> arrayList2 = new ArrayList();
                                                        int width = iMo7868roundToPx0680j_42;
                                                        List<Placeable> list = arrayList;
                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                        int size3 = list.size();
                                                        for (int i19 = 0; i19 < size3; i19++) {
                                                            Placeable placeable2 = list.get(i19);
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                            arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo7871toDpu2uoSUM(width), subcomposeMeasureScope2.mo7871toDpu2uoSUM(placeable2.getWidth()), null));
                                                            width += placeable2.getWidth();
                                                        }
                                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                        long j4 = j3;
                                                        Ref.IntRef intRef3 = intRef;
                                                        Ref.IntRef intRef4 = intRef2;
                                                        int i20 = 0;
                                                        for (int size4 = listSubcompose2.size(); i20 < size4; size4 = size4) {
                                                            Measurable measurable = listSubcompose2.get(i20);
                                                            int i21 = intRef3.element;
                                                            Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, i21, i21, 0, 0, 8, null));
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, intRef4.element - placeableMo12610measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                            i20++;
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                            @Composable
                                                            public final void invoke(@Nullable Composer composer3, int i22) {
                                                                if ((i22 & 11) == 2 && composer3.getSkipping()) {
                                                                    composer3.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-411868839, i22, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:305)");
                                                                }
                                                                function36.invoke(arrayList2, composer3, 8);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }));
                                                        Ref.IntRef intRef5 = intRef;
                                                        Ref.IntRef intRef6 = intRef2;
                                                        int size5 = listSubcompose3.size();
                                                        for (int i22 = 0; i22 < size5; i22++) {
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i22).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                        }
                                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo7868roundToPx0680j_42, arrayList2, i18);
                                                    }
                                                }, 4, null);
                                            }
                                        }, composer2, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function23 = function2M8884getLambda2$material_release;
                            f2 = fM9053getScrollableTabRowPaddingD9Ej5fM;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function23 = function2;
                            function3ComposableLambda = function32;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final long j3 = primarySurface;
                            final long j4 = jM8864contentColorForek8zF_U;
                            final float f4 = f2;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function3ComposableLambda;
                            final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
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

                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    TabRowKt.m9054ScrollableTabRowsKfQg0A(i, modifier4, j3, j4, f4, function34, function25, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 12582912;
                    if ((i4 & 23967451) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i9 == 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                                i8 = i4;
                                function2M8884getLambda2$material_release = function2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final float f322 = fM9053getScrollableTabRowPaddingD9Ej5fM;
                            final Function2<? super Composer, ? super Integer, Unit> function2422 = function2M8884getLambda2$material_release;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3322 = function3ComposableLambda;
                            SurfaceKt.m9025SurfaceFjzlyU(modifier2, null, primarySurface, jM8864contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1455860572, i12, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:249)");
                                        }
                                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                        composer2.startReplaceableGroup(773894976);
                                        composer2.startReplaceableGroup(-492369756);
                                        Object objRememberedValue = composer2.rememberedValue();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        composer2.endReplaceableGroup();
                                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                        composer2.endReplaceableGroup();
                                        composer2.startReplaceableGroup(511388516);
                                        boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                        final float f42 = f322;
                                        final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function2422;
                                        final int i13 = i;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function342 = function3322;
                                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return m9056invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            @NotNull
                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final MeasureResult m9056invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j32) {
                                                int iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                final int iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(f42);
                                                long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j32, iMo7868roundToPx0680j_4, 0, 0, 0, 14, null);
                                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function252);
                                                final List<? extends Placeable> arrayList = new ArrayList(listSubcompose.size());
                                                int size = listSubcompose.size();
                                                for (int i14 = 0; i14 < size; i14++) {
                                                    arrayList.add(listSubcompose.get(i14).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                                                }
                                                final Ref.IntRef intRef = new Ref.IntRef();
                                                intRef.element = iMo7868roundToPx0680j_42 * 2;
                                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                                int size2 = arrayList.size();
                                                for (int i15 = 0; i15 < size2; i15++) {
                                                    Placeable placeable = (Placeable) arrayList.get(i15);
                                                    intRef.element += placeable.getWidth();
                                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                }
                                                int i16 = intRef.element;
                                                int i17 = intRef2.element;
                                                final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                final int i18 = i13;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function342;
                                                return MeasureScope.layout$default(subcomposeMeasureScope, i16, i17, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                        final List<TabPosition> arrayList2 = new ArrayList();
                                                        int width = iMo7868roundToPx0680j_42;
                                                        List<Placeable> list = arrayList;
                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                        int size3 = list.size();
                                                        for (int i19 = 0; i19 < size3; i19++) {
                                                            Placeable placeable2 = list.get(i19);
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                            arrayList2.add(new TabPosition(subcomposeMeasureScope2.mo7871toDpu2uoSUM(width), subcomposeMeasureScope2.mo7871toDpu2uoSUM(placeable2.getWidth()), null));
                                                            width += placeable2.getWidth();
                                                        }
                                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                        long j42 = j32;
                                                        Ref.IntRef intRef3 = intRef;
                                                        Ref.IntRef intRef4 = intRef2;
                                                        int i20 = 0;
                                                        for (int size4 = listSubcompose2.size(); i20 < size4; size4 = size4) {
                                                            Measurable measurable = listSubcompose2.get(i20);
                                                            int i21 = intRef3.element;
                                                            Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j42, i21, i21, 0, 0, 8, null));
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, intRef4.element - placeableMo12610measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                            i20++;
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
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

                                                            @Composable
                                                            public final void invoke(@Nullable Composer composer3, int i22) {
                                                                if ((i22 & 11) == 2 && composer3.getSkipping()) {
                                                                    composer3.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-411868839, i22, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:305)");
                                                                }
                                                                function36.invoke(arrayList2, composer3, 8);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }));
                                                        Ref.IntRef intRef5 = intRef;
                                                        Ref.IntRef intRef6 = intRef2;
                                                        int size5 = listSubcompose3.size();
                                                        for (int i22 = 0; i22 < size5; i22++) {
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i22).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                        }
                                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo7868roundToPx0680j_42, arrayList2, i18);
                                                    }
                                                }, 4, null);
                                            }
                                        }, composer2, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function23 = function2M8884getLambda2$material_release;
                            f2 = fM9053getScrollableTabRowPaddingD9Ej5fM;
                            modifier3 = modifier2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function32 = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i4 & 23967451) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i4 & 23967451) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i4 & 23967451) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
