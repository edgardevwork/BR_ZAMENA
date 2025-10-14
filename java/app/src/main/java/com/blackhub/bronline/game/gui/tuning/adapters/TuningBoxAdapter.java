package com.blackhub.bronline.game.gui.tuning.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningSubmenuBoxItemBinding;
import com.blackhub.bronline.game.gui.tuning.data.TuningBoxItemObj;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TuningBoxAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TuningBoxAdapter extends RecyclerView.Adapter<TuningBoxHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<TuningBoxItemObj> lBoxItems;

    public TuningBoxAdapter(@NotNull List<TuningBoxItemObj> lBoxItems) {
        Intrinsics.checkNotNullParameter(lBoxItems, "lBoxItems");
        this.lBoxItems = lBoxItems;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TuningBoxHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TuningSubmenuBoxItemBinding tuningSubmenuBoxItemBindingInflate = TuningSubmenuBoxItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(tuningSubmenuBoxItemBindingInflate, "inflate(...)");
        return new TuningBoxHolder(this, tuningSubmenuBoxItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TuningBoxHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.lBoxItems.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.lBoxItems.size();
    }

    /* compiled from: TuningBoxAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningBoxAdapter$TuningBoxHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/TuningSubmenuBoxItemBinding;", "(Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningBoxAdapter;Lcom/blackhub/bronline/databinding/TuningSubmenuBoxItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/tuning/data/TuningBoxItemObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class TuningBoxHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final TuningSubmenuBoxItemBinding binding;
        public final /* synthetic */ TuningBoxAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuningBoxHolder(@NotNull TuningBoxAdapter tuningBoxAdapter, TuningSubmenuBoxItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = tuningBoxAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull TuningBoxItemObj item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.textBoxItem.setText(item.getName());
        }
    }
}

