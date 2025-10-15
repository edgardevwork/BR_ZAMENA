package com.blackhub.bronline.game.gui.inventory.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.InventoryExchangeItemBinding;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryExchangeAndTrunkAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.bless.client.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InventoryExchangeAndTrunkAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001*Bc\u0012>\u0010\u0003\u001a:\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004j\u0004\u0018\u0001`\f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f¢\u0006\u0002\u0010\u0012J\b\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u001d\u001a\u00020\u000b2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tH\u0016J\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\tJ8\u0010%\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050&2\u0006\u0010\u0015\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014J\u0014\u0010'\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050&J\u000e\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\tR\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000RF\u0010\u0003\u001a:\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004j\u0004\u0018\u0001`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryExchangeAndTrunkAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryExchangeAndTrunkAdapter$ViewHolder;", "itemsClickListener", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "Lkotlin/ParameterName;", "name", "item", "", "position", "", "Lcom/blackhub/bronline/game/gui/inventory/OnItemsClickListener;", "counterForIdsPlate", "itemRender", "Landroidx/collection/ArrayMap;", "", "Landroid/graphics/Bitmap;", "(Lkotlin/jvm/functions/Function2;ILandroidx/collection/ArrayMap;)V", "itemsList", "", "sizeInv", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "vehiclesList", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "getItemCount", "getItemId", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCheckOnlyElement", "checkedPosition", "setItems", "", "updateItems", "updateSize", "newSize", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes2.dex */
public final class InventoryExchangeAndTrunkAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public final int counterForIdsPlate;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender;

    @Nullable
    public final Function2<InvItems, Integer, Unit> itemsClickListener;

    @NotNull
    public List<InvItems> itemsList;
    public int sizeInv;

    @NotNull
    public List<SkinsDTO> skinsList;

    @NotNull
    public List<VehiclesDTO> vehiclesList;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InventoryExchangeAndTrunkAdapter(@Nullable Function2<? super InvItems, ? super Integer, Unit> function2, int i, @NotNull ArrayMap<String, Bitmap> itemRender) {
        Intrinsics.checkNotNullParameter(itemRender, "itemRender");
        this.itemsClickListener = function2;
        this.counterForIdsPlate = i;
        this.itemRender = itemRender;
        this.itemsList = CollectionsKt__CollectionsKt.emptyList();
        this.vehiclesList = CollectionsKt__CollectionsKt.emptyList();
        this.skinsList = CollectionsKt__CollectionsKt.emptyList();
    }

    public final void setItems(@NotNull List<InvItems> itemsList, int sizeInv, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList) {
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        this.itemsList = itemsList;
        this.sizeInv = sizeInv;
        this.vehiclesList = vehiclesList;
        this.skinsList = skinsList;
        notifyDataSetChanged();
    }

    public final void updateItems(@NotNull List<InvItems> itemsList) {
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        this.itemsList = itemsList;
    }

    public final void updateSize(int newSize) {
        int i = this.sizeInv;
        this.sizeInv = newSize;
        if (i <= newSize || newSize > i) {
            return;
        }
        while (true) {
            notifyItemRemoved(i);
            if (i == newSize) {
                return;
            } else {
                i--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        InventoryExchangeItemBinding inventoryExchangeItemBindingInflate = InventoryExchangeItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inventoryExchangeItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, inventoryExchangeItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.itemsList.get(position), this.itemsClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount, reason: from getter */
    public int getSizeInv() {
        return this.sizeInv;
    }

    /* compiled from: InventoryExchangeAndTrunkAdapter.kt */
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JN\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2>\u0010\t\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nj\u0004\u0018\u0001`\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryExchangeAndTrunkAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/InventoryExchangeItemBinding;", "(Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryExchangeAndTrunkAdapter;Lcom/blackhub/bronline/databinding/InventoryExchangeItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "itemsClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "position", "Lcom/blackhub/bronline/game/gui/inventory/OnItemsClickListener;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nInventoryExchangeAndTrunkAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryExchangeAndTrunkAdapter.kt\ncom/blackhub/bronline/game/gui/inventory/adapters/InventoryExchangeAndTrunkAdapter$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final InventoryExchangeItemBinding binding;
        public final /* synthetic */ InventoryExchangeAndTrunkAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull InventoryExchangeAndTrunkAdapter inventoryExchangeAndTrunkAdapter, InventoryExchangeItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = inventoryExchangeAndTrunkAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final InvItems item, @Nullable final Function2<? super InvItems, ? super Integer, Unit> itemsClickListener) {
            int id;
            int layoutPosition;
            Object next;
            String strValueOf;
            Intrinsics.checkNotNullParameter(item, "item");
            if (!item.getCheck()) {
                this.binding.invItemActiveBg.setVisibility(4);
            } else {
                this.binding.invItemActiveBg.setVisibility(0);
            }
            if (item.getItemsValue() == 0) {
                this.binding.invValueItems.setVisibility(4);
                this.binding.invLineUpOrDown.setVisibility(4);
                this.binding.invUnderline.setVisibility(4);
                this.binding.invItemItemsIcon.setImageBitmap(null);
                this.binding.bgItemsAura.setVisibility(0);
            } else {
                this.binding.invValueItems.setVisibility(0);
                this.binding.invLineUpOrDown.setVisibility(0);
                this.binding.invUnderline.setVisibility(0);
                this.binding.bgItemsAura.setVisibility(4);
                int i = this.this$0.counterForIdsPlate;
                if (i == 0) {
                    id = item.getId();
                    layoutPosition = getLayoutPosition();
                } else if (i == 1) {
                    id = item.getId() + getLayoutPosition();
                    layoutPosition = this.this$0.itemsList.size() * 2;
                } else {
                    id = item.getId() + getLayoutPosition();
                    layoutPosition = this.this$0.itemsList.size() * 4;
                }
                int i2 = id + layoutPosition;
                int id2 = item.getId();
                if (id2 == 59) {
                    Bitmap bitmap = (Bitmap) this.this$0.itemRender.get(item.getTextIfException());
                    this.binding.invItemItemsIcon.setScaleX(-1.0f);
                    if (bitmap == null) {
                        String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(item.getTextIfException(), Constants.RIGHT_DELIMITER, (String) null, 2, (Object) null);
                        String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(item.getTextIfException(), Constants.LEFT_DELIMITER, (String) null, 2, (Object) null);
                        Useful useful = Useful.INSTANCE;
                        ImageView invItemItemsIcon = this.binding.invItemItemsIcon;
                        Intrinsics.checkNotNullExpressionValue(invItemItemsIcon, "invItemItemsIcon");
                        useful.renderPlate(1, i2, strSubstringBefore$default, strSubstringAfter$default, invItemItemsIcon, this.this$0.itemRender, item.getTextIfException());
                    } else {
                        this.binding.invItemItemsIcon.setImageBitmap(bitmap);
                    }
                } else if (id2 != 134) {
                    switch (id2) {
                        case 81:
                            Bitmap bitmap2 = (Bitmap) this.this$0.itemRender.get(item.getTextIfException());
                            this.binding.invItemItemsIcon.setScaleX(-1.0f);
                            if (bitmap2 == null) {
                                String textIfException = item.getTextIfException();
                                String strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                                Useful useful2 = Useful.INSTANCE;
                                ImageView invItemItemsIcon2 = this.binding.invItemItemsIcon;
                                Intrinsics.checkNotNullExpressionValue(invItemItemsIcon2, "invItemItemsIcon");
                                useful2.renderPlate(2, i2, textIfException, strEmpty, invItemItemsIcon2, this.this$0.itemRender, item.getTextIfException());
                                break;
                            } else {
                                this.binding.invItemItemsIcon.setImageBitmap(bitmap2);
                                break;
                            }
                        case 82:
                            Bitmap bitmap3 = (Bitmap) this.this$0.itemRender.get(item.getTextIfException());
                            this.binding.invItemItemsIcon.setScaleX(-1.0f);
                            if (bitmap3 == null) {
                                String textIfException2 = item.getTextIfException();
                                String strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                                Useful useful3 = Useful.INSTANCE;
                                ImageView invItemItemsIcon3 = this.binding.invItemItemsIcon;
                                Intrinsics.checkNotNullExpressionValue(invItemItemsIcon3, "invItemItemsIcon");
                                useful3.renderPlate(3, i2, textIfException2, strEmpty2, invItemItemsIcon3, this.this$0.itemRender, item.getTextIfException());
                                break;
                            } else {
                                this.binding.invItemItemsIcon.setImageBitmap(bitmap3);
                                break;
                            }
                        case 83:
                            Bitmap bitmap4 = (Bitmap) this.this$0.itemRender.get(item.getTextIfException());
                            this.binding.invItemItemsIcon.setScaleX(-1.0f);
                            if (bitmap4 == null) {
                                String strSubstringBefore$default2 = StringsKt__StringsKt.substringBefore$default(item.getTextIfException(), Constants.RIGHT_DELIMITER, (String) null, 2, (Object) null);
                                String strSubstringAfter$default2 = StringsKt__StringsKt.substringAfter$default(item.getTextIfException(), Constants.LEFT_DELIMITER, (String) null, 2, (Object) null);
                                Useful useful4 = Useful.INSTANCE;
                                ImageView invItemItemsIcon4 = this.binding.invItemItemsIcon;
                                Intrinsics.checkNotNullExpressionValue(invItemItemsIcon4, "invItemItemsIcon");
                                useful4.renderPlate(4, i2, strSubstringBefore$default2, strSubstringAfter$default2, invItemItemsIcon4, this.this$0.itemRender, item.getTextIfException());
                                break;
                            } else {
                                this.binding.invItemItemsIcon.setImageBitmap(bitmap4);
                                break;
                            }
                        default:
                            if (item.getImageName() == null) {
                                Bitmap bitmap5 = (Bitmap) this.this$0.itemRender.get(String.valueOf(item.getModelid()));
                                this.binding.invItemItemsIcon.setScaleX(-1.0f);
                                if (bitmap5 == null) {
                                    Useful useful5 = Useful.INSTANCE;
                                    Integer numValueOf = Integer.valueOf(item.getId());
                                    Integer numValueOf2 = Integer.valueOf(item.getModelid());
                                    ImageView invItemItemsIcon5 = this.binding.invItemItemsIcon;
                                    Intrinsics.checkNotNullExpressionValue(invItemItemsIcon5, "invItemItemsIcon");
                                    useful5.renderItem(0, numValueOf, numValueOf2, 3, invItemItemsIcon5, Float.valueOf(item.getX()), Float.valueOf(item.getY()), Float.valueOf(item.getZ()), Float.valueOf(item.getZoom()), Float.valueOf(item.getShiftX()), Float.valueOf(item.getShiftY()), Float.valueOf(item.getShiftZ()), this.this$0.itemRender);
                                    break;
                                } else {
                                    this.binding.invItemItemsIcon.setImageBitmap(bitmap5);
                                    break;
                                }
                            } else {
                                Context context = this.binding.getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                String imageName = item.getImageName();
                                if (imageName == null) {
                                    imageName = "";
                                }
                                Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(context, imageName, ImageTypePathInCDNEnum.ACCESSORY, 0.0f, 0.0f, 24, null);
                                InventoryExchangeItemBinding inventoryExchangeItemBinding = this.binding;
                                inventoryExchangeItemBinding.invItemItemsIcon.setScaleX(1.0f);
                                inventoryExchangeItemBinding.invItemItemsIcon.setImageBitmap(bitmapFromZip$default);
                                break;
                            }
                    }
                } else {
                    Iterator it = this.this$0.skinsList.iterator();
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
                    if ((skinsDTO != null ? skinsDTO.getImageName() : null) == null) {
                        Bitmap bitmap6 = (Bitmap) this.this$0.itemRender.get(String.valueOf(item.getModelid()));
                        this.binding.invItemItemsIcon.setScaleX(-1.0f);
                        if (bitmap6 == null) {
                            Useful useful6 = Useful.INSTANCE;
                            Integer numValueOf3 = Integer.valueOf(item.getId());
                            Integer numValueOf4 = Integer.valueOf(item.getModelid());
                            ImageView invItemItemsIcon6 = this.binding.invItemItemsIcon;
                            Intrinsics.checkNotNullExpressionValue(invItemItemsIcon6, "invItemItemsIcon");
                            useful6.renderItem(2, numValueOf3, numValueOf4, 1, invItemItemsIcon6, Float.valueOf(item.getX()), Float.valueOf(item.getY()), Float.valueOf(item.getZ()), Float.valueOf(item.getZoom()), Float.valueOf(item.getShiftX()), Float.valueOf(item.getShiftY()), Float.valueOf(item.getShiftZ()), this.this$0.itemRender);
                        } else {
                            this.binding.invItemItemsIcon.setImageBitmap(bitmap6);
                        }
                    } else {
                        Context context2 = this.binding.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        Bitmap bitmapFromZip$default2 = BitmapUtilsKt.getBitmapFromZip$default(context2, skinsDTO.getImageName(), ImageTypePathInCDNEnum.SKIN, 0.0f, 0.0f, 24, null);
                        InventoryExchangeItemBinding inventoryExchangeItemBinding2 = this.binding;
                        inventoryExchangeItemBinding2.invItemItemsIcon.setScaleX(1.0f);
                        inventoryExchangeItemBinding2.invItemItemsIcon.setImageBitmap(bitmapFromZip$default2);
                    }
                }
            }
            int whoseItem = item.getWhoseItem();
            if (whoseItem == 0) {
                this.binding.invLineUpOrDown.setVisibility(4);
                this.binding.invUnderline.setVisibility(4);
            } else if (whoseItem == 1) {
                this.binding.invLineUpOrDown.setVisibility(0);
                this.binding.invUnderline.setVisibility(0);
                this.binding.invLineUpOrDown.setImageResource(R.drawable.ic_arrow_up_1);
            } else if (whoseItem == 2) {
                this.binding.invLineUpOrDown.setVisibility(0);
                this.binding.invUnderline.setVisibility(0);
                this.binding.invLineUpOrDown.setImageResource(R.drawable.ic_arrow_down);
            }
            if (item.getId() == 58) {
                strValueOf = item.getTextIfException();
            } else {
                strValueOf = String.valueOf(item.getItemsValue());
            }
            this.binding.invValueItems.setText(strValueOf);
            this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.adapters.InventoryExchangeAndTrunkAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InventoryExchangeAndTrunkAdapter.ViewHolder.bind$lambda$3(itemsClickListener, item, this, view);
                }
            });
        }

        public static final void bind$lambda$3(Function2 function2, InvItems item, ViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (function2 != null) {
                function2.invoke(item, Integer.valueOf(this$0.getLayoutPosition()));
            }
        }
    }

    public final void setCheckOnlyElement(int checkedPosition) {
        int size = this.itemsList.size();
        for (int i = 0; i < size; i++) {
            if (this.itemsList.get(i).getCheck() && i != checkedPosition) {
                this.itemsList.get(i).setCheck(false);
                notifyItemChanged(i);
            }
        }
    }
}
