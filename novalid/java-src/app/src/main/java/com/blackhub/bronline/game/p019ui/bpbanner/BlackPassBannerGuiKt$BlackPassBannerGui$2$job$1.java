package com.blackhub.bronline.game.p019ui.bpbanner;

import androidx.compose.runtime.MutableFloatState;
import com.blackhub.bronline.game.common.sensormanager.SensorData;
import com.blackhub.bronline.game.common.sensormanager.SensorDataManager;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassBannerGui.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerGui$2$job$1", m7120f = "BlackPassBannerGui.kt", m7121i = {}, m7122l = {131}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class BlackPassBannerGuiKt$BlackPassBannerGui$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ SensorDataManager $dataManager;
    public final /* synthetic */ float $multiplier;
    public final /* synthetic */ MutableFloatState $offX$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassBannerGuiKt$BlackPassBannerGui$2$job$1(SensorDataManager sensorDataManager, float f, MutableFloatState mutableFloatState, Continuation<? super BlackPassBannerGuiKt$BlackPassBannerGui$2$job$1> continuation) {
        super(2, continuation);
        this.$dataManager = sensorDataManager;
        this.$multiplier = f;
        this.$offX$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassBannerGuiKt$BlackPassBannerGui$2$job$1(this.$dataManager, this.$multiplier, this.$offX$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassBannerGuiKt$BlackPassBannerGui$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowReceiveAsFlow = FlowKt.receiveAsFlow(this.$dataManager.getData());
            final float f = this.$multiplier;
            final MutableFloatState mutableFloatState = this.$offX$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerGui$2$job$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((SensorData) obj2, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull SensorData sensorData, @NotNull Continuation<? super Unit> continuation) {
                    if (AnyExtensionKt.isNotNull(sensorData) && !Float.isNaN(sensorData.getHorizontal())) {
                        mutableFloatState.setFloatValue(sensorData.getHorizontal() * f);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowReceiveAsFlow.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
