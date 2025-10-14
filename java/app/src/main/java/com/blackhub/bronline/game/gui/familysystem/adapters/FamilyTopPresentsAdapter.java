package com.blackhub.bronline.game.gui.familysystem.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesTopPresentItemBinding;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyPresent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FamilyTopPresentsAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FamilyTopPresentsAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final List<FamilyPresent> rewardTopList;

    public FamilyTopPresentsAdapter(@NotNull List<FamilyPresent> rewardTopList) {
        Intrinsics.checkNotNullParameter(rewardTopList, "rewardTopList");
        this.rewardTopList = rewardTopList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FamiliesTopPresentItemBinding familiesTopPresentItemBindingInflate = FamiliesTopPresentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(familiesTopPresentItemBindingInflate, "inflate(...)");
        return new ViewHolder(familiesTopPresentItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.rewardTopList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.rewardTopList.size();
    }

    /* compiled from: FamilyTopPresentsAdapter.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyTopPresentsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FamiliesTopPresentItemBinding;", "(Lcom/blackhub/bronline/databinding/FamiliesTopPresentItemBinding;)V", "bind", "", "thisPresent", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyPresent;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        @NotNull
        public final FamiliesTopPresentItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull FamiliesTopPresentItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public final void bind(@NotNull FamilyPresent thisPresent) {
            Intrinsics.checkNotNullParameter(thisPresent, "thisPresent");
            FamiliesTopPresentItemBinding familiesTopPresentItemBinding = this.binding;
            familiesTopPresentItemBinding.presentTitle.setText(thisPresent.getThisPresentsName());
            familiesTopPresentItemBinding.presentValue.setText(thisPresent.getThisPresentsValue());
        }
    }
}

