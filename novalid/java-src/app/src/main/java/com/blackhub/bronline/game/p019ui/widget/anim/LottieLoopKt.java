package com.blackhub.bronline.game.p019ui.widget.anim;

import androidx.annotation.RawRes;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieRetrySignal;
import com.airbnb.lottie.compose.LottieRetrySignalKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LottieLoop.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\f\u0010\t\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002"}, m7105d2 = {"LottieLoop", "", "modifier", "Landroidx/compose/ui/Modifier;", "animResId", "", "iterations", "(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;II)V", "app_siteRelease", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLottieLoop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieLoop.kt\ncom/blackhub/bronline/game/ui/widget/anim/LottieLoopKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,55:1\n487#2,4:56\n491#2,2:64\n495#2:70\n25#3:60\n1116#4,3:61\n1119#4,3:67\n1116#4,6:71\n1116#4,6:77\n487#5:66\n81#6:83\n107#6,2:84\n*S KotlinDebug\n*F\n+ 1 LottieLoop.kt\ncom/blackhub/bronline/game/ui/widget/anim/LottieLoopKt\n*L\n29#1:56,4\n29#1:64,2\n29#1:70\n29#1:60\n29#1:61,3\n29#1:67,3\n32#1:71,6\n38#1:77,6\n29#1:66\n38#1:83\n38#1:84,2\n*E\n"})
/* loaded from: classes3.dex */
public final class LottieLoopKt {

