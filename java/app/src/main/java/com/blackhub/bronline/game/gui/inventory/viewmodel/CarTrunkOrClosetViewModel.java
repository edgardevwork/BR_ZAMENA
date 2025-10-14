package com.blackhub.bronline.game.gui.inventory.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.gui.inventory.InventoryUtilsKt;
import com.blackhub.bronline.game.gui.inventory.MigrateItemsFromAny;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: CarTrunkOrClosetViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CarTrunkOrClosetViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final MigrateItemsFromAny actionWithJSONArray = new MigrateItemsFromAny();

    @NotNull
    public final MutableLiveData<Integer> mutableInvPos;

    @NotNull
    public final MutableLiveData<Integer> mutableMaxOtherWeight;

    @NotNull
    public final MutableLiveData<Integer> mutableMaxPlayersWeight;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableOtherItems;

    @NotNull
    public final MutableLiveData<Integer> mutableOtherPos;

    @NotNull
    public final MutableLiveData<Integer> mutableOtherWeight;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutablePlayerItems;

    @NotNull
    public final MutableLiveData<List<InvItems>> mutableSlotItems;

    @NotNull
    public final MutableLiveData<Integer> mutableSlotPos;

    @NotNull
    public final MutableLiveData<Integer> mutableSlotsInInventory;

    @NotNull
    public final MutableLiveData<Integer> mutableThisPlayersWeight;

    @NotNull
    public final MutableLiveData<Integer> mutableTypeInterface;

    @NotNull
    public final LiveData<Integer> newInvPos;

    @NotNull
    public final LiveData<Integer> newMaxOtherWeight;

    @NotNull
    public final LiveData<Integer> newMaxPlayersWeight;

    @NotNull
    public final LiveData<List<InvItems>> newOtherItems;

    @NotNull
    public final LiveData<Integer> newOtherPos;

    @NotNull
    public final LiveData<Integer> newOtherWeight;

    @NotNull
    public final LiveData<List<InvItems>> newPlayerItems;

    @NotNull
    public final LiveData<List<InvItems>> newSlotItems;

    @NotNull
    public final LiveData<Integer> newSlotPos;

    @NotNull
    public final LiveData<Integer> newThisPlayersWeight;

    @NotNull
    public final LiveData<Integer> newTypeInterface;

    public CarTrunkOrClosetViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.mutableTypeInterface = mutableLiveData;
        this.newTypeInterface = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.mutableThisPlayersWeight = mutableLiveData2;
        this.newThisPlayersWeight = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.mutableMaxPlayersWeight = mutableLiveData3;
        this.newMaxPlayersWeight = mutableLiveData3;
        this.mutableSlotsInInventory = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this.mutableOtherWeight = mutableLiveData4;
        this.newOtherWeight = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>();
        this.mutableMaxOtherWeight = mutableLiveData5;
        this.newMaxOtherWeight = mutableLiveData5;
        MutableLiveData<List<InvItems>> mutableLiveData6 = new MutableLiveData<>();
        this.mutablePlayerItems = mutableLiveData6;
        this.newPlayerItems = mutableLiveData6;
        MutableLiveData<Integer> mutableLiveData7 = new MutableLiveData<>();
        this.mutableInvPos = mutableLiveData7;
        this.newInvPos = mutableLiveData7;
        MutableLiveData<List<InvItems>> mutableLiveData8 = new MutableLiveData<>();
        this.mutableOtherItems = mutableLiveData8;
        this.newOtherItems = mutableLiveData8;
        MutableLiveData<Integer> mutableLiveData9 = new MutableLiveData<>();
        this.mutableOtherPos = mutableLiveData9;
        this.newOtherPos = mutableLiveData9;
        MutableLiveData<List<InvItems>> mutableLiveData10 = new MutableLiveData<>();
        this.mutableSlotItems = mutableLiveData10;
        this.newSlotItems = mutableLiveData10;
        MutableLiveData<Integer> mutableLiveData11 = new MutableLiveData<>();
        this.mutableSlotPos = mutableLiveData11;
        this.newSlotPos = mutableLiveData11;
    }

    @NotNull
    public final LiveData<Integer> getNewTypeInterface() {
        return this.newTypeInterface;
    }

    @NotNull
    public final LiveData<Integer> getNewThisPlayersWeight() {
        return this.newThisPlayersWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewMaxPlayersWeight() {
        return this.newMaxPlayersWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewOtherWeight() {
        return this.newOtherWeight;
    }

    @NotNull
    public final LiveData<Integer> getNewMaxOtherWeight() {
        return this.newMaxOtherWeight;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewPlayerItems() {
        return this.newPlayerItems;
    }

    @NotNull
    public final LiveData<Integer> getNewInvPos() {
        return this.newInvPos;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewOtherItems() {
        return this.newOtherItems;
    }

    @NotNull
    public final LiveData<Integer> getNewOtherPos() {
        return this.newOtherPos;
    }

    @NotNull
    public final LiveData<List<InvItems>> getNewSlotItems() {
        return this.newSlotItems;
    }

    @NotNull
    public final LiveData<Integer> getNewSlotPos() {
        return this.newSlotPos;
    }

    public final void setTypeInterface(int newTypeInterface) {
        this.mutableTypeInterface.postValue(Integer.valueOf(newTypeInterface));
    }

    public final void setThisPlayersWeight(int newPlayersWeight) {
        this.mutableThisPlayersWeight.postValue(Integer.valueOf(newPlayersWeight));
    }

    public final void setMaxPlayersWeight(int newMaxPlayersWeight) {
        this.mutableMaxPlayersWeight.postValue(Integer.valueOf(newMaxPlayersWeight));
    }

    /* compiled from: CarTrunkOrClosetViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$setSlotsInInventory$1", m7120f = "CarTrunkOrClosetViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCarTrunkOrClosetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarTrunkOrClosetViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/CarTrunkOrClosetViewModel$setSlotsInInventory$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$setSlotsInInventory$1 */
    /* loaded from: classes.dex */
    public static final class C41901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $newSlotsInInventory;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41901(int i, Continuation<? super C41901> continuation) {
            super(2, continuation);
            this.$newSlotsInInventory = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CarTrunkOrClosetViewModel.this.new C41901(this.$newSlotsInInventory, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int iIntValue;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Integer num = (Integer) CarTrunkOrClosetViewModel.this.mutableSlotsInInventory.getValue();
                    List list = (List) CarTrunkOrClosetViewModel.this.mutablePlayerItems.getValue();
                    if (num != null) {
                        if (num.intValue() != this.$newSlotsInInventory && list != null) {
                            boolean z = this.$newSlotsInInventory > num.intValue();
                            if (z) {
                                for (int iIntValue2 = Boxing.boxInt(num.intValue() - 1).intValue(); iIntValue2 < this.$newSlotsInInventory; iIntValue2++) {
                                    list.add(InventoryUtilsKt.emptyItem());
                                }
                            } else if (!z && this.$newSlotsInInventory <= (iIntValue = Boxing.boxInt(num.intValue() - 1).intValue())) {
                                while (true) {
                                    list.remove(iIntValue);
                                    if (iIntValue == this.$newSlotsInInventory) {
                                        break;
                                    }
                                    iIntValue--;
                                }
                            }
                            CarTrunkOrClosetViewModel.this.mutableSlotsInInventory.postValue(Boxing.boxInt(this.$newSlotsInInventory));
                            CarTrunkOrClosetViewModel.this.mutablePlayerItems.postValue(list);
                        }
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void setSlotsInInventory(int newSlotsInInventory) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41901(newSlotsInInventory, null), 2, null);
    }

    public final void setOtherWeight(int newOtherWeight) {
        this.mutableOtherWeight.postValue(Integer.valueOf(newOtherWeight));
    }

    public final void setMaxOtherWeight(int newMaxOtherWeight) {
        this.mutableMaxOtherWeight.postValue(Integer.valueOf(newMaxOtherWeight));
    }

    /* compiled from: CarTrunkOrClosetViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$initPlayerItems$1", m7120f = "CarTrunkOrClosetViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$initPlayerItems$1 */
    /* loaded from: classes.dex */
    public static final class C41851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $allItemsFromJSON;
        public final /* synthetic */ JSONArray $playersItemsInInventoryArray;
        public final /* synthetic */ int $sizeInventory;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41851(JSONArray jSONArray, int i, List<InvItems> list, Continuation<? super C41851> continuation) {
            super(2, continuation);
            this.$playersItemsInInventoryArray = jSONArray;
            this.$sizeInventory = i;
            this.$allItemsFromJSON = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CarTrunkOrClosetViewModel.this.new C41851(this.$playersItemsInInventoryArray, this.$sizeInventory, this.$allItemsFromJSON, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                CarTrunkOrClosetViewModel.this.mutablePlayerItems.postValue(CarTrunkOrClosetViewModel.this.actionWithJSONArray.newMigrateDataFromAnyToObject(this.$playersItemsInInventoryArray, this.$sizeInventory, false, this.$allItemsFromJSON));
                CarTrunkOrClosetViewModel.this.mutableSlotsInInventory.postValue(Boxing.boxInt(this.$sizeInventory));
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initPlayerItems(@Nullable JSONArray playersItemsInInventoryArray, @NotNull List<InvItems> allItemsFromJSON, int sizeInventory) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41851(playersItemsInInventoryArray, sizeInventory, allItemsFromJSON, null), 2, null);
    }

    /* compiled from: CarTrunkOrClosetViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$initOtherItems$1", m7120f = "CarTrunkOrClosetViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$initOtherItems$1 */
    /* loaded from: classes.dex */
    public static final class C41841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $allItemsFromJSON;
        public final /* synthetic */ JSONArray $otherItemsArray;
        public final /* synthetic */ int $sizeOtherInv;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41841(JSONArray jSONArray, int i, List<InvItems> list, Continuation<? super C41841> continuation) {
            super(2, continuation);
            this.$otherItemsArray = jSONArray;
            this.$sizeOtherInv = i;
            this.$allItemsFromJSON = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CarTrunkOrClosetViewModel.this.new C41841(this.$otherItemsArray, this.$sizeOtherInv, this.$allItemsFromJSON, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                CarTrunkOrClosetViewModel.this.mutableOtherItems.postValue(CarTrunkOrClosetViewModel.this.actionWithJSONArray.newMigrateDataFromAnyToObject(this.$otherItemsArray, this.$sizeOtherInv, false, this.$allItemsFromJSON));
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initOtherItems(@Nullable JSONArray otherItemsArray, @NotNull List<InvItems> allItemsFromJSON, int sizeOtherInv) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41841(otherItemsArray, sizeOtherInv, allItemsFromJSON, null), 2, null);
    }

    /* compiled from: CarTrunkOrClosetViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$migrateItemFromInvToOther$1", m7120f = "CarTrunkOrClosetViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCarTrunkOrClosetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarTrunkOrClosetViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/CarTrunkOrClosetViewModel$migrateItemFromInvToOther$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$migrateItemFromInvToOther$1 */
    /* loaded from: classes.dex */
    public static final class C41871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $migrateValue;
        public final /* synthetic */ int $posInInv;
        public final /* synthetic */ int $posInOther;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41871(int i, int i2, int i3, Continuation<? super C41871> continuation) {
            super(2, continuation);
            this.$posInOther = i;
            this.$posInInv = i2;
            this.$migrateValue = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CarTrunkOrClosetViewModel.this.new C41871(this.$posInOther, this.$posInInv, this.$migrateValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:5:0x000a, B:8:0x0028, B:10:0x0036, B:12:0x003d, B:14:0x004d, B:20:0x005e, B:21:0x0064, B:23:0x0075, B:25:0x0084, B:24:0x007a, B:17:0x0056, B:26:0x008d, B:28:0x00ab, B:30:0x00b6), top: B:37:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:5:0x000a, B:8:0x0028, B:10:0x0036, B:12:0x003d, B:14:0x004d, B:20:0x005e, B:21:0x0064, B:23:0x0075, B:25:0x0084, B:24:0x007a, B:17:0x0056, B:26:0x008d, B:28:0x00ab, B:30:0x00b6), top: B:37:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:5:0x000a, B:8:0x0028, B:10:0x0036, B:12:0x003d, B:14:0x004d, B:20:0x005e, B:21:0x0064, B:23:0x0075, B:25:0x0084, B:24:0x007a, B:17:0x0056, B:26:0x008d, B:28:0x00ab, B:30:0x00b6), top: B:37:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List list;
            List list2;
            int i;
            InvItems invItems;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    list = (List) CarTrunkOrClosetViewModel.this.mutablePlayerItems.getValue();
                    list2 = (List) CarTrunkOrClosetViewModel.this.mutableOtherItems.getValue();
                    i = this.$posInOther;
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                if (list != null && list2 != null) {
                    InvItems invItemsEmptyItem = (InvItems) list.get(this.$posInInv);
                    if (invItemsEmptyItem.getFold() != 0) {
                        i = i;
                        invItems = null;
                        if (invItems == null) {
                        }
                        InvItems invItemsUpdateItemAfterMigrate = CarTrunkOrClosetViewModel.this.updateItemAfterMigrate(invItemsEmptyItem, invItems, this.$migrateValue);
                        if (invItemsEmptyItem.getItemsValue() - this.$migrateValue != 0) {
                        }
                        list.set(this.$posInInv, invItemsEmptyItem);
                        list2.set(i, invItemsUpdateItemAfterMigrate);
                        i = i;
                    } else {
                        int size = list2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            if (invItemsEmptyItem.getId() == ((InvItems) list2.get(i2)).getId()) {
                                invItems = (InvItems) list2.get(i2);
                                break;
                            }
                            i2++;
                        }
                        i2 = i;
                        invItems = null;
                        if (invItems == null) {
                            invItems = (InvItems) list2.get(i2);
                        }
                        InvItems invItemsUpdateItemAfterMigrate2 = CarTrunkOrClosetViewModel.this.updateItemAfterMigrate(invItemsEmptyItem, invItems, this.$migrateValue);
                        if (invItemsEmptyItem.getItemsValue() - this.$migrateValue != 0) {
                            invItemsEmptyItem = InventoryUtilsKt.emptyItem();
                        } else {
                            invItemsEmptyItem.setItemsValue(invItemsEmptyItem.getItemsValue() - this.$migrateValue);
                        }
                        list.set(this.$posInInv, invItemsEmptyItem);
                        list2.set(i2, invItemsUpdateItemAfterMigrate2);
                        i = i2;
                    }
                    return Unit.INSTANCE;
                }
                CarTrunkOrClosetViewModel.this.mutableOtherPos.postValue(Boxing.boxInt(i));
                CarTrunkOrClosetViewModel.this.mutableInvPos.postValue(Boxing.boxInt(this.$posInInv));
                if (list != null) {
                    CarTrunkOrClosetViewModel.this.mutablePlayerItems.postValue(list);
                }
                if (list2 != null) {
                    CarTrunkOrClosetViewModel.this.mutableOtherItems.postValue(list2);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void migrateItemFromInvToOther(int posInInv, int posInOther, int migrateValue) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41871(posInOther, posInInv, migrateValue, null), 2, null);
    }

    /* compiled from: CarTrunkOrClosetViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1", m7120f = "CarTrunkOrClosetViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCarTrunkOrClosetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarTrunkOrClosetViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$migrateItemFromOtherToInv$1 */
    /* loaded from: classes.dex */
    public static final class C41881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $migrateValue;
        public final /* synthetic */ int $posInInv;
        public final /* synthetic */ int $posInOther;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41881(int i, int i2, int i3, Continuation<? super C41881> continuation) {
            super(2, continuation);
            this.$posInInv = i;
            this.$posInOther = i2;
            this.$migrateValue = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CarTrunkOrClosetViewModel.this.new C41881(this.$posInInv, this.$posInOther, this.$migrateValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:5:0x000a, B:8:0x0028, B:10:0x0036, B:12:0x003d, B:14:0x004d, B:20:0x005e, B:21:0x0064, B:23:0x0075, B:25:0x0084, B:24:0x007a, B:17:0x0056, B:26:0x008d, B:28:0x00ab, B:30:0x00b6), top: B:37:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:5:0x000a, B:8:0x0028, B:10:0x0036, B:12:0x003d, B:14:0x004d, B:20:0x005e, B:21:0x0064, B:23:0x0075, B:25:0x0084, B:24:0x007a, B:17:0x0056, B:26:0x008d, B:28:0x00ab, B:30:0x00b6), top: B:37:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:5:0x000a, B:8:0x0028, B:10:0x0036, B:12:0x003d, B:14:0x004d, B:20:0x005e, B:21:0x0064, B:23:0x0075, B:25:0x0084, B:24:0x007a, B:17:0x0056, B:26:0x008d, B:28:0x00ab, B:30:0x00b6), top: B:37:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List list;
            List list2;
            int i;
            InvItems invItems;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    list = (List) CarTrunkOrClosetViewModel.this.mutableOtherItems.getValue();
                    list2 = (List) CarTrunkOrClosetViewModel.this.mutablePlayerItems.getValue();
                    i = this.$posInInv;
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                if (list != null && list2 != null) {
                    InvItems invItemsEmptyItem = (InvItems) list.get(this.$posInOther);
                    if (invItemsEmptyItem.getFold() != 0) {
                        i = i;
                        invItems = null;
                        if (invItems == null) {
                        }
                        InvItems invItemsUpdateItemAfterMigrate = CarTrunkOrClosetViewModel.this.updateItemAfterMigrate(invItemsEmptyItem, invItems, this.$migrateValue);
                        if (invItemsEmptyItem.getItemsValue() - this.$migrateValue != 0) {
                        }
                        list.set(this.$posInOther, invItemsEmptyItem);
                        list2.set(i, invItemsUpdateItemAfterMigrate);
                        i = i;
                    } else {
                        int size = list2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            if (invItemsEmptyItem.getId() == ((InvItems) list2.get(i2)).getId()) {
                                invItems = (InvItems) list2.get(i2);
                                break;
                            }
                            i2++;
                        }
                        i2 = i;
                        invItems = null;
                        if (invItems == null) {
                            invItems = (InvItems) list2.get(i2);
                        }
                        InvItems invItemsUpdateItemAfterMigrate2 = CarTrunkOrClosetViewModel.this.updateItemAfterMigrate(invItemsEmptyItem, invItems, this.$migrateValue);
                        if (invItemsEmptyItem.getItemsValue() - this.$migrateValue != 0) {
                            invItemsEmptyItem = InventoryUtilsKt.emptyItem();
                        } else {
                            invItemsEmptyItem.setItemsValue(invItemsEmptyItem.getItemsValue() - this.$migrateValue);
                        }
                        list.set(this.$posInOther, invItemsEmptyItem);
                        list2.set(i2, invItemsUpdateItemAfterMigrate2);
                        i = i2;
                    }
                    return Unit.INSTANCE;
                }
                CarTrunkOrClosetViewModel.this.mutableInvPos.postValue(Boxing.boxInt(i));
                CarTrunkOrClosetViewModel.this.mutableOtherPos.postValue(Boxing.boxInt(this.$posInOther));
                if (list2 != null) {
                    CarTrunkOrClosetViewModel.this.mutablePlayerItems.postValue(list2);
                }
                if (list != null) {
                    CarTrunkOrClosetViewModel.this.mutableOtherItems.postValue(list);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void migrateItemFromOtherToInv(int posInOther, int posInInv, int migrateValue) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41881(posInInv, posInOther, migrateValue, null), 2, null);
    }

    public final InvItems updateItemAfterMigrate(InvItems migrateItem, InvItems finalItem, int migrateValue) {
        finalItem.setId(migrateItem.getId());
        finalItem.set_name(migrateItem.get_name());
        finalItem.set_nameStore(migrateItem.get_nameStore());
        finalItem.setDesc(migrateItem.getDesc());
        finalItem.setImageName(migrateItem.getImageName());
        finalItem.setModelid(migrateItem.getModelid());
        finalItem.setWeight(migrateItem.getWeight());
        finalItem.setAddw(migrateItem.getAddw());
        finalItem.setFold(migrateItem.getFold());
        finalItem.setShiftX(migrateItem.getShiftX());
        finalItem.setShiftY(migrateItem.getShiftY());
        finalItem.setShiftZ(migrateItem.getShiftZ());
        finalItem.setX(migrateItem.getX());
        finalItem.setY(migrateItem.getY());
        finalItem.setZ(migrateItem.getZ());
        finalItem.setZoom(migrateItem.getZoom());
        finalItem.setItemsValue(finalItem.getItemsValue() + migrateValue);
        finalItem.setTextIfException(migrateItem.getTextIfException());
        return finalItem;
    }

    /* compiled from: CarTrunkOrClosetViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$initSlotItems$1", m7120f = "CarTrunkOrClosetViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$initSlotItems$1 */
    /* loaded from: classes.dex */
    public static final class C41861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $allItemsFromJSON;
        public final /* synthetic */ JSONArray $itemsInSlotArray;
        public final /* synthetic */ int $simCardNumber;
        public int label;
        public final /* synthetic */ CarTrunkOrClosetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41861(JSONArray jSONArray, CarTrunkOrClosetViewModel carTrunkOrClosetViewModel, List<InvItems> list, int i, Continuation<? super C41861> continuation) {
            super(2, continuation);
            this.$itemsInSlotArray = jSONArray;
            this.this$0 = carTrunkOrClosetViewModel;
            this.$allItemsFromJSON = list;
            this.$simCardNumber = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41861(this.$itemsInSlotArray, this.this$0, this.$allItemsFromJSON, this.$simCardNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            InvItems invItemsInitSimCard;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                JSONArray jSONArray = this.$itemsInSlotArray;
                if (jSONArray != null && jSONArray.length() > 1) {
                    List<InvItems> listNewMigrateDataFromAnyToObject = this.this$0.actionWithJSONArray.newMigrateDataFromAnyToObject(this.$itemsInSlotArray, 8, true, this.$allItemsFromJSON);
                    if (this.$simCardNumber != 0 && (invItemsInitSimCard = this.this$0.actionWithJSONArray.initSimCard(this.$simCardNumber, this.$allItemsFromJSON)) != null) {
                        listNewMigrateDataFromAnyToObject.set(0, invItemsInitSimCard);
                    }
                    this.this$0.mutableSlotItems.postValue(listNewMigrateDataFromAnyToObject);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initSlotItems(@Nullable JSONArray itemsInSlotArray, @NotNull List<InvItems> allItemsFromJSON, int simCardNumber) {
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41861(itemsInSlotArray, this, allItemsFromJSON, simCardNumber, null), 2, null);
    }

    /* compiled from: CarTrunkOrClosetViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$migrateItemFromSlotToInv$1", m7120f = "CarTrunkOrClosetViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCarTrunkOrClosetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarTrunkOrClosetViewModel.kt\ncom/blackhub/bronline/game/gui/inventory/viewmodel/CarTrunkOrClosetViewModel$migrateItemFromSlotToInv$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel$migrateItemFromSlotToInv$1 */
    /* loaded from: classes.dex */
    public static final class C41891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $posInInv;
        public final /* synthetic */ int $posInSlot;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41891(int i, int i2, Continuation<? super C41891> continuation) {
            super(2, continuation);
            this.$posInSlot = i;
            this.$posInInv = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CarTrunkOrClosetViewModel.this.new C41891(this.$posInSlot, this.$posInInv, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    List list = (List) CarTrunkOrClosetViewModel.this.mutableSlotItems.getValue();
                    List list2 = (List) CarTrunkOrClosetViewModel.this.mutablePlayerItems.getValue();
                    if (list != null && list2 != null) {
                        InvItems invItemsUpdateItemAfterMigrate = CarTrunkOrClosetViewModel.this.updateItemAfterMigrate((InvItems) list.get(this.$posInSlot), (InvItems) list2.get(this.$posInInv), 1);
                        list.set(this.$posInSlot, InventoryUtilsKt.emptyItem());
                        list2.set(this.$posInInv, invItemsUpdateItemAfterMigrate);
                    }
                    CarTrunkOrClosetViewModel.this.mutableSlotPos.postValue(Boxing.boxInt(this.$posInSlot));
                    CarTrunkOrClosetViewModel.this.mutableInvPos.postValue(Boxing.boxInt(this.$posInInv));
                    if (list != null) {
                        CarTrunkOrClosetViewModel.this.mutableSlotItems.postValue(list);
                    }
                    if (list2 != null) {
                        CarTrunkOrClosetViewModel.this.mutablePlayerItems.postValue(list2);
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void migrateItemFromSlotToInv(int posInSlot, int posInInv) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C41891(posInSlot, posInInv, null), 2, null);
    }
}

