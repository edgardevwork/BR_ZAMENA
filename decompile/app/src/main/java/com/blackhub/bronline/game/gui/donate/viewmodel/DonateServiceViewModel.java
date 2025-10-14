package com.blackhub.bronline.game.gui.donate.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateServiceViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0014\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateServiceViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "mutableServiceItems", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "serviceItems", "Lkotlinx/coroutines/flow/StateFlow;", "getServiceItems", "()Lkotlinx/coroutines/flow/StateFlow;", "checkIfFirstItem", "", "currentSize", "", "currentObject", "initServiceItems", "itemsFromJSON", "updateValueOfSelect", "donateItem", "newValueOfSelect", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DonateServiceViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableServiceItems;

    @NotNull
    public final StateFlow<List<DonateItem>> serviceItems;

    @Inject
    public DonateServiceViewModel() {
        MutableStateFlow<List<DonateItem>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableServiceItems = MutableStateFlow;
        this.serviceItems = MutableStateFlow;
    }

    @NotNull
    public final StateFlow<List<DonateItem>> getServiceItems() {
        return this.serviceItems;
    }

    /* compiled from: DonateServiceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel$initServiceItems$1", m7120f = "DonateServiceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel$initServiceItems$1 */
    /* loaded from: classes3.dex */
    public static final class C39231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<DonateItem> $itemsFromJSON;
        public int label;
        public final /* synthetic */ DonateServiceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39231(List<DonateItem> list, DonateServiceViewModel donateServiceViewModel, Continuation<? super C39231> continuation) {
            super(2, continuation);
            this.$itemsFromJSON = list;
            this.this$0 = donateServiceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C39231(this.$itemsFromJSON, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                ArrayList arrayList = new ArrayList();
                for (DonateItem donateItem : this.$itemsFromJSON) {
                    Integer type = donateItem.getType();
                    if (type != null && type.intValue() == 5) {
                        this.this$0.checkIfFirstItem(arrayList.size(), donateItem);
                        arrayList.add(donateItem);
                    }
                }
                this.this$0.mutableServiceItems.setValue(arrayList);
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initServiceItems(@NotNull List<DonateItem> itemsFromJSON) {
        Intrinsics.checkNotNullParameter(itemsFromJSON, "itemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C39231(itemsFromJSON, this, null), 2, null);
    }

    public final void checkIfFirstItem(int currentSize, DonateItem currentObject) {
        updateValueOfSelect(currentObject, currentSize == 0);
    }

    public final void updateValueOfSelect(DonateItem donateItem, boolean newValueOfSelect) {
        donateItem.setSelected(newValueOfSelect);
    }
}
