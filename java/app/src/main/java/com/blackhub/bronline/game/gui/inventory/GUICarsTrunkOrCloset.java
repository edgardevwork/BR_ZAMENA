package com.blackhub.bronline.game.gui.inventory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.InventoryCarTrunkBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryExchangeAndTrunkAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsInSlotAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.MainButtonsAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvMainButtonsData;
import com.blackhub.bronline.game.gui.inventory.network.CarTrunkOrClosetActionsWithJSON;
import com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModel;
import com.blackhub.bronline.game.gui.inventory.viewmodel.CarTrunkOrClosetViewModelFactory;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUICarsTrunkOrCloset.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUICarsTrunkOrCloset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUICarsTrunkOrCloset.kt\ncom/blackhub/bronline/game/gui/inventory/GUICarsTrunkOrCloset\n+ 2 ArrayMap.kt\nandroidx/collection/ArrayMapKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,845:1\n26#2:846\n172#3,9:847\n*S KotlinDebug\n*F\n+ 1 GUICarsTrunkOrCloset.kt\ncom/blackhub/bronline/game/gui/inventory/GUICarsTrunkOrCloset\n*L\n140#1:846\n146#1:847,9\n*E\n"})

public final class GUICarsTrunkOrCloset extends BaseISAMPGUIFragment<InventoryCarTrunkBinding> {
    public static final int $stable = 8;

    @Nullable
    public CarTrunkOrClosetViewModel carsTrunkOrClosetViewModel;

    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> clickListenerDialogForMigrateItems;
    public int idInInv;
    public int idInOther;
    public int idInSlots;
    public boolean ifClickOtherButtonWithDismiss;
    public boolean ifNeedToResize;

    @Nullable
    public InventoryExchangeAndTrunkAdapter invAdapter;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> invItemClickListener;

    @Nullable
    public InvItems itemFromInv;

    @Nullable
    public InvItems itemFromOther;

    @Nullable
    public InventoryItemsInSlotAdapter itemsInSlotAdapter;

    @Nullable
    public JNIActivity mainActivity;

    @Nullable
    public MainButtonsAdapter mainButtonsAdapter;

    @Nullable
    public Function2<? super InvMainButtonsData, ? super View, Unit> mainButtonsClickListener;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;
    public int migrateCounter;
    public int migrateValueFromInv;
    public int migrateValueFromOther;
    public int migrateValueFromSlots;
    public int modelIdInInv;
    public int modelIdInOther;
    public int modelIdInSlots;

    @Nullable
    public NewDialogForMigrateItems newDialogForMigrateItems;
    public long oldTimeAfterCheck;
    public long oldTimeMigrate;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onItemsInSlotClickListener;

    @Nullable
    public InventoryExchangeAndTrunkAdapter otherAdapter;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> otherItemClickListener;
    public int statusCarOrHome;
    public int positionFromUsersList = -1;
    public int intermediatePositionFromUsersList = -1;
    public int positionFromOtherList = -1;
    public int intermediatePositionFromOtherList = -1;
    public int positionFromSlot = -1;
    public int intermediatePositionFromSlot = -1;
    public int positionIfThereIsFoldZero = -1;
    public boolean firstShowInv = true;
    public boolean firstShowOther = true;
    public boolean firstShowSlot = true;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender = new ArrayMap<>();

