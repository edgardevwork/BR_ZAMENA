package com.blackhub.bronline.game.gui.inventory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.InventoryLayoutUsersInventoryBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FormatUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.blackpass.data.TimerDaysAndHours;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryActionButtonsAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsInSlotAdapter;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryPlayersStatesAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvActionButtonsData;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvPlayersStateData;
import com.blackhub.bronline.game.gui.inventory.data.InvSizeAndItemsObj;
import com.blackhub.bronline.game.gui.inventory.network.CarTrunkOrClosetActionsWithJSON;
import com.blackhub.bronline.game.gui.inventory.network.InvActionWithJSON;
import com.blackhub.bronline.game.gui.inventory.viewmodel.InventoryAndExchangeViewModel;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UILayoutUsersInventory.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0002\u0010\nJ\u0016\u0010W\u001a\u00020\u00172\f\u0010X\u001a\b\u0012\u0004\u0012\u00020M04H\u0002J\u0006\u0010Y\u001a\u00020\u0017J\u0006\u0010Z\u001a\u00020\u0017J\b\u0010[\u001a\u00020\u0017H\u0002J\b\u0010\\\u001a\u00020\u0017H\u0002J\u0006\u0010]\u001a\u00020\u0017J\u0006\u0010^\u001a\u00020\u0017J\n\u0010_\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010`\u001a\u00020\u0017H\u0002J\b\u0010a\u001a\u00020\u0017H\u0002J\b\u0010b\u001a\u00020\u0017H\u0002J\b\u0010c\u001a\u00020\u0017H\u0002J\b\u0010d\u001a\u00020\u0017H\u0002J\b\u0010e\u001a\u00020\u0017H\u0002J\b\u0010f\u001a\u00020\u0017H\u0002J\u000e\u0010g\u001a\u00020\u00172\u0006\u0010h\u001a\u00020\fJ\u0006\u0010i\u001a\u00020\u0017J\u0006\u0010j\u001a\u00020\u0017J\u001c\u0010k\u001a\u0004\u0018\u00010\u00152\u0006\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010oH\u0016J\b\u0010p\u001a\u00020\u0017H\u0016J\b\u0010q\u001a\u00020\u0017H\u0016J\b\u0010r\u001a\u00020\u0017H\u0002J\u0010\u0010s\u001a\u00020\u00172\u0006\u0010t\u001a\u00020\fH\u0002J\u0010\u0010u\u001a\u00020\u00172\u0006\u0010N\u001a\u00020MH\u0002J\u0010\u0010v\u001a\u00020\u00172\u0006\u0010w\u001a\u00020\fH\u0002J\u0006\u0010x\u001a\u00020\u0017J\b\u0010y\u001a\u00020\u0017H\u0002J\u0010\u0010z\u001a\u00020\u00172\u0006\u0010{\u001a\u00020\fH\u0002J\u0010\u0010|\u001a\u00020\u00172\u0006\u0010}\u001a\u00020\fH\u0002J\u0010\u0010~\u001a\u00020\u00172\u0006\u0010\u007f\u001a\u00020\bH\u0002J\t\u0010\u0080\u0001\u001a\u00020\u0017H\u0002J\u0012\u0010\u0081\u0001\u001a\u00020\u00172\u0007\u0010\u0082\u0001\u001a\u00020\fH\u0002J\u0012\u0010\u0083\u0001\u001a\u00020\u00172\u0007\u0010\u0084\u0001\u001a\u00020\fH\u0002J\u0012\u0010\u0085\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020\fH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010j\u0004\u0018\u0001`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00106\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u001b\u0010;\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b<\u00108R\u001b\u0010>\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\b?\u00108R\u000e\u0010A\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KRF\u0010L\u001a:\u0012\u0013\u0012\u00110M¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010j\u0004\u0018\u0001`PX\u0082\u000e¢\u0006\u0002\n\u0000RF\u0010Q\u001a:\u0012\u0013\u0012\u00110M¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010j\u0004\u0018\u0001`PX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0087\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/UILayoutUsersInventory;", "Lcom/blackhub/bronline/game/common/UILayout;", "mainRoot", "Lcom/blackhub/bronline/game/gui/inventory/GUIUsersInventory;", "inventoryAndExchangeViewModel", "Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;", "itemRender", "Landroidx/collection/ArrayMap;", "", "Landroid/graphics/Bitmap;", "(Lcom/blackhub/bronline/game/gui/inventory/GUIUsersInventory;Lcom/blackhub/bronline/game/gui/inventory/viewmodel/InventoryAndExchangeViewModel;Landroidx/collection/ArrayMap;)V", "actionBlockCounter", "", "actionBlockTimer", "", "actionClickListener", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/inventory/data/InvActionButtonsData;", "Lkotlin/ParameterName;", "name", "actionButton", "Landroid/view/View;", SVG.View.NODE_NAME, "", "Lcom/blackhub/bronline/game/gui/inventory/adapters/OnActionButtonsClickListener;", "actionsAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryActionButtonsAdapter;", "anim", "Landroid/view/animation/Animation;", "binding", "Lcom/blackhub/bronline/databinding/InventoryLayoutUsersInventoryBinding;", "currentContext", "Landroid/content/Context;", "intermediateOldPositionInInvIfUsed", "getIntermediateOldPositionInInvIfUsed", "()I", "setIntermediateOldPositionInInvIfUsed", "(I)V", "intermediatePositionInInv", "intermediatePositionInSlot", "getIntermediatePositionInSlot", "setIntermediatePositionInSlot", "invDialogDelete", "Lcom/blackhub/bronline/game/gui/inventory/InvDialogDelete;", "inventoryItemsAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsAdapter;", "isFirstShowInv", "", "isFirstShowSlot", "itemsInSlotAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsInSlotAdapter;", "listPlayersStates", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvPlayersStateData;", "messageErrorFromRes", "getMessageErrorFromRes", "()Ljava/lang/String;", "messageErrorFromRes$delegate", "Lkotlin/Lazy;", "messageErrorItemNotCheck", "getMessageErrorItemNotCheck", "messageErrorItemNotCheck$delegate", "messagePleaseWait", "getMessagePleaseWait", "messagePleaseWait$delegate", "migrateCounter", "oldInvId", "oldInvValue", "oldPositionWithItem", "oldSlotId", "oldSlotValue", "oldTimeWithMigrateAndUsed", "getOldTimeWithMigrateAndUsed", "()J", "setOldTimeWithMigrateAndUsed", "(J)V", "onItemsClickListener", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "item", "position", "Lcom/blackhub/bronline/game/gui/inventory/OnItemsClickListener;", "onItemsInSlotClickListener", "playersStatesAdapter", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryPlayersStatesAdapter;", "positionFromSlot", "positionInInventory", "timerBlockCheck", "changeStatusWhoseItem", "myList", "clearInfoAboutInv", "clearInfoAboutSlot", "clearInfoIfEmptyValue", "clearItemsInfo", "deleteItem", "deleteThisItem", "getView", "initActionClickListener", "initDataInInventoryInView", "initDataInSlotsView", "initDataPlayersButtonsActionInView", "initDataPlayersStateInfoInView", "initItemsClickListener", "initSlotsClickListener", "migrateDataFromInvToSlot", "newPosition", "migrateDataFromSlotToInv", "migrateDataInInv", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLayoutClose", "onLayoutShown", "removeObservers", "renderMainSkin", "modelId", "setInfoAboutItem", "setMaxWeight", "maxWeight", "setNullableParameters", "setObservers", "setPlayersId", "playersId", "setPlayersLevel", "level", "setPlayersNick", PlayersListUtilsKt.KEY_GET_PLAYER_NICK, "setStartParams", "setThisWeight", "thisWeight", "setVIPStatus", "vipStatus", "updateHungerParameter", "newValueDinner", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nUILayoutUsersInventory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutUsersInventory.kt\ncom/blackhub/bronline/game/gui/inventory/UILayoutUsersInventory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,763:1\n1#2:764\n*E\n"})
/* loaded from: classes2.dex */
public final class UILayoutUsersInventory extends UILayout {
    public static final int $stable = 8;
    public int actionBlockCounter;
    public long actionBlockTimer;

