package com.blackhub.bronline.game.p019ui.activetask;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.TwoColorVerticalBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActiveTaskBlock.kt */
@Metadata(m7104d1 = {"\u00002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m7105d2 = {"GRADIENT_BRUSH_END", "", "GRADIENT_BRUSH_START", "ActiveTaskBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "hintTitle", "Landroidx/compose/ui/text/AnnotatedString;", "hintDesc", "isShowTimer", "", "ticks", "", "isBlockOpen", "Landroidx/compose/runtime/MutableState;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZILandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V", "PreviewActiveTaskBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nActiveTaskBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTaskBlock.kt\ncom/blackhub/bronline/game/ui/activetask/ActiveTaskBlockKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,169:1\n68#2,6:170\n74#2:204\n78#2:209\n79#3,11:176\n92#3:208\n456#4,8:187\n464#4,3:201\n467#4,3:205\n3737#5,6:195\n1116#6,6:210\n*S KotlinDebug\n*F\n+ 1 ActiveTaskBlock.kt\ncom/blackhub/bronline/game/ui/activetask/ActiveTaskBlockKt\n*L\n54#1:170,6\n54#1:204\n54#1:209\n54#1:176,11\n54#1:208\n54#1:187,8\n54#1:201,3\n54#1:205,3\n54#1:195,6\n167#1:210,6\n*E\n"})
/* loaded from: classes.dex */
public final class ActiveTaskBlockKt {
    public static final float GRADIENT_BRUSH_END = 0.3f;
    public static final float GRADIENT_BRUSH_START = 0.0f;

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActiveTaskBlock(@Nullable Modifier modifier, @NotNull final AnnotatedString hintTitle, @NotNull final AnnotatedString hintDesc, final boolean z, final int i, @NotNull final MutableState<Boolean> isBlockOpen, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(hintTitle, "hintTitle");
        Intrinsics.checkNotNullParameter(hintDesc, "hintDesc");
        Intrinsics.checkNotNullParameter(isBlockOpen, "isBlockOpen");
        Composer composerStartRestartGroup = composer.startRestartGroup(327245206);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(hintTitle) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(hintDesc) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= CpioConstants.C_ISBLK;
        } else if ((57344 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            if ((458752 & i2) == 0) {
                i5 = composerStartRestartGroup.changed(isBlockOpen) ? 131072 : 65536;
            }
            if ((374491 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(327245206, i4, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskBlock (ActiveTaskBlock.kt:51)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                final Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                AnimatedVisibilityKt.AnimatedVisibility(isBlockOpen.getValue().booleanValue(), (Modifier) null, EnterExitTransitionKt.slideInHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$1
                    @NotNull
                    public final Integer invoke(int i7) {
                        return Integer.valueOf(i7);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 1, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, companion2.getEnd(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$2
                    @NotNull
                    public final Integer invoke(int i7) {
                        return Integer.valueOf(i7);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 1, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, companion2.getEnd(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 703475444, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                        invoke(animatedVisibilityScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(703475444, i7, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskBlock.<anonymous>.<anonymous> (ActiveTaskBlock.kt:63)");
                        }
                        Modifier modifier6 = modifier5;
                        Brush.Companion companion4 = Brush.INSTANCE;
                        Brush brushM11290horizontalGradient8A3gB4$default = Brush.Companion.m11290horizontalGradient8A3gB4$default(companion4, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.0f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_20, composer3, 6))), TuplesKt.m7112to(Float.valueOf(0.3f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_40, composer3, 6)))}, 0.0f, 0.0f, 0, 14, (Object) null);
                        Brush brushM11290horizontalGradient8A3gB4$default2 = Brush.Companion.m11290horizontalGradient8A3gB4$default(companion4, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.0f), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())), TuplesKt.m7112to(Float.valueOf(0.3f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_40, composer3, 6)))}, 0.0f, 0.0f, 0, 14, (Object) null);
                        final MutableState<Boolean> mutableState = isBlockOpen;
                        final AnnotatedString annotatedString = hintTitle;
                        final boolean z2 = z;
                        final int i8 = i;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1780139034, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i9) {
                                Composer composer5;
                                if ((i9 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1780139034, i9, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskBlock.<anonymous>.<anonymous>.<anonymous> (ActiveTaskBlock.kt:74)");
                                    }
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                    Alignment.Companion companion6 = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically = companion6.getCenterVertically();
                                    final MutableState<Boolean> mutableState2 = mutableState;
                                    AnnotatedString annotatedString2 = annotatedString;
                                    boolean z3 = z2;
                                    int i10 = i8;
                                    composer4.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer4, 54);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6));
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composer4, 6));
                                    composer4.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, companion6.getTop(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN4);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(annotatedString2, companion5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14865montserratSemiBoldItalicCustomSpqcSRpps(R.dimen._17wsp, 0L, 0, composer4, 3078, 6), composer4, 48, 0, 131068);
                                    composer4.startReplaceableGroup(1841468436);
                                    if (z3) {
                                        composer5 = composer4;
                                        TextKt.m10025TextIbK3jfQ(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.tutorial_time, new Object[]{IntExtensionKt.parseTimeToStringWithFormat(i10)}, composer4, 70)), companion5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14865montserratSemiBoldItalicCustomSpqcSRpps(R.dimen._17wsp, 0L, 0, composer4, 3078, 6), composer4, 48, 0, 131068);
                                    } else {
                                        composer5 = composer4;
                                    }
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer5.startReplaceableGroup(1841469073);
                                    boolean zChanged = composer5.changed(mutableState2);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$3$1$1$2$1
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
                                                mutableState2.setValue(Boolean.FALSE);
                                            }
                                        };
                                        composer5.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceableGroup();
                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableSingletons$ActiveTaskBlockKt.INSTANCE.m14880getLambda1$app_siteRelease(), composer4, 0, 3072, UnixStat.PERM_MASK);
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        final AnnotatedString annotatedString2 = hintDesc;
                        TwoColorVerticalBlockKt.TwoColorVerticalBlock(modifier6, brushM11290horizontalGradient8A3gB4$default, brushM11290horizontalGradient8A3gB4$default2, composableLambda, ComposableLambdaKt.composableLambda(composer3, -1435575675, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$3.2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i9) {
                                if ((i9 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1435575675, i9, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskBlock.<anonymous>.<anonymous>.<anonymous> (ActiveTaskBlock.kt:117)");
                                    }
                                    TextKt.m10025TextIbK3jfQ(annotatedString2, SizeKt.fillMaxWidth$default(PaddingKt.m8124paddingVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer4, 6)), 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14865montserratSemiBoldItalicCustomSpqcSRpps(R.dimen._17wsp, 0L, 0, composer4, 3078, 6), composer4, 0, 0, 131068);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 27648, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, 200064, 18);
                AnimatedVisibilityKt.AnimatedVisibility(!isBlockOpen.getValue().booleanValue(), boxScopeInstance.align(companion, companion2.getTopEnd()), EnterExitTransitionKt.slideInHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$4
                    @NotNull
                    public final Integer invoke(int i7) {
                        return Integer.valueOf(i7);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$5
                    @NotNull
                    public final Integer invoke(int i7) {
                        return Integer.valueOf(i7);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composer2, -1999268821, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                        invoke(animatedVisibilityScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1999268821, i7, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskBlock.<anonymous>.<anonymous> (ActiveTaskBlock.kt:136)");
                        }
                        composer3.startReplaceableGroup(-233783083);
                        boolean zChanged = composer3.changed(isBlockOpen);
                        final MutableState<Boolean> mutableState = isBlockOpen;
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$6$1$1
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
                                    mutableState.setValue(Boolean.TRUE);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceableGroup();
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableSingletons$ActiveTaskBlockKt.INSTANCE.m14881getLambda2$app_siteRelease(), composer3, 0, 3072, UnixStat.PERM_MASK);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, 200064, 16);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt.ActiveTaskBlock.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i7) {
                        ActiveTaskBlockKt.ActiveTaskBlock(modifier3, hintTitle, hintDesc, z, i, isBlockOpen, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 = ProfileVerifier.CompilationStatus.f342xf2722a21;
        i4 |= i5;
        if ((374491 & i4) == 74898) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM10870constructorimpl.getInserting()) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                final Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                AnimatedVisibilityKt.AnimatedVisibility(isBlockOpen.getValue().booleanValue(), (Modifier) null, EnterExitTransitionKt.slideInHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$1
                    @NotNull
                    public final Integer invoke(int i7) {
                        return Integer.valueOf(i7);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 1, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, companion22.getEnd(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$2
                    @NotNull
                    public final Integer invoke(int i7) {
                        return Integer.valueOf(i7);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 1, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, companion22.getEnd(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 703475444, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                        invoke(animatedVisibilityScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(703475444, i7, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskBlock.<anonymous>.<anonymous> (ActiveTaskBlock.kt:63)");
                        }
                        Modifier modifier6 = modifier52;
                        Brush.Companion companion42 = Brush.INSTANCE;
                        Brush brushM11290horizontalGradient8A3gB4$default = Brush.Companion.m11290horizontalGradient8A3gB4$default(companion42, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.0f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_20, composer3, 6))), TuplesKt.m7112to(Float.valueOf(0.3f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_40, composer3, 6)))}, 0.0f, 0.0f, 0, 14, (Object) null);
                        Brush brushM11290horizontalGradient8A3gB4$default2 = Brush.Companion.m11290horizontalGradient8A3gB4$default(companion42, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.0f), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())), TuplesKt.m7112to(Float.valueOf(0.3f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_40, composer3, 6)))}, 0.0f, 0.0f, 0, 14, (Object) null);
                        final MutableState<Boolean> mutableState = isBlockOpen;
                        final AnnotatedString annotatedString = hintTitle;
                        final boolean z2 = z;
                        final int i8 = i;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1780139034, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i9) {
                                Composer composer5;
                                if ((i9 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1780139034, i9, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskBlock.<anonymous>.<anonymous>.<anonymous> (ActiveTaskBlock.kt:74)");
                                    }
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                    Alignment.Companion companion6 = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically = companion6.getCenterVertically();
                                    final MutableState<Boolean> mutableState2 = mutableState;
                                    AnnotatedString annotatedString2 = annotatedString;
                                    boolean z3 = z2;
                                    int i10 = i8;
                                    composer4.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer4, 54);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor22 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor22);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6));
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composer4, 6));
                                    composer4.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, companion6.getTop(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN4);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(annotatedString2, companion5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14865montserratSemiBoldItalicCustomSpqcSRpps(R.dimen._17wsp, 0L, 0, composer4, 3078, 6), composer4, 48, 0, 131068);
                                    composer4.startReplaceableGroup(1841468436);
                                    if (z3) {
                                        composer5 = composer4;
                                        TextKt.m10025TextIbK3jfQ(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.tutorial_time, new Object[]{IntExtensionKt.parseTimeToStringWithFormat(i10)}, composer4, 70)), companion5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14865montserratSemiBoldItalicCustomSpqcSRpps(R.dimen._17wsp, 0L, 0, composer4, 3078, 6), composer4, 48, 0, 131068);
                                    } else {
                                        composer5 = composer4;
                                    }
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer5.startReplaceableGroup(1841469073);
                                    boolean zChanged = composer5.changed(mutableState2);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$3$1$1$2$1
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
                                                mutableState2.setValue(Boolean.FALSE);
                                            }
                                        };
                                        composer5.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceableGroup();
                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableSingletons$ActiveTaskBlockKt.INSTANCE.m14880getLambda1$app_siteRelease(), composer4, 0, 3072, UnixStat.PERM_MASK);
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        final AnnotatedString annotatedString2 = hintDesc;
                        TwoColorVerticalBlockKt.TwoColorVerticalBlock(modifier6, brushM11290horizontalGradient8A3gB4$default, brushM11290horizontalGradient8A3gB4$default2, composableLambda, ComposableLambdaKt.composableLambda(composer3, -1435575675, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$3.2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i9) {
                                if ((i9 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1435575675, i9, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskBlock.<anonymous>.<anonymous>.<anonymous> (ActiveTaskBlock.kt:117)");
                                    }
                                    TextKt.m10025TextIbK3jfQ(annotatedString2, SizeKt.fillMaxWidth$default(PaddingKt.m8124paddingVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer4, 6)), 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14865montserratSemiBoldItalicCustomSpqcSRpps(R.dimen._17wsp, 0L, 0, composer4, 3078, 6), composer4, 0, 0, 131068);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 27648, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, 200064, 18);
                AnimatedVisibilityKt.AnimatedVisibility(!isBlockOpen.getValue().booleanValue(), boxScopeInstance2.align(companion4, companion22.getTopEnd()), EnterExitTransitionKt.slideInHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$4
                    @NotNull
                    public final Integer invoke(int i7) {
                        return Integer.valueOf(i7);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$5
                    @NotNull
                    public final Integer invoke(int i7) {
                        return Integer.valueOf(i7);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composer2, -1999268821, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                        invoke(animatedVisibilityScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1999268821, i7, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskBlock.<anonymous>.<anonymous> (ActiveTaskBlock.kt:136)");
                        }
                        composer3.startReplaceableGroup(-233783083);
                        boolean zChanged = composer3.changed(isBlockOpen);
                        final MutableState<Boolean> mutableState = isBlockOpen;
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt$ActiveTaskBlock$1$6$1$1
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
                                    mutableState.setValue(Boolean.TRUE);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceableGroup();
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableSingletons$ActiveTaskBlockKt.INSTANCE.m14881getLambda2$app_siteRelease(), composer3, 0, 3072, UnixStat.PERM_MASK);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, 200064, 16);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ActiveTaskBlock")
    public static final void PreviewActiveTaskBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2049040093);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049040093, i, -1, "com.blackhub.bronline.game.ui.activetask.PreviewActiveTaskBlock (ActiveTaskBlock.kt:160)");
            }
            AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString("<font color=#FFBA08>Магазин</font> товаров");
            AnnotatedString annotatedStringHtmlTextToAnnotatedString2 = StringExtensionKt.htmlTextToAnnotatedString("Отправляйтесь к маме\nи передайте ей <font color=#FFBAFA>письмо</font>.");
            composerStartRestartGroup.startReplaceableGroup(-1324600862);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ActiveTaskBlock(null, annotatedStringHtmlTextToAnnotatedString, annotatedStringHtmlTextToAnnotatedString2, true, 100, (MutableState) objRememberedValue, composerStartRestartGroup, 224256, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskBlockKt.PreviewActiveTaskBlock.2
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
                    ActiveTaskBlockKt.PreviewActiveTaskBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
