package com.blackhub.bronline.game.gui.inventory.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.InventoryItemsItemBinding;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.inventory.Constants;
import com.blackhub.bronline.game.gui.inventory.UILayoutUsersInventory;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.bless.client.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InventoryItemsAdapter.kt */
@StabilityInferred(parameters = 0)

public final class InventoryItemsAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: bgIcon$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy bgIcon;

    /* renamed from: crowIcon$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy crowIcon;

    @NotNull
    public final ArrayMap<String, Bitmap> itemRender;

    @Nullable
    public final Function2<InvItems, Integer, Unit> itemsClickListener;

    @NotNull
    public List<InvItems> itemsList;
    public int positionWithBlocked;

    @NotNull
    public List<SkinsDTO> skinsList;

    /* renamed from: textIfBlock$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy textIfBlock;

    @NotNull
    public final UILayoutUsersInventory thisRoot;

    /* JADX WARN: Multi-variable type inference failed */
    public InventoryItemsAdapter(@Nullable Function2<? super InvItems, ? super Integer, Unit> function2, @NotNull UILayoutUsersInventory thisRoot, @NotNull ArrayMap<String, Bitmap> itemRender) {
        Intrinsics.checkNotNullParameter(thisRoot, "thisRoot");
        Intrinsics.checkNotNullParameter(itemRender, "itemRender");
        this.itemsClickListener = function2;
        this.thisRoot = thisRoot;
        this.itemRender = itemRender;
        this.itemsList = CollectionsKt__CollectionsKt.emptyList();
        this.skinsList = CollectionsKt__CollectionsKt.emptyList();
        this.crowIcon = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsAdapter$crowIcon$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ContextCompat.getDrawable(JNIActivity.getContext(), R.drawable.ic_crown);
            }
        });
        this.bgIcon = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsAdapter$bgIcon$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ContextCompat.getDrawable(JNIActivity.getContext(), R.drawable.ic_bg_radial_mask_cr8);
            }
        });
        this.textIfBlock = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.inventory.adapters.InventoryItemsAdapter$textIfBlock$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return JNIActivity.getContext().getString(R.string.inv_text_if_not_actual_for_item);
            }
        });
    }

    public final Drawable getCrowIcon() {
        return (Drawable) this.crowIcon.getValue();
    }

    public final Drawable getBgIcon() {
        return (Drawable) this.bgIcon.getValue();
    }

    public final String getTextIfBlock() {
        return (String) this.textIfBlock.getValue();
    }

    public final void updateActiveSlots(int sizeActiveSlots) {
        int size = this.itemsList.size();
        for (int i = 0; i < size; i++) {
            if (i >= sizeActiveSlots) {
                notifyItemChanged(i);
            }
        }
        this.positionWithBlocked = sizeActiveSlots;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(@NotNull List<InvItems> itemsList, int sizeActiveSlots, @NotNull List<SkinsDTO> skinsList) {
        Intrinsics.checkNotNullParameter(itemsList, "itemsList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        this.positionWithBlocked = sizeActiveSlots;
        this.itemsList = itemsList;
        this.skinsList = skinsList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        InventoryItemsItemBinding inventoryItemsItemBindingInflate = InventoryItemsItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inventoryItemsItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, inventoryItemsItemBindingInflate);
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

    /* compiled from: InventoryItemsAdapter.kt */
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JP\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2>\u0010\t\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nj\u0004\u0018\u0001`\u000fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/InventoryItemsItemBinding;", "(Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsAdapter;Lcom/blackhub/bronline/databinding/InventoryItemsItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "itemsClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "position", "Lcom/blackhub/bronline/game/gui/inventory/OnItemsClickListener;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nInventoryItemsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryItemsAdapter.kt\ncom/blackhub/bronline/game/gui/inventory/adapters/InventoryItemsAdapter$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,476:1\n1#2:477\n*E\n"})
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final InventoryItemsItemBinding binding;
        public final /* synthetic */ InventoryItemsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull InventoryItemsAdapter inventoryItemsAdapter, InventoryItemsItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = inventoryItemsAdapter;
            this.binding = binding;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final void bind(@NotNull InvItems item, @Nullable Function2<? super InvItems, ? super Integer, Unit> itemsClickListener) {
            Object next;
            Object next2;
            Drawable bgIcon;
            Intrinsics.checkNotNullParameter(item, "item");
            InventoryItemsItemBinding inventoryItemsItemBinding = this.binding;
            InventoryItemsAdapter inventoryItemsAdapter = this.this$0;
            if (!item.getCheck()) {
                inventoryItemsItemBinding.invItemActiveBg.setVisibility(4);
            } else {
                inventoryItemsItemBinding.invItemActiveBg.setVisibility(0);
            }
            String textIfBlock = "";
            Drawable crowIcon = null;
            if (item.getItemsValue() == 0) {
                inventoryItemsItemBinding.invValueItems.setVisibility(4);
                inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(null);
                inventoryItemsItemBinding.bgItemsAura.setVisibility(0);
            } else {
                inventoryItemsItemBinding.invValueItems.setVisibility(0);
                inventoryItemsItemBinding.bgItemsAura.setVisibility(4);
                int id = item.getId();
                if (id == 59) {
                    Bitmap bitmap = (Bitmap) inventoryItemsAdapter.itemRender.get(item.getTextIfException());
                    inventoryItemsItemBinding.invItemItemsIcon.setScaleX(-1.0f);
                    if (bitmap == null) {
                        String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(item.getTextIfException(), Constants.RIGHT_DELIMITER, (String) null, 2, (Object) null);
                        String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(item.getTextIfException(), Constants.LEFT_DELIMITER, (String) null, 2, (Object) null);
                        int id2 = item.getId() + getLayoutPosition();
                        Useful useful = Useful.INSTANCE;
                        ImageView invItemItemsIcon = inventoryItemsItemBinding.invItemItemsIcon;
                        Intrinsics.checkNotNullExpressionValue(invItemItemsIcon, "invItemItemsIcon");
                        useful.renderPlate(1, id2, strSubstringBefore$default, strSubstringAfter$default, invItemItemsIcon, inventoryItemsAdapter.itemRender, item.getTextIfException());
                    } else {
                        inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(bitmap);
                    }
                } else if (id != 134) {
                    switch (id) {
                        case 81:
                            Iterator it = inventoryItemsAdapter.skinsList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    Integer modelId = ((SkinsDTO) next2).getModelId();
                                    int modelid = item.getModelid();
                                    if (modelId != null && modelId.intValue() == modelid) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            SkinsDTO skinsDTO = (SkinsDTO) next2;
                            if (skinsDTO == null) {
                                Bitmap bitmap2 = (Bitmap) inventoryItemsAdapter.itemRender.get(item.getTextIfException());
                                inventoryItemsItemBinding.invItemItemsIcon.setScaleX(-1.0f);
                                if (bitmap2 == null) {
                                    String textIfException = item.getTextIfException();
                                    String strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                                    int id3 = item.getId() + getLayoutPosition();
                                    Useful useful2 = Useful.INSTANCE;
                                    ImageView invItemItemsIcon2 = inventoryItemsItemBinding.invItemItemsIcon;
                                    Intrinsics.checkNotNullExpressionValue(invItemItemsIcon2, "invItemItemsIcon");
                                    useful2.renderPlate(2, id3, textIfException, strEmpty, invItemItemsIcon2, inventoryItemsAdapter.itemRender, item.getTextIfException());
                                    break;
                                } else {
                                    inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(bitmap2);
                                    break;
                                }
                            } else {
                                Context context = inventoryItemsItemBinding.getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                String imageName = skinsDTO.getImageName();
                                Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(context, imageName == null ? "" : imageName, ImageTypePathInCDNEnum.SKIN, 0.0f, 0.0f, 24, null);
                                inventoryItemsItemBinding.invItemItemsIcon.setScaleX(1.0f);
                                inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(bitmapFromZip$default);
                                break;
                            }
                            break;
                        case 82:
                            Bitmap bitmap3 = (Bitmap) inventoryItemsAdapter.itemRender.get(item.getTextIfException());
                            inventoryItemsItemBinding.invItemItemsIcon.setScaleX(-1.0f);
                            if (bitmap3 == null) {
                                String textIfException2 = item.getTextIfException();
                                String strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                                int id4 = item.getId() + getLayoutPosition();
                                Useful useful3 = Useful.INSTANCE;
                                ImageView invItemItemsIcon3 = inventoryItemsItemBinding.invItemItemsIcon;
                                Intrinsics.checkNotNullExpressionValue(invItemItemsIcon3, "invItemItemsIcon");
                                useful3.renderPlate(3, id4, textIfException2, strEmpty2, invItemItemsIcon3, inventoryItemsAdapter.itemRender, item.getTextIfException());
                                break;
                            } else {
                                inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(bitmap3);
                                break;
                            }
                        case 83:
                            Bitmap bitmap4 = (Bitmap) inventoryItemsAdapter.itemRender.get(item.getTextIfException());
                            inventoryItemsItemBinding.invItemItemsIcon.setScaleX(-1.0f);
                            if (bitmap4 == null) {
                                String strSubstringBefore$default2 = StringsKt__StringsKt.substringBefore$default(item.getTextIfException(), Constants.RIGHT_DELIMITER, (String) null, 2, (Object) null);
                                String strSubstringAfter$default2 = StringsKt__StringsKt.substringAfter$default(item.getTextIfException(), Constants.LEFT_DELIMITER, (String) null, 2, (Object) null);
                                int id5 = item.getId() + getLayoutPosition();
                                Useful useful4 = Useful.INSTANCE;
                                ImageView invItemItemsIcon4 = inventoryItemsItemBinding.invItemItemsIcon;
                                Intrinsics.checkNotNullExpressionValue(invItemItemsIcon4, "invItemItemsIcon");
                                useful4.renderPlate(4, id5, strSubstringBefore$default2, strSubstringAfter$default2, invItemItemsIcon4, inventoryItemsAdapter.itemRender, item.getTextIfException());
                                break;
                            } else {
                                inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(bitmap4);
                                break;
                            }
                        default:
                            if (item.getImageName() == null) {
                                Bitmap bitmap5 = (Bitmap) inventoryItemsAdapter.itemRender.get(String.valueOf(item.getModelid()));
                                inventoryItemsItemBinding.invItemItemsIcon.setScaleX(-1.0f);
                                if (bitmap5 == null) {
                                    Useful useful5 = Useful.INSTANCE;
                                    Integer numValueOf = Integer.valueOf(item.getId());
                                    Integer numValueOf2 = Integer.valueOf(item.getModelid());
                                    ImageView invItemItemsIcon5 = inventoryItemsItemBinding.invItemItemsIcon;
                                    Intrinsics.checkNotNullExpressionValue(invItemItemsIcon5, "invItemItemsIcon");
                                    useful5.renderItem(0, numValueOf, numValueOf2, 3, invItemItemsIcon5, Float.valueOf(item.getX()), Float.valueOf(item.getY()), Float.valueOf(item.getZ()), Float.valueOf(item.getZoom()), Float.valueOf(item.getShiftX()), Float.valueOf(item.getShiftY()), Float.valueOf(item.getShiftZ()), inventoryItemsAdapter.itemRender);
                                    break;
                                } else {
                                    inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(bitmap5);
                                    break;
                                }
                            } else {
                                Context context2 = inventoryItemsItemBinding.getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                String imageName2 = item.getImageName();
                                Bitmap bitmapFromZip$default2 = BitmapUtilsKt.getBitmapFromZip$default(context2, imageName2 == null ? "" : imageName2, ImageTypePathInCDNEnum.ACCESSORY, 0.0f, 0.0f, 24, null);
                                inventoryItemsItemBinding.invItemItemsIcon.setScaleX(1.0f);
                                inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(bitmapFromZip$default2);
                                break;
                            }
                    }
                } else {
                    Iterator it2 = inventoryItemsAdapter.skinsList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        Integer modelId2 = ((SkinsDTO) next).getModelId();
                        int modelid2 = item.getModelid();
                        if (modelId2 != null && modelId2.intValue() == modelid2) {
                            break;
                        }
                    }
                    SkinsDTO skinsDTO2 = (SkinsDTO) next;
                    if (!AnyExtensionKt.isNotNull(skinsDTO2 != null ? skinsDTO2.getImageName() : null)) {
                        Bitmap bitmap6 = (Bitmap) inventoryItemsAdapter.itemRender.get(String.valueOf(item.getModelid()));
                        inventoryItemsItemBinding.invItemItemsIcon.setScaleX(-1.0f);
                        if (bitmap6 == null) {
                            Useful useful6 = Useful.INSTANCE;
                            Integer numValueOf3 = Integer.valueOf(item.getId());
                            Integer numValueOf4 = Integer.valueOf(item.getModelid());
                            ImageView invItemItemsIcon6 = inventoryItemsItemBinding.invItemItemsIcon;
                            Intrinsics.checkNotNullExpressionValue(invItemItemsIcon6, "invItemItemsIcon");
                            useful6.renderItem(2, numValueOf3, numValueOf4, 1, invItemItemsIcon6, Float.valueOf(item.getX()), Float.valueOf(item.getY()), Float.valueOf(item.getZ()), Float.valueOf(item.getZoom()), Float.valueOf(item.getShiftX()), Float.valueOf(item.getShiftY()), Float.valueOf(item.getShiftZ()), inventoryItemsAdapter.itemRender);
                        } else {
                            inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(bitmap6);
                        }
                    } else {
                        Context context3 = inventoryItemsItemBinding.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        String imageName3 = skinsDTO2 != null ? skinsDTO2.getImageName() : null;
                        Bitmap bitmapFromZip$default3 = BitmapUtilsKt.getBitmapFromZip$default(context3, imageName3 == null ? "" : imageName3, ImageTypePathInCDNEnum.SKIN, 0.0f, 0.0f, 24, null);
                        inventoryItemsItemBinding.invItemItemsIcon.setScaleX(1.0f);
                        inventoryItemsItemBinding.invItemItemsIcon.setImageBitmap(bitmapFromZip$default3);
                    }
                }
            }
            inventoryItemsItemBinding.invValueItems.setText(String.valueOf(item.getItemsValue()));
            if (getLayoutPosition() > inventoryItemsAdapter.positionWithBlocked) {
                crowIcon = inventoryItemsAdapter.getCrowIcon();
                bgIcon = inventoryItemsAdapter.getBgIcon();
                textIfBlock = inventoryItemsAdapter.getTextIfBlock();
            } else {
                bgIcon = null;
            }
            this.binding.iconIfNoActive.setImageDrawable(crowIcon);
            this.binding.bgMask.setBackground(bgIcon);
            this.binding.textIfNotActual.setText(textIfBlock);
            inventoryItemsItemBinding.getRoot().setOnTouchListener(new InventoryItemsAdapter$ViewHolder$bind$1$4(inventoryItemsItemBinding, item, new Ref.BooleanRef(), itemsClickListener, this, inventoryItemsAdapter));
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

