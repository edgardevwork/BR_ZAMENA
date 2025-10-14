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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/adapter/AdapterGasmanHint;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/gasmangame/adapter/ViewHolderGasmanHint;", "listOfValues", "", "Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanAdapterHintItem;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
