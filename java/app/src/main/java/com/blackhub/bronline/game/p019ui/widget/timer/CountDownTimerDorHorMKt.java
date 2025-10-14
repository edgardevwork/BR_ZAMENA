package com.blackhub.bronline.game.p019ui.widget.timer;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CountDownTimerDorHorM.kt */
@SourceDebugExtension({"SMAP\nCountDownTimerDorHorM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountDownTimerDorHorM.kt\ncom/blackhub/bronline/game/ui/widget/timer/CountDownTimerDorHorMKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,94:1\n74#2:95\n1116#3,6:96\n1116#3,6:102\n1116#3,6:108\n68#4,6:114\n74#4:148\n78#4:153\n79#5,11:120\n92#5:152\n456#6,8:131\n464#6,3:145\n467#6,3:149\n3737#7,6:139\n76#8:154\n109#8,2:155\n81#9:157\n107#9,2:158\n*S KotlinDebug\n*F\n+ 1 CountDownTimerDorHorM.kt\ncom/blackhub/bronline/game/ui/widget/timer/CountDownTimerDorHorMKt\n*L\n37#1:95\n38#1:96,6\n41#1:102,6\n42#1:108,6\n76#1:114,6\n76#1:148\n76#1:153\n76#1:120,11\n76#1:152\n76#1:131,8\n76#1:145,3\n76#1:149,3\n76#1:139,6\n41#1:154\n41#1:155,2\n42#1:157\n42#1:158,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CountDownTimerDorHorMKt {
    public static final int SECONDS_IN_DAY = 86400;
    public static final int SECONDS_IN_HOUR = 3600;

    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CountDownTimerDorHorM(@Nullable Modifier modifier, @NotNull final TextStyle style, final long j, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(style, "style");
        Composer composerStartRestartGroup = composer.startRestartGroup(1756664868);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(style) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 7168) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                Function0<Unit> function04 = i6 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.timer.CountDownTimerDorHorMKt.CountDownTimerDorHorM.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                } : function02;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1756664868, i4, -1, "com.blackhub.bronline.game.ui.widget.timer.CountDownTimerDorHorM (CountDownTimerDorHorM.kt:35)");
                }
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Ref.LongRef longRef = new Ref.LongRef();
                composerStartRestartGroup.startReplaceableGroup(985895603);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Long.valueOf(System.currentTimeMillis() / 1000);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                long jLongValue = ((Number) objRememberedValue).longValue();
                composerStartRestartGroup.endReplaceableGroup();
                longRef.element = jLongValue;
                composerStartRestartGroup.startReplaceableGroup(985895690);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotLongStateKt.mutableLongStateOf(j - longRef.element);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableLongState mutableLongState = (MutableLongState) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(985895770);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(Long.valueOf(j), new C64812(longRef, j, context, function04, mutableLongState, mutableState, null), composerStartRestartGroup, ((i4 >> 6) & 14) | 64);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier4);
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
                composer2 = composerStartRestartGroup;
                TextKt.m10024Text4IGK_g(CountDownTimerDorHorM$lambda$5(mutableState), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, style, composer2, 0, (i4 << 15) & 3670016, 65534);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                function03 = function04;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                function03 = function02;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.timer.CountDownTimerDorHorMKt.CountDownTimerDorHorM.4
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
                        CountDownTimerDorHorMKt.CountDownTimerDorHorM(modifier3, style, j, function03, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        function02 = function0;
        i4 = i3;
        if ((i4 & 5851) == 1170) {
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Ref.LongRef longRef2 = new Ref.LongRef();
            composerStartRestartGroup.startReplaceableGroup(985895603);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            long jLongValue2 = ((Number) objRememberedValue).longValue();
            composerStartRestartGroup.endReplaceableGroup();
            longRef2.element = jLongValue2;
            composerStartRestartGroup.startReplaceableGroup(985895690);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            MutableLongState mutableLongState2 = (MutableLongState) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(985895770);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Long.valueOf(j), new C64812(longRef2, j, context2, function04, mutableLongState2, mutableState2, null), composerStartRestartGroup, ((i4 >> 6) & 14) | 64);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM10870constructorimpl.getInserting()) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer2 = composerStartRestartGroup;
                TextKt.m10024Text4IGK_g(CountDownTimerDorHorM$lambda$5(mutableState2), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, style, composer2, 0, (i4 << 15) & 3670016, 65534);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                function03 = function04;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CountDownTimerDorHorM.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.timer.CountDownTimerDorHorMKt$CountDownTimerDorHorM$2", m7120f = "CountDownTimerDorHorM.kt", m7121i = {}, m7122l = {72}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.widget.timer.CountDownTimerDorHorMKt$CountDownTimerDorHorM$2 */
    /* loaded from: classes8.dex */
    public static final class C64812 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $callbackIsFinishedTimer;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Ref.LongRef $currentTime;
        public final /* synthetic */ long $endTime;
        public final /* synthetic */ MutableState<String> $formattedText$delegate;
        public final /* synthetic */ MutableLongState $timeLeft$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64812(Ref.LongRef longRef, long j, Context context, Function0<Unit> function0, MutableLongState mutableLongState, MutableState<String> mutableState, Continuation<? super C64812> continuation) {
            super(2, continuation);
            this.$currentTime = longRef;
            this.$endTime = j;
            this.$context = context;
            this.$callbackIsFinishedTimer = function0;
            this.$timeLeft$delegate = mutableLongState;
            this.$formattedText$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C64812(this.$currentTime, this.$endTime, this.$context, this.$callbackIsFinishedTimer, this.$timeLeft$delegate, this.$formattedText$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C64812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String quantityString;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                this.$currentTime.element = System.currentTimeMillis() / 1000;
                CountDownTimerDorHorMKt.CountDownTimerDorHorM$lambda$3(this.$timeLeft$delegate, this.$endTime - this.$currentTime.element);
                if (CountDownTimerDorHorMKt.CountDownTimerDorHorM$lambda$2(this.$timeLeft$delegate) > 0) {
                    int iCountDownTimerDorHorM$lambda$2 = ((int) CountDownTimerDorHorMKt.CountDownTimerDorHorM$lambda$2(this.$timeLeft$delegate)) / 86400;
                    int iCountDownTimerDorHorM$lambda$22 = ((int) CountDownTimerDorHorMKt.CountDownTimerDorHorM$lambda$2(this.$timeLeft$delegate)) / 3600;
                    int iCountDownTimerDorHorM$lambda$23 = (((int) CountDownTimerDorHorMKt.CountDownTimerDorHorM$lambda$2(this.$timeLeft$delegate)) % 3600) / 60;
                    MutableState<String> mutableState = this.$formattedText$delegate;
                    if (IntExtensionKt.isNotZero(Boxing.boxInt(iCountDownTimerDorHorM$lambda$2))) {
                        quantityString = this.$context.getResources().getQuantityString(R.plurals.common_days, iCountDownTimerDorHorM$lambda$2, Boxing.boxInt(iCountDownTimerDorHorM$lambda$2));
                        Intrinsics.checkNotNull(quantityString);
                    } else if (IntExtensionKt.isNotZero(Boxing.boxInt(iCountDownTimerDorHorM$lambda$22))) {
                        quantityString = this.$context.getResources().getQuantityString(R.plurals.common_hours, iCountDownTimerDorHorM$lambda$22, Boxing.boxInt(iCountDownTimerDorHorM$lambda$22));
                        Intrinsics.checkNotNull(quantityString);
                    } else if (IntExtensionKt.isNotZero(Boxing.boxInt(iCountDownTimerDorHorM$lambda$23))) {
                        quantityString = this.$context.getResources().getQuantityString(R.plurals.common_minutes, iCountDownTimerDorHorM$lambda$23, Boxing.boxInt(iCountDownTimerDorHorM$lambda$23));
                        Intrinsics.checkNotNull(quantityString);
                    } else {
                        quantityString = this.$context.getResources().getQuantityString(R.plurals.common_minutes, 1, Boxing.boxInt(1));
                        Intrinsics.checkNotNull(quantityString);
                    }
                    CountDownTimerDorHorMKt.CountDownTimerDorHorM$lambda$6(mutableState, quantityString);
                } else {
                    this.$callbackIsFinishedTimer.invoke();
                }
                this.label = 1;
            } while (DelayKt.delay(1000L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CountDownTimerDorHorM")
    public static final void PreviewCountDownTimerDorHorM(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-939069043);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-939069043, i, -1, "com.blackhub.bronline.game.ui.widget.timer.PreviewCountDownTimerDorHorM (CountDownTimerDorHorM.kt:85)");
            }
            CountDownTimerDorHorM(null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._24wsp, ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), 1718982500L, null, composerStartRestartGroup, 384, 9);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.timer.CountDownTimerDorHorMKt.PreviewCountDownTimerDorHorM.1
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
                    CountDownTimerDorHorMKt.PreviewCountDownTimerDorHorM(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final long CountDownTimerDorHorM$lambda$2(MutableLongState mutableLongState) {
        return mutableLongState.getLongValue();
    }

    public static final void CountDownTimerDorHorM$lambda$3(MutableLongState mutableLongState, long j) {
        mutableLongState.setLongValue(j);
    }

    public static final String CountDownTimerDorHorM$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final void CountDownTimerDorHorM$lambda$6(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }
}