    @Nullable
    public Function2<? super InvActionButtonsData, ? super View, Unit> actionClickListener;

    @Nullable
    public InventoryActionButtonsAdapter actionsAdapter;

    @Nullable
    public Animation anim;

    @Nullable
    public InventoryLayoutUsersInventoryBinding binding;

    @Nullable
    public Context currentContext;
    public int intermediateOldPositionInInvIfUsed;
    public int intermediatePositionInInv;
    public int intermediatePositionInSlot;

    @Nullable
    public InvDialogDelete invDialogDelete;

    @Nullable
    public final InventoryAndExchangeViewModel inventoryAndExchangeViewModel;

    @Nullable
    public InventoryItemsAdapter inventoryItemsAdapter;
    public boolean isFirstShowInv;
    public boolean isFirstShowSlot;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender;

    @Nullable
    public InventoryItemsInSlotAdapter itemsInSlotAdapter;

    @NotNull
    public final List<InvPlayersStateData> listPlayersStates;

    @NotNull
    public final GUIUsersInventory mainRoot;

    /* renamed from: messageErrorFromRes$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageErrorFromRes;

    /* renamed from: messageErrorItemNotCheck$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messageErrorItemNotCheck;

    /* renamed from: messagePleaseWait$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy messagePleaseWait;
    public int migrateCounter;
    public int oldInvId;
    public int oldInvValue;
    public int oldPositionWithItem;
    public int oldSlotId;
    public int oldSlotValue;
    public long oldTimeWithMigrateAndUsed;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onItemsClickListener;

    @Nullable
    public Function2<? super InvItems, ? super Integer, Unit> onItemsInSlotClickListener;

    @Nullable
    public InventoryPlayersStatesAdapter playersStatesAdapter;
    public int positionFromSlot;
    public int positionInInventory;
    public long timerBlockCheck;

    public UILayoutUsersInventory(@NotNull GUIUsersInventory mainRoot, @Nullable InventoryAndExchangeViewModel inventoryAndExchangeViewModel, @NotNull ArrayMap<String, Bitmap> itemRender) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        Intrinsics.checkNotNullParameter(itemRender, "itemRender");
        this.mainRoot = mainRoot;
        this.inventoryAndExchangeViewModel = inventoryAndExchangeViewModel;
        this.itemRender = itemRender;
        this.positionInInventory = -1;
        this.oldPositionWithItem = -1;
        this.intermediatePositionInInv = -1;
        this.intermediateOldPositionInInvIfUsed = -1;
        this.intermediatePositionInSlot = -1;
        this.positionFromSlot = -1;
        this.isFirstShowInv = true;
        this.isFirstShowSlot = true;
        this.messageErrorFromRes = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$messageErrorFromRes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.this$0.getContext().getString(R.string.inv_trunk_message_error);
            }
        });
        this.messageErrorItemNotCheck = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$messageErrorItemNotCheck$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.this$0.getContext().getString(R.string.inv_text_item_not_check);
            }
        });
        this.messagePleaseWait = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$messagePleaseWait$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.this$0.getContext().getString(R.string.inv_text_please_wait);
            }
        });
        this.listPlayersStates = CollectionsKt__CollectionsKt.mutableListOf(new InvPlayersStateData(0, 0, 0, R.drawable.ic_bug_white), new InvPlayersStateData(1, 0, 100, R.drawable.ic_dinner));
    }

    public final int getIntermediateOldPositionInInvIfUsed() {
        return this.intermediateOldPositionInInvIfUsed;
    }

    public final void setIntermediateOldPositionInInvIfUsed(int i) {
        this.intermediateOldPositionInInvIfUsed = i;
    }

    public final int getIntermediatePositionInSlot() {
        return this.intermediatePositionInSlot;
    }

    public final void setIntermediatePositionInSlot(int i) {
        this.intermediatePositionInSlot = i;
    }

    public final long getOldTimeWithMigrateAndUsed() {
        return this.oldTimeWithMigrateAndUsed;
    }

    public final void setOldTimeWithMigrateAndUsed(long j) {
        this.oldTimeWithMigrateAndUsed = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMessageErrorFromRes() {
        return (String) this.messageErrorFromRes.getValue();
    }

    public final String getMessageErrorItemNotCheck() {
        return (String) this.messageErrorItemNotCheck.getValue();
    }

    public final String getMessagePleaseWait() {
        return (String) this.messagePleaseWait.getValue();
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    /* renamed from: getView */
    public View getMViewRoot() {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            return inventoryLayoutUsersInventoryBinding.getRoot();
        }
        return null;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        LinearLayout root;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBindingInflate = InventoryLayoutUsersInventoryBinding.inflate(inflater);
        this.binding = inventoryLayoutUsersInventoryBindingInflate;
        this.currentContext = (inventoryLayoutUsersInventoryBindingInflate == null || (root = inventoryLayoutUsersInventoryBindingInflate.getRoot()) == null) ? null : root.getContext();
        this.anim = AnimationUtils.loadAnimation(getContext(), R.anim.button_click);
        this.invDialogDelete = new InvDialogDelete(this);
        initItemsClickListener();
        initActionClickListener();
        initSlotsClickListener();
        initDataPlayersButtonsActionInView();
        initDataPlayersStateInfoInView();
        initDataInInventoryInView();
        initDataInSlotsView();
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            return inventoryLayoutUsersInventoryBinding.getRoot();
        }
        return null;
    }

    public final void initItemsClickListener() {
        this.onItemsClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory.initItemsClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) throws JSONException, Resources.NotFoundException {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) throws JSONException, Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(item, "item");
                if (System.currentTimeMillis() - UILayoutUsersInventory.this.timerBlockCheck > 500) {
                    UILayoutUsersInventory.this.timerBlockCheck = System.currentTimeMillis();
                    item.setCheck(true);
                    UILayoutUsersInventory.this.positionInInventory = position;
                    InventoryItemsAdapter inventoryItemsAdapter = UILayoutUsersInventory.this.inventoryItemsAdapter;
                    if (inventoryItemsAdapter != null) {
                        inventoryItemsAdapter.setCheckOnlyElement(position);
                    }
                    InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = UILayoutUsersInventory.this.itemsInSlotAdapter;
                    if (inventoryItemsInSlotAdapter != null) {
                        inventoryItemsInSlotAdapter.setCheckOnlyElement(-1);
                    }
                    UILayoutUsersInventory.this.setInfoAboutItem(item);
                    if (item.getItemsValue() != 0) {
                        UILayoutUsersInventory.this.oldPositionWithItem = position;
                        UILayoutUsersInventory.this.oldInvValue = item.getItemsValue();
                        UILayoutUsersInventory.this.oldInvId = item.getId();
                        UILayoutUsersInventory.this.clearInfoAboutSlot();
                        return;
                    }
                    if (UILayoutUsersInventory.this.oldPositionWithItem != -1 && UILayoutUsersInventory.this.oldInvValue != 0) {
                        if (System.currentTimeMillis() - UILayoutUsersInventory.this.getOldTimeWithMigrateAndUsed() <= 1000) {
                            if (UILayoutUsersInventory.this.migrateCounter == 0) {
                                CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                                String messageErrorFromRes = UILayoutUsersInventory.this.getMessageErrorFromRes();
                                Intrinsics.checkNotNullExpressionValue(messageErrorFromRes, "access$getMessageErrorFromRes(...)");
                                carTrunkOrClosetActionsWithJSON.sendMessageError(messageErrorFromRes);
                            }
                            UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                            uILayoutUsersInventory.migrateCounter++;
                            int unused = uILayoutUsersInventory.migrateCounter;
                            return;
                        }
                        UILayoutUsersInventory.this.setOldTimeWithMigrateAndUsed(System.currentTimeMillis());
                        UILayoutUsersInventory.this.intermediatePositionInInv = position;
                        UILayoutUsersInventory uILayoutUsersInventory2 = UILayoutUsersInventory.this;
                        uILayoutUsersInventory2.setIntermediateOldPositionInInvIfUsed(uILayoutUsersInventory2.oldPositionWithItem);
                        InvActionWithJSON.INSTANCE.sendIdWithOldAndNewPositionsToServer(23, UILayoutUsersInventory.this.oldInvId, UILayoutUsersInventory.this.oldPositionWithItem, position);
                        UILayoutUsersInventory.this.migrateCounter = 0;
                        return;
                    }
                    if (UILayoutUsersInventory.this.positionFromSlot == -1 || UILayoutUsersInventory.this.oldSlotValue == 0) {
                        return;
                    }
                    int i = UILayoutUsersInventory.this.oldSlotId;
                    if (i == 58) {
                        UILayoutUsersInventory.this.intermediatePositionInInv = position;
                        UILayoutUsersInventory uILayoutUsersInventory3 = UILayoutUsersInventory.this;
                        uILayoutUsersInventory3.setIntermediatePositionInSlot(uILayoutUsersInventory3.positionFromSlot);
                        InvActionWithJSON.INSTANCE.sendIdAndPositionToServer(32, UILayoutUsersInventory.this.oldSlotId, position);
                        return;
                    }
                    if (i != 134) {
                        UILayoutUsersInventory.this.intermediatePositionInInv = position;
                        UILayoutUsersInventory uILayoutUsersInventory4 = UILayoutUsersInventory.this;
                        uILayoutUsersInventory4.setIntermediatePositionInSlot(uILayoutUsersInventory4.positionFromSlot);
                        InvActionWithJSON.INSTANCE.sendIdWithOldAndNewPositionsToServer(4, UILayoutUsersInventory.this.oldSlotId, UILayoutUsersInventory.this.positionFromSlot - 2, position);
                        return;
                    }
                    UILayoutUsersInventory.this.intermediatePositionInInv = position;
                    UILayoutUsersInventory uILayoutUsersInventory5 = UILayoutUsersInventory.this;
                    uILayoutUsersInventory5.setIntermediatePositionInSlot(uILayoutUsersInventory5.positionFromSlot);
                    InvActionWithJSON.INSTANCE.sendIdWithOldAndNewPositionsToServer(4, UILayoutUsersInventory.this.oldSlotId, 6, position);
                }
            }
        };
    }

    public final void initActionClickListener() {
        this.actionClickListener = new Function2<InvActionButtonsData, View, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory.initActionClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvActionButtonsData invActionButtonsData, View view) throws JSONException {
                invoke2(invActionButtonsData, view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(@NotNull InvActionButtonsData actionButton, @NotNull View view) throws JSONException {
                Intrinsics.checkNotNullParameter(actionButton, "actionButton");
                Intrinsics.checkNotNullParameter(view, "view");
                if (System.currentTimeMillis() - UILayoutUsersInventory.this.actionBlockTimer <= 1000) {
                    if (UILayoutUsersInventory.this.actionBlockCounter == 0) {
                        CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                        String messagePleaseWait = UILayoutUsersInventory.this.getMessagePleaseWait();
                        Intrinsics.checkNotNullExpressionValue(messagePleaseWait, "access$getMessagePleaseWait(...)");
                        carTrunkOrClosetActionsWithJSON.sendMessageError(messagePleaseWait);
                        UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                        uILayoutUsersInventory.actionBlockCounter++;
                        int unused = uILayoutUsersInventory.actionBlockCounter;
                        return;
                    }
                    return;
                }
                UILayoutUsersInventory.this.actionBlockTimer = System.currentTimeMillis();
                view.startAnimation(UILayoutUsersInventory.this.anim);
                UILayoutUsersInventory.this.actionBlockCounter = 0;
                int typeMenu = actionButton.getTypeMenu();
                if (typeMenu == 7) {
                    InvActionWithJSON.INSTANCE.sendPressButton(25);
                    return;
                }
                if (typeMenu == 9) {
                    if (UILayoutUsersInventory.this.oldPositionWithItem != -1) {
                        InvDialogDelete invDialogDelete = UILayoutUsersInventory.this.invDialogDelete;
                        if (invDialogDelete != null) {
                            invDialogDelete.showDialogDelete();
                            return;
                        }
                        return;
                    }
                    CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON2 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                    String messageErrorItemNotCheck = UILayoutUsersInventory.this.getMessageErrorItemNotCheck();
                    Intrinsics.checkNotNullExpressionValue(messageErrorItemNotCheck, "access$getMessageErrorItemNotCheck(...)");
                    carTrunkOrClosetActionsWithJSON2.sendMessageError(messageErrorItemNotCheck);
                    return;
                }
                if (typeMenu != 19) {
                    return;
                }
                if (UILayoutUsersInventory.this.oldPositionWithItem != -1 && UILayoutUsersInventory.this.oldInvValue != 0) {
                    UILayoutUsersInventory uILayoutUsersInventory2 = UILayoutUsersInventory.this;
                    uILayoutUsersInventory2.setIntermediateOldPositionInInvIfUsed(uILayoutUsersInventory2.oldPositionWithItem);
                    InvActionWithJSON.INSTANCE.sendIdAndPositionToServer(19, UILayoutUsersInventory.this.oldInvId, UILayoutUsersInventory.this.oldPositionWithItem);
                } else {
                    CarTrunkOrClosetActionsWithJSON carTrunkOrClosetActionsWithJSON3 = CarTrunkOrClosetActionsWithJSON.INSTANCE;
                    String messageErrorItemNotCheck2 = UILayoutUsersInventory.this.getMessageErrorItemNotCheck();
                    Intrinsics.checkNotNullExpressionValue(messageErrorItemNotCheck2, "access$getMessageErrorItemNotCheck(...)");
                    carTrunkOrClosetActionsWithJSON3.sendMessageError(messageErrorItemNotCheck2);
                }
            }
        };
    }

    public final void initSlotsClickListener() {
        this.onItemsInSlotClickListener = new Function2<InvItems, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory.initSlotsClickListener.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InvItems invItems, Integer num) throws JSONException, Resources.NotFoundException {
                invoke(invItems, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull InvItems item, int position) throws JSONException, Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(item, "item");
                if (item.getItemsValue() != 0) {
                    UILayoutUsersInventory.this.positionFromSlot = position;
                    UILayoutUsersInventory uILayoutUsersInventory = UILayoutUsersInventory.this;
                    uILayoutUsersInventory.oldSlotValue = item.getItemsValue();
                    uILayoutUsersInventory.oldSlotId = item.getId();
                    uILayoutUsersInventory.setInfoAboutItem(item);
                    item.setCheck(true);
                    UILayoutUsersInventory.this.clearInfoAboutInv();
                    InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = UILayoutUsersInventory.this.itemsInSlotAdapter;
                    if (inventoryItemsInSlotAdapter != null) {
                        inventoryItemsInSlotAdapter.notifyItemChanged(position);
                        inventoryItemsInSlotAdapter.setCheckOnlyElement(position);
                        return;
                    }
                    return;
                }
                if (UILayoutUsersInventory.this.oldPositionWithItem == -1 || UILayoutUsersInventory.this.oldInvValue == 0) {
                    return;
                }
                UILayoutUsersInventory uILayoutUsersInventory2 = UILayoutUsersInventory.this;
                uILayoutUsersInventory2.setIntermediateOldPositionInInvIfUsed(uILayoutUsersInventory2.oldPositionWithItem);
                InvActionWithJSON.INSTANCE.sendIdAndPositionToServer(19, UILayoutUsersInventory.this.oldInvId, UILayoutUsersInventory.this.oldPositionWithItem);
            }
        };
    }

    public final void initDataPlayersButtonsActionInView() {
        this.actionsAdapter = new InventoryActionButtonsAdapter(InventoryUtilsKt.getListActionButtons(), this.actionClickListener);
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            RecyclerView recyclerView = inventoryLayoutUsersInventoryBinding.playersButtonsAction;
            recyclerView.setLayoutManager(new LinearLayoutManager(inventoryLayoutUsersInventoryBinding.getRoot().getContext(), 1, false));
            recyclerView.setAdapter(this.actionsAdapter);
        }
    }

    public final void initDataPlayersStateInfoInView() {
        this.playersStatesAdapter = new InventoryPlayersStatesAdapter(this.listPlayersStates);
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            RecyclerView recyclerView = inventoryLayoutUsersInventoryBinding.playersStateInfo;
            recyclerView.setLayoutManager(new LinearLayoutManager(inventoryLayoutUsersInventoryBinding.getRoot().getContext(), 0, false));
            recyclerView.setAdapter(this.playersStatesAdapter);
        }
    }

    public final void initDataInInventoryInView() {
        this.inventoryItemsAdapter = new InventoryItemsAdapter(this.onItemsClickListener, this, this.itemRender);
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            RecyclerView recyclerView = inventoryLayoutUsersInventoryBinding.invListItemsInInventory;
            recyclerView.setLayoutManager(new GridLayoutManager(inventoryLayoutUsersInventoryBinding.getRoot().getContext(), 4));
            recyclerView.setAdapter(this.inventoryItemsAdapter);
        }
    }

    private final void initDataInSlotsView() {
        this.itemsInSlotAdapter = new InventoryItemsInSlotAdapter(this.onItemsInSlotClickListener, true, this.itemRender);
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            RecyclerView recyclerView = inventoryLayoutUsersInventoryBinding.playersSlots;
            recyclerView.setLayoutManager(new LinearLayoutManager(inventoryLayoutUsersInventoryBinding.getRoot().getContext(), 1, false));
            recyclerView.setAdapter(this.itemsInSlotAdapter);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        setStartParams();
        setObservers();
        clearItemsInfo();
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = this.mainRoot.getViewLifecycleOwner();
        final InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.getNewPlayersNick().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    UILayoutUsersInventory uILayoutUsersInventory = this.this$0;
                    Intrinsics.checkNotNull(str);
                    uILayoutUsersInventory.setPlayersNick(str);
                }
            }));
            inventoryAndExchangeViewModel.getNewPlayersLevel().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$2
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
                    UILayoutUsersInventory uILayoutUsersInventory = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setPlayersLevel(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewPlayersId().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$3
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
                    UILayoutUsersInventory uILayoutUsersInventory = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setPlayersId(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewCurrentWeight().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$4
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
                    UILayoutUsersInventory uILayoutUsersInventory = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setThisWeight(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewMaxWeight().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$5
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
                    UILayoutUsersInventory uILayoutUsersInventory = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setMaxWeight(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewHungerParameter().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$6
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
                    UILayoutUsersInventory uILayoutUsersInventory = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.updateHungerParameter(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewVIPStatus().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$7
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
                    UILayoutUsersInventory uILayoutUsersInventory = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.setVIPStatus(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewMediatorInvItemsAndSize().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<InvSizeAndItemsObj, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$8
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
                    if (!this.this$0.isFirstShowInv || invSizeAndItemsObj.getItemsList() == null || invSizeAndItemsObj.getSizeActiveSlots() == null) {
                        return;
                    }
                    this.this$0.isFirstShowInv = false;
                    UILayoutUsersInventory uILayoutUsersInventory = this.this$0;
                    List<InvItems> itemsList = invSizeAndItemsObj.getItemsList();
                    Intrinsics.checkNotNull(itemsList);
                    uILayoutUsersInventory.changeStatusWhoseItem(itemsList);
                    InventoryItemsAdapter inventoryItemsAdapter = this.this$0.inventoryItemsAdapter;
                    if (inventoryItemsAdapter != null) {
                        List<InvItems> itemsList2 = invSizeAndItemsObj.getItemsList();
                        if (itemsList2 == null) {
                            itemsList2 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        int orZero = IntExtensionKt.getOrZero(invSizeAndItemsObj.getSizeActiveSlots());
                        List<SkinsDTO> value = inventoryAndExchangeViewModel.getSkinItems().getValue();
                        if (value == null) {
                            value = CollectionsKt__CollectionsKt.emptyList();
                        }
                        inventoryItemsAdapter.setItems(itemsList2, orZero, value);
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewSlotItems().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<List<InvItems>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$9
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
            inventoryAndExchangeViewModel.getNewSkinModelId().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$10
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
                    UILayoutUsersInventory uILayoutUsersInventory = this.this$0;
                    Intrinsics.checkNotNull(num);
                    uILayoutUsersInventory.renderMainSkin(num.intValue());
                }
            }));
            inventoryAndExchangeViewModel.getNewOldInvPosition().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$11
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
                    InventoryItemsAdapter inventoryItemsAdapter = this.this$0.inventoryItemsAdapter;
                    if (inventoryItemsAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryItemsAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewNewInvPosition().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$12
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
                    InventoryItemsAdapter inventoryItemsAdapter = this.this$0.inventoryItemsAdapter;
                    if (inventoryItemsAdapter != null) {
                        Intrinsics.checkNotNull(num);
                        inventoryItemsAdapter.notifyItemChanged(num.intValue());
                    }
                }
            }));
            inventoryAndExchangeViewModel.getNewNewSlotPosition().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$13
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
            inventoryAndExchangeViewModel.getNewSlotsInInventory().observe(viewLifecycleOwner, new UILayoutUsersInventoryKt$sam$androidx_lifecycle_Observer$0(new Function1<List<Integer>, Unit>() { // from class: com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory$setObservers$1$1$14
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
                    InventoryItemsAdapter inventoryItemsAdapter;
                    if (list.size() != 2 || list.get(0).intValue() == list.get(1).intValue() || (inventoryItemsAdapter = this.this$0.inventoryItemsAdapter) == null) {
                        return;
                    }
                    inventoryItemsAdapter.updateActiveSlots(list.get(0).intValue());
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayersNick(String nick) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.playersNameValue : null;
        if (textView == null) {
            return;
        }
        textView.setText(nick);
    }

    public final void setPlayersLevel(int level) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.playersLevel : null;
        if (textView == null) {
            return;
        }
        Context context = this.currentContext;
        textView.setText(context != null ? context.getString(R.string.common_level_with_value, Integer.valueOf(level)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayersId(int playersId) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.playersIdValue : null;
        if (textView == null) {
            return;
        }
        Context context = this.currentContext;
        textView.setText(context != null ? context.getString(R.string.common_number_in_baskets, Integer.valueOf(playersId)) : null);
    }

    public final void setThisWeight(int thisWeight) {
        this.listPlayersStates.get(0).setThisValueState(thisWeight);
        InventoryPlayersStatesAdapter inventoryPlayersStatesAdapter = this.playersStatesAdapter;
        if (inventoryPlayersStatesAdapter != null) {
            inventoryPlayersStatesAdapter.notifyItemChanged(0);
        }
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.invTitleActualWeight : null;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(thisWeight));
    }

    public final void setMaxWeight(int maxWeight) {
        this.listPlayersStates.get(0).setMaxValueState(maxWeight);
        InventoryPlayersStatesAdapter inventoryPlayersStatesAdapter = this.playersStatesAdapter;
        if (inventoryPlayersStatesAdapter != null) {
            inventoryPlayersStatesAdapter.notifyItemChanged(0);
        }
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        TextView textView = inventoryLayoutUsersInventoryBinding != null ? inventoryLayoutUsersInventoryBinding.invTitleMaxWeight : null;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(maxWeight));
    }

    public final void updateHungerParameter(int newValueDinner) {
        this.listPlayersStates.get(1).setThisValueState(newValueDinner);
        InventoryPlayersStatesAdapter inventoryPlayersStatesAdapter = this.playersStatesAdapter;
        if (inventoryPlayersStatesAdapter != null) {
            inventoryPlayersStatesAdapter.notifyItemChanged(1);
        }
    }

    public final void setVIPStatus(int vipStatus) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            if (vipStatus == 0) {
                inventoryLayoutUsersInventoryBinding.playersDonateStatusIcon.setImageResource(R.drawable.ic_crown_unknown_s20);
                return;
            }
            if (vipStatus == 1) {
                inventoryLayoutUsersInventoryBinding.playersDonateStatusIcon.setImageResource(R.drawable.ic_crown_silver_s30);
            } else if (vipStatus == 2) {
                inventoryLayoutUsersInventoryBinding.playersDonateStatusIcon.setImageResource(R.drawable.ic_crown_gold_s30);
            } else {
                if (vipStatus != 3) {
                    return;
                }
                inventoryLayoutUsersInventoryBinding.playersDonateStatusIcon.setImageResource(R.drawable.ic_crown_platinum_s30);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeStatusWhoseItem(List<InvItems> myList) {
        for (InvItems invItems : myList) {
            if (invItems.getItemsValue() != 0) {
                invItems.setWhoseItem(0);
            }
        }
    }

    public final void renderMainSkin(int modelId) {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            Useful useful = Useful.INSTANCE;
            FrameLayout playersSkinView = inventoryLayoutUsersInventoryBinding.playersSkinView;
            Intrinsics.checkNotNullExpressionValue(playersSkinView, "playersSkinView");
            useful.renderSkin(2, 134, modelId, 1, playersSkinView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setInfoAboutItem(InvItems item) throws Resources.NotFoundException {
        String string;
        Bitmap bitmapFromZip$default;
        double itemsValue;
        double weight;
        double weight2;
        String name;
        String string2;
        Integer timeLeftUntilItemDestroy;
        TimerDaysAndHours timerDaysAndHoursConvertToDaysAndHours;
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding;
        String string3;
        Object next;
        Bitmap bitmapFromZip$default2;
        LiveData<List<SkinsDTO>> skinItems;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        String string4 = null;
        List<SkinsDTO> value = (inventoryAndExchangeViewModel == null || (skinItems = inventoryAndExchangeViewModel.getSkinItems()) == null) ? null : skinItems.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        if (item.getItemsValue() != 0) {
            int id = item.getId();
            float f = -1.0f;
            if (id != 58) {
                string = "";
                if (id != 59) {
                    if (id == 134) {
                        String string5 = getContext().getString(R.string.common_number_in_baskets, Integer.valueOf(item.getModelid()));
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        Iterator<T> it = value.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            Integer modelId = ((SkinsDTO) next).getModelId();
                            int modelid = item.getModelid();
                            if (modelId != null && modelId.intValue() == modelid) {
                                break;
                            }
                        }
                        SkinsDTO skinsDTO = (SkinsDTO) next;
                        if ((skinsDTO != null ? skinsDTO.getImageName() : null) != null) {
                            Context context = getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            String imageName = skinsDTO.getImageName();
                            bitmapFromZip$default2 = BitmapUtilsKt.getBitmapFromZip$default(context, imageName == null ? "" : imageName, ImageTypePathInCDNEnum.SKIN, 0.0f, 0.0f, 24, null);
                            f = 1.0f;
                        } else {
                            bitmapFromZip$default2 = this.itemRender.get(String.valueOf(item.getModelid()));
                        }
                        double itemsValue2 = item.getItemsValue() * item.getWeight();
                        name = skinsDTO != null ? skinsDTO.getName() : null;
                        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding2 = this.binding;
                        TextView textView = inventoryLayoutUsersInventoryBinding2 != null ? inventoryLayoutUsersInventoryBinding2.invTitleThisItem : null;
                        if (textView != null) {
                            textView.setText(name);
                        }
                        weight2 = itemsValue2;
                        string = string5;
                        bitmapFromZip$default = bitmapFromZip$default2;
                    } else {
                        switch (id) {
                            case 81:
                            case 82:
                            case 83:
                                break;
                            default:
                                switch (id) {
                                    case Constants.ID_TACKLE_1 /* 642 */:
                                    case Constants.ID_TACKLE_2 /* 643 */:
                                    case Constants.ID_TACKLE_3 /* 644 */:
                                    case Constants.ID_TACKLE_4 /* 645 */:
                                    case Constants.ID_TACKLE_5 /* 646 */:
                                        string = getContext().getString(R.string.common_value_and_percent_in_baskets, Integer.valueOf(item.getItemsValue()));
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        bitmapFromZip$default = this.itemRender.get(String.valueOf(item.getModelid()));
                                        weight2 = item.getWeight();
                                        name = null;
                                        break;
                                    default:
                                        String string6 = getContext().getString(R.string.inv_text_item_title_with_value, Integer.valueOf(item.getItemsValue()));
                                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                                        if (item.getImageName() != null) {
                                            Context context2 = getContext();
                                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                            String imageName2 = item.getImageName();
                                            bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(context2, imageName2 == null ? "" : imageName2, ImageTypePathInCDNEnum.ACCESSORY, 0.0f, 0.0f, 24, null);
                                            f = 1.0f;
                                        } else {
                                            bitmapFromZip$default = this.itemRender.get(String.valueOf(item.getModelid()));
                                        }
                                        name = null;
                                        weight2 = item.getItemsValue() * item.getWeight();
                                        string = string6;
                                        break;
                                }
                        }
                    }
                    string2 = getContext().getString(R.string.common_double_string_values, UtilsKt.buildTypeMerge(item.get_name(), item.get_nameStore()), string);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    timeLeftUntilItemDestroy = item.getTimeLeftUntilItemDestroy();
                    if ((timeLeftUntilItemDestroy != null || timeLeftUntilItemDestroy.intValue() != 0) && item.getTimeLeftUntilItemDestroy() != null) {
                        timerDaysAndHoursConvertToDaysAndHours = FormatUtilsKt.convertToDaysAndHours(item.getTimeLeftUntilItemDestroy().intValue());
                        if (timerDaysAndHoursConvertToDaysAndHours.getDays() > 999) {
                            string4 = getContext().getString(R.string.inv_time_left_until_item_destroy_more_than_999);
                        } else {
                            int days = timerDaysAndHoursConvertToDaysAndHours.getDays();
                            if (1 <= days && days < 1000) {
                                string4 = getContext().getResources().getQuantityString(R.plurals.common_days, timerDaysAndHoursConvertToDaysAndHours.getDays(), Integer.valueOf(timerDaysAndHoursConvertToDaysAndHours.getDays()));
                            } else if (timerDaysAndHoursConvertToDaysAndHours.getDays() == 0) {
                                if (timerDaysAndHoursConvertToDaysAndHours.getHours() > 0) {
                                    string4 = getContext().getResources().getQuantityString(R.plurals.common_hours, timerDaysAndHoursConvertToDaysAndHours.getHours(), Integer.valueOf(timerDaysAndHoursConvertToDaysAndHours.getHours()));
                                } else {
                                    string4 = getContext().getString(R.string.inv_time_left_until_item_destroy_less_than_hour);
                                }
                            }
                        }
                        string4 = getContext().getString(R.string.inv_time_left_until_item_destroy, string4);
                    }
                    if (string4 != null && (string3 = getContext().getString(R.string.common_double_string_values, string2, string4)) != null) {
                        string2 = string3;
                    }
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format(Constants.STRING_FORMAT, Arrays.copyOf(new Object[]{Double.valueOf(weight2)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    inventoryLayoutUsersInventoryBinding = this.binding;
                    if (inventoryLayoutUsersInventoryBinding == null) {
                        if (item.getId() != 134 || AnyExtensionKt.isNull(name)) {
                            inventoryLayoutUsersInventoryBinding.invTitleThisItem.setText(string2);
                        }
                        inventoryLayoutUsersInventoryBinding.invInfoThisItem.setText(item.getDesc());
                        inventoryLayoutUsersInventoryBinding.invValueItemsWeight.setVisibility(0);
                        inventoryLayoutUsersInventoryBinding.invValueItemsWeight.setText(getContext().getString(R.string.inv_items_weight, str));
                        inventoryLayoutUsersInventoryBinding.invIconThisItem.setScaleX(f);
                        inventoryLayoutUsersInventoryBinding.invIconThisItem.setImageBitmap(bitmapFromZip$default);
                        return;
                    }
                    return;
                }
                bitmapFromZip$default = this.itemRender.get(item.getTextIfException());
                itemsValue = item.getItemsValue();
                weight = item.getWeight();
            } else {
                string = getContext().getString(R.string.inv_text_phone_number, item.getTextIfException());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                bitmapFromZip$default = this.itemRender.get(String.valueOf(item.getModelid()));
                itemsValue = item.getItemsValue();
                weight = item.getWeight();
            }
            weight2 = itemsValue * weight;
            name = null;
            string2 = getContext().getString(R.string.common_double_string_values, UtilsKt.buildTypeMerge(item.get_name(), item.get_nameStore()), string);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            timeLeftUntilItemDestroy = item.getTimeLeftUntilItemDestroy();
            if (timeLeftUntilItemDestroy != null) {
                timerDaysAndHoursConvertToDaysAndHours = FormatUtilsKt.convertToDaysAndHours(item.getTimeLeftUntilItemDestroy().intValue());
                if (timerDaysAndHoursConvertToDaysAndHours.getDays() > 999) {
                }
                string4 = getContext().getString(R.string.inv_time_left_until_item_destroy, string4);
            } else {
                timerDaysAndHoursConvertToDaysAndHours = FormatUtilsKt.convertToDaysAndHours(item.getTimeLeftUntilItemDestroy().intValue());
                if (timerDaysAndHoursConvertToDaysAndHours.getDays() > 999) {
                }
                string4 = getContext().getString(R.string.inv_time_left_until_item_destroy, string4);
            }
            if (string4 != null) {
                string2 = string3;
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Constants.STRING_FORMAT, Arrays.copyOf(new Object[]{Double.valueOf(weight2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            inventoryLayoutUsersInventoryBinding = this.binding;
            if (inventoryLayoutUsersInventoryBinding == null) {
            }
        } else {
            clearItemsInfo();
        }
    }

    public final void migrateDataFromSlotToInv() {
        int i;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i2 = this.intermediatePositionInSlot;
        if (i2 != -1 && (i = this.intermediatePositionInInv) != -1 && (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) != null) {
            inventoryAndExchangeViewModel.migrateItemFromSlotToInv(i2, i);
        }
        clearInfoAboutInv();
        clearInfoAboutSlot();
    }

    public final void migrateDataFromInvToSlot(int newPosition) {
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i = this.intermediateOldPositionInInvIfUsed;
        if (i != -1 && (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) != null) {
            inventoryAndExchangeViewModel.migrateItemFromInvToSlot(i, newPosition);
        }
        clearInfoAboutSlot();
        clearInfoAboutInv();
        clearItemsInfo();
    }

    public final void migrateDataInInv() {
        int i;
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel;
        int i2 = this.intermediateOldPositionInInvIfUsed;
        if (i2 != -1 && (i = this.intermediatePositionInInv) != -1 && (inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel) != null) {
            inventoryAndExchangeViewModel.migrateItem(i, i2);
        }
        clearInfoAboutInv();
    }

    public final void deleteThisItem() {
        int i = this.oldPositionWithItem;
        if (i != -1) {
            this.intermediateOldPositionInInvIfUsed = i;
            InvActionWithJSON.INSTANCE.sendIdAndPositionToServer(18, this.oldInvId, i);
        }
    }

    public final void deleteItem() {
        int i = this.intermediateOldPositionInInvIfUsed;
        if (i != -1) {
            InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
            if (inventoryAndExchangeViewModel != null) {
                inventoryAndExchangeViewModel.useOrDeleteTheItem(i);
            }
            clearInfoIfEmptyValue();
        }
    }

    public final void clearInfoIfEmptyValue() {
        int i;
        switch (this.oldInvId) {
            case Constants.ID_TACKLE_1 /* 642 */:
            case Constants.ID_TACKLE_2 /* 643 */:
            case Constants.ID_TACKLE_3 /* 644 */:
            case Constants.ID_TACKLE_4 /* 645 */:
            case Constants.ID_TACKLE_5 /* 646 */:
                i = 0;
                break;
            default:
                i = this.oldInvValue - 1;
                break;
        }
        this.oldInvValue = i;
        if (i == 0) {
            clearItemsInfo();
            clearInfoAboutInv();
        }
    }

    public final void clearItemsInfo() {
        InventoryLayoutUsersInventoryBinding inventoryLayoutUsersInventoryBinding = this.binding;
        if (inventoryLayoutUsersInventoryBinding != null) {
            inventoryLayoutUsersInventoryBinding.invIconThisItem.setImageBitmap(null);
            inventoryLayoutUsersInventoryBinding.invTitleThisItem.setText("");
            inventoryLayoutUsersInventoryBinding.invInfoThisItem.setText("");
            inventoryLayoutUsersInventoryBinding.invValueItemsWeight.setVisibility(4);
        }
    }

    public final void setStartParams() {
        clearInfoAboutSlot();
        clearInfoAboutInv();
        this.oldTimeWithMigrateAndUsed = 0L;
        this.timerBlockCheck = 0L;
        this.migrateCounter = 0;
        this.actionBlockCounter = 0;
        this.actionBlockTimer = 0L;
        this.isFirstShowInv = true;
        this.isFirstShowSlot = true;
    }

    public final void clearInfoAboutSlot() {
        this.oldSlotValue = 0;
        this.oldSlotId = 0;
        this.positionFromSlot = -1;
        this.intermediatePositionInSlot = -1;
        InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter = this.itemsInSlotAdapter;
        if (inventoryItemsInSlotAdapter != null) {
            inventoryItemsInSlotAdapter.setCheckOnlyElement(-1);
        }
    }

    public final void clearInfoAboutInv() {
        this.oldPositionWithItem = -1;
        this.positionInInventory = -1;
        this.intermediateOldPositionInInvIfUsed = -1;
        this.intermediatePositionInInv = -1;
        this.oldInvValue = 0;
        this.oldInvId = 0;
        InventoryItemsAdapter inventoryItemsAdapter = this.inventoryItemsAdapter;
        if (inventoryItemsAdapter != null) {
            inventoryItemsAdapter.setCheckOnlyElement(-1);
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
        InvDialogDelete invDialogDelete = this.invDialogDelete;
        if (invDialogDelete != null) {
            invDialogDelete.closeDialogDelete();
        }
        removeObservers();
    }

    private final void removeObservers() {
        LifecycleOwner viewLifecycleOwner = this.mainRoot.getViewLifecycleOwner();
        InventoryAndExchangeViewModel inventoryAndExchangeViewModel = this.inventoryAndExchangeViewModel;
        if (inventoryAndExchangeViewModel != null) {
            inventoryAndExchangeViewModel.getNewPlayersNick().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewPlayersLevel().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewPlayersId().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewCurrentWeight().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMaxWeight().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewHungerParameter().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewVIPStatus().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewMediatorInvItemsAndSize().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSlotItems().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSkinModelId().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewOldInvPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewInvPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewNewSlotPosition().removeObservers(viewLifecycleOwner);
            inventoryAndExchangeViewModel.getNewSlotsInInventory().removeObservers(viewLifecycleOwner);
        }
    }

    public final void setNullableParameters() {
        InvDialogDelete invDialogDelete = this.invDialogDelete;
        if (invDialogDelete != null) {
            invDialogDelete.closeDialogDelete();
        }
        this.binding = null;
        this.actionClickListener = null;
        this.actionsAdapter = null;
        this.playersStatesAdapter = null;
        this.anim = null;
        this.onItemsClickListener = null;
        this.inventoryItemsAdapter = null;
        this.itemsInSlotAdapter = null;
        this.onItemsInSlotClickListener = null;
        this.invDialogDelete = null;
        this.currentContext = null;
    }
}
