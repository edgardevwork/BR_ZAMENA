package com.blackhub.bronline.game.gui.dialog.gameinstruction;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.ItemViewPagerGameInstructionsBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdapterGameInstructions.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AdapterGameInstructions extends RecyclerView.Adapter<ViewHolderGameInstructions> {
    public static final int $stable = 8;

    @NotNull
    public final List<GameInstructionsItem> listOfValues;

    public AdapterGameInstructions(@NotNull List<GameInstructionsItem> listOfValues) {
        Intrinsics.checkNotNullParameter(listOfValues, "listOfValues");
        this.listOfValues = listOfValues;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolderGameInstructions onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemViewPagerGameInstructionsBinding itemViewPagerGameInstructionsBindingInflate = ItemViewPagerGameInstructionsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemViewPagerGameInstructionsBindingInflate, "inflate(...)");
        return new ViewHolderGameInstructions(itemViewPagerGameInstructionsBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolderGameInstructions holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.listOfValues.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.listOfValues.size();
    }
}

