package com.blackhub.bronline.game.gui.inventory.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.InventoryPlayersStateItemBinding;
import com.blackhub.bronline.game.gui.inventory.data.InvPlayersStateData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InventoryPlayersStatesAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryPlayersStatesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryPlayersStatesAdapter$ViewHolder;", "statesList", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvPlayersStateData;", "(Ljava/util/List;)V", "binding", "Lcom/blackhub/bronline/databinding/InventoryPlayersStateItemBinding;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class InventoryPlayersStatesAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public InventoryPlayersStateItemBinding binding;

    @NotNull
    public final List<InvPlayersStateData> statesList;

    public InventoryPlayersStatesAdapter(@NotNull List<InvPlayersStateData> statesList) {
        Intrinsics.checkNotNullParameter(statesList, "statesList");
        this.statesList = statesList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        InventoryPlayersStateItemBinding inventoryPlayersStateItemBindingInflate = InventoryPlayersStateItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inventoryPlayersStateItemBindingInflate, "inflate(...)");
        this.binding = inventoryPlayersStateItemBindingInflate;
        InventoryPlayersStateItemBinding inventoryPlayersStateItemBinding = this.binding;
        if (inventoryPlayersStateItemBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inventoryPlayersStateItemBinding = null;
        }
        return new ViewHolder(inventoryPlayersStateItemBinding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.statesList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.statesList.size();
    }

    /* compiled from: InventoryPlayersStatesAdapter.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/adapters/InventoryPlayersStatesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/InventoryPlayersStateItemBinding;", "(Lcom/blackhub/bronline/databinding/InventoryPlayersStateItemBinding;)V", "bind", "", "playersState", "Lcom/blackhub/bronline/game/gui/inventory/data/InvPlayersStateData;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        @NotNull
        public final InventoryPlayersStateItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull InventoryPlayersStateItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public final void bind(@NotNull InvPlayersStateData playersState) {
            Intrinsics.checkNotNullParameter(playersState, "playersState");
            this.binding.invStateItemIcon.setImageResource(playersState.getIconsRes());
            this.binding.invItemsProgressBar.setMax(playersState.getMaxValueState());
            this.binding.invItemsProgressBar.setProgress(playersState.getThisValueState());
        }
    }
}
