package com.blackhub.bronline.game.p019ui.widget.block;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.bless.client.R;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickNoAnimStopSpamBlock.kt */
@SourceDebugExtension({"SMAP\nClickNoAnimStopSpamBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickNoAnimStopSpamBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/ClickNoAnimStopSpamBlockKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,114:1\n154#2:115\n1116#3,6:116\n1116#3,6:122\n1116#3,3:133\n1119#3,3:139\n487#4,4:128\n491#4,2:136\n495#4:142\n25#5:132\n456#5,8:159\n464#5,3:173\n467#5,3:177\n487#6:138\n69#7,5:143\n74#7:176\n78#7:181\n79#8,11:148\n92#8:180\n3737#9,6:167\n81#10:182\n107#10,2:183\n*S KotlinDebug\n*F\n+ 1 ClickNoAnimStopSpamBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/ClickNoAnimStopSpamBlockKt\n*L\n46#1:115\n51#1:116,6\n52#1:122,6\n53#1:133,3\n53#1:139,3\n53#1:128,4\n53#1:136,2\n53#1:142\n53#1:132\n57#1:159,8\n57#1:173,3\n57#1:177,3\n53#1:138\n57#1:143,5\n57#1:176\n57#1:181\n57#1:148,11\n57#1:180\n57#1:167,6\n52#1:182\n52#1:183,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ClickNoAnimStopSpamBlockKt {
    public static final float ALPHA_DARK_VALUE = 0.5f;
    public static final float ALPHA_DEFAULT_VALUE = 1.0f;

    /* compiled from: ClickNoAnimStopSpamBlock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$3 */
    /* loaded from: classes7.dex */
    public static final class C62333 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        public final /* synthetic */ boolean $isAlphaActive;
        public final /* synthetic */ boolean $isEnabled;
        public final /* synthetic */ MutableState<Boolean> $isEnabledState;
        public final /* synthetic */ boolean $isGlareVisible;
        public final /* synthetic */ boolean $isNotDarkened;
        public final /* synthetic */ Modifier $modifierInner;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C62333(Modifier modifier, boolean z, MutableState<Boolean> mutableState, boolean z2, boolean z3, boolean z4, Shape shape, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            modifier = modifier;
            z = z;
            mutableState = mutableState;
            z = z2;
            z = z3;
            z = z4;
            shape = shape;
            function0 = function0;
            function2 = function2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock(modifier, modifier, z, mutableState, z, z, z, shape, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: ClickNoAnimStopSpamBlock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$PreviewClickAnimateBlock$3 */
    /* loaded from: classes7.dex */
    public static final class C62363 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62363(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ClickNoAnimStopSpamBlockKt.PreviewClickAnimateBlock(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:401:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ClickNoAnimStopSpamBlock(@Nullable Modifier modifier, @Nullable Modifier modifier2, boolean z, @Nullable MutableState<Boolean> mutableState, boolean z2, boolean z3, boolean z4, @Nullable Shape shape, @NotNull Function0<Unit> onClick, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2) {
        Modifier modifier3;
        int i3;
        final Modifier modifier4;
        boolean z5;
        MutableState<Boolean> mutableStateMutableStateOf$default;
        boolean z6;
        int i4;
        int i5;
        boolean z7;
        final boolean z8;
        final Shape shapeM8392RoundedCornerShape0680j_4;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z9;
        boolean z10;
        Shape shape2;
        boolean z11;
        Modifier modifier5;
        boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1440108007);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier3 = modifier;
        } else if ((i & 14) == 0) {
            modifier3 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier3) ? 4 : 2) | i;
        } else {
            modifier3 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                modifier4 = modifier2;
                int i9 = composerStartRestartGroup.changed(modifier4) ? 32 : 16;
                i3 |= i9;
            } else {
                modifier4 = modifier2;
            }
            i3 |= i9;
        } else {
            modifier4 = modifier2;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                z5 = z;
                i3 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    mutableStateMutableStateOf$default = mutableState;
                    int i11 = composerStartRestartGroup.changed(mutableStateMutableStateOf$default) ? 2048 : 1024;
                    i3 |= i11;
                } else {
                    mutableStateMutableStateOf$default = mutableState;
                }
                i3 |= i11;
            } else {
                mutableStateMutableStateOf$default = mutableState;
            }
            if ((57344 & i) != 0) {
                if ((i2 & 16) == 0) {
                    z6 = z2;
                    int i12 = composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    i3 |= i12;
                } else {
                    z6 = z2;
                }
                i3 |= i12;
            } else {
                z6 = z2;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i & 458752) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
            }
            if ((i & 29360128) == 0) {
                i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(shape)) ? 8388608 : 4194304;
            }
            if ((i2 & 256) != 0) {
                i7 = (234881024 & i) == 0 ? composerStartRestartGroup.changedInstance(onClick) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION : 100663296;
                if ((i2 & 512) == 0) {
                    i6 = (1879048192 & i) == 0 ? composerStartRestartGroup.changedInstance(content) ? 536870912 : 268435456 : 805306368;
                    if ((1533916891 & i3) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            z7 = z3;
                            z8 = z4;
                        } else {
                            if (i8 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            }
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                modifier4 = modifier3;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                z6 = z5;
                            }
                            z7 = i4 == 0 ? false : z3;
                            z8 = i5 == 0 ? false : z4;
                            if ((i2 & 128) == 0) {
                                shapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(C2046Dp.m13666constructorimpl(0));
                                i3 &= -29360129;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1440108007, i3, -1, "com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlock (ClickNoAnimStopSpamBlock.kt:49)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-1103033225);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-1103033159);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            MutableState mutableState2 = (MutableState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(AlphaKt.alpha(modifier3, (z5 || !z7) ? 1.0f : 0.5f), mutableInteractionSource, null, !z5 && ClickNoAnimStopSpamBlock$lambda$2(mutableState2) && mutableStateMutableStateOf$default.getValue().booleanValue(), null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock.1
                                public final /* synthetic */ CoroutineScope $coroutineScope;
                                public final /* synthetic */ MutableState<Boolean> $isEnabledClick$delegate;
                                public final /* synthetic */ MutableState<Boolean> $isEnabledState;
                                public final /* synthetic */ Function0<Unit> $onClick;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C62321(MutableState<Boolean> mutableStateMutableStateOf$default2, Function0<Unit> onClick2, CoroutineScope coroutineScope2, MutableState<Boolean> mutableState22) {
                                    super(0);
                                    mutableState = mutableStateMutableStateOf$default2;
                                    function0 = onClick2;
                                    coroutineScope = coroutineScope2;
                                    mutableState = mutableState22;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke */
                                public final void invoke2() {
                                    if (!ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock$lambda$2(mutableState) || !mutableState.getValue().booleanValue()) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(mutableState, null), 3, null);
                                        return;
                                    }
                                    mutableState.setValue(Boolean.FALSE);
                                    ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock$lambda$3(mutableState, false);
                                    function0.invoke();
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableState, null), 3, null);
                                }

                                /* compiled from: ClickNoAnimStopSpamBlock.kt */
                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$1", m7120f = "ClickNoAnimStopSpamBlock.kt", m7121i = {}, m7122l = {70}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$1 */
                                /* loaded from: classes8.dex */
                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ MutableState<Boolean> $isEnabledClick$delegate;
                                    public final /* synthetic */ MutableState<Boolean> $isEnabledState;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$isEnabledState = mutableState;
                                        this.$isEnabledClick$delegate = mutableState2;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$isEnabledState, this.$isEnabledClick$delegate, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (DelayKt.delay(400L, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        this.$isEnabledState.setValue(Boxing.boxBoolean(true));
                                        ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock$lambda$3(this.$isEnabledClick$delegate, true);
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* compiled from: ClickNoAnimStopSpamBlock.kt */
                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$2", m7120f = "ClickNoAnimStopSpamBlock.kt", m7121i = {}, m7122l = {76}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$2 */
                                /* loaded from: classes8.dex */
                                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ MutableState<Boolean> $isEnabledState;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass2(MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
                                        super(2, continuation);
                                        this.$isEnabledState = mutableState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new AnonymousClass2(this.$isEnabledState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (DelayKt.delay(400L, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        this.$isEnabledState.setValue(Boxing.boxBoolean(true));
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, 24, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            boolean z13 = z7;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
                            Modifier modifier6 = modifier3;
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
                            final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            ComposeExtensionKt.IfFalse(Boolean.valueOf(z6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1574472922, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$2$1
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
                                public final void invoke(@Nullable Composer composer2, int i13) {
                                    if ((i13 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1574472922, i13, -1, "com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlock.<anonymous>.<anonymous> (ClickNoAnimStopSpamBlock.kt:84)");
                                        }
                                        if (z8) {
                                            composer2.startReplaceableGroup(-517301410);
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_button_inactive_2, composer2, 6), (String) null, ClipKt.clip(boxScopeInstance.matchParentSize(modifier4), shapeM8392RoundedCornerShape0680j_4), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                                            composer2.endReplaceableGroup();
                                        } else {
                                            composer2.startReplaceableGroup(-517301037);
                                            BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(boxScopeInstance.matchParentSize(modifier4), ColorResources_androidKt.colorResource(R.color.black_50, composer2, 6), shapeM8392RoundedCornerShape0680j_4), composer2, 0);
                                            composer2.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, ((i3 >> 12) & 14) | 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z9 = z5;
                            z10 = z6;
                            modifier3 = modifier6;
                            shape2 = shapeM8392RoundedCornerShape0680j_4;
                            z11 = z8;
                            modifier5 = modifier4;
                            z12 = z13;
                        }
                        shapeM8392RoundedCornerShape0680j_4 = shape;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1103033225);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1103033159);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        MutableState<Boolean> mutableState22 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (z5) {
                            if (z5) {
                                Modifier modifierM7803clickableO2vRcR0$default2 = ClickableKt.m7803clickableO2vRcR0$default(AlphaKt.alpha(modifier3, (z5 || !z7) ? 1.0f : 0.5f), mutableInteractionSource2, null, !z5 && ClickNoAnimStopSpamBlock$lambda$2(mutableState22) && mutableStateMutableStateOf$default2.getValue().booleanValue(), null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock.1
                                    public final /* synthetic */ CoroutineScope $coroutineScope;
                                    public final /* synthetic */ MutableState<Boolean> $isEnabledClick$delegate;
                                    public final /* synthetic */ MutableState<Boolean> $isEnabledState;
                                    public final /* synthetic */ Function0<Unit> $onClick;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C62321(MutableState<Boolean> mutableStateMutableStateOf$default2, Function0<Unit> onClick2, CoroutineScope coroutineScope22, MutableState<Boolean> mutableState222) {
                                        super(0);
                                        mutableState = mutableStateMutableStateOf$default2;
                                        function0 = onClick2;
                                        coroutineScope = coroutineScope22;
                                        mutableState = mutableState222;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke */
                                    public final void invoke2() {
                                        if (!ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock$lambda$2(mutableState) || !mutableState.getValue().booleanValue()) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(mutableState, null), 3, null);
                                            return;
                                        }
                                        mutableState.setValue(Boolean.FALSE);
                                        ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock$lambda$3(mutableState, false);
                                        function0.invoke();
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableState, null), 3, null);
                                    }

                                    /* compiled from: ClickNoAnimStopSpamBlock.kt */
                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$1", m7120f = "ClickNoAnimStopSpamBlock.kt", m7121i = {}, m7122l = {70}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                    /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$1 */
                                    /* loaded from: classes8.dex */
                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ MutableState<Boolean> $isEnabledClick$delegate;
                                        public final /* synthetic */ MutableState<Boolean> $isEnabledState;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$isEnabledState = mutableState;
                                            this.$isEnabledClick$delegate = mutableState2;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$isEnabledState, this.$isEnabledClick$delegate, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (DelayKt.delay(400L, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            this.$isEnabledState.setValue(Boxing.boxBoolean(true));
                                            ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock$lambda$3(this.$isEnabledClick$delegate, true);
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    /* compiled from: ClickNoAnimStopSpamBlock.kt */
                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$2", m7120f = "ClickNoAnimStopSpamBlock.kt", m7121i = {}, m7122l = {76}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                    /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$2 */
                                    /* loaded from: classes8.dex */
                                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ MutableState<Boolean> $isEnabledState;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass2(MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
                                            super(2, continuation);
                                            this.$isEnabledState = mutableState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new AnonymousClass2(this.$isEnabledState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (DelayKt.delay(400L, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            this.$isEnabledState.setValue(Boxing.boxBoolean(true));
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, 24, null);
                                Alignment center2 = Alignment.INSTANCE.getCenter();
                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                boolean z132 = z7;
                                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default2);
                                Modifier modifier62 = modifier3;
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
                                    final BoxScope boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                    ComposeExtensionKt.IfFalse(Boolean.valueOf(z6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1574472922, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$2$1
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
                                        public final void invoke(@Nullable Composer composer2, int i13) {
                                            if ((i13 & 11) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1574472922, i13, -1, "com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlock.<anonymous>.<anonymous> (ClickNoAnimStopSpamBlock.kt:84)");
                                                }
                                                if (z8) {
                                                    composer2.startReplaceableGroup(-517301410);
                                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_button_inactive_2, composer2, 6), (String) null, ClipKt.clip(boxScopeInstance2.matchParentSize(modifier4), shapeM8392RoundedCornerShape0680j_4), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                                                    composer2.endReplaceableGroup();
                                                } else {
                                                    composer2.startReplaceableGroup(-517301037);
                                                    BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(boxScopeInstance2.matchParentSize(modifier4), ColorResources_androidKt.colorResource(R.color.black_50, composer2, 6), shapeM8392RoundedCornerShape0680j_4), composer2, 0);
                                                    composer2.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), composerStartRestartGroup, ((i3 >> 12) & 14) | 48);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z9 = z5;
                                    z10 = z6;
                                    modifier3 = modifier62;
                                    shape2 = shapeM8392RoundedCornerShape0680j_4;
                                    z11 = z8;
                                    modifier5 = modifier4;
                                    z12 = z132;
                                }
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z11 = z4;
                        modifier5 = modifier4;
                        z9 = z5;
                        z10 = z6;
                        z12 = z3;
                        shape2 = shape;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock.3
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                            public final /* synthetic */ boolean $isAlphaActive;
                            public final /* synthetic */ boolean $isEnabled;
                            public final /* synthetic */ MutableState<Boolean> $isEnabledState;
                            public final /* synthetic */ boolean $isGlareVisible;
                            public final /* synthetic */ boolean $isNotDarkened;
                            public final /* synthetic */ Modifier $modifierInner;
                            public final /* synthetic */ Function0<Unit> $onClick;
                            public final /* synthetic */ Shape $shape;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C62333(Modifier modifier52, boolean z92, MutableState<Boolean> mutableStateMutableStateOf$default2, boolean z102, boolean z122, boolean z112, Shape shape22, Function0<Unit> onClick2, Function2<? super Composer, ? super Integer, Unit> content2, int i13, int i22) {
                                super(2);
                                modifier = modifier52;
                                z = z92;
                                mutableState = mutableStateMutableStateOf$default2;
                                z = z102;
                                z = z122;
                                z = z112;
                                shape = shape22;
                                function0 = onClick2;
                                function2 = content2;
                                i = i13;
                                i = i22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i13) {
                                ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock(modifier, modifier, z, mutableState, z, z, z, shape, function0, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i6;
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i13 & 1) == 0) {
                        if (i8 != 0) {
                        }
                        if ((i22 & 2) != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if ((i22 & 8) != 0) {
                        }
                        if ((i22 & 16) != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i22 & 128) == 0) {
                            shapeM8392RoundedCornerShape0680j_4 = shape;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1103033225);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1103033159);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        MutableState<Boolean> mutableState222 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i3 |= i7;
            if ((i22 & 512) == 0) {
            }
            i3 |= i6;
            if ((1533916891 & i3) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z5 = z;
        if ((i13 & 7168) != 0) {
        }
        if ((57344 & i13) != 0) {
        }
        i4 = i22 & 32;
        if (i4 == 0) {
        }
        i5 = i22 & 64;
        if (i5 == 0) {
        }
        if ((i13 & 29360128) == 0) {
        }
        if ((i22 & 256) != 0) {
        }
        i3 |= i7;
        if ((i22 & 512) == 0) {
        }
        i3 |= i6;
        if ((1533916891 & i3) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void ClickNoAnimStopSpamBlock$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: ClickNoAnimStopSpamBlock.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1 */
    /* loaded from: classes7.dex */
    public static final class C62321 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ CoroutineScope $coroutineScope;
        public final /* synthetic */ MutableState<Boolean> $isEnabledClick$delegate;
        public final /* synthetic */ MutableState<Boolean> $isEnabledState;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62321(MutableState<Boolean> mutableStateMutableStateOf$default2, Function0<Unit> onClick2, CoroutineScope coroutineScope22, MutableState<Boolean> mutableState222) {
            super(0);
            mutableState = mutableStateMutableStateOf$default2;
            function0 = onClick2;
            coroutineScope = coroutineScope22;
            mutableState = mutableState222;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            if (!ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock$lambda$2(mutableState) || !mutableState.getValue().booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(mutableState, null), 3, null);
                return;
            }
            mutableState.setValue(Boolean.FALSE);
            ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock$lambda$3(mutableState, false);
            function0.invoke();
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableState, null), 3, null);
        }

        /* compiled from: ClickNoAnimStopSpamBlock.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$1", m7120f = "ClickNoAnimStopSpamBlock.kt", m7121i = {}, m7122l = {70}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$1 */
        /* loaded from: classes8.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ MutableState<Boolean> $isEnabledClick$delegate;
            public final /* synthetic */ MutableState<Boolean> $isEnabledState;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isEnabledState = mutableState;
                this.$isEnabledClick$delegate = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$isEnabledState, this.$isEnabledClick$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(400L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.$isEnabledState.setValue(Boxing.boxBoolean(true));
                ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock$lambda$3(this.$isEnabledClick$delegate, true);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: ClickNoAnimStopSpamBlock.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$2", m7120f = "ClickNoAnimStopSpamBlock.kt", m7121i = {}, m7122l = {76}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$ClickNoAnimStopSpamBlock$1$2 */
        /* loaded from: classes8.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ MutableState<Boolean> $isEnabledState;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$isEnabledState = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.$isEnabledState, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(400L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.$isEnabledState.setValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: ClickNoAnimStopSpamBlock.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$PreviewClickAnimateBlock$1 */
    /* loaded from: classes7.dex */
    public static final class C62341 extends Lambda implements Function0<Unit> {
        public static final C62341 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ClickNoAnimStopSpamBlock.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt$PreviewClickAnimateBlock$2 */
    /* loaded from: classes7.dex */
    public static final class C62352 extends Lambda implements Function0<Unit> {
        public static final C62352 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ClickAnimateBlock")
    public static final void PreviewClickAnimateBlock(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1505619813);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1505619813, i, -1, "com.blackhub.bronline.game.ui.widget.block.PreviewClickAnimateBlock (ClickNoAnimStopSpamBlock.kt:109)");
            }
            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, C62341.INSTANCE, C62352.INSTANCE, ComposableSingletons$ClickNoAnimStopSpamBlockKt.INSTANCE.m15040getLambda1$app_siteRelease(), composerStartRestartGroup, 0, 3504, DoubleToDecimal.BQ_MASK);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ClickNoAnimStopSpamBlockKt.PreviewClickAnimateBlock.3
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C62363(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    ClickNoAnimStopSpamBlockKt.PreviewClickAnimateBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean ClickNoAnimStopSpamBlock$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