    /* renamed from: messageErrorFromRes$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageErrorFromRes = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$messageErrorFromRes$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return JNIActivity.getContext().getString(R.string.inv_trunk_message_error);
        }
    });

    @NotNull
    public List<InvItems> invItemsFromJson = CollectionsKt__CollectionsKt.emptyList();

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 34;
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    public final String getMessageErrorFromRes() {
        return (String) this.messageErrorFromRes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JNIActivityViewModel getMainViewModel() {
        return (JNIActivityViewModel) this.mainViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        int i;
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel;
        int i2;
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel2;
        int i3;
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel3;
        int i4;
        int i5;
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel4;
        if (json != null) {
            int iOptInt = json.optInt("t");
            int iOptInt2 = json.optInt("s");
            if (iOptInt == 0) {
                if (iOptInt2 != 1) {
                    return;
                }
                CarTrunkOrClosetViewModel carTrunkOrClosetViewModel5 = this.carsTrunkOrClosetViewModel;
                if (carTrunkOrClosetViewModel5 != null) {
                    carTrunkOrClosetViewModel5.setThisPlayersWeight(json.optInt("w"));
                    carTrunkOrClosetViewModel5.setOtherWeight(json.optInt(KeyForCarTrunkOrCloset.KEY_BW));
                }
                int i6 = this.intermediatePositionFromOtherList;
                if (i6 == -1 || (i = this.intermediatePositionFromUsersList) == -1 || (carTrunkOrClosetViewModel = this.carsTrunkOrClosetViewModel) == null) {
                    return;
                }
                carTrunkOrClosetViewModel.migrateItemFromInvToOther(i, i6, this.migrateValueFromInv);
                return;
            }
            if (iOptInt == 1) {
                if (iOptInt2 != 1) {
                    return;
                }
                this.ifNeedToResize = true;
                CarTrunkOrClosetViewModel carTrunkOrClosetViewModel6 = this.carsTrunkOrClosetViewModel;
                if (carTrunkOrClosetViewModel6 != null) {
                    carTrunkOrClosetViewModel6.setThisPlayersWeight(json.optInt("w"));
                    carTrunkOrClosetViewModel6.setOtherWeight(json.optInt(KeyForCarTrunkOrCloset.KEY_BW));
                }
                int i7 = this.intermediatePositionFromOtherList;
                if (i7 == -1 || (i2 = this.intermediatePositionFromUsersList) == -1 || (carTrunkOrClosetViewModel2 = this.carsTrunkOrClosetViewModel) == null) {
                    return;
                }
                carTrunkOrClosetViewModel2.migrateItemFromOtherToInv(i7, i2, this.migrateValueFromOther);
                return;
            }
            if (iOptInt != 2) {
                if (iOptInt != 9 || iOptInt2 != 1 || (i4 = this.intermediatePositionFromUsersList) == -1 || (i5 = this.intermediatePositionFromSlot) == -1 || (carTrunkOrClosetViewModel4 = this.carsTrunkOrClosetViewModel) == null) {
                    return;
                }
                carTrunkOrClosetViewModel4.migrateItemFromSlotToInv(i5, i4);
                return;
            }
            if (iOptInt2 != 1) {
                return;
            }
            CarTrunkOrClosetViewModel carTrunkOrClosetViewModel7 = this.carsTrunkOrClosetViewModel;
            if (carTrunkOrClosetViewModel7 != null) {
                carTrunkOrClosetViewModel7.setMaxPlayersWeight(json.optInt("nw"));
                carTrunkOrClosetViewModel7.setSlotsInInventory(json.optInt("ns"));
            }
            int i8 = this.intermediatePositionFromUsersList;
            if (i8 == -1 || (i3 = this.intermediatePositionFromSlot) == -1 || (carTrunkOrClosetViewModel3 = this.carsTrunkOrClosetViewModel) == null) {
                return;
            }
            carTrunkOrClosetViewModel3.migrateItemFromSlotToInv(i3, i8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        this.mainActivity = JNIActivity.getContext();
        initViewModel();
        setObservers((InventoryCarTrunkBinding) getBinding());
        JNILib.toggleDrawing2dStuff(true);
        JNILib.toggleBloor(true);
        initMainButtonsClickListener();
        initDataMainButtons();
        initDialogForMigrateItems();
        initUsersItemClickListener();
        initCarsItemClickListener();
        initSlotClickListener();
        initDataInUsersList();
        initDataInOtherList();
        initDataInSlotsView();
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            initItemsFromJson(jsonObj);
        }
        ((InventoryCarTrunkBinding) getBinding()).carTrunkMainButtonExit.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUICarsTrunkOrCloset.initViewsISAMPGUI$lambda$5(this.f$0, view);
            }
        });
    }

    public static final void initViewsISAMPGUI$lambda$5(GUICarsTrunkOrCloset this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.ifClickOtherButtonWithDismiss = false;
        this$0.closeFragment();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public InventoryCarTrunkBinding getViewBinding() {
        InventoryCarTrunkBinding inventoryCarTrunkBindingInflate = InventoryCarTrunkBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inventoryCarTrunkBindingInflate, "inflate(...)");
        return inventoryCarTrunkBindingInflate;
    }

    /* compiled from: GUICarsTrunkOrCloset.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$initItemsFromJson$1", m7120f = "GUICarsTrunkOrCloset.kt", m7121i = {}, m7122l = {277}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$initItemsFromJson$1 */
    /* loaded from: classes.dex */
    public static final class C41641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41641(JSONObject jSONObject, Continuation<? super C41641> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUICarsTrunkOrCloset.this.new C41641(this.$json, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ConfigurationJsonModel> configurationJsons = GUICarsTrunkOrCloset.this.getMainViewModel().getConfigurationJsons();
                final GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                final JSONObject jSONObject = this.$json;
                FlowCollector<? super ConfigurationJsonModel> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset.initItemsFromJson.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) throws JSONException {
                        List<InvItems> invItemsFromJson = configurationJsonModel.getInvItemsFromJson();
                        if (!invItemsFromJson.isEmpty()) {
                            gUICarsTrunkOrCloset.invItemsFromJson = invItemsFromJson;
                            gUICarsTrunkOrCloset.getStartData(jSONObject);
                        } else {
                            LocalNotification localNotification = new LocalNotification(GUIManager.INSTANCE.getInstance());
                            String string = gUICarsTrunkOrCloset.getString(R.string.common_error_with_json_parsing);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            localNotification.showErrorNotification(string);
                            gUICarsTrunkOrCloset.closeFragment();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (configurationJsons.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void initItemsFromJson(JSONObject json) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C41641(json, null));
    }

    private final void initViewModel() {
        this.carsTrunkOrClosetViewModel = (CarTrunkOrClosetViewModel) new ViewModelProvider(this, new CarTrunkOrClosetViewModelFactory()).get(CarTrunkOrClosetViewModel.class);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setObservers(final InventoryCarTrunkBinding binding) {
        if (binding != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            CarTrunkOrClosetViewModel carTrunkOrClosetViewModel = this.carsTrunkOrClosetViewModel;
            if (carTrunkOrClosetViewModel != null) {
                carTrunkOrClosetViewModel.getNewTypeInterface().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke2(num);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Integer num) {
                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset = this.this$0;
                        Intrinsics.checkNotNull(num);
                        gUICarsTrunkOrCloset.changeViewInterface(num.intValue());
                    }
                }));
                carTrunkOrClosetViewModel.getNewThisPlayersWeight().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke2(num);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Integer num) {
                        binding.carTrunkTitleActualWeightUsers.setText(String.valueOf(num));
                    }
                }));
                carTrunkOrClosetViewModel.getNewMaxPlayersWeight().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke2(num);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Integer num) {
                        binding.carTrunkTitleMaxWeightUsers.setText(String.valueOf(num));
                    }
                }));
                carTrunkOrClosetViewModel.getNewOtherWeight().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke2(num);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Integer num) {
                        binding.carTrunkTitleActualWeight.setText(String.valueOf(num));
                    }
                }));
                carTrunkOrClosetViewModel.getNewMaxOtherWeight().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$5
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke2(num);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Integer num) {
                        binding.carTrunkTitleMaxWeight.setText(String.valueOf(num));
                    }
                }));
                carTrunkOrClosetViewModel.getNewPlayerItems().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
                        invoke2(list);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<InvItems> list) {
                        if (this.this$0.firstShowInv) {
                            this.this$0.firstShowInv = false;
                            InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.invAdapter;
                            if (inventoryExchangeAndTrunkAdapter != null) {
                                Intrinsics.checkNotNull(list);
                                inventoryExchangeAndTrunkAdapter.setItems(list, list.size(), this.this$0.getMainViewModel().getConfigurationJsons().getValue().getVehiclesFromJson(), this.this$0.getMainViewModel().getConfigurationJsons().getValue().getSkinsFromJson());
                            }
                            binding.carTrunkListItemsInInventory.setItemViewCacheSize(list.size());
                            return;
                        }
                        if (this.this$0.ifNeedToResize) {
                            this.this$0.ifNeedToResize = false;
                            InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2 = this.this$0.invAdapter;
                            if (inventoryExchangeAndTrunkAdapter2 != null) {
                                inventoryExchangeAndTrunkAdapter2.notifyDataSetChanged();
                                return;
                            }
                            return;
                        }
                        this.this$0.clearInfoAboutUsersItem();
                    }
                }));
                carTrunkOrClosetViewModel.getNewInvPos().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$7
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke2(num);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Integer num) {
                        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.invAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            Intrinsics.checkNotNull(num);
                            inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                        }
                    }
                }));
                carTrunkOrClosetViewModel.getNewOtherItems().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
                        invoke2(list);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<InvItems> list) {
                        if (this.this$0.firstShowOther) {
                            this.this$0.firstShowOther = false;
                            InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.otherAdapter;
                            if (inventoryExchangeAndTrunkAdapter != null) {
                                Intrinsics.checkNotNull(list);
                                inventoryExchangeAndTrunkAdapter.setItems(list, list.size(), this.this$0.getMainViewModel().getConfigurationJsons().getValue().getVehiclesFromJson(), this.this$0.getMainViewModel().getConfigurationJsons().getValue().getSkinsFromJson());
                            }
                            binding.carTrunkListItemsInCar.setItemViewCacheSize(list.size());
                            return;
                        }
                        this.this$0.clearInfoAboutOtherItem();
                    }
                }));
                carTrunkOrClosetViewModel.getNewOtherPos().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$9
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke2(num);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Integer num) {
                        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.otherAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            Intrinsics.checkNotNull(num);
                            inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                        }
                    }
                }));
                carTrunkOrClosetViewModel.getNewSlotItems().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$10
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<InvItems> list) {
                        invoke2(list);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<InvItems> list) {
                        if (this.this$0.firstShowSlot) {
                            this.this$0.firstShowSlot = false;
                            InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = this.this$0.itemsInSlotAdapter;
                            if (inventoryItemsInSlotAdapter != null) {
                                Intrinsics.checkNotNull(list);
                                inventoryItemsInSlotAdapter.setSlotItems(list, this.this$0.getMainViewModel().getConfigurationJsons().getValue().getSkinsFromJson());
                            }
                        }
                        this.this$0.clearInfoAboutSlot();
                    }
                }));
                carTrunkOrClosetViewModel.getNewSlotPos().observe(viewLifecycleOwner, new GUICarsTrunkOrCloset$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$setObservers$1$1$1$11
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke2(num);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Integer num) {
                        InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = this.this$0.itemsInSlotAdapter;
                        if (inventoryItemsInSlotAdapter != null) {
                            Intrinsics.checkNotNull(num);
                            inventoryItemsInSlotAdapter.notifyItemChanged(num.intValue());
                        }
                    }
                }));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void changeViewInterface(int typeInterface) {
        InventoryCarTrunkBinding inventoryCarTrunkBinding = (InventoryCarTrunkBinding) getBinding();
        JNIActivity jNIActivity = this.mainActivity;
        if (jNIActivity != null) {
            if (typeInterface == 0) {
                inventoryCarTrunkBinding.carTrunkTextNameCar.setText(jNIActivity.getText(R.string.inv_text_car_trunk));
                inventoryCarTrunkBinding.familyBg.setVisibility(8);
                inventoryCarTrunkBinding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(R.color.transparent, null));
                this.statusCarOrHome = 1;
                inventoryCarTrunkBinding.carTrunkMainButtons.setVisibility(0);
                return;
            }
            if (typeInterface == 1) {
                inventoryCarTrunkBinding.carTrunkTextNameCar.setText(jNIActivity.getText(R.string.inv_text_closet));
                inventoryCarTrunkBinding.familyBg.setVisibility(8);
                inventoryCarTrunkBinding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(R.color.transparent, null));
                this.statusCarOrHome = 3;
                inventoryCarTrunkBinding.carTrunkMainButtons.setVisibility(0);
                return;
            }
            if (typeInterface == 2) {
                inventoryCarTrunkBinding.carTrunkTextNameCar.setText(jNIActivity.getText(R.string.common_family_safe));
                inventoryCarTrunkBinding.familyBg.setVisibility(0);
                inventoryCarTrunkBinding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(R.color.black, null));
                inventoryCarTrunkBinding.carTrunkMainButtons.setVisibility(4);
                return;
            }
            if (typeInterface != 3) {
                return;
            }
            inventoryCarTrunkBinding.carTrunkTextNameCar.setText(jNIActivity.getText(R.string.inv_text_ship_trunk));
            inventoryCarTrunkBinding.familyBg.setVisibility(8);
            inventoryCarTrunkBinding.getRoot().setBackgroundColor(jNIActivity.getResources().getColor(R.color.transparent, null));
            this.statusCarOrHome = 1;
            inventoryCarTrunkBinding.carTrunkMainButtons.setVisibility(0);
        }
    }

    public final void initMainButtonsClickListener() {
        this.mainButtonsClickListener = new Function2<InvMainButtonsData, View, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset.initMainButtonsClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvMainButtonsData invMainButtonsData, View view) throws JSONException {
                invoke2(invMainButtonsData, view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull InvMainButtonsData mainButton, @NotNull View view) throws JSONException {
                Intrinsics.checkNotNullParameter(mainButton, "mainButton");
                Intrinsics.checkNotNullParameter(view, "view");
                view.startAnimation(GUICarsTrunkOrCloset.this.getAnim());
                int typeMenu = mainButton.getTypeMenu();
                if (typeMenu == 0) {
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(3);
                    return;
                }
                if (typeMenu == 1) {
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(4);
                    return;
                }
                if (typeMenu == 2) {
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(5);
                    return;
                }
                if (typeMenu == 3) {
                    CarTrunkOrClosetActionsWithJSON.INSTANCE.openRadialMenu();
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(6);
                } else {
                    if (typeMenu != 4) {
                        return;
                    }
                    GUICarsTrunkOrCloset.this.mainButtonsClickListener(7);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initDataMainButtons() {
        this.mainButtonsAdapter = new MainButtonsAdapter(InventoryUtilsKt.getListButtons(), this.mainButtonsClickListener);
        RecyclerView recyclerView = ((InventoryCarTrunkBinding) getBinding()).carTrunkMainButtons;
        recyclerView.setLayoutManager(new LinearLayoutManager(((InventoryCarTrunkBinding) getBinding()).getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.mainButtonsAdapter);
    }

    public final void initDialogForMigrateItems() {
        initLogicForDialogMigrateItems();
        this.newDialogForMigrateItems = new NewDialogForMigrateItems(this.clickListenerDialogForMigrateItems, this.itemRender);
    }

    public final void initLogicForDialogMigrateItems() {
        this.clickListenerDialogForMigrateItems = new Function3<Integer, Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset.initLogicForDialogMigrateItems.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) throws JSONException {
                invoke(num.intValue(), num2.intValue(), num3.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(int migrateValue, int action, int applyAction) throws JSONException {
                if (action != 1) {
                    if (action == 2 && applyAction == 11 && GUICarsTrunkOrCloset.this.positionFromOtherList != -1 && GUICarsTrunkOrCloset.this.positionFromUsersList != -1) {
                        GUICarsTrunkOrCloset.this.migrateValueFromOther = migrateValue;
                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                        gUICarsTrunkOrCloset.intermediatePositionFromUsersList = gUICarsTrunkOrCloset.positionFromUsersList;
                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset2 = GUICarsTrunkOrCloset.this;
                        gUICarsTrunkOrCloset2.intermediatePositionFromOtherList = gUICarsTrunkOrCloset2.positionFromOtherList;
                        CarTrunkOrClosetActionsWithJSON.INSTANCE.sendIdWithOldAndNewPositionsAndValueToServer(1, GUICarsTrunkOrCloset.this.idInOther, GUICarsTrunkOrCloset.this.positionFromOtherList, GUICarsTrunkOrCloset.this.positionFromUsersList, GUICarsTrunkOrCloset.this.migrateValueFromOther);
                    }
                } else if (applyAction == 11 && GUICarsTrunkOrCloset.this.positionFromUsersList != -1 && GUICarsTrunkOrCloset.this.positionFromOtherList != -1) {
                    GUICarsTrunkOrCloset.this.migrateValueFromInv = migrateValue;
                    GUICarsTrunkOrCloset gUICarsTrunkOrCloset3 = GUICarsTrunkOrCloset.this;
                    gUICarsTrunkOrCloset3.intermediatePositionFromUsersList = gUICarsTrunkOrCloset3.positionFromUsersList;
                    GUICarsTrunkOrCloset gUICarsTrunkOrCloset4 = GUICarsTrunkOrCloset.this;
                    gUICarsTrunkOrCloset4.intermediatePositionFromOtherList = gUICarsTrunkOrCloset4.positionFromOtherList;
                    CarTrunkOrClosetActionsWithJSON.INSTANCE.sendIdWithOldAndNewPositionsAndValueToServer(0, GUICarsTrunkOrCloset.this.idInInv, GUICarsTrunkOrCloset.this.positionFromUsersList, GUICarsTrunkOrCloset.this.positionFromOtherList, GUICarsTrunkOrCloset.this.migrateValueFromInv);
                }
                NewDialogForMigrateItems newDialogForMigrateItems = GUICarsTrunkOrCloset.this.newDialogForMigrateItems;
                if (newDialogForMigrateItems != null) {
                    newDialogForMigrateItems.closeDialogForMigrate();
                }
            }
        };
    }

    public final void initUsersItemClickListener() {
        this.invItemClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset.initUsersItemClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) throws JSONException {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) throws JSONException {
                Intrinsics.checkNotNullParameter(item, "item");
                if (GUICarsTrunkOrCloset.this.oldTimeAfterCheck == System.currentTimeMillis() || System.currentTimeMillis() - GUICarsTrunkOrCloset.this.oldTimeAfterCheck <= 500) {
                    return;
                }
                GUICarsTrunkOrCloset.this.oldTimeAfterCheck = System.currentTimeMillis();
                GUICarsTrunkOrCloset.this.positionFromUsersList = position;
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = GUICarsTrunkOrCloset.this.invAdapter;
                if (inventoryExchangeAndTrunkAdapter != null) {
                    inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                }
                GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                gUICarsTrunkOrCloset.migrateValueFromInv = item.getItemsValue();
                gUICarsTrunkOrCloset.idInInv = item.getId();
                gUICarsTrunkOrCloset.modelIdInInv = item.getModelid();
                gUICarsTrunkOrCloset.itemFromInv = item;
                if (item.getItemsValue() == 0) {
                    if (GUICarsTrunkOrCloset.this.positionFromOtherList == -1 || GUICarsTrunkOrCloset.this.migrateValueFromOther == 0) {
                        if (GUICarsTrunkOrCloset.this.positionFromSlot == -1 || GUICarsTrunkOrCloset.this.migrateValueFromSlots == 0) {
                            GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                            return;
                        }
                        int i = GUICarsTrunkOrCloset.this.idInSlots;
                        if (i == 58) {
                            GUICarsTrunkOrCloset.this.intermediatePositionFromUsersList = position;
                            GUICarsTrunkOrCloset gUICarsTrunkOrCloset2 = GUICarsTrunkOrCloset.this;
                            gUICarsTrunkOrCloset2.intermediatePositionFromSlot = gUICarsTrunkOrCloset2.positionFromSlot;
                            CarTrunkOrClosetActionsWithJSON.INSTANCE.sendPositionToServer(9, position);
                            return;
                        }
                        if (i != 134) {
                            int i2 = GUICarsTrunkOrCloset.this.positionFromSlot - 2;
                            GUICarsTrunkOrCloset.this.intermediatePositionFromUsersList = position;
                            GUICarsTrunkOrCloset gUICarsTrunkOrCloset3 = GUICarsTrunkOrCloset.this;
                            gUICarsTrunkOrCloset3.intermediatePositionFromSlot = gUICarsTrunkOrCloset3.positionFromSlot;
                            CarTrunkOrClosetActionsWithJSON.INSTANCE.sendIdWithOldAndNewPositionsToServer(2, GUICarsTrunkOrCloset.this.idInSlots, i2, position);
                            return;
                        }
                        GUICarsTrunkOrCloset.this.intermediatePositionFromUsersList = position;
                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset4 = GUICarsTrunkOrCloset.this;
                        gUICarsTrunkOrCloset4.intermediatePositionFromSlot = gUICarsTrunkOrCloset4.positionFromSlot;
                        CarTrunkOrClosetActionsWithJSON.INSTANCE.sendIdWithOldAndNewPositionsToServer(2, GUICarsTrunkOrCloset.this.idInSlots, 6, position);
                        return;
                    }
                    switch (GUICarsTrunkOrCloset.this.idInOther) {
                        case Constants.ID_TACKLE_1 /* 642 */:
                        case Constants.ID_TACKLE_2 /* 643 */:
                        case Constants.ID_TACKLE_3 /* 644 */:
                        case Constants.ID_TACKLE_4 /* 645 */:
                        case Constants.ID_TACKLE_5 /* 646 */:
                            break;
                        default:
                            if (GUICarsTrunkOrCloset.this.migrateValueFromOther != 1) {
                                NewDialogForMigrateItems newDialogForMigrateItems = GUICarsTrunkOrCloset.this.newDialogForMigrateItems;
                                if (newDialogForMigrateItems != null) {
                                    newDialogForMigrateItems.showDialogForMigrateItem(GUICarsTrunkOrCloset.this.itemFromOther, 2);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                    if (GUICarsTrunkOrCloset.this.oldTimeMigrate == System.currentTimeMillis() || System.currentTimeMillis() - GUICarsTrunkOrCloset.this.oldTimeMigrate <= 1000) {
                        if (GUICarsTrunkOrCloset.this.migrateCounter == 0) {
                            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                            String messageErrorFromRes = GUICarsTrunkOrCloset.this.getMessageErrorFromRes();
                            Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                            carTrunkOrClosetActionsWithJSON.sendMessageError(messageErrorFromRes);
                        }
                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset5 = GUICarsTrunkOrCloset.this;
                        gUICarsTrunkOrCloset5.migrateCounter++;
                        int unused = gUICarsTrunkOrCloset5.migrateCounter;
                        GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                        GUICarsTrunkOrCloset.this.clearInfoAboutSlot();
                        GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                        return;
                    }
                    GUICarsTrunkOrCloset.this.oldTimeMigrate = System.currentTimeMillis();
                    int i3 = GUICarsTrunkOrCloset.this.idInOther == 134 ? GUICarsTrunkOrCloset.this.modelIdInOther : GUICarsTrunkOrCloset.this.migrateValueFromOther;
                    GUICarsTrunkOrCloset gUICarsTrunkOrCloset6 = GUICarsTrunkOrCloset.this;
                    gUICarsTrunkOrCloset6.intermediatePositionFromOtherList = gUICarsTrunkOrCloset6.positionFromOtherList;
                    GUICarsTrunkOrCloset.this.intermediatePositionFromUsersList = position;
                    CarTrunkOrClosetActionsWithJSON.INSTANCE.sendIdWithOldAndNewPositionsAndValueToServer(1, GUICarsTrunkOrCloset.this.idInOther, GUICarsTrunkOrCloset.this.positionFromOtherList, position, i3);
                    GUICarsTrunkOrCloset.this.migrateCounter = 0;
                    return;
                }
                item.setCheck(true);
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2 = GUICarsTrunkOrCloset.this.invAdapter;
                if (inventoryExchangeAndTrunkAdapter2 != null) {
                    inventoryExchangeAndTrunkAdapter2.notifyItemChanged(position);
                    inventoryExchangeAndTrunkAdapter2.setCheckOnlyElement(position);
                }
                GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                GUICarsTrunkOrCloset.this.clearInfoAboutSlot();
            }
        };
    }

    public final void initCarsItemClickListener() {
        this.otherItemClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset.initCarsItemClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) throws JSONException {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) throws JSONException {
                Intrinsics.checkNotNullParameter(item, "item");
                if (GUICarsTrunkOrCloset.this.oldTimeAfterCheck == System.currentTimeMillis() || System.currentTimeMillis() - GUICarsTrunkOrCloset.this.oldTimeAfterCheck <= 500) {
                    return;
                }
                GUICarsTrunkOrCloset.this.oldTimeAfterCheck = System.currentTimeMillis();
                GUICarsTrunkOrCloset.this.positionFromOtherList = position;
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = GUICarsTrunkOrCloset.this.otherAdapter;
                if (inventoryExchangeAndTrunkAdapter != null) {
                    inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                }
                GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                gUICarsTrunkOrCloset.migrateValueFromOther = item.getItemsValue();
                gUICarsTrunkOrCloset.idInOther = item.getId();
                gUICarsTrunkOrCloset.modelIdInOther = item.getModelid();
                gUICarsTrunkOrCloset.itemFromOther = item;
                if (item.getItemsValue() == 0) {
                    if (GUICarsTrunkOrCloset.this.positionFromUsersList == -1 || GUICarsTrunkOrCloset.this.migrateValueFromInv == 0) {
                        GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                        return;
                    }
                    switch (GUICarsTrunkOrCloset.this.idInInv) {
                        case Constants.ID_TACKLE_1 /* 642 */:
                        case Constants.ID_TACKLE_2 /* 643 */:
                        case Constants.ID_TACKLE_3 /* 644 */:
                        case Constants.ID_TACKLE_4 /* 645 */:
                        case Constants.ID_TACKLE_5 /* 646 */:
                            break;
                        default:
                            if (GUICarsTrunkOrCloset.this.migrateValueFromInv != 1) {
                                NewDialogForMigrateItems newDialogForMigrateItems = GUICarsTrunkOrCloset.this.newDialogForMigrateItems;
                                if (newDialogForMigrateItems != null) {
                                    newDialogForMigrateItems.showDialogForMigrateItem(GUICarsTrunkOrCloset.this.itemFromInv, 1);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                    if (GUICarsTrunkOrCloset.this.oldTimeMigrate == System.currentTimeMillis() || System.currentTimeMillis() - GUICarsTrunkOrCloset.this.oldTimeMigrate <= 1000) {
                        if (GUICarsTrunkOrCloset.this.migrateCounter == 0) {
                            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                            String messageErrorFromRes = GUICarsTrunkOrCloset.this.getMessageErrorFromRes();
                            Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                            carTrunkOrClosetActionsWithJSON.sendMessageError(messageErrorFromRes);
                        }
                        GUICarsTrunkOrCloset gUICarsTrunkOrCloset2 = GUICarsTrunkOrCloset.this;
                        gUICarsTrunkOrCloset2.migrateCounter++;
                        int unused = gUICarsTrunkOrCloset2.migrateCounter;
                        GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                        GUICarsTrunkOrCloset.this.clearInfoAboutSlot();
                        GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                        return;
                    }
                    GUICarsTrunkOrCloset.this.oldTimeMigrate = System.currentTimeMillis();
                    int i = GUICarsTrunkOrCloset.this.idInInv == 134 ? GUICarsTrunkOrCloset.this.modelIdInInv : GUICarsTrunkOrCloset.this.migrateValueFromInv;
                    GUICarsTrunkOrCloset gUICarsTrunkOrCloset3 = GUICarsTrunkOrCloset.this;
                    gUICarsTrunkOrCloset3.intermediatePositionFromUsersList = gUICarsTrunkOrCloset3.positionFromUsersList;
                    GUICarsTrunkOrCloset.this.intermediatePositionFromOtherList = position;
                    CarTrunkOrClosetActionsWithJSON.INSTANCE.sendIdWithOldAndNewPositionsAndValueToServer(0, GUICarsTrunkOrCloset.this.idInInv, GUICarsTrunkOrCloset.this.positionFromUsersList, position, i);
                    GUICarsTrunkOrCloset.this.migrateCounter = 0;
                    return;
                }
                item.setCheck(true);
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2 = GUICarsTrunkOrCloset.this.otherAdapter;
                if (inventoryExchangeAndTrunkAdapter2 != null) {
                    inventoryExchangeAndTrunkAdapter2.notifyItemChanged(position);
                    inventoryExchangeAndTrunkAdapter2.setCheckOnlyElement(position);
                }
                GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                GUICarsTrunkOrCloset.this.clearInfoAboutSlot();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initDataInUsersList() {
        this.invAdapter = new InventoryExchangeAndTrunkAdapter(this.invItemClickListener, 0, this.itemRender);
        RecyclerView recyclerView = ((InventoryCarTrunkBinding) getBinding()).carTrunkListItemsInInventory;
        recyclerView.setLayoutManager(new GridLayoutManager(((InventoryCarTrunkBinding) getBinding()).getRoot().getContext(), 4));
        recyclerView.setAdapter(this.invAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initDataInOtherList() {
        this.otherAdapter = new InventoryExchangeAndTrunkAdapter(this.otherItemClickListener, 1, this.itemRender);
        RecyclerView recyclerView = ((InventoryCarTrunkBinding) getBinding()).carTrunkListItemsInCar;
        recyclerView.setLayoutManager(new GridLayoutManager(((InventoryCarTrunkBinding) getBinding()).getRoot().getContext(), 4));
        recyclerView.setAdapter(this.otherAdapter);
    }

    public final void getStartData(JSONObject json) {
        CarTrunkOrClosetViewModel carTrunkOrClosetViewModel = this.carsTrunkOrClosetViewModel;
        if (carTrunkOrClosetViewModel != null) {
            carTrunkOrClosetViewModel.setTypeInterface(json.optInt("tb"));
            carTrunkOrClosetViewModel.setThisPlayersWeight(json.optInt("w"));
            carTrunkOrClosetViewModel.setMaxPlayersWeight(json.optInt("mw"));
            carTrunkOrClosetViewModel.setOtherWeight(json.optInt(KeyForCarTrunkOrCloset.KEY_BW));
            carTrunkOrClosetViewModel.setMaxOtherWeight(json.optInt(KeyForCarTrunkOrCloset.KEY_CW));
            carTrunkOrClosetViewModel.initPlayerItems(json.optJSONArray("it"), this.invItemsFromJson, json.optInt("sl"));
            carTrunkOrClosetViewModel.initOtherItems(json.optJSONArray(KeyForCarTrunkOrCloset.KEY_IC), this.invItemsFromJson, json.optInt("sb"));
            carTrunkOrClosetViewModel.initSlotItems(json.optJSONArray("ai"), this.invItemsFromJson, json.optInt("nm"));
        }
    }

    public final void initSlotClickListener() {
        this.onItemsInSlotClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset.initSlotClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                Intrinsics.checkNotNullParameter(item, "item");
                GUICarsTrunkOrCloset.this.positionFromSlot = position;
                GUICarsTrunkOrCloset.this.clearInfoAboutOtherItem();
                GUICarsTrunkOrCloset.this.clearInfoAboutUsersItem();
                GUICarsTrunkOrCloset gUICarsTrunkOrCloset = GUICarsTrunkOrCloset.this;
                if (item.getItemsValue() != 0) {
                    item.setCheck(true);
                    gUICarsTrunkOrCloset.migrateValueFromSlots = item.getItemsValue();
                    gUICarsTrunkOrCloset.idInSlots = item.getId();
                    gUICarsTrunkOrCloset.modelIdInSlots = item.getModelid();
                    InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = gUICarsTrunkOrCloset.itemsInSlotAdapter;
                    if (inventoryItemsInSlotAdapter != null) {
                        inventoryItemsInSlotAdapter.notifyItemChanged(position);
                        inventoryItemsInSlotAdapter.setCheckOnlyElement(position);
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initDataInSlotsView() {
        this.itemsInSlotAdapter = new InventoryItemsInSlotAdapter(this.onItemsInSlotClickListener, false, this.itemRender);
        RecyclerView recyclerView = ((InventoryCarTrunkBinding) getBinding()).playersSlotsInCarTrunk;
        recyclerView.setLayoutManager(new LinearLayoutManager(((InventoryCarTrunkBinding) getBinding()).getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.itemsInSlotAdapter);
    }

    public final void clearInfoAboutOtherItem() {
        this.migrateValueFromOther = 0;
        this.idInOther = 0;
        this.positionFromOtherList = -1;
        this.modelIdInOther = 0;
        this.intermediatePositionFromOtherList = -1;
        this.itemFromOther = null;
        this.positionIfThereIsFoldZero = -1;
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.otherAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearInfoAboutSlot() {
        this.idInSlots = 0;
        this.migrateValueFromSlots = 0;
        this.modelIdInSlots = 0;
        this.positionFromSlot = -1;
        this.intermediatePositionFromSlot = -1;
        InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = this.itemsInSlotAdapter;
        if (inventoryItemsInSlotAdapter != null) {
            inventoryItemsInSlotAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void clearInfoAboutUsersItem() {
        this.migrateValueFromInv = 0;
        this.idInInv = 0;
        this.positionFromUsersList = -1;
        this.modelIdInInv = 0;
        this.intermediatePositionFromUsersList = -1;
        this.itemFromInv = null;
        this.positionIfThereIsFoldZero = -1;
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.invAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void mainButtonsClickListener(int typeButton) throws JSONException {
        this.ifClickOtherButtonWithDismiss = true;
        CarTrunkOrClosetActionsWithJSON.INSTANCE.sendPressButton(typeButton);
        closeFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() throws JSONException {
        super.onDestroy();
        JNILib.toggleDrawing2dStuff(false);
        JNILib.toggleBloor(false);
        if (!this.ifClickOtherButtonWithDismiss) {
            CarTrunkOrClosetActionsWithJSON.INSTANCE.sendPressButton(8);
        }
        NewDialogForMigrateItems newDialogForMigrateItems = this.newDialogForMigrateItems;
        if (newDialogForMigrateItems != null) {
            newDialogForMigrateItems.closeDialogForMigrate();
        }
        setNullableParameters();
    }

    private final void setNullableParameters() {
        this.mainActivity = null;
        this.mainButtonsAdapter = null;
        this.otherAdapter = null;
        this.invAdapter = null;
        this.invItemClickListener = null;
        this.otherItemClickListener = null;
        this.itemsInSlotAdapter = null;
        this.onItemsInSlotClickListener = null;
    }

    public GUICarsTrunkOrCloset() {
        final Function0 function0 = null;
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(fragmentActivityRequireActivity).get(JNIActivityViewModel.class);
            }
        });
    }
}

