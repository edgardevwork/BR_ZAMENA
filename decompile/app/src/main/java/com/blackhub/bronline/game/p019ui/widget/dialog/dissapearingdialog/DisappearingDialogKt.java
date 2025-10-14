package com.blackhub.bronline.game.p019ui.widget.dialog.dissapearingdialog;

import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DisappearingDialog.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\bH\u0003¢\u0006\u0002\u0010\t\u001aG\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012²\u0006\u0015\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\bX\u008a\u0084\u0002"}, m7105d2 = {"WAITING_MILLIS", "", "DialogLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DisappearingDialog", "onDismissRequest", "properties", "Lcom/blackhub/bronline/game/ui/widget/dialog/dissapearingdialog/DialogProperties;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/IntOffset;", "DisappearingDialog-49G2kSo", "(Lkotlin/jvm/functions/Function0;Lcom/blackhub/bronline/game/ui/widget/dialog/dissapearingdialog/DialogProperties;JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_siteRelease", "currentContent"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDisappearingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisappearingDialog.kt\ncom/blackhub/bronline/game/ui/widget/dialog/dissapearingdialog/DisappearingDialogKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,262:1\n74#2:263\n74#2:264\n74#2:265\n1116#3,6:266\n79#4,11:272\n92#4:303\n456#5,8:283\n464#5,6:297\n3737#6,6:291\n81#7:304\n*S KotlinDebug\n*F\n+ 1 DisappearingDialog.kt\ncom/blackhub/bronline/game/ui/widget/dialog/dissapearingdialog/DisappearingDialogKt\n*L\n65#1:263\n66#1:264\n67#1:265\n70#1:266,6\n248#1:272,11\n248#1:303\n248#1:283,8\n248#1:297,6\n248#1:291,6\n69#1:304\n*E\n"})
/* loaded from: classes3.dex */
public final class DisappearingDialogKt {
    public static final long WAITING_MILLIS = 5000;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DisappearingDialog-49G2kSo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15086DisappearingDialog49G2kSo(@NotNull final Function0<Unit> onDismissRequest, @Nullable DialogProperties dialogProperties, long j, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        DialogProperties dialogProperties2;
        int i4;
        long j2;
        DialogProperties dialogProperties3;
        long jIntOffset;
        View view;
        final LayoutDirection layoutDirection;
        CompositionContext compositionContextRememberCompositionContext;
        final State stateRememberUpdatedState;
        boolean zChanged;
        Object objRememberedValue;
        final DialogProperties dialogProperties4;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-975301531);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                dialogProperties2 = dialogProperties;
                i3 |= composerStartRestartGroup.changed(dialogProperties2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    j2 = j;
                    i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
                }
                if ((i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    dialogProperties3 = i5 == 0 ? new DialogProperties(false, false, 3, null) : dialogProperties2;
                    jIntOffset = i4 == 0 ? IntOffsetKt.IntOffset(0, 0) : j2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-975301531, i3, -1, "com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialog (DisappearingDialog.kt:63)");
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    float density = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity();
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i3 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-1666394146);
                    zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(view);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        DialogWrapper dialogWrapper = new DialogWrapper(onDismissRequest, dialogProperties3, view, layoutDirection, jIntOffset, null);
                        dialogWrapper.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-687456090, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$dialog$1$1$1
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
                            public final void invoke(@Nullable Composer composer2, int i6) {
                                if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-687456090, i6, -1, "com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialog.<anonymous>.<anonymous>.<anonymous> (DisappearingDialog.kt:78)");
                                    }
                                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$dialog$1$1$1.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                            SemanticsPropertiesKt.dialog(semantics);
                                        }
                                    }, 1, null);
                                    final State<Function2<Composer, Integer, Unit>> state = stateRememberUpdatedState;
                                    DisappearingDialogKt.DialogLayout(modifierSemantics$default, ComposableLambdaKt.composableLambda(composer2, -1228644730, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$dialog$1$1$1.2
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

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i7) {
                                            if ((i7 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1228644730, i7, -1, "com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DisappearingDialog.kt:82)");
                                            }
                                            DisappearingDialogKt.DisappearingDialog_49G2kSo$lambda$0(state).invoke(composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer2, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                        composerStartRestartGroup.updateRememberedValue(dialogWrapper);
                        objRememberedValue = dialogWrapper;
                    }
                    final DialogWrapper dialogWrapper2 = (DialogWrapper) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(dialogWrapper2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            dialogWrapper2.show();
                            final DialogWrapper dialogWrapper3 = dialogWrapper2;
                            final Function0<Unit> function0 = onDismissRequest;
                            return new DisposableEffectResult() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    dialogWrapper3.dismiss();
                                    function0.invoke();
                                    dialogWrapper3.disposeComposition();
                                }
                            };
                        }
                    }, composerStartRestartGroup, 8);
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new DisappearingDialogKt$DisappearingDialog$2(dialogWrapper2, onDismissRequest, null), composerStartRestartGroup, 70);
                    final DialogProperties dialogProperties5 = dialogProperties3;
                    final long j4 = jIntOffset;
                    EffectsKt.SideEffect(new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$3
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
                            dialogWrapper2.m15085updateParametersKtjjmr4(onDismissRequest, dialogProperties5, layoutDirection, j4);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    dialogProperties4 = dialogProperties3;
                    j3 = jIntOffset;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    dialogProperties4 = dialogProperties2;
                    j3 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$4
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

                        public final void invoke(@Nullable Composer composer2, int i6) {
                            DisappearingDialogKt.m15086DisappearingDialog49G2kSo(onDismissRequest, dialogProperties4, j3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            j2 = j;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 5851) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                float density2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity();
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i3 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-1666394146);
                zChanged = composerStartRestartGroup.changed(density2) | composerStartRestartGroup.changed(view);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    DialogWrapper dialogWrapper3 = new DialogWrapper(onDismissRequest, dialogProperties3, view, layoutDirection, jIntOffset, null);
                    dialogWrapper3.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-687456090, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$dialog$1$1$1
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
                        public final void invoke(@Nullable Composer composer2, int i6) {
                            if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-687456090, i6, -1, "com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialog.<anonymous>.<anonymous>.<anonymous> (DisappearingDialog.kt:78)");
                                }
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$dialog$1$1$1.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        SemanticsPropertiesKt.dialog(semantics);
                                    }
                                }, 1, null);
                                final State<? extends Function2<? super Composer, ? super Integer, Unit>> state = stateRememberUpdatedState;
                                DisappearingDialogKt.DialogLayout(modifierSemantics$default, ComposableLambdaKt.composableLambda(composer2, -1228644730, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$dialog$1$1$1.2
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i7) {
                                        if ((i7 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1228644730, i7, -1, "com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DisappearingDialog.kt:82)");
                                        }
                                        DisappearingDialogKt.DisappearingDialog_49G2kSo$lambda$0(state).invoke(composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }));
                    composerStartRestartGroup.updateRememberedValue(dialogWrapper3);
                    objRememberedValue = dialogWrapper3;
                    final DialogWrapper dialogWrapper22 = (DialogWrapper) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(dialogWrapper22, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            dialogWrapper22.show();
                            final DialogWrapper dialogWrapper32 = dialogWrapper22;
                            final Function0 function0 = onDismissRequest;
                            return new DisposableEffectResult() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    dialogWrapper32.dismiss();
                                    function0.invoke();
                                    dialogWrapper32.disposeComposition();
                                }
                            };
                        }
                    }, composerStartRestartGroup, 8);
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new DisappearingDialogKt$DisappearingDialog$2(dialogWrapper22, onDismissRequest, null), composerStartRestartGroup, 70);
                    final DialogProperties dialogProperties52 = dialogProperties3;
                    final long j42 = jIntOffset;
                    EffectsKt.SideEffect(new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt$DisappearingDialog$3
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
                            dialogWrapper22.m15085updateParametersKtjjmr4(onDismissRequest, dialogProperties52, layoutDirection, j42);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    dialogProperties4 = dialogProperties3;
                    j3 = jIntOffset;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        dialogProperties2 = dialogProperties;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        j2 = j;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 5851) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DialogLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1161786370);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1161786370, i3, -1, "com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DialogLayout (DisappearingDialog.kt:246)");
            }
            Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(modifier, ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6), null, 2, null);
            C64251 c64251 = new MeasurePolicy() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt.DialogLayout.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r13v15 */
                /* JADX WARN: Type inference failed for: r13v17 */
                /* JADX WARN: Type inference failed for: r13v18 */
                /* JADX WARN: Type inference failed for: r13v23 */
                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                    Object obj;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    final ArrayList arrayList = new ArrayList(measurables.size());
                    int size = measurables.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList.add(measurables.get(i5).mo12610measureBRTryo0(j));
                    }
                    Placeable placeable = null;
                    int i6 = 1;
                    if (arrayList.isEmpty()) {
                        obj = null;
                    } else {
                        obj = arrayList.get(0);
                        int width = ((Placeable) obj).getWidth();
                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                        if (1 <= lastIndex) {
                            int i7 = 1;
                            while (true) {
                                Object obj2 = arrayList.get(i7);
                                int width2 = ((Placeable) obj2).getWidth();
                                if (width < width2) {
                                    obj = obj2;
                                    width = width2;
                                }
                                if (i7 == lastIndex) {
                                    break;
                                }
                                i7++;
                            }
                        }
                    }
                    Placeable placeable2 = (Placeable) obj;
                    int width3 = placeable2 != null ? placeable2.getWidth() : Constraints.m13624getMinWidthimpl(j);
                    if (!arrayList.isEmpty()) {
                        ?? r13 = arrayList.get(0);
                        int height = ((Placeable) r13).getHeight();
                        int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                        boolean z = r13;
                        if (1 <= lastIndex2) {
                            while (true) {
                                Object obj3 = arrayList.get(i6);
                                int height2 = ((Placeable) obj3).getHeight();
                                r13 = z;
                                if (height < height2) {
                                    r13 = obj3;
                                    height = height2;
                                }
                                if (i6 == lastIndex2) {
                                    break;
                                }
                                i6++;
                                z = r13;
                            }
                        }
                        placeable = r13;
                    }
                    Placeable placeable3 = placeable;
                    return MeasureScope.layout$default(Layout, width3, placeable3 != null ? placeable3.getHeight() : Constraints.m13623getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt.DialogLayout.1.1
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
                        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            List<Placeable> list = arrayList;
                            int size2 = list.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                Placeable.PlacementScope.placeRelative$default(layout, list.get(i8), 0, 0, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
            int i5 = 6 | (((((i3 >> 3) & 14) | 384) << 9) & 7168);
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
            Updater.m10877setimpl(composerM10870constructorimpl, c64251, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.dissapearingdialog.DisappearingDialogKt.DialogLayout.2
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

                public final void invoke(@Nullable Composer composer2, int i6) {
                    DisappearingDialogKt.DialogLayout(modifier, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final Function2<Composer, Integer, Unit> DisappearingDialog_49G2kSo$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
