package com.blackhub.bronline.game.gui.menupausesettingandmap.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.ItemNewMenuSettingControlBinding;
import com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuSettingControlAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MenuSettingControlAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MenuSettingControlAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final String[] controlList;
    public Function1<? super Integer, Unit> onItemClickListener;

    public MenuSettingControlAdapter(@NotNull String[] controlList) {
        Intrinsics.checkNotNullParameter(controlList, "controlList");
        this.controlList = controlList;
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

    /* compiled from: MenuSettingControlAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuSettingControlAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/ItemNewMenuSettingControlBinding;", "(Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuSettingControlAdapter;Lcom/blackhub/bronline/databinding/ItemNewMenuSettingControlBinding;)V", "bind", "", "item", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final ItemNewMenuSettingControlBinding binding;
        public final /* synthetic */ MenuSettingControlAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull MenuSettingControlAdapter menuSettingControlAdapter, ItemNewMenuSettingControlBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = menuSettingControlAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull String item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TextView root = this.binding.getRoot();
            final MenuSettingControlAdapter menuSettingControlAdapter = this.this$0;
            root.setText(item);
            root.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuSettingControlAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MenuSettingControlAdapter.ViewHolder.bind$lambda$1$lambda$0(menuSettingControlAdapter, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(MenuSettingControlAdapter this$0, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getOnItemClickListener().invoke(Integer.valueOf(this$1.getBindingAdapterPosition()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemNewMenuSettingControlBinding itemNewMenuSettingControlBindingInflate = ItemNewMenuSettingControlBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemNewMenuSettingControlBindingInflate, "inflate(...)");
        return new ViewHolder(this, itemNewMenuSettingControlBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.controlList[position]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.controlList.length;
    }
}

