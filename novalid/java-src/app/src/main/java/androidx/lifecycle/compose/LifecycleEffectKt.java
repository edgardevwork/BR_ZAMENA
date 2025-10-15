package androidx.lifecycle.compose;

import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LifecycleEffect.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a:\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aD\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001aN\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001aH\u0010\t\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0017\"\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001a6\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000e2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010\u001b\u001a:\u0010\u001c\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aD\u0010\u001c\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001aN\u0010\u001c\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001aH\u0010\u001c\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0017\"\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001a6\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001d2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010 ¨\u0006!²\u0006\u0010\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u008a\u0084\u0002"}, m7105d2 = {"LifecycleEventEffect", "", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onEvent", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LifecycleResumeEffect", "key1", "", "effects", "Lkotlin/Function1;", "Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "keys", "", "([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LifecycleResumeEffectImpl", PomReader.SCOPE, "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LifecycleStartEffect", "Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "LifecycleStartEffectImpl", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lifecycle-runtime-compose_release", "currentOnEvent"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,706:1\n76#2:707\n76#2:708\n76#2:717\n76#2:728\n76#2:738\n76#2:748\n76#2:757\n76#2:768\n76#2:778\n50#3:709\n49#3:710\n67#3,3:718\n66#3:721\n83#3,3:729\n83#3,3:739\n50#3:749\n49#3:750\n67#3,3:758\n66#3:761\n83#3,3:769\n83#3,3:779\n955#4,6:711\n955#4,6:722\n955#4,6:732\n955#4,6:742\n955#4,6:751\n955#4,6:762\n955#4,6:772\n955#4,6:782\n89#5:788\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n57#1:707\n135#1:708\n198#1:717\n263#1:728\n324#1:738\n447#1:748\n510#1:757\n575#1:768\n636#1:778\n138#1:709\n138#1:710\n201#1:718,3\n201#1:721\n266#1:729,3\n327#1:739,3\n450#1:749\n450#1:750\n513#1:758,3\n513#1:761\n578#1:769,3\n639#1:779,3\n138#1:711,6\n201#1:722,6\n266#1:732,6\n327#1:742,6\n450#1:751,6\n513#1:762,6\n578#1:772,6\n639#1:782,6\n67#1:788\n*E\n"})
/* loaded from: classes2.dex */
public final class LifecycleEffectKt {
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LifecycleEventEffect(@NotNull final Lifecycle.Event event, @Nullable LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-709389590);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(event) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 256 : 128;
        }
        if (i4 != 2 || (i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (event != Lifecycle.Event.ON_DESTROY) {
                    throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                }
                EffectsKt.DisposableEffect(lifecycleOwner, new C26631(lifecycleOwner, event, SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i3 >> 6) & 14)), composerStartRestartGroup, 8);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i4 != 0) {
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (event != Lifecycle.Event.ON_DESTROY) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleEventEffect.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    LifecycleEffectKt.LifecycleEventEffect(event, lifecycleOwner2, function0, composer2, i | 1, i2);
                }
            });
        }
    }

    /* compiled from: LifecycleEffect.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,706:1\n62#2,5:707\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1\n*L\n77#1:707,5\n*E\n"})
    /* renamed from: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1 */
    /* loaded from: classes.dex */
    public static final class C26631 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ State<Function0<Unit>> $currentOnEvent$delegate;
        public final /* synthetic */ Lifecycle.Event $event;
        public final /* synthetic */ LifecycleOwner $lifecycleOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26631(LifecycleOwner lifecycleOwner, Lifecycle.Event event, State<? extends Function0<Unit>> state) {
            super(1);
            this.$lifecycleOwner = lifecycleOwner;
            this.$event = event;
            this.$currentOnEvent$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
            final Lifecycle.Event event = this.$event;
            final State<Function0<Unit>> state = this.$currentOnEvent$delegate;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    LifecycleEffectKt.C26631.invoke$lambda$0(event, state, lifecycleOwner, event2);
                }
            };
            this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
            final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                }
            };
        }

        public static final void invoke$lambda$0(Lifecycle.Event event, State state, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
            if (event2 == event) {
                LifecycleEffectKt.LifecycleEventEffect$lambda$0(state).invoke();
            }
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable final Object obj, @Nullable LifecycleOwner lifecycleOwner, @NotNull final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, final int i, final int i2) {
        final LifecycleOwner lifecycleOwner2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1408314671);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        composerStartRestartGroup.startReplaceableGroup(-3686552);
        boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(lifecycleOwner2);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LifecycleStartEffectImpl(lifecycleOwner2, (LifecycleStartStopEffectScope) objRememberedValue, function1, composerStartRestartGroup, (i3 & 896) | 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect.1
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

                public final void invoke(@Nullable Composer composer2, int i4) {
                    LifecycleEffectKt.LifecycleStartEffect(obj, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable final Object obj, @Nullable final Object obj2, @Nullable LifecycleOwner lifecycleOwner, @NotNull final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, final int i, final int i2) {
        final LifecycleOwner lifecycleOwner2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(696924721);
        if ((i2 & 4) != 0) {
            i3 = i & (-897);
            lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        composerStartRestartGroup.startReplaceableGroup(-3686095);
        boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(lifecycleOwner2);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LifecycleStartEffectImpl(lifecycleOwner2, (LifecycleStartStopEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i3 >> 3) & 896) | 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect.2
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

                public final void invoke(@Nullable Composer composer2, int i4) {
                    LifecycleEffectKt.LifecycleStartEffect(obj, obj2, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable LifecycleOwner lifecycleOwner, @NotNull final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, final int i, final int i2) {
        final LifecycleOwner lifecycleOwner2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(574812561);
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        Object[] objArr = {obj, obj2, obj3, lifecycleOwner2};
        composerStartRestartGroup.startReplaceableGroup(-3685570);
        int i4 = 0;
        boolean zChanged = false;
        while (i4 < 4) {
            Object obj4 = objArr[i4];
            i4++;
            zChanged |= composerStartRestartGroup.changed(obj4);
        }
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LifecycleStartEffectImpl(lifecycleOwner2, (LifecycleStartStopEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i3 >> 6) & 896) | 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect.3
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    LifecycleEffectKt.LifecycleStartEffect(obj, obj2, obj3, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@NotNull final Object[] objArr, @Nullable LifecycleOwner lifecycleOwner, @NotNull final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, final int i, final int i2) {
        final LifecycleOwner lifecycleOwner2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1510305724);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(objArr);
        spreadBuilder.add(lifecycleOwner2);
        Object[] array = spreadBuilder.toArray(new Object[spreadBuilder.size()]);
        composerStartRestartGroup.startReplaceableGroup(-3685570);
        int length = array.length;
        int i4 = 0;
        boolean zChanged = false;
        while (i4 < length) {
            Object obj = array[i4];
            i4++;
            zChanged |= composerStartRestartGroup.changed(obj);
        }
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LifecycleStartEffectImpl(lifecycleOwner2, (LifecycleStartStopEffectScope) objRememberedValue, function1, composerStartRestartGroup, (i3 & 896) | 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect.4
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    Object[] objArr2 = objArr;
                    LifecycleEffectKt.LifecycleStartEffect(Arrays.copyOf(objArr2, objArr2.length), lifecycleOwner2, (Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult>) function1, composer2, i | 1, i2);
                }
            });
        }
    }

    @Composable
    public static final void LifecycleStartEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(228371534);
        EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, new C26751(lifecycleOwner, lifecycleStartStopEffectScope, function1), composerStartRestartGroup, 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffectImpl.2
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

                public final void invoke(@Nullable Composer composer2, int i2) {
                    LifecycleEffectKt.LifecycleStartEffectImpl(lifecycleOwner, lifecycleStartStopEffectScope, function1, composer2, i | 1);
                }
            });
        }
    }

    /* compiled from: LifecycleEffect.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,706:1\n62#2,5:707\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleStartEffectImpl$1\n*L\n355#1:707,5\n*E\n"})
    /* renamed from: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1 */
    /* loaded from: classes.dex */
    public static final class C26751 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> $effects;
        public final /* synthetic */ LifecycleOwner $lifecycleOwner;
        public final /* synthetic */ LifecycleStartStopEffectScope $scope;

        /* compiled from: LifecycleEffect.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$WhenMappings */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26751(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1) {
            super(1);
            this.$lifecycleOwner = lifecycleOwner;
            this.$scope = lifecycleStartStopEffectScope;
            this.$effects = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final LifecycleStartStopEffectScope lifecycleStartStopEffectScope = this.$scope;
            final Function1<LifecycleStartStopEffectScope, LifecycleStopOrDisposeEffectResult> function1 = this.$effects;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    LifecycleEffectKt.C26751.invoke$lambda$1(lifecycleStartStopEffectScope, objectRef, function1, lifecycleOwner, event);
                }
            };
            this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
            final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                    LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef.element;
                    if (lifecycleStopOrDisposeEffectResult != null) {
                        lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                    }
                }
            };
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        public static final void invoke$lambda$1(LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Ref.ObjectRef objectRef, Function1 function1, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult;
            int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
            if (i == 1) {
                objectRef.element = function1.invoke(lifecycleStartStopEffectScope);
            } else if (i == 2 && (lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) objectRef.element) != null) {
                lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
            }
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable final Object obj, @Nullable LifecycleOwner lifecycleOwner, @NotNull final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, final int i, final int i2) {
        final LifecycleOwner lifecycleOwner2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1220373486);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        composerStartRestartGroup.startReplaceableGroup(-3686552);
        boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(lifecycleOwner2);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LifecycleResumeEffectImpl(lifecycleOwner2, (LifecycleResumePauseEffectScope) objRememberedValue, function1, composerStartRestartGroup, (i3 & 896) | 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect.1
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

                public final void invoke(@Nullable Composer composer2, int i4) {
                    LifecycleEffectKt.LifecycleResumeEffect(obj, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable final Object obj, @Nullable final Object obj2, @Nullable LifecycleOwner lifecycleOwner, @NotNull final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, final int i, final int i2) {
        final LifecycleOwner lifecycleOwner2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(752680142);
        if ((i2 & 4) != 0) {
            i3 = i & (-897);
            lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        composerStartRestartGroup.startReplaceableGroup(-3686095);
        boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(obj2) | composerStartRestartGroup.changed(lifecycleOwner2);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LifecycleResumeEffectImpl(lifecycleOwner2, (LifecycleResumePauseEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i3 >> 3) & 896) | 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect.2
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

                public final void invoke(@Nullable Composer composer2, int i4) {
                    LifecycleEffectKt.LifecycleResumeEffect(obj, obj2, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable LifecycleOwner lifecycleOwner, @NotNull final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, final int i, final int i2) {
        final LifecycleOwner lifecycleOwner2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-485941842);
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        Object[] objArr = {obj, obj2, obj3, lifecycleOwner2};
        composerStartRestartGroup.startReplaceableGroup(-3685570);
        int i4 = 0;
        boolean zChanged = false;
        while (i4 < 4) {
            Object obj4 = objArr[i4];
            i4++;
            zChanged |= composerStartRestartGroup.changed(obj4);
        }
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LifecycleResumeEffectImpl(lifecycleOwner2, (LifecycleResumePauseEffectScope) objRememberedValue, function1, composerStartRestartGroup, ((i3 >> 6) & 896) | 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect.3
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    LifecycleEffectKt.LifecycleResumeEffect(obj, obj2, obj3, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@NotNull final Object[] objArr, @Nullable LifecycleOwner lifecycleOwner, @NotNull final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, final int i, final int i2) {
        final LifecycleOwner lifecycleOwner2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-781756895);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(objArr);
        spreadBuilder.add(lifecycleOwner2);
        Object[] array = spreadBuilder.toArray(new Object[spreadBuilder.size()]);
        composerStartRestartGroup.startReplaceableGroup(-3685570);
        int length = array.length;
        int i4 = 0;
        boolean zChanged = false;
        while (i4 < length) {
            Object obj = array[i4];
            i4++;
            zChanged |= composerStartRestartGroup.changed(obj);
        }
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LifecycleResumeEffectImpl(lifecycleOwner2, (LifecycleResumePauseEffectScope) objRememberedValue, function1, composerStartRestartGroup, (i3 & 896) | 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect.4
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    Object[] objArr2 = objArr;
                    LifecycleEffectKt.LifecycleResumeEffect(Arrays.copyOf(objArr2, objArr2.length), lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) function1, composer2, i | 1, i2);
                }
            });
        }
    }

    @Composable
    public static final void LifecycleResumeEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(912823238);
        EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, new C26691(lifecycleOwner, lifecycleResumePauseEffectScope, function1), composerStartRestartGroup, 72);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffectImpl.2
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

                public final void invoke(@Nullable Composer composer2, int i2) {
                    LifecycleEffectKt.LifecycleResumeEffectImpl(lifecycleOwner, lifecycleResumePauseEffectScope, function1, composer2, i | 1);
                }
            });
        }
    }

    /* compiled from: LifecycleEffect.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,706:1\n62#2,5:707\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleResumeEffectImpl$1\n*L\n667#1:707,5\n*E\n"})
    /* renamed from: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1 */
    /* loaded from: classes.dex */
    public static final class C26691 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> $effects;
        public final /* synthetic */ LifecycleOwner $lifecycleOwner;
        public final /* synthetic */ LifecycleResumePauseEffectScope $scope;

        /* compiled from: LifecycleEffect.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1$WhenMappings */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26691(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1) {
            super(1);
            this.$lifecycleOwner = lifecycleOwner;
            this.$scope = lifecycleResumePauseEffectScope;
            this.$effects = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = this.$scope;
            final Function1<LifecycleResumePauseEffectScope, LifecyclePauseOrDisposeEffectResult> function1 = this.$effects;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    LifecycleEffectKt.C26691.invoke$lambda$1(lifecycleResumePauseEffectScope, objectRef, function1, lifecycleOwner, event);
                }
            };
            this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
            final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                    LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) objectRef.element;
                    if (lifecyclePauseOrDisposeEffectResult != null) {
                        lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                    }
                }
            };
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        public static final void invoke$lambda$1(LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, Ref.ObjectRef objectRef, Function1 function1, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult;
            int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
            if (i == 1) {
                objectRef.element = function1.invoke(lifecycleResumePauseEffectScope);
            } else if (i == 2 && (lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) objectRef.element) != null) {
                lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
            }
        }
    }

    public static final Function0<Unit> LifecycleEventEffect$lambda$0(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
