package com.blackhub.bronline.game.gui.menupausesettingandmap.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.ItemNewMenuSettingMainTitleBinding;
import com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuSettingTitleAdapter;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MenuSettingTitleAdapter.kt */
@StabilityInferred(parameters = 0)

public final class MenuSettingTitleAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public boolean ifSetCheck;
    public int oldPositionIsClicked;
    public Function1<? super Integer, Unit> onItemClickListener;

    @NotNull
    public final List<String> titleItems;

    public MenuSettingTitleAdapter(@NotNull List<String> titleItems) {
        Intrinsics.checkNotNullParameter(titleItems, "titleItems");
        this.titleItems = titleItems;
        this.ifSetCheck = true;
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

    /* compiled from: MenuSettingTitleAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuSettingTitleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/ItemNewMenuSettingMainTitleBinding;", "(Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuSettingTitleAdapter;Lcom/blackhub/bronline/databinding/ItemNewMenuSettingMainTitleBinding;)V", "bind", "", "item", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final ItemNewMenuSettingMainTitleBinding binding;
        public final /* synthetic */ MenuSettingTitleAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull MenuSettingTitleAdapter menuSettingTitleAdapter, ItemNewMenuSettingMainTitleBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = menuSettingTitleAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull String item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.newMenuSettingMainTitleText.setText(item);
            if (this.this$0.ifSetCheck && this.this$0.oldPositionIsClicked == getBindingAdapterPosition()) {
                ItemNewMenuSettingMainTitleBinding itemNewMenuSettingMainTitleBinding = this.binding;
                itemNewMenuSettingMainTitleBinding.newMenuSettingMainTitleText.setTextColor(ContextCompat.getColor(itemNewMenuSettingMainTitleBinding.getRoot().getContext(), R.color.white));
            } else {
                ItemNewMenuSettingMainTitleBinding itemNewMenuSettingMainTitleBinding2 = this.binding;
                itemNewMenuSettingMainTitleBinding2.newMenuSettingMainTitleText.setTextColor(ContextCompat.getColor(itemNewMenuSettingMainTitleBinding2.getRoot().getContext(), R.color.dark_gray_blue));
            }
            LinearLayout root = this.binding.getRoot();
            final MenuSettingTitleAdapter menuSettingTitleAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuSettingTitleAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MenuSettingTitleAdapter.ViewHolder.bind$lambda$0(menuSettingTitleAdapter, this, view);
                }
            });
        }

        public static final void bind$lambda$0(MenuSettingTitleAdapter this$0, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.ifSetCheck = false;
            this$0.notifyItemChanged(this$0.oldPositionIsClicked);
            this$0.ifSetCheck = true;
            this$0.notifyItemChanged(this$1.getBindingAdapterPosition());
            this$0.oldPositionIsClicked = this$1.getBindingAdapterPosition();
            this$0.getOnItemClickListener().invoke(Integer.valueOf(this$1.getBindingAdapterPosition()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemNewMenuSettingMainTitleBinding itemNewMenuSettingMainTitleBindingInflate = ItemNewMenuSettingMainTitleBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemNewMenuSettingMainTitleBindingInflate, "inflate(...)");
        return new ViewHolder(this, itemNewMenuSettingMainTitleBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.titleItems.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.titleItems.size();
    }

    public final void setCurrentClickItem() {
        this.ifSetCheck = false;
        notifyItemChanged(this.oldPositionIsClicked);
        this.ifSetCheck = true;
        this.oldPositionIsClicked = 0;
        notifyItemChanged(0);
    }
}

