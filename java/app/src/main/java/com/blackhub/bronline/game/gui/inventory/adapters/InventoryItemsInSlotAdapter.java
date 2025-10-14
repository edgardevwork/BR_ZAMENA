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
import com.blackhub.bronline.databinding.InventoryItemInSlotBinding;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsInSlotAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
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

/* compiled from: InventoryItemsInSlotAdapter.kt */
@StabilityInferred(parameters = 0)

public final class InventoryItemsInSlotAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public final boolean isInventory;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender;

    @Nullable
    public final Function2<InvItems, Integer, Unit> itemsClickListener;

    @NotNull
    public List<InvItems> itemsList;

    @NotNull
    public List<SkinsDTO> skinsList;

    /* JADX WARN: Multi-variable type inference failed */
    public InventoryItemsInSlotAdapter(@Nullable Function2<? super InvItems, ? super Integer, Unit> function2, boolean z, @NotNull ArrayMap<String, Bitmap> itemRender) {
        Intrinsics.checkNotNullParameter(itemRender, "itemRender");
        this.itemsClickListener = function2;
        this.isInventory = z;
        this.itemRender = itemRender;
        this.itemsList = CollectionsKt__CollectionsKt.emptyList();
        this.skinsList = CollectionsKt__CollectionsKt.emptyList();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setSlotItems(@NotNull List<InvItems> itemsList, @NotNull List<SkinsDTO> skinsList) {
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        this.itemsList = itemsList;
        this.skinsList = skinsList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        InventoryItemInSlotBinding inventoryItemInSlotBindingInflate = InventoryItemInSlotBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inventoryItemInSlotBindingInflate, "inflate(...)");
        return new ViewHolder(this, inventoryItemInSlotBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.itemsList.get(position), this.itemsClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.itemsList.size();
    }

    /* compiled from: InventoryItemsInSlotAdapter.kt */
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JN\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2>\u0010\t\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nj\u0004\u0018\u0001`\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsInSlotAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/InventoryItemInSlotBinding;", "(Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsInSlotAdapter;Lcom/blackhub/bronline/databinding/InventoryItemInSlotBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "itemsClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "position", "Lcom/blackhub/bronline/game/gui/inventory/OnItemsClickListener;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nInventoryItemsInSlotAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryItemsInSlotAdapter.kt\ncom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsInSlotAdapter$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final InventoryItemInSlotBinding binding;
        public final /* synthetic */ InventoryItemsInSlotAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull InventoryItemsInSlotAdapter inventoryItemsInSlotAdapter, InventoryItemInSlotBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = inventoryItemsInSlotAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final InvItems item, @Nullable final Function2<? super InvItems, ? super Integer, Unit> itemsClickListener) {
            Object next;
            Intrinsics.checkNotNullParameter(item, "item");
            if (!item.getCheck()) {
                this.binding.invSlotActiveBg.setVisibility(4);
            } else {
                this.binding.invSlotActiveBg.setVisibility(0);
            }
            if (item.getItemsValue() != 0) {
                int id = item.getId();
                if (id == 59) {
                    Bitmap bitmap = (Bitmap) this.this$0.itemRender.get(item.getTextIfException());
                    if (bitmap == null) {
                        String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(item.getTextIfException(), Constants.RIGHT_DELIMITER, (String) null, 2, (Object) null);
                        String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(item.getTextIfException(), Constants.LEFT_DELIMITER, (String) null, 2, (Object) null);
                        int id2 = item.getId() + getLayoutPosition();
                        this.binding.playersItem.setScaleX(-1.0f);
                        Useful useful = Useful.INSTANCE;
                        ImageView playersItem = this.binding.playersItem;
                        Intrinsics.checkNotNullExpressionValue(playersItem, "playersItem");
                        useful.renderPlate(1, id2, strSubstringBefore$default, strSubstringAfter$default, playersItem, this.this$0.itemRender, item.getTextIfException());
                    } else {
                        this.binding.playersItem.setImageBitmap(bitmap);
                    }
                } else if (id != 134) {
                    switch (id) {
                        case 81:
                            Bitmap bitmap2 = (Bitmap) this.this$0.itemRender.get(item.getTextIfException());
                            this.binding.playersItem.setScaleX(-1.0f);
                            if (bitmap2 == null) {
                                String textIfException = item.getTextIfException();
                                String strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                                int id3 = item.getId() + getLayoutPosition();
                                Useful useful2 = Useful.INSTANCE;
                                ImageView playersItem2 = this.binding.playersItem;
                                Intrinsics.checkNotNullExpressionValue(playersItem2, "playersItem");
                                useful2.renderPlate(2, id3, textIfException, strEmpty, playersItem2, this.this$0.itemRender, item.getTextIfException());
                                break;
                            } else {
                                this.binding.playersItem.setImageBitmap(bitmap2);
                                break;
                            }
                        case 82:
                            Bitmap bitmap3 = (Bitmap) this.this$0.itemRender.get(item.getTextIfException());
                            this.binding.playersItem.setScaleX(-1.0f);
                            if (bitmap3 == null) {
                                String textIfException2 = item.getTextIfException();
                                String strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                                int id4 = item.getId() + getLayoutPosition();
                                Useful useful3 = Useful.INSTANCE;
                                ImageView playersItem3 = this.binding.playersItem;
                                Intrinsics.checkNotNullExpressionValue(playersItem3, "playersItem");
                                useful3.renderPlate(3, id4, textIfException2, strEmpty2, playersItem3, this.this$0.itemRender, item.getTextIfException());
                                break;
                            } else {
                                this.binding.playersItem.setImageBitmap(bitmap3);
                                break;
                            }
                        case 83:
                            Bitmap bitmap4 = (Bitmap) this.this$0.itemRender.get(item.getTextIfException());
                            this.binding.playersItem.setScaleX(-1.0f);
                            if (bitmap4 == null) {
                                String strSubstringBefore$default2 = StringsKt__StringsKt.substringBefore$default(item.getTextIfException(), Constants.RIGHT_DELIMITER, (String) null, 2, (Object) null);
                                String strSubstringAfter$default2 = StringsKt__StringsKt.substringAfter$default(item.getTextIfException(), Constants.LEFT_DELIMITER, (String) null, 2, (Object) null);
                                int id5 = item.getId() + getLayoutPosition();
                                Useful useful4 = Useful.INSTANCE;
                                ImageView playersItem4 = this.binding.playersItem;
                                Intrinsics.checkNotNullExpressionValue(playersItem4, "playersItem");
                                useful4.renderPlate(4, id5, strSubstringBefore$default2, strSubstringAfter$default2, playersItem4, this.this$0.itemRender, item.getTextIfException());
                                break;
                            } else {
                                this.binding.playersItem.setImageBitmap(bitmap4);
                                break;
                            }
                        default:
                            if (item.getImageName() == null) {
                                Bitmap bitmap5 = (Bitmap) this.this$0.itemRender.get(String.valueOf(item.getModelid()));
                                this.binding.playersItem.setScaleX(-1.0f);
                                if (bitmap5 == null) {
                                    Useful useful5 = Useful.INSTANCE;
                                    Integer numValueOf = Integer.valueOf(item.getId());
                                    Integer numValueOf2 = Integer.valueOf(item.getModelid());
                                    ImageView playersItem5 = this.binding.playersItem;
                                    Intrinsics.checkNotNullExpressionValue(playersItem5, "playersItem");
                                    useful5.renderItem(0, numValueOf, numValueOf2, 3, playersItem5, Float.valueOf(item.getX()), Float.valueOf(item.getY()), Float.valueOf(item.getZ()), Float.valueOf(item.getZoom()), Float.valueOf(item.getShiftX()), Float.valueOf(item.getShiftY()), Float.valueOf(item.getShiftZ()), this.this$0.itemRender);
                                    break;
                                } else {
                                    this.binding.playersItem.setImageBitmap(bitmap5);
                                    break;
                                }
                            } else {
                                Context context = this.binding.getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                String imageName = item.getImageName();
                                Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(context, imageName == null ? "" : imageName, ImageTypePathInCDNEnum.ACCESSORY, 0.0f, 0.0f, 24, null);
                                InventoryItemInSlotBinding inventoryItemInSlotBinding = this.binding;
                                inventoryItemInSlotBinding.playersItem.setScaleX(1.0f);
                                inventoryItemInSlotBinding.playersItem.setImageBitmap(bitmapFromZip$default);
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
                        this.binding.playersItem.setScaleX(-1.0f);
                        if (bitmap6 == null) {
                            Useful useful6 = Useful.INSTANCE;
                            Integer numValueOf3 = Integer.valueOf(item.getId());
                            Integer numValueOf4 = Integer.valueOf(item.getModelid());
                            ImageView playersItem6 = this.binding.playersItem;
                            Intrinsics.checkNotNullExpressionValue(playersItem6, "playersItem");
                            useful6.renderItem(2, numValueOf3, numValueOf4, 1, playersItem6, Float.valueOf(item.getX()), Float.valueOf(item.getY()), Float.valueOf(item.getZ()), Float.valueOf(item.getZoom()), Float.valueOf(item.getShiftX()), Float.valueOf(item.getShiftY()), Float.valueOf(item.getShiftZ()), this.this$0.itemRender);
                        } else {
                            this.binding.playersItem.setImageBitmap(bitmap6);
                        }
                    } else {
                        Context context2 = this.binding.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        String imageName2 = skinsDTO.getImageName();
                        Bitmap bitmapFromZip$default2 = BitmapUtilsKt.getBitmapFromZip$default(context2, imageName2 == null ? "" : imageName2, ImageTypePathInCDNEnum.SKIN, 0.0f, 0.0f, 24, null);
                        InventoryItemInSlotBinding inventoryItemInSlotBinding2 = this.binding;
                        inventoryItemInSlotBinding2.playersItem.setScaleX(1.0f);
                        inventoryItemInSlotBinding2.playersItem.setImageBitmap(bitmapFromZip$default2);
                    }
                }
            } else {
                this.binding.playersItem.setImageBitmap(null);
            }
            if (getLayoutPosition() == 0 && this.this$0.isInventory) {
                this.binding.iconTelephone.setVisibility(0);
            } else {
                this.binding.iconTelephone.setVisibility(8);
            }
            this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsInSlotAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InventoryItemsInSlotAdapter.ViewHolder.bind$lambda$3(itemsClickListener, item, this, view);
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

