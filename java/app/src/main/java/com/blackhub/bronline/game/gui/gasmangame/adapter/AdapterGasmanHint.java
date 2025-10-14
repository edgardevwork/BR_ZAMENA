package com.blackhub.bronline.game.gui.gasmangame.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.ItemGasmanViewPagerHintBinding;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanAdapterHintItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdapterGasmanHint.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AdapterGasmanHint extends RecyclerView.Adapter<ViewHolderGasmanHint> {
    public static final int $stable = 8;

    @NotNull
    public final List<GasmanAdapterHintItem> listOfValues;

    public AdapterGasmanHint(@NotNull List<GasmanAdapterHintItem> listOfValues) {
        Intrinsics.checkNotNullParameter(listOfValues, "listOfValues");
        this.listOfValues = listOfValues;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolderGasmanHint onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemGasmanViewPagerHintBinding itemGasmanViewPagerHintBindingInflate = ItemGasmanViewPagerHintBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemGasmanViewPagerHintBindingInflate, "inflate(...)");
        return new ViewHolderGasmanHint(itemGasmanViewPagerHintBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolderGasmanHint holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.listOfValues.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.listOfValues.size();
    }
}