    /* compiled from: LottieLoop.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.anim.LottieLoopKt$LottieLoop$3 */
    /* loaded from: classes7.dex */
    public static final class C62273 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $animResId;
        public final /* synthetic */ int $iterations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62273(int i, int i2, int i3, int i4) {
            super(2);
            i = i;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            LottieLoopKt.LottieLoop(modifier, i, i, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LottieLoop(@NotNull Modifier modifier, @RawRes int i, int i2, @Nullable Composer composer, int i3, int i4) {
        int i5;
        int i6;
        LottieRetrySignal lottieRetrySignalRememberLottieRetrySignal;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        Object objRememberedValue3;
        MutableState mutableState;
        Composer composer2;
        int i7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(379587916);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i8 = i4 & 4;
        if (i8 == 0) {
            if ((i3 & 896) == 0) {
                i6 = i2;
                i5 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
            }
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                int i9 = i8 == 0 ? Integer.MAX_VALUE : i6;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(379587916, i5, -1, "com.blackhub.bronline.game.ui.widget.anim.LottieLoop (LottieLoop.kt:25)");
                }
                lottieRetrySignalRememberLottieRetrySignal = LottieRetrySignalKt.rememberLottieRetrySignal(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                LottieCompositionSpec.RawRes rawResM14337boximpl = LottieCompositionSpec.RawRes.m14337boximpl(LottieCompositionSpec.RawRes.m14338constructorimpl(i));
                composerStartRestartGroup.startReplaceableGroup(-1093120479);
                zChanged = ((i5 & 112) == 32) | composerStartRestartGroup.changed(lottieRetrySignalRememberLottieRetrySignal);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LottieLoopKt$LottieLoop$composition$1$1(i, lottieRetrySignalRememberLottieRetrySignal, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(rawResM14337boximpl, null, null, null, null, (Function3) objRememberedValue2, composerStartRestartGroup, 262144, 30);
                composerStartRestartGroup.startReplaceableGroup(-1093120249);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new C62261(coroutineScope, lottieCompositionResultRememberLottieComposition, mutableState, null), composerStartRestartGroup, 70);
                if (LottieLoop$lambda$2(mutableState) != null) {
                    composer2 = composerStartRestartGroup;
                } else {
                    composer2 = composerStartRestartGroup;
                    LottieAnimationKt.LottieAnimation(LottieLoop$lambda$2(mutableState), modifier, false, false, null, 0.0f, i9, false, false, true, null, false, false, null, null, null, false, false, null, false, null, composer2, ((i5 << 3) & 112) | 805306376 | ((i5 << 12) & 3670016), 0, 0, 2096572);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i7 = i9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i7 = i6;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.anim.LottieLoopKt.LottieLoop.3
                    public final /* synthetic */ int $$changed;
                    public final /* synthetic */ int $$default;
                    public final /* synthetic */ int $animResId;
                    public final /* synthetic */ int $iterations;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C62273(int i10, int i72, int i32, int i42) {
                        super(2);
                        i = i10;
                        i = i72;
                        i = i32;
                        i = i42;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i10) {
                        LottieLoopKt.LottieLoop(modifier, i, i, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 384;
        i6 = i2;
        if ((i5 & 731) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            lottieRetrySignalRememberLottieRetrySignal = LottieRetrySignalKt.rememberLottieRetrySignal(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            LottieCompositionSpec.RawRes rawResM14337boximpl2 = LottieCompositionSpec.RawRes.m14337boximpl(LottieCompositionSpec.RawRes.m14338constructorimpl(i10));
            composerStartRestartGroup.startReplaceableGroup(-1093120479);
            zChanged = ((i5 & 112) == 32) | composerStartRestartGroup.changed(lottieRetrySignalRememberLottieRetrySignal);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new LottieLoopKt$LottieLoop$composition$1$1(i10, lottieRetrySignalRememberLottieRetrySignal, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceableGroup();
                LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = RememberLottieCompositionKt.rememberLottieComposition(rawResM14337boximpl2, null, null, null, null, (Function3) objRememberedValue2, composerStartRestartGroup, 262144, 30);
                composerStartRestartGroup.startReplaceableGroup(-1093120249);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new C62261(coroutineScope2, lottieCompositionResultRememberLottieComposition2, mutableState, null), composerStartRestartGroup, 70);
                if (LottieLoop$lambda$2(mutableState) != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                i72 = i9;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: LottieLoop.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.anim.LottieLoopKt$LottieLoop$1", m7120f = "LottieLoop.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.widget.anim.LottieLoopKt$LottieLoop$1 */
    /* loaded from: classes8.dex */
    public static final class C62261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ LottieCompositionResult $composition;
        public final /* synthetic */ CoroutineScope $coroutineScope;
        public final /* synthetic */ MutableState<LottieComposition> $lottieComposition$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62261(CoroutineScope coroutineScope, LottieCompositionResult lottieCompositionResult, MutableState<LottieComposition> mutableState, Continuation<? super C62261> continuation) {
            super(2, continuation);
            this.$coroutineScope = coroutineScope;
            this.$composition = lottieCompositionResult;
            this.$lottieComposition$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C62261(this.$coroutineScope, this.$composition, this.$lottieComposition$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C62261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LottieLoop.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.anim.LottieLoopKt$LottieLoop$1$1", m7120f = "LottieLoop.kt", m7121i = {}, m7122l = {43}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.widget.anim.LottieLoopKt$LottieLoop$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ LottieCompositionResult $composition;
            public final /* synthetic */ MutableState<LottieComposition> $lottieComposition$delegate;
            public Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LottieCompositionResult lottieCompositionResult, MutableState<LottieComposition> mutableState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$composition = lottieCompositionResult;
                this.$lottieComposition$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$composition, this.$lottieComposition$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                MutableState<LottieComposition> mutableState;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableState<LottieComposition> mutableState2 = this.$lottieComposition$delegate;
                    LottieCompositionResult lottieCompositionResult = this.$composition;
                    this.L$0 = mutableState2;
                    this.label = 1;
                    Object objAwait = lottieCompositionResult.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                LottieLoopKt.LottieLoop$lambda$3(mutableState, (LottieComposition) obj);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass1(this.$composition, this.$lottieComposition$delegate, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final LottieComposition LottieLoop$lambda$2(MutableState<LottieComposition> mutableState) {
        return mutableState.getValue();
    }

    public static final void LottieLoop$lambda$3(MutableState<LottieComposition> mutableState, LottieComposition lottieComposition) {
        mutableState.setValue(lottieComposition);
    }
}
