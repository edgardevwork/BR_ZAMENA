package androidx.compose.runtime.livedata;

import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LiveDataAdapter.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a5\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0002*\u0002H\u0005*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0006\u001a\u0002H\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m7105d2 = {"observeAsState", "Landroidx/compose/runtime/State;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "(Landroidx/lifecycle/LiveData;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "R", "initial", "(Landroidx/lifecycle/LiveData;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime-livedata_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLiveDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,71:1\n74#2:72\n25#3:73\n1116#4,6:74\n*S KotlinDebug\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n*L\n59#1:72\n60#1:73\n60#1:74,6\n*E\n"})
/* loaded from: classes2.dex */
public final class LiveDataAdapterKt {
    @Composable
    @NotNull
    public static final <T> State<T> observeAsState(@NotNull LiveData<T> liveData, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2027206144);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2027206144, i, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:40)");
        }
        State<T> stateObserveAsState = observeAsState(liveData, liveData.getValue(), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateObserveAsState;
    }

    @Composable
    @NotNull
    public static final <R, T extends R> State<R> observeAsState(@NotNull LiveData<T> liveData, R r, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(411178300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(411178300, i, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:57)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (liveData.isInitialized()) {
                r = liveData.getValue();
            }
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.DisposableEffect(liveData, lifecycleOwner, new C18151(liveData, lifecycleOwner, mutableState), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    /* compiled from: LiveDataAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "R", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nLiveDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt$observeAsState$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,71:1\n64#2,5:72\n*S KotlinDebug\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt$observeAsState$1\n*L\n67#1:72,5\n*E\n"})
    /* renamed from: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1 */
    public static final class C18151 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ LifecycleOwner $lifecycleOwner;
        public final /* synthetic */ MutableState<R> $state;
        public final /* synthetic */ LiveData<T> $this_observeAsState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18151(LiveData<T> liveData, LifecycleOwner lifecycleOwner, MutableState<R> mutableState) {
            super(1);
            this.$this_observeAsState = liveData;
            this.$lifecycleOwner = lifecycleOwner;
            this.$state = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
            final MutableState<R> mutableState = this.$state;
            final Observer observer = new Observer() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    mutableState.setValue(obj);
                }
            };
            this.$this_observeAsState.observe(this.$lifecycleOwner, observer);
            final LiveData<T> liveData = this.$this_observeAsState;
            return new DisposableEffectResult() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    liveData.removeObserver(observer);
                }
            };
        }
    }
}
