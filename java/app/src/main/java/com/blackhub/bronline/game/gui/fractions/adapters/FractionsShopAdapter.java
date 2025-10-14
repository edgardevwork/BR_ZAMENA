package com.blackhub.bronline.game.gui.fractions.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FractionsShopItemBinding;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.fractions.FractionsUtilsKt;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsShopAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsShopItem;
import com.blackhub.bronline.game.gui.fractions.data.FractionsShopList;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FractionsShopAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FractionsShopAdapter extends RecyclerView.Adapter<FractionsShopViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final Activity activity;

    @NotNull
    public final FractionsShopList list;
    public Function1<? super Integer, Unit> onItemClickListener;

    public FractionsShopAdapter(@NotNull FractionsShopList list, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.list = list;
        this.activity = activity;
    }

    @NotNull
    public final Function1<Integer, Unit> getOnItemClickListener() {
        Function1 function1 = this.onItemClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onItemClickListener");
        return null;
    }

    public final void setOnItemClickListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onItemClickListener = function1;
    }

    /* compiled from: FractionsShopAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsShopAdapter$FractionsShopViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FractionsShopItemBinding;", "(Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsShopAdapter;Lcom/blackhub/bronline/databinding/FractionsShopItemBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/FractionsShopItemBinding;", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopItem;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class FractionsShopViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FractionsShopItemBinding binding;
        public final /* synthetic */ FractionsShopAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FractionsShopViewHolder(@NotNull FractionsShopAdapter fractionsShopAdapter, FractionsShopItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = fractionsShopAdapter;
            this.binding = binding;
        }

        @NotNull
        public final FractionsShopItemBinding getBinding() {
            return this.binding;
        }

        public final void bind(@NotNull final FractionsShopItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            FractionsShopItemBinding fractionsShopItemBinding = this.binding;
            final FractionsShopAdapter fractionsShopAdapter = this.this$0;
            fractionsShopItemBinding.textViewTitle.setText(item.getBoxName());
            fractionsShopItemBinding.textViewPrice.setText(String.valueOf(item.getBoxPrice()));
            if (item.getRender() == null) {
                if (item.getTypeID() == 3) {
                    fractionsShopItemBinding.imageViewBoxImage.setImageResource(R.drawable.tuning_icon_box);
                } else {
                    int objectID = item.getObjectID();
                    if (objectID == 7344) {
                        Activity activity = fractionsShopAdapter.activity;
                        int itemId = item.getItemId();
                        int objectID2 = item.getObjectID();
                        ImageView imageViewBoxImage = fractionsShopItemBinding.imageViewBoxImage;
                        Intrinsics.checkNotNullExpressionValue(imageViewBoxImage, "imageViewBoxImage");
                        FractionsUtilsKt.renderShopItem(activity, itemId, objectID2, imageViewBoxImage, item, 20.0f, 180.0f, 0.0f, 0.6f);
                    } else if (objectID == 7374) {
                        Activity activity2 = fractionsShopAdapter.activity;
                        int itemId2 = item.getItemId();
                        int objectID3 = item.getObjectID();
                        ImageView imageViewBoxImage2 = fractionsShopItemBinding.imageViewBoxImage;
                        Intrinsics.checkNotNullExpressionValue(imageViewBoxImage2, "imageViewBoxImage");
                        FractionsUtilsKt.renderShopItem(activity2, itemId2, objectID3, imageViewBoxImage2, item, 20.0f, 180.0f, 0.0f, 0.7f);
                    } else if (objectID == 7378) {
                        Activity activity3 = fractionsShopAdapter.activity;
                        int itemId3 = item.getItemId();
                        int objectID4 = item.getObjectID();
                        ImageView imageViewBoxImage3 = fractionsShopItemBinding.imageViewBoxImage;
                        Intrinsics.checkNotNullExpressionValue(imageViewBoxImage3, "imageViewBoxImage");
                        FractionsUtilsKt.renderShopItem(activity3, itemId3, objectID4, imageViewBoxImage3, item, 0.0f, 0.0f, 90.0f, 0.6f);
                    } else if (objectID == 7385) {
                        Activity activity4 = fractionsShopAdapter.activity;
                        int itemId4 = item.getItemId();
                        int objectID5 = item.getObjectID();
                        ImageView imageViewBoxImage4 = fractionsShopItemBinding.imageViewBoxImage;
                        Intrinsics.checkNotNullExpressionValue(imageViewBoxImage4, "imageViewBoxImage");
                        FractionsUtilsKt.renderShopItem(activity4, itemId4, objectID5, imageViewBoxImage4, item, 45.0f, 90.0f, 70.0f, 0.9f);
                    } else if (objectID == 7387) {
                        Activity activity5 = fractionsShopAdapter.activity;
                        int itemId5 = item.getItemId();
                        int objectID6 = item.getObjectID();
                        ImageView imageViewBoxImage5 = fractionsShopItemBinding.imageViewBoxImage;
                        Intrinsics.checkNotNullExpressionValue(imageViewBoxImage5, "imageViewBoxImage");
                        FractionsUtilsKt.renderShopItem(activity5, itemId5, objectID6, imageViewBoxImage5, item, 0.0f, 90.0f, 70.0f, 0.8f);
                    } else if (objectID != 7390) {
                        Activity activity6 = fractionsShopAdapter.activity;
                        int itemId6 = item.getItemId();
                        int objectID7 = item.getObjectID();
                        ImageView imageViewBoxImage6 = fractionsShopItemBinding.imageViewBoxImage;
                        Intrinsics.checkNotNullExpressionValue(imageViewBoxImage6, "imageViewBoxImage");
                        FractionsUtilsKt.renderShopItem(activity6, itemId6, objectID7, imageViewBoxImage6, item);
                    } else {
                        Activity activity7 = fractionsShopAdapter.activity;
                        int itemId7 = item.getItemId();
                        int objectID8 = item.getObjectID();
                        ImageView imageViewBoxImage7 = fractionsShopItemBinding.imageViewBoxImage;
                        Intrinsics.checkNotNullExpressionValue(imageViewBoxImage7, "imageViewBoxImage");
                        FractionsUtilsKt.renderShopItem(activity7, itemId7, objectID8, imageViewBoxImage7, item, 0.0f, 260.0f, 0.0f, 0.8f);
                    }
                }
            } else {
                fractionsShopItemBinding.imageViewBoxImage.setImageBitmap(item.getRender());
            }
            fractionsShopItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fractions.adapters.FractionsShopAdapter$FractionsShopViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FractionsShopAdapter.FractionsShopViewHolder.bind$lambda$1$lambda$0(fractionsShopAdapter, this, item, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(FractionsShopAdapter this$0, FractionsShopViewHolder this$1, FractionsShopItem item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(item, "$item");
            if (this$0.list.getItemClicked() != this$1.getAdapterPosition()) {
                if (this$0.list.getItemClicked() >= 0) {
                    this$0.notifyItemChanged(this$0.list.getItemClicked());
                }
                this$0.list.setItemClicked(this$1.getAdapterPosition());
                this$0.notifyItemChanged(this$1.getAdapterPosition());
                return;
            }
            this$0.getOnItemClickListener().invoke(Integer.valueOf(item.getUniqueId()));
            this$0.list.setItemClicked(-1);
            this$0.notifyItemChanged(this$1.getAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FractionsShopViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FractionsShopItemBinding fractionsShopItemBindingInflate = FractionsShopItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(fractionsShopItemBindingInflate, "inflate(...)");
        return new FractionsShopViewHolder(this, fractionsShopItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FractionsShopViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<FractionsShopItem> list = this.list.getList();
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        FractionsShopItem fractionsShopItem = (FractionsShopItem) CollectionsKt___CollectionsKt.getOrNull(list, position);
        if (fractionsShopItem == null) {
            fractionsShopItem = new FractionsShopItem(0, null, 0, 0, 0, 0, 63, null);
        }
        holder.bind(fractionsShopItem);
        if (this.list.getItemClicked() == position) {
            holder.itemView.isSelected();
            View view = holder.itemView;
            view.setBackground(ContextCompat.getDrawable(view.getContext(), R.drawable.bg_fractions_shop_item_selected));
        } else {
            View view2 = holder.itemView;
            view2.setBackground(ContextCompat.getDrawable(view2.getContext(), R.drawable.bg_fractions_shop_item));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<FractionsShopItem> list = this.list.getList();
        return IntExtensionKt.getOrZero(list != null ? Integer.valueOf(list.size()) : null);
    }
}

