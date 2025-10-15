package com.blackhub.bronline.game.gui.drivingschool.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingMainType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrivingSchoolClassInfoViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0005R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolClassInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "driverLicenseType", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingMainType;", "getDriverLicenseType", "()Lkotlinx/coroutines/flow/StateFlow;", "isApplyStartTest", "Lkotlinx/coroutines/flow/SharedFlow;", "", "()Lkotlinx/coroutines/flow/SharedFlow;", "mutableDriverLicenseType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableIsApplyStartTest", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "checkStartTest", "", "status", "clearInfoAboutCategory", "saveCategory", EclipseUpdateSiteParser.CategoryHandler.CATEGORY, "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DrivingSchoolClassInfoViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final StateFlow<DrivingMainType> driverLicenseType;

    @NotNull
    public final SharedFlow<Boolean> isApplyStartTest;

    @NotNull
    public final MutableStateFlow<DrivingMainType> mutableDriverLicenseType;

    @NotNull
    public final MutableSharedFlow<Boolean> mutableIsApplyStartTest;

    @Inject
    public DrivingSchoolClassInfoViewModel() {
        MutableStateFlow<DrivingMainType> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.mutableDriverLicenseType = MutableStateFlow;
        this.driverLicenseType = MutableStateFlow;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableIsApplyStartTest = mutableSharedFlowMutableSharedFlow$default;
        this.isApplyStartTest = mutableSharedFlowMutableSharedFlow$default;
    }

    @NotNull
    public final StateFlow<DrivingMainType> getDriverLicenseType() {
        return this.driverLicenseType;
    }

    @NotNull
    public final SharedFlow<Boolean> isApplyStartTest() {
        return this.isApplyStartTest;
    }

    public final void saveCategory(@NotNull DrivingMainType category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.mutableDriverLicenseType.setValue(category);
    }

    /* compiled from: DrivingSchoolClassInfoViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel$checkStartTest$1", m7120f = "DrivingSchoolClassInfoViewModel.kt", m7121i = {}, m7122l = {27}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel$checkStartTest$1 */
    /* loaded from: classes3.dex */
    public static final class C39521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $status;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39521(boolean z, Continuation<? super C39521> continuation) {
            super(2, continuation);
            this.$status = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DrivingSchoolClassInfoViewModel.this.new C39521(this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = DrivingSchoolClassInfoViewModel.this.mutableIsApplyStartTest;
                Boolean boolBoxBoolean = Boxing.boxBoolean(this.$status);
                this.label = 1;
                if (mutableSharedFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

    public final void checkStartTest(boolean status) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39521(status, null), 3, null);
    }

    public final void clearInfoAboutCategory() {
        this.mutableDriverLicenseType.setValue(null);
    }
}
