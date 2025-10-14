package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.media3.extractor.p007ts.H263Reader;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReportDrawn.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a.\u0010\u0003\u001a\u00020\u00012\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m7105d2 = {"ReportDrawn", "", "(Landroidx/compose/runtime/Composer;I)V", "ReportDrawnAfter", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReportDrawnWhen", "predicate", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "activity-compose_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ReportDrawnKt {
    @Composable
    public static final void ReportDrawnWhen(@NotNull final Function0<Boolean> function0, @Nullable Composer composer, final int i) {
        int i2;
        final FullyDrawnReporter fullyDrawnReporter;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i3) {
                        ReportDrawnKt.ReportDrawnWhen(function0, composer2, i | 1);
                    }
                });
                return;
            }
            EffectsKt.DisposableEffect(fullyDrawnReporter, function0, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnWhen.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    if (!fullyDrawnReporter.isFullyDrawnReported()) {
                        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(fullyDrawnReporter, function0);
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$invoke$$inlined$onDispose$2
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                reportDrawnComposition.removeReporter();
                            }
                        };
                    }
                    return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, composerStartRestartGroup, ((i2 << 3) & 112) | 8);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnWhen.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                ReportDrawnKt.ReportDrawnWhen(function0, composer2, i | 1);
            }
        });
    }

    @Composable
    public static final void ReportDrawn(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357012904);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            ReportDrawnWhen(new Function0<Boolean>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawn.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            }, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawn.2
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
                ReportDrawnKt.ReportDrawn(composer2, i | 1);
            }
        });
    }

    @Composable
    public static final void ReportDrawnAfter(@NotNull final Function1<? super Continuation<? super Unit>, ? extends Object> function1, @Nullable Composer composer, final int i) {
        FullyDrawnReporter fullyDrawnReporter;
        Composer composerStartRestartGroup = composer.startRestartGroup(945311272);
        FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1
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
                    ReportDrawnKt.ReportDrawnAfter(function1, composer2, i | 1);
                }
            });
            return;
        }
        EffectsKt.LaunchedEffect(function1, fullyDrawnReporter, new C00791(fullyDrawnReporter, function1, null), composerStartRestartGroup, 584);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnAfter.2
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
                ReportDrawnKt.ReportDrawnAfter(function1, composer2, i | 1);
            }
        });
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", m7120f = "ReportDrawn.kt", m7121i = {0}, m7122l = {H263Reader.START_CODE_VALUE_VOP}, m7123m = "invokeSuspend", m7124n = {"$this$reportWhenComplete$iv"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,176:1\n180#2,10:177\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n*L\n173#1:177,10\n*E\n"})
    /* renamed from: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1 */
    public static final class C00791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
        public final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00791(FullyDrawnReporter fullyDrawnReporter, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C00791> continuation) {
            super(2, continuation);
            this.$fullyDrawnReporter = fullyDrawnReporter;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C00791(this.$fullyDrawnReporter, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C00791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FullyDrawnReporter fullyDrawnReporter;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
                Function1<Continuation<? super Unit>, Object> function1 = this.$block;
                fullyDrawnReporter2.addReporter();
                if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                    try {
                        this.L$0 = fullyDrawnReporter2;
                        this.label = 1;
                        if (function1.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        fullyDrawnReporter = fullyDrawnReporter2;
                        fullyDrawnReporter.removeReporter();
                    } catch (Throwable th2) {
                        fullyDrawnReporter = fullyDrawnReporter2;
                        th = th2;
                        fullyDrawnReporter.removeReporter();
                        throw th;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    fullyDrawnReporter.removeReporter();
                } catch (Throwable th3) {
                    th = th3;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
