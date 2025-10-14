package com.blackhub.bronline.game.gui.inventory;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.InventoryLayoutExchangeWithUserBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryExchangeAndTrunkAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsInSlotAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvMessageObj;
import com.blackhub.bronline.game.gui.inventory.data.InvSizeAndItemsObj;
import com.blackhub.bronline.game.gui.inventory.network.CarTrunkOrClosetActionsWithJSON;
import com.blackhub.bronline.game.gui.inventory.network.InvActionWithJSON;
import com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UILayoutExchange.kt */
@StabilityInferred(parameters = 0)
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes2.dex */
public final class UILayoutExchange extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public InventoryLayoutExchangeWithUserBinding binding;
    public boolean blockStatus;

    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> clickListenerDialogForMigrateItems;

    @Nullable
    public UIChat dialogChat;

    @Nullable
    public NewDialogForMigrateItems dialogForMigrateItem;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> emptyClickListener;
    public int exchangeStatus;
    public int exchangeYourMoney;
    public int idFromExchange;
    public int idFromInv;
    public int idFromSlot;
    public boolean ifFirstShow;
    public boolean ifFirstShowOrClearMyExchangeItems;
    public boolean ifFirstShowOrClearOtherExchangeItems;
    public int initInvSize;
    public int intermediatePositionFromSlot;
    public int intermediatePositionWithExchangeItem;
    public int intermediatePositionWithItem;

    @Nullable
    public final InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
    public boolean isFirstShowInv;
    public boolean isFirstShowSlot;

    @Nullable
    public InvItems itemInExchange;

    @Nullable
    public InvItems itemInInv;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender;

    @Nullable
    public InventoryItemsInSlotAdapter itemsInSlotAdapter;

    @NotNull
    public final GUIUsersInventory mainRoot;

    /* renamed from: messageCantExchangeMoreMoney$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageCantExchangeMoreMoney;

    /* renamed from: messageCantTakeOffClothes$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageCantTakeOffClothes;

    /* renamed from: messageChangeField$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageChangeField;

    /* renamed from: messageErrorFromRes$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageErrorFromRes;

    /* renamed from: messageNotEnoughMoney$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageNotEnoughMoney;
    public int modelIdFromExchange;
    public int modelIdFromInv;
    public int modelIdFromSlot;

    @NotNull
    public List<Integer> myInitInvItemsPos;
    public long oldTimeAfterCheck;
    public long oldTimeWithMigrate;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onItemsInSlotClickListener;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onYourExchangeItemsClickListener;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onYourItemsClickListener;

    @Nullable
    public InventoryExchangeAndTrunkAdapter otherPlayersItemsAndTrunkAdapter;
    public int positionFromSlot;
    public int positionWithExchangeItem;
    public int positionWithItem;
    public int saveExchangeYourMoney;

    @NotNull
    public List<Integer> savedPosInInv;
    public int sendCounter;
    public boolean setInitState;
    public int simCardNumberFromExchange;
    public int simCardNumberFromInv;
    public int startThisWeight;
    public int statusViewExchange;

    @Nullable
    public String textIsFromOtherPlayer;

    @Nullable
    public String textIsFromYou;
    public int valueFromExchange;
    public int valueFromInv;
    public int valueFromSlot;
    public int yourAllMoney;

    @Nullable
    public InventoryExchangeAndTrunkAdapter yourExchangeItemsAndTrunkAdapter;

    @Nullable
    public InventoryExchangeAndTrunkAdapter yourItemsAndTrunkAdapter;

    public UILayoutExchange(@NotNull GUIUsersInventory mainRoot, @Nullable InventoryAndExchangeViewModel inventoryAndExchangeViewModel, @NotNull ArrayMap<String, Bitmap> itemRender) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        Intrinsics.checkNotNullParameter(itemRender, "itemRender");
        this.mainRoot = mainRoot;
        this.inventoryAndExchangeViewModel = inventoryAndExchangeViewModel;
        this.itemRender = itemRender;
        this.positionWithItem = -1;
        this.intermediatePositionWithItem = -1;
        this.positionWithExchangeItem = -1;
        this.intermediatePositionWithExchangeItem = -1;
        this.positionFromSlot = -1;
        this.intermediatePositionFromSlot = -1;
        this.myInitInvItemsPos = new ArrayList();
        this.savedPosInInv = new ArrayList();
        this.textIsFromOtherPlayer = "";
        this.textIsFromYou = "";
        this.ifFirstShow = true;
        this.isFirstShowSlot = true;
        this.isFirstShowInv = true;
        this.ifFirstShowOrClearMyExchangeItems = true;
        this.ifFirstShowOrClearOtherExchangeItems = true;
        this.messageErrorFromRes = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageErrorFromRes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.this$0.getContext().getString(R.string.inv_trunk_message_error);
            }
        });
        this.messageChangeField = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageChangeField$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.this$0.getContext().getString(R.string.inv_text_change_field);
            }
        });
        this.messageCantTakeOffClothes = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageCantTakeOffClothes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.this$0.getContext().getString(R.string.inv_text_take_off_clothes);
            }
        });
        this.messageCantExchangeMoreMoney = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageCantExchangeMoreMoney$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.this$0.getContext().getString(R.string.inv_text_cant_exchange_more_money);
            }
        });
        this.messageNotEnoughMoney = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$messageNotEnoughMoney$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.this$0.getContext().getString(R.string.inv_text_not_enough_money);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMessageErrorFromRes() {
        return (String) this.messageErrorFromRes.getValue();
    }

    public final String getMessageChangeField() {
        return (String) this.messageChangeField.getValue();
    }

    public final String getMessageCantTakeOffClothes() {
        return (String) this.messageCantTakeOffClothes.getValue();
    }

    public final String getMessageCantExchangeMoreMoney() {
        return (String) this.messageCantExchangeMoreMoney.getValue();
    }

    public final String getMessageNotEnoughMoney() {
        return (String) this.messageNotEnoughMoney.getValue();
    }

    public final void changeStatusWhoseItem(List<InvItems> myList) {
        for (InvItems invItems : myList) {
            if (invItems.getItemsValue() != 0) {
                invItems.setWhoseItem(0);
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    /* renamed from: getView */
    public View getMViewRoot() {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            return inventoryLayoutExchangeWithUserBinding.getRoot();
        }
        return null;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.binding = InventoryLayoutExchangeWithUserBinding.inflate(inflater);
        initDialogForMigrateItems();
        initYourItemsClickListener();
        initYourExchangeItemsClickListener();
        initForEmptyClickListener();
        initSlotClickListener();
        initDataYourItemsInView();
        initDataExchangeItemsInView();
        initDataInSlotsView();
        setOtherPlayersMoney(0);
        setMyMoney(0);
        final InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            inventoryLayoutExchangeWithUserBinding.exchangeBgValuesForBag.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UILayoutExchange.onCreateView$lambda$5$lambda$0(this.f$0, view);
                }
            });
            inventoryLayoutExchangeWithUserBinding.exchangeButtonCancel.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UILayoutExchange.onCreateView$lambda$5$lambda$1(view);
                }
            });
            inventoryLayoutExchangeWithUserBinding.exchangeButtonApply.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    UILayoutExchange.onCreateView$lambda$5$lambda$2(this.f$0, view);
                }
            });
            CustomEditText customEditText = inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney;
            customEditText.setGUIManager(GUIManager.INSTANCE.getInstance());
            customEditText.setMainRoot(this.mainRoot);
            inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$onCreateView$1$5
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable p0) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) throws NumberFormatException {
                    String strValueOf = String.valueOf(p0);
                    UILayoutExchange uILayoutExchange = this.this$0;
                    int i = 0;
                    if (strValueOf.length() > 0 && strValueOf.charAt(0) != '0') {
                        i = Integer.parseInt(strValueOf);
                    }
                    uILayoutExchange.exchangeYourMoney = i;
                    if (this.this$0.exchangeYourMoney != 0) {
                        inventoryLayoutExchangeWithUserBinding.exchangeTextMoney.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(this.this$0.exchangeYourMoney)));
                    } else {
                        inventoryLayoutExchangeWithUserBinding.exchangeTextMoney.setText("");
                    }
                }
            });
            inventoryLayoutExchangeWithUserBinding.exchangeBgButtonChat.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UILayoutExchange.onCreateView$lambda$5$lambda$4(this.f$0, view);
                }
            });
        }
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding2 = this.binding;
        if (inventoryLayoutExchangeWithUserBinding2 != null) {
            return inventoryLayoutExchangeWithUserBinding2.getRoot();
        }
        return null;
    }

    public static final void onCreateView$lambda$5$lambda$0(UILayoutExchange this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.statusViewExchange == 0 ? 1 : 0;
        this$0.statusViewExchange = i;
        this$0.setViewExchangeList(i);
    }

    public static final void onCreateView$lambda$5$lambda$1(View view) {
        InvActionWithJSON.INSTANCE.sendPressButton(7);
    }

    public static final void onCreateView$lambda$5$lambda$2(UILayoutExchange this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.exchangeYourMoney;
        if (i > 20000000) {
            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
            String messageCantExchangeMoreMoney = this$0.getMessageCantExchangeMoreMoney();
            Intrinsics.checkNotNullExpressionValue(messageCantExchangeMoreMoney, "<get-messageCantExchangeMoreMoney>(...)");
            carTrunkOrClosetActionsWithJSON.sendMessageError(messageCantExchangeMoreMoney);
            return;
        }
        if (this$0.yourAllMoney < i) {
            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON2 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
            String messageNotEnoughMoney = this$0.getMessageNotEnoughMoney();
            Intrinsics.checkNotNullExpressionValue(messageNotEnoughMoney, "<get-messageNotEnoughMoney>(...)");
            carTrunkOrClosetActionsWithJSON2.sendMessageError(messageNotEnoughMoney);
            return;
        }
        int i2 = this$0.exchangeStatus;
        if (i2 == 0) {
            InvActionWithJSON.INSTANCE.sendPressButton(8);
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this$0.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel != null) {
                inventoryAndExchangeViewModel.setBlockStatus(true);
                return;
            }
            return;
        }
        if (i2 != 2) {
            return;
        }
        InvActionWithJSON.INSTANCE.sendPressButton(9);
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel2 = this$0.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel2 != null) {
            inventoryAndExchangeViewModel2.setBlockStatus(true);
        }
    }

    public static final void onCreateView$lambda$5$lambda$4(UILayoutExchange this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showChat();
        this$0.mainRoot.closeAndroidInterface();
        this$0.mainRoot.setCounter(0);
        this$0.updateCountWithNewMessages(this$0.mainRoot.getCounter());
    }

    private final void initDialogForMigrateItems() {
        initLogicForDialogMigrateItems();
        this.dialogForMigrateItem = new NewDialogForMigrateItems(this.clickListenerDialogForMigrateItems, this.itemRender);
    }

    private final void initLogicForDialogMigrateItems() {
        this.clickListenerDialogForMigrateItems = new Function3<Integer, Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange.initLogicForDialogMigrateItems.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) throws JSONException {
                invoke(num.intValue(), num2.intValue(), num3.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(int migrateValue, int action, int applyAction) throws JSONException {
                if (action != 4) {
                    if (action == 5 && applyAction == 11 && UILayoutExchange.this.positionWithExchangeItem != -1) {
                        UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                        uILayoutExchange.intermediatePositionWithExchangeItem = uILayoutExchange.positionWithExchangeItem;
                        UILayoutExchange.this.valueFromExchange = migrateValue;
                        InvActionWithJSON.INSTANCE.sendIdWithCountToServer(24, UILayoutExchange.this.idFromExchange, UILayoutExchange.this.valueFromExchange, ((Number) UILayoutExchange.this.savedPosInInv.get(UILayoutExchange.this.positionWithExchangeItem)).intValue());
                    }
                } else if (applyAction == 11 && UILayoutExchange.this.positionWithItem != -1) {
                    UILayoutExchange uILayoutExchange2 = UILayoutExchange.this;
                    uILayoutExchange2.intermediatePositionWithItem = uILayoutExchange2.positionWithItem;
                    UILayoutExchange.this.valueFromInv = migrateValue;
                    InvActionWithJSON.INSTANCE.sendIdWithCountAndSlotToServer(5, UILayoutExchange.this.idFromInv, UILayoutExchange.this.valueFromInv, UILayoutExchange.this.positionWithItem);
                }
                NewDialogForMigrateItems newDialogForMigrateItems = UILayoutExchange.this.dialogForMigrateItem;
                if (newDialogForMigrateItems != null) {
                    newDialogForMigrateItems.closeDialogForMigrate();
                }
            }
        };
    }

    public final void initYourItemsClickListener() {
        this.onYourItemsClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange.initYourItemsClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) throws JSONException {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) throws JSONException {
                Intrinsics.checkNotNullParameter(item, "item");
                if (UILayoutExchange.this.blockStatus || UILayoutExchange.this.oldTimeAfterCheck == System.currentTimeMillis() || System.currentTimeMillis() - UILayoutExchange.this.oldTimeAfterCheck <= 500) {
                    return;
                }
                UILayoutExchange.this.oldTimeAfterCheck = System.currentTimeMillis();
                UILayoutExchange.this.positionWithItem = position;
                if (item.getItemsValue() != 0) {
                    UILayoutExchange.this.clearInfoAboutSlot();
                    UILayoutExchange.this.clearInfoAboutExchange();
                    UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                    item.setCheck(true);
                    uILayoutExchange.idFromInv = item.getId();
                    uILayoutExchange.modelIdFromInv = item.getModelid();
                    uILayoutExchange.valueFromInv = item.getItemsValue();
                    if (!Intrinsics.areEqual(item.getTextIfException(), "") && item.getId() == 58) {
                        uILayoutExchange.simCardNumberFromInv = Integer.parseInt(item.getTextIfException());
                    }
                    uILayoutExchange.itemInInv = item;
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        inventoryExchangeAndTrunkAdapter.notifyItemChanged(position);
                        inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                        return;
                    }
                    return;
                }
                if (UILayoutExchange.this.positionWithExchangeItem == -1 || UILayoutExchange.this.valueFromExchange == 0) {
                    if (UILayoutExchange.this.positionFromSlot != -1 && UILayoutExchange.this.valueFromSlot != 0) {
                        if (((Number) UILayoutExchange.this.myInitInvItemsPos.get(UILayoutExchange.this.positionWithItem)).intValue() != 0 || UILayoutExchange.this.positionFromSlot == 0) {
                            return;
                        }
                        if (UILayoutExchange.this.positionFromSlot == 1) {
                            CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                            String messageCantTakeOffClothes = UILayoutExchange.this.getMessageCantTakeOffClothes();
                            Intrinsics.checkNotNullExpressionValue(messageCantTakeOffClothes, "access$getMessageCantTakeOffClothes(...)");
                            carTrunkOrClosetActionsWithJSON.sendMessageError(messageCantTakeOffClothes);
                            return;
                        }
                        UILayoutExchange uILayoutExchange2 = UILayoutExchange.this;
                        uILayoutExchange2.intermediatePositionFromSlot = uILayoutExchange2.positionFromSlot;
                        UILayoutExchange.this.intermediatePositionWithItem = position;
                        InvActionWithJSON.INSTANCE.sendIdWithOldAndNewPositionsToServer(27, UILayoutExchange.this.idFromSlot, UILayoutExchange.this.positionFromSlot - 2, position);
                        return;
                    }
                    UILayoutExchange.this.clearInfoAboutInv();
                    return;
                }
                switch (UILayoutExchange.this.idFromExchange) {
                    case Constants.ID_TACKLE_1 /* 642 */:
                    case Constants.ID_TACKLE_2 /* 643 */:
                    case Constants.ID_TACKLE_3 /* 644 */:
                    case Constants.ID_TACKLE_4 /* 645 */:
                    case Constants.ID_TACKLE_5 /* 646 */:
                        break;
                    default:
                        if (UILayoutExchange.this.valueFromExchange != 1) {
                            NewDialogForMigrateItems newDialogForMigrateItems = UILayoutExchange.this.dialogForMigrateItem;
                            if (newDialogForMigrateItems != null) {
                                newDialogForMigrateItems.showDialogForMigrateItem(UILayoutExchange.this.itemInExchange, 5);
                                return;
                            }
                            return;
                        }
                        break;
                }
                if (UILayoutExchange.this.oldTimeWithMigrate == System.currentTimeMillis() || System.currentTimeMillis() - UILayoutExchange.this.oldTimeWithMigrate <= 1000) {
                    if (UILayoutExchange.this.sendCounter == 0) {
                        CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON2 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                        String messageErrorFromRes = UILayoutExchange.this.getMessageErrorFromRes();
                        Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                        carTrunkOrClosetActionsWithJSON2.sendMessageError(messageErrorFromRes);
                    }
                    UILayoutExchange uILayoutExchange3 = UILayoutExchange.this;
                    uILayoutExchange3.sendCounter++;
                    int unused = uILayoutExchange3.sendCounter;
                    return;
                }
                UILayoutExchange.this.oldTimeWithMigrate = System.currentTimeMillis();
                int i = UILayoutExchange.this.idFromExchange;
                int i2 = i != 58 ? i != 134 ? UILayoutExchange.this.valueFromExchange : UILayoutExchange.this.modelIdFromExchange : UILayoutExchange.this.simCardNumberFromExchange;
                UILayoutExchange uILayoutExchange4 = UILayoutExchange.this;
                uILayoutExchange4.intermediatePositionWithExchangeItem = uILayoutExchange4.positionWithExchangeItem;
                InvActionWithJSON.INSTANCE.sendIdWithCountToServer(24, UILayoutExchange.this.idFromExchange, i2, ((Number) UILayoutExchange.this.savedPosInInv.get(UILayoutExchange.this.positionWithExchangeItem)).intValue());
                UILayoutExchange.this.sendCounter = 0;
            }
        };
    }

    public final void initYourExchangeItemsClickListener() {
        this.onYourExchangeItemsClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange.initYourExchangeItemsClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) throws JSONException {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) throws JSONException {
                Intrinsics.checkNotNullParameter(item, "item");
                if (UILayoutExchange.this.blockStatus || UILayoutExchange.this.oldTimeAfterCheck == System.currentTimeMillis() || System.currentTimeMillis() - UILayoutExchange.this.oldTimeAfterCheck <= 500) {
                    return;
                }
                UILayoutExchange.this.oldTimeAfterCheck = System.currentTimeMillis();
                UILayoutExchange.this.positionWithExchangeItem = position;
                if (item.getItemsValue() == 0) {
                    if (UILayoutExchange.this.positionWithItem != -1 && UILayoutExchange.this.valueFromInv != 0) {
                        switch (UILayoutExchange.this.idFromInv) {
                            case Constants.ID_TACKLE_1 /* 642 */:
                            case Constants.ID_TACKLE_2 /* 643 */:
                            case Constants.ID_TACKLE_3 /* 644 */:
                            case Constants.ID_TACKLE_4 /* 645 */:
                            case Constants.ID_TACKLE_5 /* 646 */:
                                break;
                            default:
                                if (UILayoutExchange.this.valueFromInv != 1) {
                                    NewDialogForMigrateItems newDialogForMigrateItems = UILayoutExchange.this.dialogForMigrateItem;
                                    if (newDialogForMigrateItems != null) {
                                        newDialogForMigrateItems.showDialogForMigrateItem(UILayoutExchange.this.itemInInv, 4);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                        if (UILayoutExchange.this.oldTimeWithMigrate == System.currentTimeMillis() || System.currentTimeMillis() - UILayoutExchange.this.oldTimeWithMigrate <= 1000) {
                            if (UILayoutExchange.this.sendCounter == 0) {
                                CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                String messageErrorFromRes = UILayoutExchange.this.getMessageErrorFromRes();
                                Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                                carTrunkOrClosetActionsWithJSON.sendMessageError(messageErrorFromRes);
                            }
                            UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                            uILayoutExchange.sendCounter++;
                            int unused = uILayoutExchange.sendCounter;
                            UILayoutExchange.this.clearInfoAboutSlot();
                            UILayoutExchange.this.clearInfoAboutExchange();
                            UILayoutExchange.this.clearInfoAboutInv();
                            return;
                        }
                        UILayoutExchange.this.oldTimeWithMigrate = System.currentTimeMillis();
                        int i = UILayoutExchange.this.idFromInv;
                        int i2 = i != 58 ? i != 134 ? UILayoutExchange.this.valueFromInv : UILayoutExchange.this.modelIdFromInv : UILayoutExchange.this.simCardNumberFromInv;
                        UILayoutExchange uILayoutExchange2 = UILayoutExchange.this;
                        uILayoutExchange2.intermediatePositionWithItem = uILayoutExchange2.positionWithItem;
                        InvActionWithJSON.INSTANCE.sendIdWithCountAndSlotToServer(5, UILayoutExchange.this.idFromInv, i2, UILayoutExchange.this.positionWithItem);
                        UILayoutExchange.this.sendCounter = 0;
                        return;
                    }
                    UILayoutExchange.this.clearInfoAboutExchange();
                    return;
                }
                UILayoutExchange.this.clearInfoAboutInv();
                UILayoutExchange.this.clearInfoAboutSlot();
                UILayoutExchange uILayoutExchange3 = UILayoutExchange.this;
                item.setCheck(true);
                uILayoutExchange3.idFromExchange = item.getId();
                uILayoutExchange3.modelIdFromExchange = item.getModelid();
                uILayoutExchange3.valueFromExchange = item.getItemsValue();
                if (!Intrinsics.areEqual(item.getTextIfException(), "") && item.getId() == 58) {
                    uILayoutExchange3.simCardNumberFromExchange = Integer.parseInt(item.getTextIfException());
                }
                uILayoutExchange3.itemInExchange = item;
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.yourExchangeItemsAndTrunkAdapter;
                if (inventoryExchangeAndTrunkAdapter != null) {
                    inventoryExchangeAndTrunkAdapter.notifyItemChanged(position);
                    inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                }
            }
        };
    }

    public final void initForEmptyClickListener() {
        this.emptyClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange.initForEmptyClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) throws JSONException {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) throws JSONException {
                Intrinsics.checkNotNullParameter(item, "item");
                InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = UILayoutExchange.this.otherPlayersItemsAndTrunkAdapter;
                if (inventoryExchangeAndTrunkAdapter != null) {
                    inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(position);
                }
                if (UILayoutExchange.this.positionWithItem == -1 || UILayoutExchange.this.valueFromInv == 0) {
                    return;
                }
                CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                String messageChangeField = UILayoutExchange.this.getMessageChangeField();
                Intrinsics.checkNotNullExpressionValue(messageChangeField, "access$getMessageChangeField(...)");
                carTrunkOrClosetActionsWithJSON.sendMessageError(messageChangeField);
            }
        };
    }

    private final void initSlotClickListener() {
        this.onItemsInSlotClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange.initSlotClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (UILayoutExchange.this.exchangeStatus == 0) {
                    UILayoutExchange.this.positionFromSlot = position;
                    UILayoutExchange.this.clearInfoAboutInv();
                    UILayoutExchange.this.clearInfoAboutExchange();
                    if (item.getItemsValue() != 0) {
                        UILayoutExchange uILayoutExchange = UILayoutExchange.this;
                        item.setCheck(true);
                        uILayoutExchange.idFromSlot = item.getId();
                        uILayoutExchange.modelIdFromSlot = item.getModelid();
                        uILayoutExchange.valueFromSlot = item.getItemsValue();
                        InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = UILayoutExchange.this.itemsInSlotAdapter;
                        if (inventoryItemsInSlotAdapter != null) {
                            inventoryItemsInSlotAdapter.notifyItemChanged(position);
                            inventoryItemsInSlotAdapter.setCheckOnlyElement(position);
                        }
                    }
                }
            }
        };
    }

    public final void initDataYourItemsInView() {
        this.yourItemsAndTrunkAdapter = new InventoryExchangeAndTrunkAdapter(this.onYourItemsClickListener, 0, this.itemRender);
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            RecyclerView recyclerView = inventoryLayoutExchangeWithUserBinding.exchangeListItemsInInventory;
            recyclerView.setLayoutManager(new GridLayoutManager(inventoryLayoutExchangeWithUserBinding.getRoot().getContext(), 4));
            recyclerView.setAdapter(this.yourItemsAndTrunkAdapter);
        }
    }

    public final void initDataExchangeItemsInView() {
        this.yourExchangeItemsAndTrunkAdapter = new InventoryExchangeAndTrunkAdapter(this.onYourExchangeItemsClickListener, 1, this.itemRender);
        this.otherPlayersItemsAndTrunkAdapter = new InventoryExchangeAndTrunkAdapter(this.emptyClickListener, 2, this.itemRender);
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            RecyclerView recyclerView = inventoryLayoutExchangeWithUserBinding.exchangeListItemsInCar;
            recyclerView.setLayoutManager(new GridLayoutManager(inventoryLayoutExchangeWithUserBinding.getRoot().getContext(), 4));
            recyclerView.setAdapter(this.yourExchangeItemsAndTrunkAdapter);
        }
    }

    private final void initDataInSlotsView() {
        this.itemsInSlotAdapter = new InventoryItemsInSlotAdapter(this.onItemsInSlotClickListener, false, this.itemRender);
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            RecyclerView recyclerView = inventoryLayoutExchangeWithUserBinding.playersSlotsInExchange;
            recyclerView.setLayoutManager(new LinearLayoutManager(inventoryLayoutExchangeWithUserBinding.getRoot().getContext(), 1, false));
            recyclerView.setAdapter(this.itemsInSlotAdapter);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        clearInfoAboutExchange();
        clearInfoAboutInv();
        clearInfoAboutSlot();
        setDefaultParams();
        setObservers();
        changeButtonAndHelpInfo(false);
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = this.mainRoot.getViewLifecycleOwner();
        final InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.getNewOtherPlayersNick().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable String str) {
                    this.this$0.setPlayersNick(str);
                    this.this$0.statusViewExchange = 0;
                    UILayoutExchange uILayoutExchange = this.this$0;
                    uILayoutExchange.setViewExchangeList(uILayoutExchange.statusViewExchange);
                    this.this$0.mainRoot.setCounter(0);
                    this.this$0.mainRoot.updateCountWithNewMessages(this.this$0.mainRoot.getCounter());
                    this.this$0.dialogChat = new UIChat(this.this$0.mainRoot, str, this.this$0.inventoryAndExchangeViewModel);
                }
            }));
            inventoryAndExchangeViewModel.getNewCurrentWeight().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$2
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
                    UILayoutExchange uILayoutExchange = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutExchange.setThisWeightInventory(num.intValue());
                    if (this.this$0.ifFirstShow) {
                        this.this$0.ifFirstShow = false;
                        this.this$0.startThisWeight = num.intValue();
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewMaxWeight().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$3
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
                    UILayoutExchange uILayoutExchange = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutExchange.setMaxWeightInventory(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewMyMoney().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$4
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
                    UILayoutExchange uILayoutExchange = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutExchange.setMyMoney(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewSlotItems().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$5
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
                    if (this.this$0.isFirstShowSlot) {
                        this.this$0.isFirstShowSlot = false;
                        InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = this.this$0.itemsInSlotAdapter;
                        if (inventoryItemsInSlotAdapter != null) {
                            Intrinsics.checkNotNull(list);
                            List<SkinsDTO> value = inventoryAndExchangeViewModel.getSkinItems().getValue();
                            if (value == null) {
                                value = CollectionsKt__CollectionsKt.emptyList();
                            }
                            inventoryItemsInSlotAdapter.setSlotItems(list, value);
                        }
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewMediatorInvItemsAndSize().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<InvSizeAndItemsObj, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InvSizeAndItemsObj invSizeAndItemsObj) {
                    invoke2(invSizeAndItemsObj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InvSizeAndItemsObj invSizeAndItemsObj) {
                    RecyclerView recyclerView;
                    if (!this.this$0.isFirstShowInv || invSizeAndItemsObj.getItemsList() == null || invSizeAndItemsObj.getSizeActiveSlots() == null) {
                        return;
                    }
                    this.this$0.isFirstShowInv = false;
                    UILayoutExchange uILayoutExchange = this.this$0;
                    List<InvItems> itemsList = invSizeAndItemsObj.getItemsList();
                    Intrinsics.checkNotNull(itemsList);
                    uILayoutExchange.changeStatusWhoseItem(itemsList);
                    UILayoutExchange uILayoutExchange2 = this.this$0;
                    Integer sizeActiveSlots = invSizeAndItemsObj.getSizeActiveSlots();
                    Intrinsics.checkNotNull(sizeActiveSlots);
                    uILayoutExchange2.initInvSize = sizeActiveSlots.intValue() + 1;
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.yourItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        List<InvItems> itemsList2 = invSizeAndItemsObj.getItemsList();
                        Intrinsics.checkNotNull(itemsList2);
                        int i = this.this$0.initInvSize;
                        List<VehiclesDTO> value = inventoryAndExchangeViewModel.getVehicleItems().getValue();
                        if (value == null) {
                            value = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List<SkinsDTO> value2 = inventoryAndExchangeViewModel.getSkinItems().getValue();
                        if (value2 == null) {
                            value2 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        inventoryExchangeAndTrunkAdapter.setItems(itemsList2, i, value, value2);
                    }
                    InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.this$0.binding;
                    if (inventoryLayoutExchangeWithUserBinding != null && (recyclerView = inventoryLayoutExchangeWithUserBinding.exchangeListItemsInInventory) != null) {
                        List<InvItems> itemsList3 = invSizeAndItemsObj.getItemsList();
                        Intrinsics.checkNotNull(itemsList3);
                        recyclerView.setItemViewCacheSize(itemsList3.size());
                    }
                    inventoryAndExchangeViewModel.initMyExchangeItems(this.this$0.initInvSize);
                    inventoryAndExchangeViewModel.initOtherExchangeItems(this.this$0.initInvSize);
                    InventoryAndExchangeViewModel inventoryAndExchangeViewModel2 = inventoryAndExchangeViewModel;
                    List<InvItems> itemsList4 = invSizeAndItemsObj.getItemsList();
                    Intrinsics.checkNotNull(itemsList4);
                    inventoryAndExchangeViewModel2.initSavedPos(itemsList4);
                }
            }));
            inventoryAndExchangeViewModel.getNewMyExchangeItems().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$7
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
                    if (this.this$0.ifFirstShowOrClearMyExchangeItems) {
                        this.this$0.ifFirstShowOrClearMyExchangeItems = false;
                        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.yourExchangeItemsAndTrunkAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            Intrinsics.checkNotNull(list);
                            int i = this.this$0.initInvSize;
                            List<VehiclesDTO> value = inventoryAndExchangeViewModel.getVehicleItems().getValue();
                            if (value == null) {
                                value = CollectionsKt__CollectionsKt.emptyList();
                            }
                            List<SkinsDTO> value2 = inventoryAndExchangeViewModel.getSkinItems().getValue();
                            if (value2 == null) {
                                value2 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            inventoryExchangeAndTrunkAdapter.setItems(list, i, value, value2);
                            return;
                        }
                        return;
                    }
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2 = this.this$0.yourExchangeItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter2 != null) {
                        Intrinsics.checkNotNull(list);
                        inventoryExchangeAndTrunkAdapter2.updateItems(list);
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewOtherExchangeItems().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$8
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
                    if (this.this$0.ifFirstShowOrClearOtherExchangeItems) {
                        this.this$0.ifFirstShowOrClearOtherExchangeItems = false;
                        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.otherPlayersItemsAndTrunkAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            Intrinsics.checkNotNull(list);
                            int i = this.this$0.initInvSize;
                            List<VehiclesDTO> value = inventoryAndExchangeViewModel.getVehicleItems().getValue();
                            if (value == null) {
                                value = CollectionsKt__CollectionsKt.emptyList();
                            }
                            List<SkinsDTO> value2 = inventoryAndExchangeViewModel.getSkinItems().getValue();
                            if (value2 == null) {
                                value2 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            inventoryExchangeAndTrunkAdapter.setItems(list, i, value, value2);
                            return;
                        }
                        return;
                    }
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2 = this.this$0.otherPlayersItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter2 != null) {
                        Intrinsics.checkNotNull(list);
                        inventoryExchangeAndTrunkAdapter2.updateItems(list);
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewOtherMoney().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$9
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke2(num);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Integer num) {
                    this.this$0.setOtherPlayersMoney(num);
                }
            }));
            inventoryAndExchangeViewModel.getNewOtherExchangeItemPos().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$10
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
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.otherPlayersItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewNewMessage().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<InvMessageObj, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$11
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InvMessageObj invMessageObj) {
                    invoke2(invMessageObj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InvMessageObj invMessageObj) {
                    UILayoutExchange uILayoutExchange = this.this$0;
                    Intrinsics.checkNotNull(invMessageObj);
                    uILayoutExchange.updateNewMessage(invMessageObj);
                    this.this$0.mainRoot.updateCountWithNewMessages(this.this$0.mainRoot.getCounter());
                }
            }));
            inventoryAndExchangeViewModel.getNewMyExchangeItemPos().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$12
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
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.yourExchangeItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewSavedInitPosInInv().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$13
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<Integer> list) {
                    UILayoutExchange uILayoutExchange = this.this$0;
                    Intrinsics.checkNotNull(list);
                    uILayoutExchange.myInitInvItemsPos = list;
                }
            }));
            inventoryAndExchangeViewModel.getNewOldPosFromInv().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$14
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<Integer> list) {
                    UILayoutExchange uILayoutExchange = this.this$0;
                    Intrinsics.checkNotNull(list);
                    uILayoutExchange.savedPosInInv = list;
                }
            }));
            inventoryAndExchangeViewModel.getNewNewInvPosition().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$15
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
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.yourItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewOldInvPosition().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$16
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
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.yourItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryExchangeAndTrunkAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewNewSlotPosition().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$17
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
            inventoryAndExchangeViewModel.getNewSlotsInInventory().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$18
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<Integer> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<Integer> list) {
                    if (list.size() != 2 || list.get(0).intValue() == list.get(1).intValue()) {
                        return;
                    }
                    this.this$0.initInvSize = list.get(0).intValue();
                    InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.yourItemsAndTrunkAdapter;
                    if (inventoryExchangeAndTrunkAdapter != null) {
                        inventoryExchangeAndTrunkAdapter.updateSize(list.get(0).intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewExchangeStatus().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$19
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
                    UILayoutExchange uILayoutExchange = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutExchange.exchangeStatus = num.intValue();
                }
            }));
            inventoryAndExchangeViewModel.getNewBlockStatus().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$20
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                    UILayoutExchange uILayoutExchange = this.this$0;
                    Intrinsics.checkNotNull(bool);
                    uILayoutExchange.blockStatus = bool.booleanValue();
                    UILayoutExchange uILayoutExchange2 = this.this$0;
                    uILayoutExchange2.setEnableForEditText(uILayoutExchange2.blockStatus);
                }
            }));
            inventoryAndExchangeViewModel.getNewInvItems().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$21
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
                    if (this.this$0.setInitState) {
                        this.this$0.setInitState = false;
                        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.this$0.yourItemsAndTrunkAdapter;
                        if (inventoryExchangeAndTrunkAdapter != null) {
                            Intrinsics.checkNotNull(list);
                            int i = this.this$0.initInvSize;
                            List<VehiclesDTO> value = inventoryAndExchangeViewModel.getVehicleItems().getValue();
                            if (value == null) {
                                value = CollectionsKt__CollectionsKt.emptyList();
                            }
                            List<SkinsDTO> value2 = inventoryAndExchangeViewModel.getSkinItems().getValue();
                            if (value2 == null) {
                                value2 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            inventoryExchangeAndTrunkAdapter.setItems(list, i, value, value2);
                        }
                    }
                }
            }));
            inventoryAndExchangeViewModel.getSaveTheOldValueOfMoney().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$22
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                    this.this$0.saveTheOldValueOfMoney();
                }
            }));
            inventoryAndExchangeViewModel.getReturnToTheOldValueOfMoney().observe(viewLifecycleOwner, new UILayoutExchange$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutExchange$setObservers$1$1$23
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                    this.this$0.returnToTheOldValueOfMoney();
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayersNick(String nick) {
        if (nick == null) {
            nick = "";
        }
        this.textIsFromOtherPlayer = getContext().getString(R.string.inv_title_other_player_exchange, nick);
        this.textIsFromYou = getContext().getString(R.string.inv_title_your_exchange, nick);
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeMoneyFromText : null;
        if (textView == null) {
            return;
        }
        textView.setText(nick);
    }

    public final void setThisWeightInventory(int size) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeTitleActualWeightUsers : null;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(size));
    }

    public final void setMaxWeightInventory(int size) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeTitleMaxWeightUsers : null;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(size));
    }

    public final void setMyMoney(int money) {
        this.yourAllMoney = money;
        String string = getContext().getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(money)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeValueMyMoney : null;
        if (textView == null) {
            return;
        }
        textView.setText(string);
    }

    public final void setOtherPlayersMoney(Integer money) {
        String string = getContext().getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(money != null ? money.intValue() : 0)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        TextView textView = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeValueMoneyFrom : null;
        if (textView == null) {
            return;
        }
        textView.setText(string);
    }

    public final void setEmptyListOtherPlayers() {
        this.ifFirstShowOrClearOtherExchangeItems = true;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.initOtherExchangeItems(this.initInvSize);
        }
    }

    public final void setEnableForEditText(boolean ifEnable) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        CustomEditText customEditText = inventoryLayoutExchangeWithUserBinding != null ? inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney : null;
        if (customEditText == null) {
            return;
        }
        customEditText.setEnabled(!ifEnable);
    }

    public final void saveTheOldValueOfMoney() {
        this.saveExchangeYourMoney = this.exchangeYourMoney;
    }

    public final void returnToTheOldValueOfMoney() {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            int i = this.saveExchangeYourMoney;
            if (i == 0) {
                Editable text = inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.getText();
                if (text != null) {
                    text.clear();
                }
                inventoryLayoutExchangeWithUserBinding.exchangeTextMoney.setText("");
                return;
            }
            inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.setText(String.valueOf(i));
            inventoryLayoutExchangeWithUserBinding.exchangeTextMoney.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(this.saveExchangeYourMoney)));
        }
    }

    public final void migrateFromExchangeToInv() {
        migrateItemFromExchange();
        clearInfoAboutExchange();
        clearInfoAboutInv();
    }

    public final void migrateItemFromExchange() {
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i = this.intermediatePositionWithExchangeItem;
        if (i == -1 || (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) == null) {
            return;
        }
        inventoryAndExchangeViewModel.migrateItemFromExchangeToInv(i, this.valueFromExchange);
    }

    public final void migrateItemFromInvToExchange() {
        migrateItemFromInventory();
        clearInfoAboutInv();
        clearInfoAboutExchange();
    }

    public final void migrateItemFromInventory() {
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i = this.intermediatePositionWithItem;
        if (i == -1 || (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) == null) {
            return;
        }
        inventoryAndExchangeViewModel.migrateItemFromInvToExchange(i, this.valueFromInv);
    }

    public final void setViewExchangeList(int thisView) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            if (thisView == 0) {
                inventoryLayoutExchangeWithUserBinding.exchangeTextPlayersNick.setText(this.textIsFromYou);
                inventoryLayoutExchangeWithUserBinding.exchangeBgPlayersName.setBackgroundResource(R.drawable.bg_rectangle_orange_hgr_cr3);
                inventoryLayoutExchangeWithUserBinding.exchangeListItemsInCar.setAdapter(this.yourExchangeItemsAndTrunkAdapter);
            } else {
                if (thisView != 1) {
                    return;
                }
                inventoryLayoutExchangeWithUserBinding.exchangeTextPlayersNick.setText(this.textIsFromOtherPlayer);
                inventoryLayoutExchangeWithUserBinding.exchangeBgPlayersName.setBackgroundResource(R.drawable.bg_rectangle_dark_green_vgr_cr3);
                inventoryLayoutExchangeWithUserBinding.exchangeListItemsInCar.setAdapter(this.otherPlayersItemsAndTrunkAdapter);
            }
        }
    }

    public final void migrateFromSlotToInventory() {
        migrateItemFromSlotToInventory();
        clearInfoAboutSlot();
        clearInfoAboutInv();
    }

    public final void migrateItemFromSlotToInventory() {
        int i;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i2 = this.intermediatePositionFromSlot;
        if (i2 == -1 || (i = this.intermediatePositionWithItem) == -1 || (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) == null) {
            return;
        }
        inventoryAndExchangeViewModel.migrateItemFromSlotToInv(i2, i);
    }

    public final void changeButtonAndHelpInfo(boolean isBothApply) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            if (isBothApply) {
                inventoryLayoutExchangeWithUserBinding.exchangeButtonApply.setText(getContext().getText(R.string.common_apply));
                inventoryLayoutExchangeWithUserBinding.exchangeTextInfo.setText(getContext().getText(R.string.inv_text_info_if_apply_exchange));
            } else {
                inventoryLayoutExchangeWithUserBinding.exchangeButtonApply.setText(getContext().getText(R.string.inv_title_button_exchange));
                inventoryLayoutExchangeWithUserBinding.exchangeTextInfo.setText(getContext().getText(R.string.inv_text_info));
            }
        }
    }

    public final void setClearClickInLists() {
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.yourItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter2 = this.yourExchangeItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter2 != null) {
            inventoryExchangeAndTrunkAdapter2.setCheckOnlyElement(-1);
        }
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter3 = this.otherPlayersItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter3 != null) {
            inventoryExchangeAndTrunkAdapter3.setCheckOnlyElement(-1);
        }
        this.intermediatePositionWithItem = -1;
        this.intermediatePositionWithExchangeItem = -1;
        this.intermediatePositionFromSlot = -1;
        this.positionWithItem = -1;
        this.positionWithExchangeItem = -1;
        this.positionFromSlot = -1;
    }

    public final void updateChangeStatus(int getStatus) {
        if (getStatus == 1) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel != null) {
                inventoryAndExchangeViewModel.setBlockStatus(true);
                inventoryAndExchangeViewModel.updateExchangeStatus(1);
            }
            changeButtonAndHelpInfo(false);
            return;
        }
        if (getStatus == 2) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel2 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel2 != null) {
                inventoryAndExchangeViewModel2.setBlockStatus(false);
                inventoryAndExchangeViewModel2.updateExchangeStatus(0);
            }
            changeButtonAndHelpInfo(false);
            return;
        }
        if (getStatus == 3) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel3 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel3 != null) {
                inventoryAndExchangeViewModel3.setBlockStatus(false);
                inventoryAndExchangeViewModel3.updateExchangeStatus(0);
            }
            clearMyInterface();
            return;
        }
        if (getStatus == 4) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel4 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel4 != null) {
                inventoryAndExchangeViewModel4.setBlockStatus(false);
            }
            this.mainRoot.layoutListener(0, false);
            return;
        }
        if (getStatus == 5) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel5 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel5 != null) {
                inventoryAndExchangeViewModel5.setBlockStatus(false);
            }
            setEmptyListOtherPlayers();
            InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.otherPlayersItemsAndTrunkAdapter;
            if (inventoryExchangeAndTrunkAdapter != null) {
                inventoryExchangeAndTrunkAdapter.notifyDataSetChanged();
            }
            setOtherPlayersMoney(0);
            return;
        }
        if (getStatus == 8) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel6 = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel6 != null) {
                inventoryAndExchangeViewModel6.setBlockStatus(true);
                inventoryAndExchangeViewModel6.updateExchangeStatus(1);
            }
            setClearClickInLists();
            return;
        }
        if (getStatus != 26) {
            return;
        }
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel7 = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel7 != null) {
            inventoryAndExchangeViewModel7.setBlockStatus(true);
            inventoryAndExchangeViewModel7.updateExchangeStatus(2);
        }
        changeButtonAndHelpInfo(true);
    }

    public final void clearMyInterface() {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            Editable text = inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.getText();
            if (text != null) {
                text.clear();
            }
            inventoryLayoutExchangeWithUserBinding.exchangeTextMoney.setText("");
            inventoryLayoutExchangeWithUserBinding.exchangeTitleActualWeightUsers.setText(String.valueOf(this.startThisWeight));
        }
        this.ifFirstShowOrClearMyExchangeItems = true;
        this.setInitState = true;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.setInitState();
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
        closePopupWindows();
        closeChat();
        this.dialogChat = null;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.setInitState();
        }
        removeObservers();
    }

    public final void removeObservers() {
        LifecycleOwner viewLifecycleOwner = this.mainRoot.getViewLifecycleOwner();
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.getNewOtherPlayersNick().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewCurrentWeight().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMaxWeight().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMyMoney().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSlotItems().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMediatorInvItemsAndSize().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMyExchangeItems().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOtherExchangeItems().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOtherMoney().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOtherExchangeItemPos().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewMessage().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMyExchangeItemPos().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSavedInitPosInInv().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOldPosFromInv().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewInvPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOldInvPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewSlotPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewItemFromSlot().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSlotsInInventory().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewExchangeStatus().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewBlockStatus().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewInvItems().removeObservers(viewLifecycleOwner);
        }
    }

    public final void updateCountWithNewMessages(int count) {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            if (count > 0) {
                inventoryLayoutExchangeWithUserBinding.exchangeTextValueMessage.setVisibility(0);
                inventoryLayoutExchangeWithUserBinding.exchangeTextValueMessage.setText(String.valueOf(count));
            } else {
                inventoryLayoutExchangeWithUserBinding.exchangeTextValueMessage.setVisibility(4);
            }
        }
    }

    public final void removeFocusableForEditText() {
        InventoryLayoutExchangeWithUserBinding inventoryLayoutExchangeWithUserBinding = this.binding;
        if (inventoryLayoutExchangeWithUserBinding != null) {
            Object systemService = this.mainRoot.requireActivity().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(inventoryLayoutExchangeWithUserBinding.getRoot().getWindowToken(), 0);
            inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.setFocusable(false);
            inventoryLayoutExchangeWithUserBinding.exchangeEdittextMoney.setFocusableInTouchMode(true);
        }
    }

    public final void showChat() {
        UIChat uIChat = this.dialogChat;
        if (uIChat != null) {
            uIChat.showDialogChat();
        }
    }

    public final void updateNewMessage(InvMessageObj newMessage) {
        UIChat uIChat = this.dialogChat;
        if (uIChat != null) {
            uIChat.setNewMessage(newMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearInfoAboutSlot() {
        this.idFromSlot = 0;
        this.modelIdFromSlot = 0;
        this.valueFromSlot = 0;
        this.intermediatePositionFromSlot = -1;
        this.positionFromSlot = -1;
        InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = this.itemsInSlotAdapter;
        if (inventoryItemsInSlotAdapter != null) {
            inventoryItemsInSlotAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void clearInfoAboutInv() {
        this.itemInInv = null;
        this.idFromInv = 0;
        this.modelIdFromInv = 0;
        this.valueFromInv = 0;
        this.simCardNumberFromInv = 0;
        this.positionWithItem = -1;
        this.intermediatePositionWithItem = -1;
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.yourItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void clearInfoAboutExchange() {
        this.itemInExchange = null;
        this.idFromExchange = 0;
        this.modelIdFromExchange = 0;
        this.valueFromExchange = 0;
        this.simCardNumberFromExchange = 0;
        this.intermediatePositionWithExchangeItem = -1;
        this.positionWithExchangeItem = -1;
        InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter = this.yourExchangeItemsAndTrunkAdapter;
        if (inventoryExchangeAndTrunkAdapter != null) {
            inventoryExchangeAndTrunkAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void setDefaultParams() {
        this.startThisWeight = 0;
        this.textIsFromOtherPlayer = "";
        this.textIsFromYou = "";
        this.exchangeYourMoney = 0;
        this.oldTimeWithMigrate = 0L;
        this.oldTimeAfterCheck = 0L;
        this.sendCounter = 0;
        this.yourAllMoney = 0;
        this.initInvSize = 0;
        this.ifFirstShow = true;
        this.isFirstShowSlot = true;
        this.isFirstShowInv = true;
        this.ifFirstShowOrClearMyExchangeItems = true;
        this.ifFirstShowOrClearOtherExchangeItems = true;
        this.blockStatus = false;
        this.setInitState = false;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.setOtherMoney(null);
        }
    }

    public final void setNullableParameters() {
        closePopupWindows();
        closeChat();
        this.binding = null;
        this.dialogForMigrateItem = null;
        this.clickListenerDialogForMigrateItems = null;
        this.itemInInv = null;
        this.itemInExchange = null;
        this.yourItemsAndTrunkAdapter = null;
        this.yourExchangeItemsAndTrunkAdapter = null;
        this.otherPlayersItemsAndTrunkAdapter = null;
        this.onYourItemsClickListener = null;
        this.onYourExchangeItemsClickListener = null;
        this.emptyClickListener = null;
        this.itemsInSlotAdapter = null;
        this.onItemsInSlotClickListener = null;
    }

    private final void closePopupWindows() {
        NewDialogForMigrateItems newDialogForMigrateItems = this.dialogForMigrateItem;
        if (newDialogForMigrateItems != null) {
            newDialogForMigrateItems.closeDialogForMigrate();
        }
    }

    public final void closeChat() {
        UIChat uIChat = this.dialogChat;
        if (uIChat != null) {
            uIChat.closeChat();
        }
    }
}

