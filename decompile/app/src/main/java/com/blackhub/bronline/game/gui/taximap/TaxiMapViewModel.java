package com.blackhub.bronline.game.gui.taximap;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiMapViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/taximap/TaxiMapUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/taximap/TaxiMapActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/taximap/TaxiMapActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "handlerCoordinates", "", "widthView", "", "heightView", "coordinateX", "coordinateY", "sendCloseScreen", "sendCoordinates", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class TaxiMapViewModel extends BaseViewModel<TaxiMapUiState> implements ViewModelProvider.Factory {
    public static final float HALF_SIZE = 2.0f;
    public static final float REVERSE_SIZE = -1.0f;
    public static final float TEMP_SIZE = 6000.0f;

    @NotNull
    public final MutableStateFlow<TaxiMapUiState> _uiState;

    @NotNull
    public final TaxiMapActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<TaxiMapUiState> uiState;
    public static final int $stable = 8;

    @Inject
    public TaxiMapViewModel(@NotNull TaxiMapActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new TaxiMapUiState(0.0f, 0.0f, false, false, 15, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<TaxiMapUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TaxiMapUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: TaxiMapViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel$handlerCoordinates$1", m7120f = "TaxiMapViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiMapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiMapViewModel.kt\ncom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel$handlerCoordinates$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,65:1\n230#2,5:66\n*S KotlinDebug\n*F\n+ 1 TaxiMapViewModel.kt\ncom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel$handlerCoordinates$1\n*L\n40#1:66,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel$handlerCoordinates$1 */
    /* loaded from: classes3.dex */
    public static final class C45281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ float $coordinateX;
        public final /* synthetic */ float $coordinateY;
        public final /* synthetic */ float $heightView;
        public final /* synthetic */ float $widthView;
        public int label;
        public final /* synthetic */ TaxiMapViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45281(float f, float f2, float f3, float f4, TaxiMapViewModel taxiMapViewModel, Continuation<? super C45281> continuation) {
            super(2, continuation);
            this.$coordinateX = f;
            this.$coordinateY = f2;
            this.$widthView = f3;
            this.$heightView = f4;
            this.this$0 = taxiMapViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C45281(this.$coordinateX, this.$coordinateY, this.$widthView, this.$heightView, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TaxiMapUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            float f = this.$coordinateX;
            float f2 = this.$coordinateY;
            float f3 = this.$widthView;
            float f4 = this.$heightView;
            float f5 = (f - (f3 / 2.0f)) * (6000.0f / f3);
            float f6 = (f2 - (f4 / 2.0f)) * (6000.0f / f4) * (-1.0f);
            MutableStateFlow<TaxiMapUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, TaxiMapUiState.copy$default(value, f5, f6, true, false, 8, null)));
            return Unit.INSTANCE;
        }
    }

    public final void handlerCoordinates(float widthView, float heightView, float coordinateX, float coordinateY) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C45281(coordinateX, coordinateY, widthView, heightView, this, null), 1, null);
    }

    /* compiled from: TaxiMapViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel$sendCoordinates$1", m7120f = "TaxiMapViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel$sendCoordinates$1 */
    /* loaded from: classes3.dex */
    public static final class C45301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ float $coordinateX;
        public final /* synthetic */ float $coordinateY;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45301(float f, float f2, Continuation<? super C45301> continuation) {
            super(2, continuation);
            this.$coordinateX = f;
            this.$coordinateY = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiMapViewModel.this.new C45301(this.$coordinateX, this.$coordinateY, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TaxiMapViewModel.this.actionWithJSON.sendCoordinates(this.$coordinateX, this.$coordinateY);
                TaxiMapViewModel.this.sendCloseScreen();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCoordinates(float coordinateX, float coordinateY) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45301(coordinateX, coordinateY, null), 1, null);
    }

    /* compiled from: TaxiMapViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel$sendCloseScreen$1", m7120f = "TaxiMapViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiMapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiMapViewModel.kt\ncom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,65:1\n230#2,5:66\n*S KotlinDebug\n*F\n+ 1 TaxiMapViewModel.kt\ncom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel$sendCloseScreen$1\n*L\n60#1:66,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel$sendCloseScreen$1 */
    /* loaded from: classes3.dex */
    public static final class C45291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45291(Continuation<? super C45291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiMapViewModel.this.new C45291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TaxiMapUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TaxiMapViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<TaxiMapUiState> mutableStateFlow = TaxiMapViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, TaxiMapUiState.copy$default(value, 0.0f, 0.0f, false, true, 7, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45291(null), 1, null);
    }
}
